/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation.impl;

import com.cotechnoe.ontocase.eli.gowl.GowlPackage;

import com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl;

import com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage;

import com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl;

import com.cotechnoe.ontocase.eli.gowl.model.entity.EntityPackage;

import com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl;

import com.cotechnoe.ontocase.eli.gowl.model.relation.ALink;
import com.cotechnoe.ontocase.eli.gowl.model.relation.DLink;
import com.cotechnoe.ontocase.eli.gowl.model.relation.ELink;
import com.cotechnoe.ontocase.eli.gowl.model.relation.G_TypedRelation;
import com.cotechnoe.ontocase.eli.gowl.model.relation.G_UntypedRelation;
import com.cotechnoe.ontocase.eli.gowl.model.relation.ILink;
import com.cotechnoe.ontocase.eli.gowl.model.relation.InvLink;
import com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink;
import com.cotechnoe.ontocase.eli.gowl.model.relation.PLink;
import com.cotechnoe.ontocase.eli.gowl.model.relation.RelationFactory;
import com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage;
import com.cotechnoe.ontocase.eli.gowl.model.relation.SLink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationPackageImpl extends EPackageImpl implements RelationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_TypedRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_UntypedRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatePLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dLinkEClass = null;

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
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationPackageImpl() {
		super(eNS_URI, RelationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationPackage init() {
		if (isInited) return (RelationPackage)EPackage.Registry.INSTANCE.getEPackage(RelationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationPackageImpl theRelationPackage = registeredRelationPackage instanceof RelationPackageImpl ? (RelationPackageImpl)registeredRelationPackage : new RelationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GowlPackage.eNS_URI);
		GowlPackageImpl theGowlPackage = (GowlPackageImpl)(registeredPackage instanceof GowlPackageImpl ? registeredPackage : GowlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theRelationPackage.createPackageContents();
		theGowlPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theRelationPackage.initializePackageContents();
		theGowlPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationPackage.eNS_URI, theRelationPackage);
		return theRelationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_TypedRelation() {
		return g_TypedRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getILink() {
		return iLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getILink_I() {
		return (EAttribute)iLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPLink() {
		return pLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_UntypedRelation() {
		return g_UntypedRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSLink() {
		return sLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSLink_S() {
		return (EAttribute)sLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getELink() {
		return eLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getELink_E() {
		return (EAttribute)eLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getALink() {
		return aLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getALink_A() {
		return (EAttribute)aLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvLink() {
		return invLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvLink_Inv() {
		return (EAttribute)invLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegatePLink() {
		return negatePLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNegatePLink_NOT() {
		return (EAttribute)negatePLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDLink() {
		return dLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDLink_D() {
		return (EAttribute)dLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationFactory getRelationFactory() {
		return (RelationFactory)getEFactoryInstance();
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
		g_TypedRelationEClass = createEClass(GTYPED_RELATION);

		iLinkEClass = createEClass(ILINK);
		createEAttribute(iLinkEClass, ILINK__I);

		pLinkEClass = createEClass(PLINK);

		g_UntypedRelationEClass = createEClass(GUNTYPED_RELATION);

		sLinkEClass = createEClass(SLINK);
		createEAttribute(sLinkEClass, SLINK__S);

		eLinkEClass = createEClass(ELINK);
		createEAttribute(eLinkEClass, ELINK__E);

		aLinkEClass = createEClass(ALINK);
		createEAttribute(aLinkEClass, ALINK__A);

		invLinkEClass = createEClass(INV_LINK);
		createEAttribute(invLinkEClass, INV_LINK__INV);

		negatePLinkEClass = createEClass(NEGATE_PLINK);
		createEAttribute(negatePLinkEClass, NEGATE_PLINK__NOT);

		dLinkEClass = createEClass(DLINK);
		createEAttribute(dLinkEClass, DLINK__D);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		g_TypedRelationEClass.getESuperTypes().add(theCorePackage.getG_Relation());
		iLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		pLinkEClass.getESuperTypes().add(this.getG_UntypedRelation());
		g_UntypedRelationEClass.getESuperTypes().add(theCorePackage.getG_Relation());
		sLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		eLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		aLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		invLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		negatePLinkEClass.getESuperTypes().add(this.getG_UntypedRelation());
		dLinkEClass.getESuperTypes().add(this.getG_TypedRelation());

		// Initialize classes, features, and operations; add parameters
		initEClass(g_TypedRelationEClass, G_TypedRelation.class, "G_TypedRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iLinkEClass, ILink.class, "ILink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getILink_I(), ecorePackage.getEString(), "I", "I", 1, 1, ILink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pLinkEClass, PLink.class, "PLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_UntypedRelationEClass, G_UntypedRelation.class, "G_UntypedRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sLinkEClass, SLink.class, "SLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSLink_S(), ecorePackage.getEString(), "S", "S", 1, 1, SLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eLinkEClass, ELink.class, "ELink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELink_E(), ecorePackage.getEString(), "E", "E", 1, 1, ELink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aLinkEClass, ALink.class, "ALink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getALink_A(), ecorePackage.getEString(), "A", "A", 1, 1, ALink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(invLinkEClass, InvLink.class, "InvLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvLink_Inv(), ecorePackage.getEString(), "Inv", "-1", 1, 1, InvLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(negatePLinkEClass, NegatePLink.class, "NegatePLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNegatePLink_NOT(), ecorePackage.getEString(), "NOT", "NOT", 1, 1, NegatePLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dLinkEClass, DLink.class, "DLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDLink_D(), ecorePackage.getEString(), "D", "D", 1, 1, DLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //RelationPackageImpl
