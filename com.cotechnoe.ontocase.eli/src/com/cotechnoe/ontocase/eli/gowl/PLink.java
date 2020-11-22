/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.PLink#getG_Property <em>GProperty</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getPLink()
 * @model
 * @generated
 */
public interface PLink extends G_UntypedRelation {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * Returns the value of the '<em><b>GProperty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GProperty</em>' reference.
	 * @see #setG_Property(G_Property)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getPLink_G_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	G_Property getG_Property();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.PLink#getG_Property <em>GProperty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GProperty</em>' reference.
	 * @see #getG_Property()
	 * @generated
	 */
	void setG_Property(G_Property value);
} // PLink
