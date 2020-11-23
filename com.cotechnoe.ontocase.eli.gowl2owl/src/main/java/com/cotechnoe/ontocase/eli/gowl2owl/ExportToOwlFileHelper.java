/**
 * 
 */
package com.cotechnoe.ontocase.eli.gowl2owl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.rdf4j.model.vocabulary.OWL;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.model.vocabulary.RDFS;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.io.SystemOutDocumentTarget;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import com.cotechnoe.ontocase.eli.gowl.ALink;
import com.cotechnoe.ontocase.eli.gowl.ELink;
import com.cotechnoe.ontocase.eli.gowl.G_Annotation;
import com.cotechnoe.ontocase.eli.gowl.G_AnnotationProperty;
import com.cotechnoe.ontocase.eli.gowl.G_Collection;
import com.cotechnoe.ontocase.eli.gowl.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.G_NamedClass;
import com.cotechnoe.ontocase.eli.gowl.G_NamedIndividual;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Document;
import com.cotechnoe.ontocase.eli.gowl.G_ObjectProperty;
import com.cotechnoe.ontocase.eli.gowl.G_Property;
import com.cotechnoe.ontocase.eli.gowl.G_Relation;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;
import com.cotechnoe.ontocase.eli.gowl.ILink;
import com.cotechnoe.ontocase.eli.gowl.PLink;
import com.cotechnoe.ontocase.eli.gowl.SLink;
import com.cotechnoe.ontocase.eli.gowl.util.GowlResourceFactoryImpl;
import com.cotechnoe.ontocase.eli.gowl2owl.util.GOWL_Helper;
import org.semanticweb.owlapi.model.IRI;

/**
 * @author heon
 *
 */
public class ExportToOwlFileHelper {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws OWLOntologyStorageException 
	 */
	public static void main(String[] args) throws FileNotFoundException, OWLOntologyStorageException {
		String filename = "Enseigner";
		String rep = "/home/heon/00-PROJECT-OntoCASE-WEB/00-GIT/OntoCASE4G-OWL/com.cotechnoe.ontocase.eli.gowl2owl/ontologies/gowlToOwl/";

		File inputFile = new File(rep+filename+".gowl");
		FileOutputStream outputFile = new FileOutputStream(rep+filename+".ttl");
		ExportToOwlFileHelper exporter = new ExportToOwlFileHelper(inputFile, outputFile);
		exporter.parseModel();
		exporter.save();
		System.out.println("Done !");

	}
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
	private File inputFile;
	private FileOutputStream outputFile;
	private OWLOntologyManager manager;
	private OWLOntology ontology;
	private OWLDataFactory dataFactory;
	private ResourceSetImpl resourceSet;
	private Resource gowlResource;
	private G_OWL_Document GOWLOntology;
	public ExportToOwlFileHelper(File inputFile, FileOutputStream outputFile) {
		try {
			init(inputFile, outputFile);
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}	}

