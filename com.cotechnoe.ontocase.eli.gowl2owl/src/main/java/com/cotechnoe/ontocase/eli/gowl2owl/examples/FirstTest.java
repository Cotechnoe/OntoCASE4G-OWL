package com.cotechnoe.ontocase.eli.gowl2owl.examples;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

import uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl;


public class FirstTest {

	public static void main(String[] args) throws OWLOntologyCreationException, OWLOntologyStorageException {
		
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		File file = new File("/home/heon/00-PROJECT-OntoCASE-WEB/00-GIT/VIVO-Sample-Data/sample-dataset/exemple1.ttl");
		OWLOntology ont = manager.loadOntologyFromOntologyDocument(file);
		Stream<OWLEntity> resu = ont.signature();
		for (Iterator iterator = resu.iterator(); iterator.hasNext();) {
			OWLEntity owlAxiom = (OWLEntity) iterator.next();
//	 ressu = ont.getDeclarationAxioms(owlAxiom.getS);

//			if (owlAxiom instanceof OWLDeclarationAxiom) 
				System.out.println(owlAxiom + " ----- " +owlAxiom.getClass().getName());
		}
//		manager.saveOntology(ont, new FunctionalSyntaxDocumentFormat(), System.out);
//		System.out.println(resu);
//		Set<OWLClass> clss = ont.getClassesInSignature();
//		System.out.println("---------------------------------");				
//		for (Iterator iterator = clss.iterator(); iterator.hasNext();) {
//			OWLClass cls = (OWLClass) iterator.next();
//			System.out.println(cls);
//			ont.get
//			Set<OWLAnnotationAssertionAxiom> anno = ont.getAnnotations( cls);
//			for (Iterator iterator2 = anno.iterator(); iterator2.hasNext();) {
//				OWLAnnotationAssertionAxiom owlAnnotationProperty = (OWLAnnotationAssertionAxiom) iterator2.next();
//				System.out.println("---->" +owlAnnotationProperty);				
//			}
//			
//		}
//		Set<OWLClass> classes = ont.getClassesInSignature();
//		for (Iterator iterator = classes.iterator(); iterator.hasNext();) {
//			OWLClass owlClass = (OWLClass) iterator.next();
//			System.out.println(owlClass);
//			Set<OWLObjectProperty> sig = owlClass.getObjectPropertiesInSignature();
//			for (Iterator iterator2 = sig.iterator(); iterator2.hasNext();) {
//				OWLObjectProperty owlEntity = (OWLObjectProperty) iterator2.next();
//				System.out.println("---->" +owlEntity);				
//			}
//		}
		
		

	}

}
