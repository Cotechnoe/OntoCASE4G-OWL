/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inv Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.relation.InvLink#getInv <em>Inv</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getInvLink()
 * @model
 * @generated
 */
public interface InvLink extends G_TypedRelation {
	/**
	 * Returns the value of the '<em><b>Inv</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv</em>' attribute.
	 * @see #isSetInv()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getInvLink_Inv()
	 * @model default="-1" unsettable="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getInv();

	/**
	 * Returns whether the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.InvLink#getInv <em>Inv</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inv</em>' attribute is set.
	 * @see #getInv()
	 * @generated
	 */
	boolean isSetInv();

} // InvLink
