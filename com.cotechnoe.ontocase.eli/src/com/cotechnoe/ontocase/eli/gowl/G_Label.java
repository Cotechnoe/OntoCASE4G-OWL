/**
 * Copyright Text	(c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GLabel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_Label#getG_labelType <em>Glabel Type</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_Label#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Label()
 * @model
 * @generated
 */
public interface G_Label extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * Returns the value of the '<em><b>Glabel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glabel Type</em>' attribute.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE
	 * @see #setG_labelType(G_LABEL_TYPE)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Label_G_labelType()
	 * @model ordered="false"
	 * @generated
	 */
	G_LABEL_TYPE getG_labelType();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_Label#getG_labelType <em>Glabel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glabel Type</em>' attribute.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE
	 * @see #getG_labelType()
	 * @generated
	 */
	void setG_labelType(G_LABEL_TYPE value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Label_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_Label#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // G_Label
