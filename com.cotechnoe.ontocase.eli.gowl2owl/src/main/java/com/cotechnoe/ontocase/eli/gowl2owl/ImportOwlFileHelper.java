package com.cotechnoe.ontocase.eli.gowl2owl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;

import com.cotechnoe.ontocase.eli.gowl.ALink;
import com.cotechnoe.ontocase.eli.gowl.ELink;
import com.cotechnoe.ontocase.eli.gowl.G_AnnotationProperty;
import com.cotechnoe.ontocase.eli.gowl.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.G_IRI_Status;
import com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE;
import com.cotechnoe.ontocase.eli.gowl.G_NamedClass;
import com.cotechnoe.ontocase.eli.gowl.G_NamedIndividual;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Document;
import com.cotechnoe.ontocase.eli.gowl.G_ObjectProperty;
import com.cotechnoe.ontocase.eli.gowl.G_Property;
import com.cotechnoe.ontocase.eli.gowl.G_Relation;
import com.cotechnoe.ontocase.eli.gowl.GowlFactory;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;
import com.cotechnoe.ontocase.eli.gowl.ILink;
import com.cotechnoe.ontocase.eli.gowl.PLink;
import com.cotechnoe.ontocase.eli.gowl.SLink;
import com.cotechnoe.ontocase.eli.gowl.util.GowlResourceFactoryImpl;

import uk.ac.manchester.cs.owl.owlapi.OWLOntologyImpl;
public class ImportOwlFileHelper {
	public static void main(String[] args) throws OWLOntologyCreationException, IOException {
		//		FileOutputStream outputFile = new FileOutputStream("/home/heon/SIRIUS/runtime-EclipseApplication/test/test.gowl");
		//		File inputFile = new File("/home/heon/00-PROJECT-OntoCASE-WEB/00-GIT/OntoCASE4G-OWL/com.cotechnoe.ontocase.eli.gowl2owl/ontology/result.ttl");

		String filename = "owlPrimer";
		String rep = "/home/heon/00-PROJECT-OntoCASE-WEB/00-GIT/OntoCASE4G-OWL/com.cotechnoe.ontocase.eli.gowl2owl/ontologies/owlPrimer/";

		File inputFile = new File(rep+filename+".ttl");
		FileOutputStream outputFile = new FileOutputStream(rep+filename+".gowl");

		ImportOwlFileHelper importHelper = new ImportOwlFileHelper(inputFile, outputFile);
		importHelper.parseOntolgy();
		importHelper.save();
		System.out.println("Done !");

	}

	private OWLOntologyManager manager;
	private OWLOntology ontology;
	private ResourceSetImpl resourceSet;
	private G_OWL_Document GOWLOntology;
	private OWLDataFactory dataFactory;
	private Resource resource;
	private File inputFile;
	private FileOutputStream outputFile;


