/**
 * Copyright Text	(c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GOWL Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getG_labelType <em>Glabel Type</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getLabel <em>Label</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getG_label <em>Glabel</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Object()
 * @model abstract="true"
 * @generated
 */
public interface G_OWL_Object extends EObject {
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
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Object_G_labelType()
	 * @model ordered="false"
	 * @generated
	 */
	G_LABEL_TYPE getG_labelType();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getG_labelType <em>Glabel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glabel Type</em>' attribute.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE
	 * @see #getG_labelType()
	 * @generated
	 */
	void setG_labelType(G_LABEL_TYPE value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Object_Label()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glabel</em>' attribute.
	 * @see #setG_label(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Object_G_label()
	 * @model required="true" volatile="true" ordered="false"
	 * @generated
	 */
	String getG_label();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getG_label <em>Glabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glabel</em>' attribute.
	 * @see #getG_label()
	 * @generated
	 */
	void setG_label(String value);

} // G_OWL_Object
