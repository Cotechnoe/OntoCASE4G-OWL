/**
 * Copyright Text	(c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GAnnotation CLass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_AnnotationCLass#getG_ClassType <em>GClass Type</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_AnnotationCLass()
 * @model
 * @generated
 */
public interface G_AnnotationCLass extends G_Collection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * Returns the value of the '<em><b>GClass Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cotechnoe.ontocase.eli.gowl.G_ClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GClass Type</em>' attribute.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ClassType
	 * @see #setG_ClassType(G_ClassType)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_AnnotationCLass_G_ClassType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	G_ClassType getG_ClassType();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_AnnotationCLass#getG_ClassType <em>GClass Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GClass Type</em>' attribute.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ClassType
	 * @see #getG_ClassType()
	 * @generated
	 */
	void setG_ClassType(G_ClassType value);

} // G_AnnotationCLass
