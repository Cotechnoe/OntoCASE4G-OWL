/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.util;

import com.cotechnoe.ontocase.eli.gowl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage
 * @generated
 */
public class GowlSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GowlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GowlSwitch() {
		if (modelPackage == null) {
			modelPackage = GowlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GowlPackage.ALINK: {
				ALink aLink = (ALink)theEObject;
				T result = caseALink(aLink);
				if (result == null) result = caseG_TypedRelation(aLink);
				if (result == null) result = caseG_Relation(aLink);
				if (result == null) result = caseG_OWL_Object(aLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GTYPED_RELATION: {
				G_TypedRelation g_TypedRelation = (G_TypedRelation)theEObject;
				T result = caseG_TypedRelation(g_TypedRelation);
				if (result == null) result = caseG_Relation(g_TypedRelation);
				if (result == null) result = caseG_OWL_Object(g_TypedRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GRELATION: {
				G_Relation g_Relation = (G_Relation)theEObject;
				T result = caseG_Relation(g_Relation);
				if (result == null) result = caseG_OWL_Object(g_Relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GOWL_OBJECT: {
				G_OWL_Object g_OWL_Object = (G_OWL_Object)theEObject;
				T result = caseG_OWL_Object(g_OWL_Object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GENTITY: {
				G_Entity g_Entity = (G_Entity)theEObject;
				T result = caseG_Entity(g_Entity);
				if (result == null) result = caseG_OWL_Object(g_Entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.DLINK: {
				DLink dLink = (DLink)theEObject;
				T result = caseDLink(dLink);
				if (result == null) result = caseG_TypedRelation(dLink);
				if (result == null) result = caseG_Relation(dLink);
				if (result == null) result = caseG_OWL_Object(dLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.ELINK: {
				ELink eLink = (ELink)theEObject;
				T result = caseELink(eLink);
				if (result == null) result = caseG_TypedRelation(eLink);
				if (result == null) result = caseG_Relation(eLink);
				if (result == null) result = caseG_OWL_Object(eLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GUNTYPED_RELATION: {
				G_UntypedRelation g_UntypedRelation = (G_UntypedRelation)theEObject;
				T result = caseG_UntypedRelation(g_UntypedRelation);
				if (result == null) result = caseG_Relation(g_UntypedRelation);
				if (result == null) result = caseG_OWL_Object(g_UntypedRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.ILINK: {
				ILink iLink = (ILink)theEObject;
				T result = caseILink(iLink);
				if (result == null) result = caseG_TypedRelation(iLink);
				if (result == null) result = caseG_Relation(iLink);
				if (result == null) result = caseG_OWL_Object(iLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.INV_LINK: {
				InvLink invLink = (InvLink)theEObject;
				T result = caseInvLink(invLink);
				if (result == null) result = caseG_TypedRelation(invLink);
				if (result == null) result = caseG_Relation(invLink);
				if (result == null) result = caseG_OWL_Object(invLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.NEGATE_PLINK: {
				NegatePLink negatePLink = (NegatePLink)theEObject;
				T result = caseNegatePLink(negatePLink);
				if (result == null) result = caseG_UntypedRelation(negatePLink);
				if (result == null) result = caseG_Relation(negatePLink);
				if (result == null) result = caseG_OWL_Object(negatePLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.PLINK: {
				PLink pLink = (PLink)theEObject;
				T result = casePLink(pLink);
				if (result == null) result = caseG_UntypedRelation(pLink);
				if (result == null) result = caseG_Relation(pLink);
				if (result == null) result = caseG_OWL_Object(pLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GPROPERTY: {
				G_Property g_Property = (G_Property)theEObject;
				T result = caseG_Property(g_Property);
				if (result == null) result = caseG_Entity(g_Property);
				if (result == null) result = caseG_OWL_Object(g_Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.SLINK: {
				SLink sLink = (SLink)theEObject;
				T result = caseSLink(sLink);
				if (result == null) result = caseG_TypedRelation(sLink);
				if (result == null) result = caseG_Relation(sLink);
				if (result == null) result = caseG_OWL_Object(sLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GANNOTATION_PROPERTY: {
				G_AnnotationProperty g_AnnotationProperty = (G_AnnotationProperty)theEObject;
				T result = caseG_AnnotationProperty(g_AnnotationProperty);
				if (result == null) result = caseG_Property(g_AnnotationProperty);
				if (result == null) result = caseG_Entity(g_AnnotationProperty);
				if (result == null) result = caseG_OWL_Object(g_AnnotationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GANONYMOUS_INDIVIDUAL: {
				G_AnonymousIndividual g_AnonymousIndividual = (G_AnonymousIndividual)theEObject;
				T result = caseG_AnonymousIndividual(g_AnonymousIndividual);
				if (result == null) result = caseG_Individual(g_AnonymousIndividual);
				if (result == null) result = caseG_Entity(g_AnonymousIndividual);
				if (result == null) result = caseG_OWL_Object(g_AnonymousIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GINDIVIDUAL: {
				G_Individual g_Individual = (G_Individual)theEObject;
				T result = caseG_Individual(g_Individual);
				if (result == null) result = caseG_Entity(g_Individual);
				if (result == null) result = caseG_OWL_Object(g_Individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GCLASS_CONTAINER: {
				G_ClassContainer g_ClassContainer = (G_ClassContainer)theEObject;
				T result = caseG_ClassContainer(g_ClassContainer);
				if (result == null) result = caseG_Container(g_ClassContainer);
				if (result == null) result = caseG_Entity(g_ClassContainer);
				if (result == null) result = caseG_OWL_Object(g_ClassContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GCONTAINER: {
				G_Container g_Container = (G_Container)theEObject;
				T result = caseG_Container(g_Container);
				if (result == null) result = caseG_Entity(g_Container);
				if (result == null) result = caseG_OWL_Object(g_Container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GCOLLECTION: {
				G_Collection g_Collection = (G_Collection)theEObject;
				T result = caseG_Collection(g_Collection);
				if (result == null) result = caseG_Entity(g_Collection);
				if (result == null) result = caseG_OWL_Object(g_Collection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GLITERAL: {
				G_Literal g_Literal = (G_Literal)theEObject;
				T result = caseG_Literal(g_Literal);
				if (result == null) result = caseG_SingleObject(g_Literal);
				if (result == null) result = caseG_Entity(g_Literal);
				if (result == null) result = caseG_OWL_Object(g_Literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GSINGLE_OBJECT: {
				G_SingleObject g_SingleObject = (G_SingleObject)theEObject;
				T result = caseG_SingleObject(g_SingleObject);
				if (result == null) result = caseG_Entity(g_SingleObject);
				if (result == null) result = caseG_OWL_Object(g_SingleObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GNAMED_CLASS: {
				G_NamedClass g_NamedClass = (G_NamedClass)theEObject;
				T result = caseG_NamedClass(g_NamedClass);
				if (result == null) result = caseG_Collection(g_NamedClass);
				if (result == null) result = caseG_Entity(g_NamedClass);
				if (result == null) result = caseG_OWL_Object(g_NamedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GNAMED_INDIVIDUAL: {
				G_NamedIndividual g_NamedIndividual = (G_NamedIndividual)theEObject;
				T result = caseG_NamedIndividual(g_NamedIndividual);
				if (result == null) result = caseG_Individual(g_NamedIndividual);
				if (result == null) result = caseG_Entity(g_NamedIndividual);
				if (result == null) result = caseG_OWL_Object(g_NamedIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GOBJECT_INTERSECTION_OF: {
				G_ObjectIntersectionOf g_ObjectIntersectionOf = (G_ObjectIntersectionOf)theEObject;
				T result = caseG_ObjectIntersectionOf(g_ObjectIntersectionOf);
				if (result == null) result = caseG_ClassContainer(g_ObjectIntersectionOf);
				if (result == null) result = caseG_Container(g_ObjectIntersectionOf);
				if (result == null) result = caseG_Entity(g_ObjectIntersectionOf);
				if (result == null) result = caseG_OWL_Object(g_ObjectIntersectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GOBJECT_PROPERTY: {
				G_ObjectProperty g_ObjectProperty = (G_ObjectProperty)theEObject;
				T result = caseG_ObjectProperty(g_ObjectProperty);
				if (result == null) result = caseG_Property(g_ObjectProperty);
				if (result == null) result = caseG_Entity(g_ObjectProperty);
				if (result == null) result = caseG_OWL_Object(g_ObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GPREFIX: {
				G_Prefix g_Prefix = (G_Prefix)theEObject;
				T result = caseG_Prefix(g_Prefix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GANNOTATION: {
				G_Annotation g_Annotation = (G_Annotation)theEObject;
				T result = caseG_Annotation(g_Annotation);
				if (result == null) result = caseG_SingleObject(g_Annotation);
				if (result == null) result = caseG_Entity(g_Annotation);
				if (result == null) result = caseG_OWL_Object(g_Annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.IRI: {
				IRI iri = (IRI)theEObject;
				T result = caseIRI(iri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GOWL_DOCUMENT: {
				G_OWL_Document g_OWL_Document = (G_OWL_Document)theEObject;
				T result = caseG_OWL_Document(g_OWL_Document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.ENTITIES_GROUP: {
				EntitiesGroup entitiesGroup = (EntitiesGroup)theEObject;
				T result = caseEntitiesGroup(entitiesGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.RELATIONS_GROUP: {
				RelationsGroup relationsGroup = (RelationsGroup)theEObject;
				T result = caseRelationsGroup(relationsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GowlPackage.GANNOTATION_CLASS: {
				G_AnnotationClass g_AnnotationClass = (G_AnnotationClass)theEObject;
				T result = caseG_AnnotationClass(g_AnnotationClass);
				if (result == null) result = caseG_Collection(g_AnnotationClass);
				if (result == null) result = caseG_Entity(g_AnnotationClass);
				if (result == null) result = caseG_OWL_Object(g_AnnotationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GOWL Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GOWL Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_OWL_Document(G_OWL_Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entities Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entities Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntitiesGroup(EntitiesGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relations Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relations Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationsGroup(RelationsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GAnnotation Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GAnnotation Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_AnnotationClass(G_AnnotationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GIndividual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GIndividual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Individual(G_Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRelation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRelation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Relation(G_Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GOWL Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GOWL Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_OWL_Object(G_OWL_Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPrefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPrefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Prefix(G_Prefix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Annotation(G_Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRI(IRI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEntity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEntity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Entity(G_Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GObject Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GObject Intersection Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_ObjectIntersectionOf(G_ObjectIntersectionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GClass Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GClass Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_ClassContainer(G_ClassContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GContainer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GContainer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Container(G_Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCollection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCollection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Collection(G_Collection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GAnnotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GAnnotation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_AnnotationProperty(G_AnnotationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Property(G_Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GObject Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GObject Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_ObjectProperty(G_ObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GAnonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GAnonymous Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_AnonymousIndividual(G_AnonymousIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNamed Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNamed Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_NamedIndividual(G_NamedIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNamed Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNamed Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_NamedClass(G_NamedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSingle Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSingle Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_SingleObject(G_SingleObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Literal(G_Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTyped Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTyped Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_TypedRelation(G_TypedRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILink(ILink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePLink(PLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUntyped Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUntyped Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_UntypedRelation(G_UntypedRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLink(SLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELink(ELink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALink(ALink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inv Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inv Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvLink(InvLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negate PLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negate PLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatePLink(NegatePLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDLink(DLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GowlSwitch
