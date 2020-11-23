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
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import com.cotechnoe.ontocase.eli.gowl.G_Annotation;
import com.cotechnoe.ontocase.eli.gowl.G_AnnotationProperty;
import com.cotechnoe.ontocase.eli.gowl.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.G_NamedClass;
import com.cotechnoe.ontocase.eli.gowl.G_NamedIndividual;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Document;
import com.cotechnoe.ontocase.eli.gowl.G_ObjectProperty;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;
import com.cotechnoe.ontocase.eli.gowl.util.GowlResourceFactoryImpl;

/**
 * @author heon
 *
 */
public class ExportToOwlFileHelper {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "Enseigner";
		String rep = "/home/heon/00-PROJECT-OntoCASE-WEB/00-GIT/OntoCASE4G-OWL/com.cotechnoe.ontocase.eli.gowl2owl/ontologies/gowlToOwl/";

		File inputFile = new File(rep+filename+".gowl");
		FileOutputStream outputFile = new FileOutputStream(rep+filename+".ttl");
		ExportToOwlFileHelper exporter = new ExportToOwlFileHelper(inputFile, outputFile);
		exporter.parseModel();
	}
	private void parseModel() {
		parseEntities();
		
	}
	private void parseEntities() {
		EList<G_Entity> entities = GOWLOntology.getGroupOfEntities().getG_entities();
		for (G_Entity g_Entity : entities) {
			String label = g_Entity.getG_label();
			String iri = g_Entity.getIri();
			
			if (g_Entity instanceof G_Annotation ) {
				
			} else if (g_Entity instanceof G_NamedIndividual ) {
				dataFactory.getOWLNamedIndividual(IRI.create(iri));
			} else if (g_Entity instanceof G_NamedClass ) {
				
			} else if (g_Entity instanceof G_ObjectProperty ) {
				
			} else if (g_Entity instanceof G_AnnotationProperty ) {
				
			} else {
				System.err.println("Entity not Supported "+g_Entity);
			}
			
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
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
}
