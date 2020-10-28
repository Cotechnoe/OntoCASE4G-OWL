/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DLink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.relation.DLink#getD <em>D</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getDLink()
 * @model
 * @generated
 */
public interface DLink extends G_TypedRelation {
	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * The default value is <code>"D"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #isSetD()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getDLink_D()
	 * @model default="D" unsettable="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getD();

	/**
	 * Returns whether the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.DLink#getD <em>D</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>D</em>' attribute is set.
	 * @see #getD()
	 * @generated
	 */
	boolean isSetD();

} // DLink
