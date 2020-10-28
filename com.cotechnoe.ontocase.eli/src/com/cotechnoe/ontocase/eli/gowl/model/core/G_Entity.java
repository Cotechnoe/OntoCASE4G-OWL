/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsSourceOf <em>Is Source Of</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsTargetOf <em>Is Target Of</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getG_label <em>Glabel</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIri <em>Iri</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Entity()
 * @model abstract="true"
 * @generated
 */
public interface G_Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Source Of</b></em>' reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation}.
	 * It is bidirectional and its opposite is '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Of</em>' reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Entity_IsSourceOf()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<G_Relation> getIsSourceOf();

	/**
	 * Returns the value of the '<em><b>Is Target Of</b></em>' reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation}.
	 * It is bidirectional and its opposite is '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Target Of</em>' reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Entity_IsTargetOf()
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<G_Relation> getIsTargetOf();

	/**
	 * Returns the value of the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glabel</em>' attribute.
	 * @see #setG_label(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Entity_G_label()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getG_label();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getG_label <em>Glabel</em>}' attribute.
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
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Entity_Iri()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getIri();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIri <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri</em>' attribute.
	 * @see #getIri()
	 * @generated
	 */
	void setIri(String value);

} // G_Entity