	private void init(File inputFile, FileOutputStream outputFile) throws OWLOntologyCreationException {
		this.inputFile = inputFile;
		this.outputFile = outputFile;

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
		(GowlPackage.eNS_URI, GowlPackage.eINSTANCE);

		URI uri = inputFile.isFile() ? URI.createFileURI(inputFile.getAbsolutePath()): URI.createURI(inputFile.getName());
		try {
			// Demand load resource for this file.
			//
			gowlResource = resourceSet.getResource(uri, true);
			System.out.println("Loaded " + uri);

			// Validate the contents of the loaded resource.
			//
			for (EObject eObject : gowlResource.getContents()) {
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					printDiagnostic(diagnostic, "");
				}
			}
		}
		catch (RuntimeException exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
		}
		GOWLOntology = (G_OWL_Document) gowlResource.getContents().get(0);
		/**
		 * OWL Initialisation
		 */
		manager = OWLManager.createOWLOntologyManager();
		ontology = manager.createOntology();
		dataFactory = ontology.getOWLOntologyManager().getOWLDataFactory();

	}

	private void parseEntities() {
		EList<G_Entity> entities = GOWLOntology.getGroupOfEntities().getG_entities();
		OWLEntity owlEntity = null;
		for (G_Entity g_Entity : entities) {
			String label = g_Entity.getG_label();
			String iriString = g_Entity.getIri();
			IRI owlIri = IRI.create(iriString);
			if (g_Entity instanceof G_Annotation ) {
				//				dataFactory.getOWLAnnotation(RDF.TYPE, owlIri);
				//				OWLAnnotationValue value = owlIri;
				//				System.err.println("Managing G_NamedIndividual "+g_Entity);
			} else if (g_Entity instanceof G_NamedIndividual ) {
				owlEntity = dataFactory.getOWLNamedIndividual(owlIri);
				System.err.println("Managing G_NamedIndividual "+g_Entity);
			} else if (g_Entity instanceof G_NamedClass ) {
				owlEntity = dataFactory.getOWLClass(owlIri);
				System.err.println("Managing G_NamedClass "+g_Entity);
			} else if (g_Entity instanceof G_ObjectProperty ) {
				owlEntity = dataFactory.getOWLObjectProperty(owlIri);
				System.err.println("Managing G_ObjectProperty "+g_Entity);
			} else if (g_Entity instanceof G_AnnotationProperty ) {
				owlEntity = dataFactory.getOWLAnnotationProperty(owlIri);		
				System.err.println("Managing G_AnnotationProperty "+g_Entity);
			} else {
				System.err.println("Entity not Supported "+g_Entity);
			}
			OWLDeclarationAxiom axiom = dataFactory.getOWLDeclarationAxiom(owlEntity);
			manager.addAxiom(ontology, axiom);

		}

	}

	private void parseModel() {
		parseEntities();
		parseRelations();

	}
	private void parseRelations() {
		EList<G_Relation> relations = GOWLOntology.getGroupOfRelations().getG_relations();
		for (G_Relation g_relation : relations) {
			OWLAnnotationAssertionAxiom axiom=null;
			if (g_relation instanceof ILink ) {
				System.err.println("ILINK "+g_relation);
				G_Entity source = g_relation.getSource();
				G_Entity target = g_relation.getTarget();
				IRI srcIri = IRI.create(source.getIri());
				IRI targetIri = IRI.create(target.getIri());
				OWLAnnotationValue value = targetIri;
				OWLAnnotationSubject sub = srcIri;
				OWLAnnotationProperty prop = dataFactory.getOWLAnnotationProperty(IRI.create(RDF.TYPE.toString()));			
				axiom = dataFactory.getOWLAnnotationAssertionAxiom(prop, sub, value);
			} else if (g_relation instanceof SLink ) {
				G_Entity source = g_relation.getSource();
				G_Entity target = g_relation.getTarget();
				IRI srcIri = IRI.create(source.getIri());
				IRI targetIri = IRI.create(target.getIri());
				OWLAnnotationValue value = targetIri;
				OWLAnnotationSubject sub = srcIri;
				OWLAnnotationProperty prop=null;
				if (source instanceof G_NamedClass && target instanceof G_NamedClass ) {
					prop = dataFactory.getOWLAnnotationProperty(IRI.create(RDFS.SUBCLASSOF.toString()));
				} else {
					prop = dataFactory.getOWLAnnotationProperty(IRI.create(RDFS.SUBPROPERTYOF.toString()));					
				}
				try {
					axiom = dataFactory.getOWLAnnotationAssertionAxiom(prop, sub, value);
				} catch (java.lang.NullPointerException e) {
					System.err.println("SLINK NOT Implemented: "+g_relation);
				}
			} else if (g_relation instanceof ELink ) {
				G_Entity source = g_relation.getSource();
				G_Entity target = g_relation.getTarget();
				IRI srcIri = IRI.create(source.getIri());
				IRI targetIri = IRI.create(target.getIri());
				OWLAnnotationValue value = targetIri;
				OWLAnnotationSubject sub = srcIri;
				OWLAnnotationProperty prop=null;
				if (source instanceof G_Collection && target instanceof G_Collection ) {
					prop = dataFactory.getOWLAnnotationProperty(IRI.create(OWL.EQUIVALENTCLASS.toString()));
				} else if (source instanceof G_Property && target instanceof G_Property ){
					prop = dataFactory.getOWLAnnotationProperty(IRI.create(OWL.EQUIVALENTPROPERTY.toString()));					
				} else {
					prop = dataFactory.getOWLAnnotationProperty(IRI.create(OWL.SAMEAS.toString()));										
				}
				try {
					axiom = dataFactory.getOWLAnnotationAssertionAxiom(prop, sub, value);
				} catch (java.lang.NullPointerException e) {
					System.err.println("SLINK NOT Implemented: "+g_relation);
				}
			} else if (g_relation instanceof ALink ) {
				G_Entity source = g_relation.getSource();
				G_Entity target = g_relation.getTarget();
				IRI srcIri = IRI.create(source.getIri());
				IRI targetIri = IRI.create(target.getIri());
				OWLAnnotationValue value = targetIri;
				OWLAnnotationSubject sub = srcIri;
				OWLAnnotationProperty prop=null;
				if (source instanceof G_Collection && target instanceof G_Property ) {
					prop = dataFactory.getOWLAnnotationProperty(IRI.create(RDFS.RANGE.toString()));
				} else if (source instanceof G_Property && target instanceof G_Collection ){
					prop = dataFactory.getOWLAnnotationProperty(IRI.create(RDFS.DOMAIN.toString()));					
				} 
				try {
					axiom = dataFactory.getOWLAnnotationAssertionAxiom(prop, sub, value);
				} catch (java.lang.NullPointerException e) {
					System.err.println("ALINK NOT Implemented: "+g_relation);
				}
			} else if (g_relation instanceof PLink ) {
				G_Entity source = g_relation.getSource();
				G_Entity target = g_relation.getTarget();
				G_Property g_prop = ((PLink)g_relation).getG_Property();
				IRI srcIri = IRI.create(source.getIri());
				IRI targetIri = IRI.create(target.getIri());
				OWLAnnotationValue value = targetIri;
				OWLAnnotationSubject sub = srcIri;
				OWLAnnotationProperty prop=dataFactory.getOWLAnnotationProperty(IRI.create(g_prop.getIri()));
				axiom = dataFactory.getOWLAnnotationAssertionAxiom(prop, sub, value);
			}
			try {
				manager.addAxiom(ontology, axiom);	
			} catch (java.lang.NullPointerException e) {
				System.err.println("NOT Implemented: "+g_relation);
			}

		}

	}
	private void save() throws OWLOntologyStorageException {
		manager.saveOntology(ontology, new TurtleDocumentFormat(), new SystemOutDocumentTarget());

	}
}
