/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.entity.util;

import com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity;

import com.cotechnoe.ontocase.eli.gowl.model.entity.*;

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
 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.EntityPackage
 * @generated
 */
public class EntitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EntityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitySwitch() {
		if (modelPackage == null) {
			modelPackage = EntityPackage.eINSTANCE;
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
			case EntityPackage.GOBJECT_INTERSECTION_OF: {
				G_ObjectIntersectionOf g_ObjectIntersectionOf = (G_ObjectIntersectionOf)theEObject;
				T result = caseG_ObjectIntersectionOf(g_ObjectIntersectionOf);
				if (result == null) result = caseG_ClassContainer(g_ObjectIntersectionOf);
				if (result == null) result = caseG_Container(g_ObjectIntersectionOf);
				if (result == null) result = caseG_Entity(g_ObjectIntersectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GCLASS_CONTAINER: {
				G_ClassContainer g_ClassContainer = (G_ClassContainer)theEObject;
				T result = caseG_ClassContainer(g_ClassContainer);
				if (result == null) result = caseG_Container(g_ClassContainer);
				if (result == null) result = caseG_Entity(g_ClassContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GCONTAINER: {
				G_Container g_Container = (G_Container)theEObject;
				T result = caseG_Container(g_Container);
				if (result == null) result = caseG_Entity(g_Container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GCOLLECTION: {
				G_Collection g_Collection = (G_Collection)theEObject;
				T result = caseG_Collection(g_Collection);
				if (result == null) result = caseG_Entity(g_Collection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GANNOTATION_PROPERTY: {
				G_AnnotationProperty g_AnnotationProperty = (G_AnnotationProperty)theEObject;
				T result = caseG_AnnotationProperty(g_AnnotationProperty);
				if (result == null) result = caseG_Property(g_AnnotationProperty);
				if (result == null) result = caseG_Entity(g_AnnotationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GPROPERTY: {
				G_Property g_Property = (G_Property)theEObject;
				T result = caseG_Property(g_Property);
				if (result == null) result = caseG_Entity(g_Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GOBJECT_PROPERTY: {
				G_ObjectProperty g_ObjectProperty = (G_ObjectProperty)theEObject;
				T result = caseG_ObjectProperty(g_ObjectProperty);
				if (result == null) result = caseG_Property(g_ObjectProperty);
				if (result == null) result = caseG_Entity(g_ObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GANONYMOUS_INDIVIDUAL: {
				G_AnonymousIndividual g_AnonymousIndividual = (G_AnonymousIndividual)theEObject;
				T result = caseG_AnonymousIndividual(g_AnonymousIndividual);
				if (result == null) result = caseG_Individual(g_AnonymousIndividual);
				if (result == null) result = caseG_Entity(g_AnonymousIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GINDIVIDUAL: {
				G_Individual g_Individual = (G_Individual)theEObject;
				T result = caseG_Individual(g_Individual);
				if (result == null) result = caseG_Entity(g_Individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GNAMED_INDIVIDUAL: {
				G_NamedIndividual g_NamedIndividual = (G_NamedIndividual)theEObject;
				T result = caseG_NamedIndividual(g_NamedIndividual);
				if (result == null) result = caseG_Individual(g_NamedIndividual);
				if (result == null) result = caseG_Entity(g_NamedIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GNAMED_CLASS: {
				G_NamedClass g_NamedClass = (G_NamedClass)theEObject;
				T result = caseG_NamedClass(g_NamedClass);
				if (result == null) result = caseG_Collection(g_NamedClass);
				if (result == null) result = caseG_Entity(g_NamedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GRESOURCE: {
				G_Resource g_Resource = (G_Resource)theEObject;
				T result = caseG_Resource(g_Resource);
				if (result == null) result = caseG_SingleObject(g_Resource);
				if (result == null) result = caseG_Entity(g_Resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GSINGLE_OBJECT: {
				G_SingleObject g_SingleObject = (G_SingleObject)theEObject;
				T result = caseG_SingleObject(g_SingleObject);
				if (result == null) result = caseG_Entity(g_SingleObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityPackage.GLITERAL: {
				G_Literal g_Literal = (G_Literal)theEObject;
				T result = caseG_Literal(g_Literal);
				if (result == null) result = caseG_SingleObject(g_Literal);
				if (result == null) result = caseG_Entity(g_Literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>GResource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GResource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Resource(G_Resource object) {
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

} //EntitySwitch
