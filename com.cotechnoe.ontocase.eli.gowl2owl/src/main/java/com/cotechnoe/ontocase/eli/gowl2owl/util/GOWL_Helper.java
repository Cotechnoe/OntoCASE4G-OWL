package com.cotechnoe.ontocase.eli.gowl2owl.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;

import com.cotechnoe.ontocase.eli.gowl.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Document;

public class GOWL_Helper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static G_Entity fingGowlResourceByIRI(G_OWL_Document GOWLOntology, IRI entityIRI) {
		EList<G_Entity> entities = GOWLOntology.getGroupOfEntities().getG_entities();
		for (Iterator iterator = entities.iterator(); iterator.hasNext();) {
			G_Entity g_Entity = (G_Entity) iterator.next();
			if (g_Entity.getIri().equals(entityIRI.toString())) {
				return g_Entity;
			}
		}
		return null;
	}

	public static G_Entity fingOwlEntityByIRI(OWLOntology ontology, IRI srcIri) {
		
		// TODO Auto-generated method stub
		return null;
	}


}
