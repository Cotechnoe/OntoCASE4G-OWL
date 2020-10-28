/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPrefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix#getNs <em>Ns</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix#getIri <em>Iri</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Prefix()
 * @model
 * @generated
 */
public interface G_Prefix extends EObject {
	/**
	 * Returns the value of the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns</em>' attribute.
	 * @see #setNs(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Prefix_Ns()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNs();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(String value);

	/**
	 * Returns the value of the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri</em>' attribute.
	 * @see #setIri(String)
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#getG_Prefix_Iri()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getIri();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix#getIri <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri</em>' attribute.
	 * @see #getIri()
	 * @generated
	 */
	void setIri(String value);

} // G_Prefix
