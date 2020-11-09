/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import org.eclipse.emf.common.util.EList;


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
	 * Returns the value of the '<em><b>GProperty</b></em>' containment reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.G_Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * À transformer en volatile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GProperty</em>' containment reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getPLink_G_Property()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<G_Property> getG_Property();
} // PLink
