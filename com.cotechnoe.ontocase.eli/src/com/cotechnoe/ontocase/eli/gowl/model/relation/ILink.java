/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ILink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ILink#getI <em>I</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getILink()
 * @model
 * @generated
 */
public interface ILink extends G_TypedRelation {
	/**
	 * Returns the value of the '<em><b>I</b></em>' attribute.
	 * The default value is <code>"I"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' attribute.
	 * @see #isSetI()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getILink_I()
	 * @model default="I" unsettable="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getI();

	/**
	 * Returns whether the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ILink#getI <em>I</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>I</em>' attribute is set.
	 * @see #getI()
	 * @generated
	 */
	boolean isSetI();

} // ILink
