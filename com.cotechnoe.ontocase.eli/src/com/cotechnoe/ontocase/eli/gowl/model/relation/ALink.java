/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ALink#getA <em>A</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getALink()
 * @model
 * @generated
 */
public interface ALink extends G_TypedRelation {
	/**
	 * Returns the value of the '<em><b>A</b></em>' attribute.
	 * The default value is <code>"A"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' attribute.
	 * @see #isSetA()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getALink_A()
	 * @model default="A" unsettable="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getA();

	/**
	 * Returns whether the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ALink#getA <em>A</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>A</em>' attribute is set.
	 * @see #getA()
	 * @generated
	 */
	boolean isSetA();

} // ALink