	/**
	 * @param inputFile
	 * @param outputFile
	 * @throws OWLOntologyCreationException 
	 */
	public ImportOwlFileHelper(File inputFile, FileOutputStream outputFile)  {
		this.inputFile = inputFile;
		this.outputFile = outputFile;
		try {
			init(inputFile, outputFile);
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
	}
	public ImportOwlFileHelper(String inputFile, String outputFile) throws FileNotFoundException {
		this.inputFile = new File(inputFile);
		this.outputFile = new FileOutputStream(outputFile);
		try {
			init(this.inputFile, this.outputFile);
		} catch (OWLOntologyCreationException e) {

			e.printStackTrace();
		}
	}

	private G_Entity createAndAddOWLEntiy(OWLEntity owlEntity) {
		G_Entity gowlEntity=null;
		if (owlEntity instanceof OWLClass ) {
			gowlEntity = GowlFactory.eINSTANCE.createG_NamedClass();
			setBasicInfoOf(owlEntity, gowlEntity);
			GOWLOntology.getGroupOfEntities().getG_entities().add(gowlEntity);
		} else if (owlEntity instanceof OWLIndividual ) {
			gowlEntity = GowlFactory.eINSTANCE.createG_NamedIndividual();
			setBasicInfoOf(owlEntity, gowlEntity);
			GOWLOntology.getGroupOfEntities().getG_entities().add(gowlEntity);
		} else if (owlEntity instanceof OWLAnnotationProperty ) {
			gowlEntity = GowlFactory.eINSTANCE.createG_AnnotationProperty();
			setBasicInfoOf(owlEntity, gowlEntity);
			GOWLOntology.getGroupOfEntities().getG_entities().add(gowlEntity);
		} else if (owlEntity instanceof OWLObjectProperty ) {
			gowlEntity = GowlFactory.eINSTANCE.createG_ObjectProperty();
			setBasicInfoOf(owlEntity, gowlEntity);
			GOWLOntology.getGroupOfEntities().getG_entities().add(gowlEntity);
		} else {
			System.err.println("Entity Creation NOT Implemented : "+ owlEntity + " (" +owlEntity.getClass().getName()+") ");
		}		return null;
	}

	private G_Entity fingGowlResourceByIRI(IRI entityIRI) {
		EList<G_Entity> entities = GOWLOntology.getGroupOfEntities().getG_entities();
		for (Iterator iterator = entities.iterator(); iterator.hasNext();) {
			G_Entity g_Entity = (G_Entity) iterator.next();
			if (g_Entity.getIri().equals(entityIRI.toString())) {
				return g_Entity;
			}
		}
		return null;
	}

	private void init(File inputFile, FileOutputStream outputFile) throws OWLOntologyCreationException {
		/**
		 * OWL Initialisation
		 */
		this.inputFile = inputFile;
		this.outputFile = outputFile;
		manager = OWLManager.createOWLOntologyManager();
		ontology = manager.loadOntologyFromOntologyDocument(inputFile);
		dataFactory = ontology.getOWLOntologyManager().getOWLDataFactory();

		/**
		 * G-OWL Initialisation
		 */
		// Create a resource set to hold the resources.
		//
		resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new GowlResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
		(GowlPackage.eNS_URI, 
				GowlPackage.eINSTANCE);

		resource = resourceSet.createResource(URI.createURI("http:///My.gowl"));
		GOWLOntology = GowlFactory.eINSTANCE.createG_OWL_Document();
		resource.getContents().add(GOWLOntology);
	}

	private void parseOntolgy() {
		parseOntologyEntities();
		parseOntologyAxioms();
	}

	private void parseOntologyAxioms() {
		Stream<OWLAxiom> owlAxioms = ontology.axioms();

		for (Iterator iterator = owlAxioms.iterator(); iterator.hasNext();) {
			OWLAxiom owlAxiom = (OWLAxiom) iterator.next();
//			System.err.println(owlAxiom + " ----- " +owlAxiom.getClass().getName());
			if (owlAxiom instanceof OWLClassAssertionAxiom 
					&& ((OWLClassAssertionAxiom)owlAxiom).getIndividual().isNamed()
					&& ((OWLClassAssertionAxiom)owlAxiom).getClassExpression().isNamed()
					) {
				OWLClassAssertionAxiom classAssertion = (OWLClassAssertionAxiom)owlAxiom;
				OWLIndividual individual = classAssertion.getIndividual();
				ILink gowlIlink = GowlFactory.eINSTANCE.createILink();
				setSourceAndTargetToARelation(gowlIlink, 
						individual.asOWLNamedIndividual().getIRI(), 
						classAssertion.getClassExpression().asOWLClass().getIRI());
				GOWLOntology.getGroupOfRelations().getG_relations().add(gowlIlink);
			} else 	if (owlAxiom instanceof OWLSubClassOfAxiom
					&& ((OWLSubClassOfAxiom)owlAxiom).getSubClass().isNamed()
					&& ((OWLSubClassOfAxiom)owlAxiom).getSuperClass().isNamed()) {
				OWLSubClassOfAxiom axiom = (OWLSubClassOfAxiom)owlAxiom;
				OWLClassExpression owlSubClasses = axiom.getSubClass();
				OWLClassExpression owlSuperClasses = axiom.getSuperClass();
				SLink gowlLink = GowlFactory.eINSTANCE.createSLink();
				setSourceAndTargetToARelation(gowlLink, 
						owlSubClasses.asOWLClass().getIRI(), 
						owlSuperClasses.asOWLClass().getIRI());
				GOWLOntology.getGroupOfRelations().getG_relations().add(gowlLink);
			} else 	if (owlAxiom instanceof OWLEquivalentClassesAxiom
					&& ((OWLEquivalentClassesAxiom)owlAxiom).getClassExpressionsAsList().get(0).isNamed()
					&& ((OWLEquivalentClassesAxiom)owlAxiom).getClassExpressionsAsList().get(1).isNamed()) {
				OWLEquivalentClassesAxiom axiom = (OWLEquivalentClassesAxiom)owlAxiom;
				OWLClassExpression owlClasse = axiom.getClassExpressionsAsList().get(0);
				OWLClassExpression owlEqClasse = axiom.getClassExpressionsAsList().get(1);
				ELink gowlLink = GowlFactory.eINSTANCE.createELink();
				setSourceAndTargetToARelation(gowlLink, 
						owlClasse.asOWLClass().getIRI(), 
						owlEqClasse.asOWLClass().getIRI());
				GOWLOntology.getGroupOfRelations().getG_relations().add(gowlLink);
			} else 	if (owlAxiom instanceof OWLEquivalentObjectPropertiesAxiom
					&& ((OWLEquivalentObjectPropertiesAxiom)owlAxiom).getOperandsAsList().get(0).isNamed()
					&& ((OWLEquivalentObjectPropertiesAxiom)owlAxiom).getOperandsAsList().get(1).isNamed()) {
				OWLEquivalentObjectPropertiesAxiom axiom = (OWLEquivalentObjectPropertiesAxiom)owlAxiom;
				 OWLObjectPropertyExpression owlProperty = axiom.getOperandsAsList().get(0);
				 OWLObjectPropertyExpression owlEqProperty = axiom.getOperandsAsList().get(1);
				ELink gowlLink = GowlFactory.eINSTANCE.createELink();
				setSourceAndTargetToARelation(gowlLink, 
						owlProperty.asOWLObjectProperty().getIRI(), 
						owlEqProperty.asOWLObjectProperty().getIRI());
				GOWLOntology.getGroupOfRelations().getG_relations().add(gowlLink);
			}else 	if (owlAxiom instanceof OWLSameIndividualAxiom
					&& ((OWLSameIndividualAxiom)owlAxiom).getIndividualsAsList().get(0).isNamed()
					&& ((OWLSameIndividualAxiom)owlAxiom).getIndividualsAsList().get(1).isNamed()) {
				OWLSameIndividualAxiom axiom = (OWLSameIndividualAxiom)owlAxiom;
				 OWLIndividual owlIndv = axiom.getIndividualsAsList().get(0);
				 OWLIndividual owlSameIndv = axiom.getIndividualsAsList().get(1);
				ELink gowlLink = GowlFactory.eINSTANCE.createELink();
				setSourceAndTargetToARelation(gowlLink, 
						owlIndv.asOWLNamedIndividual().getIRI(), 
						owlSameIndv.asOWLNamedIndividual().getIRI());
				GOWLOntology.getGroupOfRelations().getG_relations().add(gowlLink);
			} else 	if (owlAxiom instanceof OWLSubObjectPropertyOfAxiom
					&& ((OWLSubObjectPropertyOfAxiom)owlAxiom).getSubProperty().isNamed()
					&& ((OWLSubObjectPropertyOfAxiom)owlAxiom).getSuperProperty().isNamed()) {
				OWLSubObjectPropertyOfAxiom axiom = (OWLSubObjectPropertyOfAxiom)owlAxiom;
				 OWLObjectPropertyExpression owlSubProperty = axiom.getSubProperty();
				 OWLObjectPropertyExpression owlSuperProperty = axiom.getSuperProperty();
				SLink gowlLink = GowlFactory.eINSTANCE.createSLink();
				setSourceAndTargetToARelation(gowlLink, 
						owlSubProperty.asOWLObjectProperty().getIRI(), 
						owlSuperProperty.asOWLObjectProperty().getIRI());
				GOWLOntology.getGroupOfRelations().getG_relations().add(gowlLink);
			} else if (owlAxiom instanceof OWLAnnotationAssertionAxiom 
					&& ((OWLAnnotationAssertionAxiom)owlAxiom).getProperty().isNamed()
					&& ((OWLAnnotationAssertionAxiom)owlAxiom).getValue().isNamed()
					) {
				OWLAnnotationAssertionAxiom annotationAssertion = (OWLAnnotationAssertionAxiom)owlAxiom;
				OWLAnnotationProperty property = annotationAssertion.getProperty();
				OWLAnnotationValue value = annotationAssertion.getValue();
				IRI subject = annotationAssertion.getSubject().asIRI().get();
				PLink gowlPlink = setSourceAndTargetToA_PLink( 
						property,
						value,
						subject
						);
				/*
				 * le Plink existe entre deux ressources
				 * 
				 */
				if (gowlPlink != null ) GOWLOntology.getGroupOfRelations().getG_relations().add(gowlPlink);
			} else if (owlAxiom instanceof OWLObjectPropertyAssertionAxiom 
					&& ((OWLObjectPropertyAssertionAxiom)owlAxiom).getSubject().isNamed()
					&& ((OWLObjectPropertyAssertionAxiom)owlAxiom).getObject().isNamed()
					) {
				OWLObjectPropertyAssertionAxiom axiom = (OWLObjectPropertyAssertionAxiom)owlAxiom;
				OWLObjectPropertyExpression property = axiom.getProperty();
				OWLNamedIndividual subj = axiom.getSubject().asOWLNamedIndividual();
				OWLNamedIndividual obj = axiom.getObject().asOWLNamedIndividual();
				
				PLink gowlPlink = setSourceAndTargetToA_PLink( 
						property,
						subj,
						obj
						);
				/*
				 * le Plink existe entre deux ressources
				 * 
				 */
				if (gowlPlink != null ) GOWLOntology.getGroupOfRelations().getG_relations().add(gowlPlink);
			} else if (owlAxiom instanceof OWLObjectPropertyRangeAxiom 
					&& ((OWLObjectPropertyRangeAxiom)owlAxiom).getRange().isNamed()
					&& ((OWLObjectPropertyRangeAxiom)owlAxiom).getProperty().isNamed()
					) {
				OWLObjectPropertyRangeAxiom axiom = (OWLObjectPropertyRangeAxiom)owlAxiom;
				OWLClassExpression owlClass = axiom.getRange();
				OWLObjectPropertyExpression owlProperty = axiom.getProperty();
				ALink gowlLink = GowlFactory.eINSTANCE.createALink();
				setSourceAndTargetToARelation(gowlLink, 						
						owlProperty.asOWLObjectProperty().getIRI(),
						owlClass.asOWLClass().getIRI());
				GOWLOntology.getGroupOfRelations().getG_relations().add(gowlLink);
				/*
				 * le Plink existe entre deux ressources
				 * 
				 */
				if (gowlLink != null ) GOWLOntology.getGroupOfRelations().getG_relations().add(gowlLink);
			} else if (owlAxiom instanceof OWLObjectPropertyDomainAxiom 
					&& ((OWLObjectPropertyDomainAxiom)owlAxiom).getDomain().isNamed()
					&& ((OWLObjectPropertyDomainAxiom)owlAxiom).getProperty().isNamed()
					) {
				OWLObjectPropertyDomainAxiom axiom = (OWLObjectPropertyDomainAxiom)owlAxiom;
				OWLClassExpression owlClass = axiom.getDomain();
				OWLObjectPropertyExpression owlProperty = axiom.getProperty();
				ALink gowlLink = GowlFactory.eINSTANCE.createALink();
				setSourceAndTargetToARelation(gowlLink, 						
						owlClass.asOWLClass().getIRI(),
						owlProperty.asOWLObjectProperty().getIRI());
				GOWLOntology.getGroupOfRelations().getG_relations().add(gowlLink);
				/*
				 * le Plink existe entre deux ressources
				 * 
				 */
				if (gowlLink != null ) GOWLOntology.getGroupOfRelations().getG_relations().add(gowlLink);
			}else if (owlAxiom instanceof OWLDeclarationAxiom ) {
				OWLDeclarationAxiom axiom = (OWLDeclarationAxiom)owlAxiom;
				axiom.getEntity();
			} else {
				System.out.print("NOT FOUND ---> " +owlAxiom);
				System.out.println("");			}

		}

	}

	private void parseOntologyEntities() {
		Stream<OWLEntity> resu = ontology.signature();


		for (Iterator iterator = resu.iterator(); iterator.hasNext();) {
			OWLEntity owlEntity = (OWLEntity) iterator.next();
			createAndAddOWLEntiy(owlEntity);
		} 
		System.err.println("--------------- ");			

	}

	private void save() throws IOException {
		resource.save(outputFile, null);
		//		resource.save(System.out, null);
	}

	private void setBasicInfoOf(OWLEntity owlEntity, G_Entity aGowlEntity) {
		IRI iri = owlEntity.getIRI();
		String g_label= null;
		for(OWLAnnotationAssertionAxiom a : ontology.getAnnotationAssertionAxioms(iri)) {
			if(a.getProperty().isLabel()) {
				if(a.getValue() instanceof OWLLiteral) {
					OWLLiteral val = (OWLLiteral) a.getValue();
						g_label = val.getLiteral();
				}
			}
		}
		aGowlEntity.setIri(owlEntity.getIRI().toString());
		aGowlEntity.setG_iri_status(G_IRI_Status.PRESET);
		if (g_label== null)
			aGowlEntity.setG_label(owlEntity.getIRI().getFragment());
		else			
			aGowlEntity.setG_label(g_label);

	}

	private PLink setSourceAndTargetToA_PLink(OWLAnnotationProperty property, OWLAnnotationValue value,
			IRI subject) {
		/*
		 * La value doit être une resource et non un litéral.
		 */
		if ( !value.isIRI() ) { return null; }
		PLink gowlPlink = GowlFactory.eINSTANCE.createPLink();	
		G_Entity src = fingGowlResourceByIRI(subject);
		gowlPlink.setSource(src);
		G_Entity g_property = fingGowlResourceByIRI(property.getIRI());
		if(g_property==null) {
			g_property = GowlFactory.eINSTANCE.createG_AnnotationProperty();
			g_property.setIri(property.getIRI().toString());
			g_property.setG_label(property.getIRI().getFragment());
			GOWLOntology.getGroupOfEntities().getG_entities().add(g_property);
		}
		gowlPlink.setG_labelType(G_LABEL_TYPE.PROPERTY_LABEL);
		gowlPlink.setG_Property((G_Property) g_property);

		G_Entity target = fingGowlResourceByIRI(value.asIRI().get());
		if (target == null) {
			target = GowlFactory.eINSTANCE.createG_Annotation();
			target.setIri(value.asIRI().get().toString());
			target.setG_label(value.asIRI().get().getFragment());
			GOWLOntology.getGroupOfEntities().getG_entities().add(target);
		}
		gowlPlink.setTarget(target);
		return gowlPlink;
	}
	
	private PLink setSourceAndTargetToA_PLink(OWLObjectPropertyExpression property, OWLNamedIndividual subject,
			OWLNamedIndividual object) {
		PLink gowlPlink = GowlFactory.eINSTANCE.createPLink();	
		G_Entity src = fingGowlResourceByIRI(subject.getIRI());
		G_Entity target = fingGowlResourceByIRI(object.getIRI());
		G_Entity g_property = fingGowlResourceByIRI(property.asOWLObjectProperty().getIRI());
		gowlPlink.setSource(src);
//		if(g_property==null) {
//			g_property = GowlFactory.eINSTANCE.createG_AnnotationProperty();
//			g_property.setIri(property.getIRI().toString());
//			g_property.setG_label(property.getIRI().getFragment());
//			GOWLOntology.getGroupOfEntities().getG_entities().add(g_property);
//		}
		gowlPlink.setG_labelType(G_LABEL_TYPE.PROPERTY_LABEL);
		gowlPlink.setG_Property((G_Property) g_property);
		gowlPlink.setTarget(target);
		return gowlPlink;
	}

	private void setSourceAndTargetToARelation(G_Relation aRelation, IRI sourceIRI, IRI targetIRI) {
		G_Entity src = fingGowlResourceByIRI(sourceIRI);
		G_Entity target = fingGowlResourceByIRI(targetIRI);
		aRelation.setSource(src);
		aRelation.setTarget(target);
	}
}
