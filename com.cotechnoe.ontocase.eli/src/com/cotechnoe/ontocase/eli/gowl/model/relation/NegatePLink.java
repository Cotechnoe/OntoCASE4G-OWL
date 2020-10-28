/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negate PLink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink#getNOT <em>NOT</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getNegatePLink()
 * @model
 * @generated
 */
public interface NegatePLink extends G_UntypedRelation {
	/**
	 * Returns the value of the '<em><b>NOT</b></em>' attribute.
	 * The default value is <code>"NOT"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOT</em>' attribute.
	 * @see #isSetNOT()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#getNegatePLink_NOT()
	 * @model default="NOT" unsettable="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getNOT();

	/**
	 * Returns whether the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink#getNOT <em>NOT</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NOT</em>' attribute is set.
	 * @see #getNOT()
	 * @generated
	 */
	boolean isSetNOT();

} // NegatePLink
