/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.core.impl;

import com.cotechnoe.ontocase.eli.gowl.GowlPackage;

import com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl;

import com.cotechnoe.ontocase.eli.gowl.model.core.CoreFactory;
import com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage;
import com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix;
import com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation;
import com.cotechnoe.ontocase.eli.gowl.model.core.G_Resource;

import com.cotechnoe.ontocase.eli.gowl.model.entity.EntityPackage;

import com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl;

import com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage;

import com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_RelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_ResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_PrefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_EntityEClass = null;

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
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl ? (CorePackageImpl)registeredCorePackage : new CorePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GowlPackage.eNS_URI);
		GowlPackageImpl theGowlPackage = (GowlPackageImpl)(registeredPackage instanceof GowlPackageImpl ? registeredPackage : GowlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationPackage.eNS_URI);
		RelationPackageImpl theRelationPackage = (RelationPackageImpl)(registeredPackage instanceof RelationPackageImpl ? registeredPackage : RelationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theGowlPackage.createPackageContents();
		theRelationPackage.createPackageContents();
		theEntityPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theGowlPackage.initializePackageContents();
		theRelationPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_Relation() {
		return g_RelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_Relation_G_label() {
		return (EAttribute)g_RelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_Relation_Iri() {
		return (EAttribute)g_RelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_Relation_Source() {
		return (EReference)g_RelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_Relation_Target() {
		return (EReference)g_RelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_Resource() {
		return g_ResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_Prefix() {
		return g_PrefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_Prefix_Ns() {
		return (EAttribute)g_PrefixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_Prefix_Iri() {
		return (EAttribute)g_PrefixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIRI() {
		return iriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIRI_Iri() {
		return (EAttribute)iriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_Entity() {
		return g_EntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_Entity_IsSourceOf() {
		return (EReference)g_EntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_Entity_IsTargetOf() {
		return (EReference)g_EntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_Entity_G_label() {
		return (EAttribute)g_EntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_Entity_Iri() {
		return (EAttribute)g_EntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		g_RelationEClass = createEClass(GRELATION);
		createEAttribute(g_RelationEClass, GRELATION__GLABEL);
		createEAttribute(g_RelationEClass, GRELATION__IRI);
		createEReference(g_RelationEClass, GRELATION__SOURCE);
		createEReference(g_RelationEClass, GRELATION__TARGET);

		g_ResourceEClass = createEClass(GRESOURCE);

		g_PrefixEClass = createEClass(GPREFIX);
		createEAttribute(g_PrefixEClass, GPREFIX__NS);
		createEAttribute(g_PrefixEClass, GPREFIX__IRI);

		iriEClass = createEClass(IRI);
		createEAttribute(iriEClass, IRI__IRI);

		g_EntityEClass = createEClass(GENTITY);
		createEReference(g_EntityEClass, GENTITY__IS_SOURCE_OF);
		createEReference(g_EntityEClass, GENTITY__IS_TARGET_OF);
		createEAttribute(g_EntityEClass, GENTITY__GLABEL);
		createEAttribute(g_EntityEClass, GENTITY__IRI);
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
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		g_ResourceEClass.getESuperTypes().add(theEntityPackage.getG_SingleObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(g_RelationEClass, G_Relation.class, "G_Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG_Relation_G_label(), ecorePackage.getEString(), "g_label", null, 1, 1, G_Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_Relation_Iri(), ecorePackage.getEString(), "iri", null, 1, 1, G_Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_Relation_Source(), this.getG_Entity(), this.getG_Entity_IsSourceOf(), "source", null, 0, 1, G_Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_Relation_Target(), this.getG_Entity(), this.getG_Entity_IsTargetOf(), "target", null, 0, 1, G_Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(g_ResourceEClass, G_Resource.class, "G_Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_PrefixEClass, G_Prefix.class, "G_Prefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG_Prefix_Ns(), ecorePackage.getEString(), "ns", null, 1, 1, G_Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_Prefix_Iri(), ecorePackage.getEString(), "iri", null, 1, 1, G_Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iriEClass, com.cotechnoe.ontocase.eli.gowl.model.core.IRI.class, "IRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRI_Iri(), ecorePackage.getEString(), "iri", null, 1, 1, com.cotechnoe.ontocase.eli.gowl.model.core.IRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(g_EntityEClass, G_Entity.class, "G_Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getG_Entity_IsSourceOf(), this.getG_Relation(), this.getG_Relation_Source(), "isSourceOf", null, 0, -1, G_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_Entity_IsTargetOf(), this.getG_Relation(), this.getG_Relation_Target(), "isTargetOf", null, 0, -1, G_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_Entity_G_label(), ecorePackage.getEString(), "g_label", null, 1, 1, G_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_Entity_Iri(), ecorePackage.getEString(), "iri", null, 1, 1, G_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //CorePackageImpl
