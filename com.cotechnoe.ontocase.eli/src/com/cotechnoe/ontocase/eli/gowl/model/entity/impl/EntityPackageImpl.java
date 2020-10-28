/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.entity.impl;

import com.cotechnoe.ontocase.eli.gowl.GowlPackage;

import com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl;

import com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage;

import com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl;

import com.cotechnoe.ontocase.eli.gowl.model.entity.EntityFactory;
import com.cotechnoe.ontocase.eli.gowl.model.entity.EntityPackage;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnnotationProperty;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnonymousIndividual;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_ClassContainer;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_Collection;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_Container;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_Individual;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_Literal;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedClass;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedIndividual;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectIntersectionOf;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectProperty;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_Property;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_Resource;
import com.cotechnoe.ontocase.eli.gowl.model.entity.G_SingleObject;

import com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage;

import com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityPackageImpl extends EPackageImpl implements EntityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_ObjectIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_ClassContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_ContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_CollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_AnnotationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_ObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_AnonymousIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_IndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_NamedIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_NamedClassEClass = null;

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
	private EClass g_SingleObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_LiteralEClass = null;

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
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.EntityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EntityPackageImpl() {
		super(eNS_URI, EntityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EntityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EntityPackage init() {
		if (isInited) return (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEntityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EntityPackageImpl theEntityPackage = registeredEntityPackage instanceof EntityPackageImpl ? (EntityPackageImpl)registeredEntityPackage : new EntityPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GowlPackage.eNS_URI);
		GowlPackageImpl theGowlPackage = (GowlPackageImpl)(registeredPackage instanceof GowlPackageImpl ? registeredPackage : GowlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationPackage.eNS_URI);
		RelationPackageImpl theRelationPackage = (RelationPackageImpl)(registeredPackage instanceof RelationPackageImpl ? registeredPackage : RelationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theEntityPackage.createPackageContents();
		theGowlPackage.createPackageContents();
		theRelationPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theEntityPackage.initializePackageContents();
		theGowlPackage.initializePackageContents();
		theRelationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEntityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EntityPackage.eNS_URI, theEntityPackage);
		return theEntityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_ObjectIntersectionOf() {
		return g_ObjectIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_ClassContainer() {
		return g_ClassContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_Container() {
		return g_ContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_Collection() {
		return g_CollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_AnnotationProperty() {
		return g_AnnotationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_Property() {
		return g_PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_ObjectProperty() {
		return g_ObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_AnonymousIndividual() {
		return g_AnonymousIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_Individual() {
		return g_IndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_NamedIndividual() {
		return g_NamedIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_NamedClass() {
		return g_NamedClassEClass;
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
	public EClass getG_SingleObject() {
		return g_SingleObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_Literal() {
		return g_LiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityFactory getEntityFactory() {
		return (EntityFactory)getEFactoryInstance();
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
		g_ObjectIntersectionOfEClass = createEClass(GOBJECT_INTERSECTION_OF);

		g_ClassContainerEClass = createEClass(GCLASS_CONTAINER);

		g_ContainerEClass = createEClass(GCONTAINER);

		g_CollectionEClass = createEClass(GCOLLECTION);

		g_AnnotationPropertyEClass = createEClass(GANNOTATION_PROPERTY);

		g_PropertyEClass = createEClass(GPROPERTY);

		g_ObjectPropertyEClass = createEClass(GOBJECT_PROPERTY);

		g_AnonymousIndividualEClass = createEClass(GANONYMOUS_INDIVIDUAL);

		g_IndividualEClass = createEClass(GINDIVIDUAL);

		g_NamedIndividualEClass = createEClass(GNAMED_INDIVIDUAL);

		g_NamedClassEClass = createEClass(GNAMED_CLASS);

		g_ResourceEClass = createEClass(GRESOURCE);

		g_SingleObjectEClass = createEClass(GSINGLE_OBJECT);

		g_LiteralEClass = createEClass(GLITERAL);
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
		g_ObjectIntersectionOfEClass.getESuperTypes().add(this.getG_ClassContainer());
		g_ClassContainerEClass.getESuperTypes().add(this.getG_Container());
		g_ContainerEClass.getESuperTypes().add(theCorePackage.getG_Entity());
		g_CollectionEClass.getESuperTypes().add(theCorePackage.getG_Entity());
		g_AnnotationPropertyEClass.getESuperTypes().add(this.getG_Property());
		g_PropertyEClass.getESuperTypes().add(theCorePackage.getG_Entity());
		g_ObjectPropertyEClass.getESuperTypes().add(this.getG_Property());
		g_AnonymousIndividualEClass.getESuperTypes().add(this.getG_Individual());
		g_IndividualEClass.getESuperTypes().add(theCorePackage.getG_Entity());
		g_NamedIndividualEClass.getESuperTypes().add(this.getG_Individual());
		g_NamedClassEClass.getESuperTypes().add(this.getG_Collection());
		g_ResourceEClass.getESuperTypes().add(this.getG_SingleObject());
		g_SingleObjectEClass.getESuperTypes().add(theCorePackage.getG_Entity());
		g_LiteralEClass.getESuperTypes().add(this.getG_SingleObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(g_ObjectIntersectionOfEClass, G_ObjectIntersectionOf.class, "G_ObjectIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_ClassContainerEClass, G_ClassContainer.class, "G_ClassContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_ContainerEClass, G_Container.class, "G_Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_CollectionEClass, G_Collection.class, "G_Collection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_AnnotationPropertyEClass, G_AnnotationProperty.class, "G_AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_PropertyEClass, G_Property.class, "G_Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_ObjectPropertyEClass, G_ObjectProperty.class, "G_ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_AnonymousIndividualEClass, G_AnonymousIndividual.class, "G_AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_IndividualEClass, G_Individual.class, "G_Individual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_NamedIndividualEClass, G_NamedIndividual.class, "G_NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_NamedClassEClass, G_NamedClass.class, "G_NamedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_ResourceEClass, G_Resource.class, "G_Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_SingleObjectEClass, G_SingleObject.class, "G_SingleObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_LiteralEClass, G_Literal.class, "G_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //EntityPackageImpl
