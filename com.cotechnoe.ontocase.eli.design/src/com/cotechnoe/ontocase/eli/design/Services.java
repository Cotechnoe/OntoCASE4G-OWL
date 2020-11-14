package com.cotechnoe.ontocase.eli.design;

import org.eclipse.emf.ecore.EObject;

import com.cotechnoe.ontocase.eli.gowl.G_Annotation;
import com.cotechnoe.ontocase.eli.gowl.G_AnnotationProperty;
import com.cotechnoe.ontocase.eli.gowl.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.G_NamedClass;
import com.cotechnoe.ontocase.eli.gowl.G_NamedIndividual;
import com.cotechnoe.ontocase.eli.gowl.G_ObjectProperty;
import com.cotechnoe.ontocase.eli.gowl.G_Property;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		return self;
	}

	public boolean canCreateSlink(EObject preSource, EObject preTarget) {
		if (preSource.equals(preTarget)) return false;
		if (preSource instanceof G_NamedClass && preTarget instanceof G_NamedClass) {
			return true;
		} else if (preSource instanceof G_ObjectProperty && preTarget instanceof G_ObjectProperty) {
			return true;
		}
		return false;
	}
	public boolean canCreateAlink(EObject preSource, EObject preTarget) {
		if (preSource.equals(preTarget)) return false;
		if (preSource instanceof G_NamedClass && preTarget instanceof G_NamedClass) {
			return false;
		} else if (preSource instanceof G_ObjectProperty && preTarget instanceof G_ObjectProperty) {
			return false;
		}
		return true;
	}
	public boolean canCreateElink(EObject preSource, EObject preTarget) {
		if (preSource.equals(preTarget)) return false;
		// R1
		if (preSource instanceof G_NamedClass && preTarget instanceof G_NamedClass) {
//			System.out.println("R1 "+((G_Entity)preSource).getG_label()+ " --E--> "+ ((G_Entity)preTarget).getG_label());
			return true;
			// R2
		} else if (preSource instanceof G_ObjectProperty && preTarget instanceof G_ObjectProperty) {
//			System.out.println("R2 "+((G_Entity)preSource).getG_label()+ " --E--> "+ ((G_Entity)preTarget).getG_label());
			return true;
			// R3
		} else if (preSource instanceof G_NamedIndividual && preTarget instanceof G_NamedIndividual) {
//			System.out.println("R3 "+((G_Entity)preSource).getG_label()+ " --E--> "+ ((G_Entity)preTarget).getG_label());
			return true;
			// R4
		} else if (preSource instanceof G_Annotation || preTarget instanceof G_Annotation) {
//			System.out.println("R4 "+((G_Entity)preSource).getG_label()+ " --E--> "+ ((G_Entity)preTarget).getG_label());
			return true;
			// R5
		} else if (preSource instanceof G_Property && preTarget instanceof G_Property) {
//			System.out.println("R4 "+((G_Entity)preSource).getG_label()+ " --E--> "+ ((G_Entity)preTarget).getG_label());
			return true;
		}
		return false;
	}
}
