/**
 * Copyright Text	(c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entities Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.EntitiesGroup#getName <em>Name</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.EntitiesGroup#getG_entities <em>Gentities</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getEntitiesGroup()
 * @model
 * @generated
 */
public interface EntitiesGroup extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Entities "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getEntitiesGroup_Name()
	 * @model default="Entities " required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.EntitiesGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gentities</b></em>' containment reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.G_Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gentities</em>' containment reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getEntitiesGroup_G_entities()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<G_Entity> getG_entities();

} // EntitiesGroup
