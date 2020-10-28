/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.relation.SLink#getS <em>S</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getSLink()
 * @model
 * @generated
 */
public interface SLink extends G_TypedRelation {
	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * The default value is <code>"S"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see #isSetS()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getSLink_S()
	 * @model default="S" unsettable="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getS();

	/**
	 * Returns whether the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.SLink#getS <em>S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>S</em>' attribute is set.
	 * @see #getS()
	 * @generated
	 */
	boolean isSetS();

} // SLink
