/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsTargetOf <em>Is Target Of</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getIri <em>Iri</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getG_iri_status <em>Giri status</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsSourceOf <em>Is Source Of</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Entity()
 * @model abstract="true"
 * @generated
 */
public interface G_Entity extends G_OWL_Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * Returns the value of the '<em><b>Is Source Of</b></em>' reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.G_Relation}.
	 * It is bidirectional and its opposite is '{@link com.cotechnoe.ontocase.eli.gowl.G_Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Of</em>' reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Entity_IsSourceOf()
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Relation#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<G_Relation> getIsSourceOf();

	/**
	 * Returns the value of the '<em><b>Is Target Of</b></em>' reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.G_Relation}.
	 * It is bidirectional and its opposite is '{@link com.cotechnoe.ontocase.eli.gowl.G_Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Target Of</em>' reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Entity_IsTargetOf()
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Relation#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<G_Relation> getIsTargetOf();

	/**
	 * Returns the value of the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri</em>' attribute.
	 * @see #setIri(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Entity_Iri()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getIri();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getIri <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri</em>' attribute.
	 * @see #getIri()
	 * @generated
	 */
	void setIri(String value);

	/**
	 * Returns the value of the '<em><b>Giri status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cotechnoe.ontocase.eli.gowl.G_IRI_Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Giri status</em>' attribute.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_IRI_Status
	 * @see #setG_iri_status(G_IRI_Status)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_Entity_G_iri_status()
	 * @model ordered="false"
	 * @generated
	 */
	G_IRI_Status getG_iri_status();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getG_iri_status <em>Giri status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Giri status</em>' attribute.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_IRI_Status
	 * @see #getG_iri_status()
	 * @generated
	 */
	void setG_iri_status(G_IRI_Status value);

} // G_Entity
