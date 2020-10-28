/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.GowlFactory
 * @model kind="package"
 * @generated
 */
public interface GowlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gowl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cotechnoe.com/vocabulary/g-owl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gowl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GowlPackage eINSTANCE = com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl <em>GOWL Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_OWL_Document()
	 * @generated
	 */
	int GOWL_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Gentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT__GENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Grelations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT__GRELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Gprefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT__GPREFIX = 2;

	/**
	 * The feature id for the '<em><b>Base IRI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT__BASE_IRI = 3;

	/**
	 * The number of structural features of the '<em>GOWL Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GOWL Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document <em>GOWL Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GOWL Document</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Document
	 * @generated
	 */
	EClass getG_OWL_Document();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getG_entities <em>Gentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gentities</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getG_entities()
	 * @see #getG_OWL_Document()
	 * @generated
	 */
	EReference getG_OWL_Document_G_entities();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getG_relations <em>Grelations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grelations</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getG_relations()
	 * @see #getG_OWL_Document()
	 * @generated
	 */
	EReference getG_OWL_Document_G_relations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getG_prefix <em>Gprefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gprefix</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getG_prefix()
	 * @see #getG_OWL_Document()
	 * @generated
	 */
	EReference getG_OWL_Document_G_prefix();

	/**
	 * Returns the meta object for the reference '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getBaseIRI <em>Base IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base IRI</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getBaseIRI()
	 * @see #getG_OWL_Document()
	 * @generated
	 */
	EReference getG_OWL_Document_BaseIRI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GowlFactory getGowlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl <em>GOWL Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_OWL_Document()
		 * @generated
		 */
		EClass GOWL_DOCUMENT = eINSTANCE.getG_OWL_Document();

		/**
		 * The meta object literal for the '<em><b>Gentities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOWL_DOCUMENT__GENTITIES = eINSTANCE.getG_OWL_Document_G_entities();

		/**
		 * The meta object literal for the '<em><b>Grelations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOWL_DOCUMENT__GRELATIONS = eINSTANCE.getG_OWL_Document_G_relations();

		/**
		 * The meta object literal for the '<em><b>Gprefix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOWL_DOCUMENT__GPREFIX = eINSTANCE.getG_OWL_Document_G_prefix();

		/**
		 * The meta object literal for the '<em><b>Base IRI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOWL_DOCUMENT__BASE_IRI = eINSTANCE.getG_OWL_Document_BaseIRI();

	}

} //GowlPackage
