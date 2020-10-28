/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.impl;

import com.cotechnoe.ontocase.eli.gowl.G_OWL_Document;
import com.cotechnoe.ontocase.eli.gowl.GowlFactory;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;

import com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage;

import com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl;

import com.cotechnoe.ontocase.eli.gowl.model.entity.EntityPackage;

import com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl;

import com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage;

import com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GowlPackageImpl extends EPackageImpl implements GowlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_OWL_DocumentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GowlPackageImpl() {
		super(eNS_URI, GowlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GowlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GowlPackage init() {
		if (isInited) return (GowlPackage)EPackage.Registry.INSTANCE.getEPackage(GowlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGowlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GowlPackageImpl theGowlPackage = registeredGowlPackage instanceof GowlPackageImpl ? (GowlPackageImpl)registeredGowlPackage : new GowlPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationPackage.eNS_URI);
		RelationPackageImpl theRelationPackage = (RelationPackageImpl)(registeredPackage instanceof RelationPackageImpl ? registeredPackage : RelationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theGowlPackage.createPackageContents();
		theRelationPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theGowlPackage.initializePackageContents();
		theRelationPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGowlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GowlPackage.eNS_URI, theGowlPackage);
		return theGowlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_OWL_Document() {
		return g_OWL_DocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_OWL_Document_G_entities() {
		return (EReference)g_OWL_DocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_OWL_Document_G_relations() {
		return (EReference)g_OWL_DocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_OWL_Document_G_prefix() {
		return (EReference)g_OWL_DocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_OWL_Document_BaseIRI() {
		return (EReference)g_OWL_DocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GowlFactory getGowlFactory() {
		return (GowlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		g_OWL_DocumentEClass = createEClass(GOWL_DOCUMENT);
		createEReference(g_OWL_DocumentEClass, GOWL_DOCUMENT__GENTITIES);
		createEReference(g_OWL_DocumentEClass, GOWL_DOCUMENT__GRELATIONS);
		createEReference(g_OWL_DocumentEClass, GOWL_DOCUMENT__GPREFIX);
		createEReference(g_OWL_DocumentEClass, GOWL_DOCUMENT__BASE_IRI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RelationPackage theRelationPackage = (RelationPackage)EPackage.Registry.INSTANCE.getEPackage(RelationPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRelationPackage);
		getESubpackages().add(theEntityPackage);
		getESubpackages().add(theCorePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(g_OWL_DocumentEClass, G_OWL_Document.class, "G_OWL_Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getG_OWL_Document_G_entities(), theCorePackage.getG_Entity(), null, "g_entities", null, 0, -1, G_OWL_Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_OWL_Document_G_relations(), theCorePackage.getG_Relation(), null, "g_relations", null, 0, -1, G_OWL_Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_OWL_Document_G_prefix(), theCorePackage.getG_Prefix(), null, "g_prefix", null, 0, -1, G_OWL_Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_OWL_Document_BaseIRI(), theCorePackage.getIRI(), null, "baseIRI", null, 1, 1, G_OWL_Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GowlPackageImpl
