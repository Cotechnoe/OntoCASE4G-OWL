/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.entity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.EntityPackage
 * @generated
 */
public interface EntityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityFactory eINSTANCE = com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GObject Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GObject Intersection Of</em>'.
	 * @generated
	 */
	G_ObjectIntersectionOf createG_ObjectIntersectionOf();

	/**
	 * Returns a new object of class '<em>GAnnotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAnnotation Property</em>'.
	 * @generated
	 */
	G_AnnotationProperty createG_AnnotationProperty();

	/**
	 * Returns a new object of class '<em>GObject Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GObject Property</em>'.
	 * @generated
	 */
	G_ObjectProperty createG_ObjectProperty();

	/**
	 * Returns a new object of class '<em>GAnonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAnonymous Individual</em>'.
	 * @generated
	 */
	G_AnonymousIndividual createG_AnonymousIndividual();

	/**
	 * Returns a new object of class '<em>GNamed Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNamed Individual</em>'.
	 * @generated
	 */
	G_NamedIndividual createG_NamedIndividual();

	/**
	 * Returns a new object of class '<em>GNamed Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNamed Class</em>'.
	 * @generated
	 */
	G_NamedClass createG_NamedClass();

	/**
	 * Returns a new object of class '<em>GResource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GResource</em>'.
	 * @generated
	 */
	G_Resource createG_Resource();

	/**
	 * Returns a new object of class '<em>GLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GLiteral</em>'.
	 * @generated
	 */
	G_Literal createG_Literal();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EntityPackage getEntityPackage();

} //EntityFactory
