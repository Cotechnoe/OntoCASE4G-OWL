package com.cotechnoe.ontocase.eli.gowl2owl.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.io.SystemOutDocumentTarget;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public class ConvertTTLtoFunc {

	public static void main(String[] args) throws FileNotFoundException, OWLOntologyCreationException, OWLOntologyStorageException {
		String filename = "owlPrimer";
		String rep = "/home/heon/00-PROJECT-OntoCASE-WEB/00-GIT/OntoCASE4G-OWL/com.cotechnoe.ontocase.eli.gowl2owl/ontologies/owlPrimer/";

		File inputFile = new File(rep+filename+".ttl");
		FileOutputStream outputFile = new FileOutputStream(rep+filename+".func");
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = manager.loadOntologyFromOntologyDocument(inputFile);
		OWLDataFactory dataFactory = ontology.getOWLOntologyManager().getOWLDataFactory();
        manager.saveOntology(ontology, new FunctionalSyntaxDocumentFormat(), new SystemOutDocumentTarget());
	}

}
