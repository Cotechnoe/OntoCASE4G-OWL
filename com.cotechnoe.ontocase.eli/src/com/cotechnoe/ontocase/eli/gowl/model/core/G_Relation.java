/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GRelation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getG_label <em>Glabel</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getIri <em>Iri</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getSource <em>Source</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Relation()
 * @model abstract="true"
 * @generated
 */
public interface G_Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glabel</em>' attribute.
	 * @see #setG_label(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Relation_G_label()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getG_label();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getG_label <em>Glabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glabel</em>' attribute.
	 * @see #getG_label()
	 * @generated
	 */
	void setG_label(String value);

	/**
	 * Returns the value of the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri</em>' attribute.
	 * @see #setIri(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Relation_Iri()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getIri();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getIri <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri</em>' attribute.
	 * @see #getIri()
	 * @generated
	 */
	void setIri(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsSourceOf <em>Is Source Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(G_Entity)
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Relation_Source()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsSourceOf
	 * @model opposite="isSourceOf" ordered="false"
	 * @generated
	 */
	G_Entity getSource();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(G_Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsTargetOf <em>Is Target Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(G_Entity)
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Relation_Target()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsTargetOf
	 * @model opposite="isTargetOf" ordered="false"
	 * @generated
	 */
	G_Entity getTarget();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(G_Entity value);

} // G_Relation
