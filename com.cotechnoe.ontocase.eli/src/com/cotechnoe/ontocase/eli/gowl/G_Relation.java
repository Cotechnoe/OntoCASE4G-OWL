/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GRelation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_Relation#getSource <em>Source</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_Relation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Relation()
 * @model abstract="true"
 * @generated
 */
public interface G_Relation extends G_OWL_Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsSourceOf <em>Is Source Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(G_Entity)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Relation_Source()
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsSourceOf
	 * @model opposite="isSourceOf" ordered="false"
	 * @generated
	 */
	G_Entity getSource();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(G_Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsTargetOf <em>Is Target Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(G_Entity)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Relation_Target()
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsTargetOf
	 * @model opposite="isTargetOf" ordered="false"
	 * @generated
	 */
	G_Entity getTarget();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(G_Entity value);

} // G_Relation
