/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ELink#getE <em>E</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getELink()
 * @model
 * @generated
 */
public interface ELink extends G_TypedRelation {
	/**
	 * Returns the value of the '<em><b>E</b></em>' attribute.
	 * The default value is <code>"E"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' attribute.
	 * @see #isSetE()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getELink_E()
	 * @model default="E" unsettable="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getE();

	/**
	 * Returns whether the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ELink#getE <em>E</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>E</em>' attribute is set.
	 * @see #getE()
	 * @generated
	 */
	boolean isSetE();

} // ELink
