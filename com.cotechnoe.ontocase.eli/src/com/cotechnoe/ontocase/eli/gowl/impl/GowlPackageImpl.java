/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.impl;

import com.cotechnoe.ontocase.eli.gowl.ALink;
import com.cotechnoe.ontocase.eli.gowl.DLink;
import com.cotechnoe.ontocase.eli.gowl.ELink;
import com.cotechnoe.ontocase.eli.gowl.EntitiesGroup;
import com.cotechnoe.ontocase.eli.gowl.G_Annotation;
import com.cotechnoe.ontocase.eli.gowl.G_AnnotationClass;
import com.cotechnoe.ontocase.eli.gowl.G_AnnotationProperty;
import com.cotechnoe.ontocase.eli.gowl.G_AnonymousIndividual;
import com.cotechnoe.ontocase.eli.gowl.G_ClassContainer;
import com.cotechnoe.ontocase.eli.gowl.G_ClassType;
import com.cotechnoe.ontocase.eli.gowl.G_Collection;
import com.cotechnoe.ontocase.eli.gowl.G_Container;
import com.cotechnoe.ontocase.eli.gowl.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.G_IRI_Status;
import com.cotechnoe.ontocase.eli.gowl.G_Individual;
import com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE;
import com.cotechnoe.ontocase.eli.gowl.G_Literal;
import com.cotechnoe.ontocase.eli.gowl.G_NamedClass;
import com.cotechnoe.ontocase.eli.gowl.G_NamedIndividual;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Document;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Object;
import com.cotechnoe.ontocase.eli.gowl.G_ObjectIntersectionOf;
import com.cotechnoe.ontocase.eli.gowl.G_ObjectProperty;
import com.cotechnoe.ontocase.eli.gowl.G_Prefix;
import com.cotechnoe.ontocase.eli.gowl.G_Property;
import com.cotechnoe.ontocase.eli.gowl.G_Relation;
import com.cotechnoe.ontocase.eli.gowl.G_SingleObject;
import com.cotechnoe.ontocase.eli.gowl.G_TypedRelation;
import com.cotechnoe.ontocase.eli.gowl.G_UntypedRelation;
import com.cotechnoe.ontocase.eli.gowl.GowlFactory;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;
import com.cotechnoe.ontocase.eli.gowl.ILink;
import com.cotechnoe.ontocase.eli.gowl.InvLink;
import com.cotechnoe.ontocase.eli.gowl.NegatePLink;
import com.cotechnoe.ontocase.eli.gowl.PLink;
import com.cotechnoe.ontocase.eli.gowl.RelationsGroup;
import com.cotechnoe.ontocase.eli.gowl.SLink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_OWL_DocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entitiesGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_AnnotationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum g_LABEL_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum g_IRI_StatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum g_ClassTypeEEnum = null;

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
	private EClass g_RelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_OWL_ObjectEClass = null;

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
	private EClass g_AnnotationEClass = null;

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
	private EClass g_SingleObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g_LiteralEClass = null;

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

		// Create package meta-data objects
		theGowlPackage.createPackageContents();

		// Initialize created meta-data
		theGowlPackage.initializePackageContents();

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
	public EReference getG_OWL_Document_G_prefix() {
		return (EReference)g_OWL_DocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_OWL_Document_BaseIRI() {
		return (EAttribute)g_OWL_DocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_OWL_Document_GroupOfEntities() {
		return (EReference)g_OWL_DocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_OWL_Document_GroupOfRelations() {
		return (EReference)g_OWL_DocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_OWL_Document_DefaultNS() {
		return (EAttribute)g_OWL_DocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntitiesGroup() {
		return entitiesGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntitiesGroup_Name() {
		return (EAttribute)entitiesGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntitiesGroup_G_entities() {
		return (EReference)entitiesGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationsGroup() {
		return relationsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationsGroup_G_relations() {
		return (EReference)relationsGroupEClass.getEStructuralFeatures().get(0);
	}


	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_AnnotationClass() {
		return g_AnnotationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_AnnotationClass_G_ClassType() {
		return (EAttribute)g_AnnotationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getG_LABEL_TYPE() {
		return g_LABEL_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getG_IRI_Status() {
		return g_IRI_StatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getG_ClassType() {
		return g_ClassTypeEEnum;
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
	public EClass getG_Relation() {
		return g_RelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_Relation_Source() {
		return (EReference)g_RelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_Relation_Target() {
		return (EReference)g_RelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getG_OWL_Object() {
		return g_OWL_ObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_OWL_Object_G_labelType() {
		return (EAttribute)g_OWL_ObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_OWL_Object_Label() {
		return (EAttribute)g_OWL_ObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_OWL_Object_G_label() {
		return (EAttribute)g_OWL_ObjectEClass.getEStructuralFeatures().get(2);
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
	public EClass getG_Annotation() {
		return g_AnnotationEClass;
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
		return (EReference)g_EntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getG_Entity_IsTargetOf() {
		return (EReference)g_EntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_Entity_Iri() {
		return (EAttribute)g_EntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getG_Entity_G_iri_status() {
		return (EAttribute)g_EntityEClass.getEStructuralFeatures().get(2);
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
	public EClass getPLink() {
		return pLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPLink_G_Property() {
		return (EReference)pLinkEClass.getEStructuralFeatures().get(0);
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
	public EClass getELink() {
		return eLinkEClass;
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
	public EClass getInvLink() {
		return invLinkEClass;
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
		aLinkEClass = createEClass(ALINK);

		g_TypedRelationEClass = createEClass(GTYPED_RELATION);

		g_RelationEClass = createEClass(GRELATION);
		createEReference(g_RelationEClass, GRELATION__SOURCE);
		createEReference(g_RelationEClass, GRELATION__TARGET);

		g_OWL_ObjectEClass = createEClass(GOWL_OBJECT);
		createEAttribute(g_OWL_ObjectEClass, GOWL_OBJECT__GLABEL_TYPE);
		createEAttribute(g_OWL_ObjectEClass, GOWL_OBJECT__LABEL);
		createEAttribute(g_OWL_ObjectEClass, GOWL_OBJECT__GLABEL);

		g_EntityEClass = createEClass(GENTITY);
		createEReference(g_EntityEClass, GENTITY__IS_TARGET_OF);
		createEAttribute(g_EntityEClass, GENTITY__IRI);
		createEAttribute(g_EntityEClass, GENTITY__GIRI_STATUS);
		createEReference(g_EntityEClass, GENTITY__IS_SOURCE_OF);

		dLinkEClass = createEClass(DLINK);
		createEAttribute(dLinkEClass, DLINK__D);

		eLinkEClass = createEClass(ELINK);

		g_UntypedRelationEClass = createEClass(GUNTYPED_RELATION);

		iLinkEClass = createEClass(ILINK);

		invLinkEClass = createEClass(INV_LINK);

		negatePLinkEClass = createEClass(NEGATE_PLINK);

		pLinkEClass = createEClass(PLINK);
		createEReference(pLinkEClass, PLINK__GPROPERTY);

		g_PropertyEClass = createEClass(GPROPERTY);

		sLinkEClass = createEClass(SLINK);

		g_AnnotationPropertyEClass = createEClass(GANNOTATION_PROPERTY);

		g_AnonymousIndividualEClass = createEClass(GANONYMOUS_INDIVIDUAL);

		g_IndividualEClass = createEClass(GINDIVIDUAL);

		g_ClassContainerEClass = createEClass(GCLASS_CONTAINER);

		g_ContainerEClass = createEClass(GCONTAINER);

		g_CollectionEClass = createEClass(GCOLLECTION);

		g_LiteralEClass = createEClass(GLITERAL);

		g_SingleObjectEClass = createEClass(GSINGLE_OBJECT);

		g_NamedClassEClass = createEClass(GNAMED_CLASS);

		g_NamedIndividualEClass = createEClass(GNAMED_INDIVIDUAL);

		g_ObjectIntersectionOfEClass = createEClass(GOBJECT_INTERSECTION_OF);

		g_ObjectPropertyEClass = createEClass(GOBJECT_PROPERTY);

		g_PrefixEClass = createEClass(GPREFIX);
		createEAttribute(g_PrefixEClass, GPREFIX__NS);
		createEAttribute(g_PrefixEClass, GPREFIX__IRI);

		g_AnnotationEClass = createEClass(GANNOTATION);

		iriEClass = createEClass(IRI);
		createEAttribute(iriEClass, IRI__IRI);

		g_OWL_DocumentEClass = createEClass(GOWL_DOCUMENT);
		createEReference(g_OWL_DocumentEClass, GOWL_DOCUMENT__GPREFIX);
		createEAttribute(g_OWL_DocumentEClass, GOWL_DOCUMENT__BASE_IRI);
		createEReference(g_OWL_DocumentEClass, GOWL_DOCUMENT__GROUP_OF_ENTITIES);
		createEReference(g_OWL_DocumentEClass, GOWL_DOCUMENT__GROUP_OF_RELATIONS);
		createEAttribute(g_OWL_DocumentEClass, GOWL_DOCUMENT__DEFAULT_NS);

		entitiesGroupEClass = createEClass(ENTITIES_GROUP);
		createEAttribute(entitiesGroupEClass, ENTITIES_GROUP__NAME);
		createEReference(entitiesGroupEClass, ENTITIES_GROUP__GENTITIES);

		relationsGroupEClass = createEClass(RELATIONS_GROUP);
		createEReference(relationsGroupEClass, RELATIONS_GROUP__GRELATIONS);

		g_AnnotationClassEClass = createEClass(GANNOTATION_CLASS);
		createEAttribute(g_AnnotationClassEClass, GANNOTATION_CLASS__GCLASS_TYPE);

		// Create enums
		g_LABEL_TYPEEEnum = createEEnum(GLABEL_TYPE);
		g_IRI_StatusEEnum = createEEnum(GIRI_STATUS);
		g_ClassTypeEEnum = createEEnum(GCLASS_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		g_TypedRelationEClass.getESuperTypes().add(this.getG_Relation());
		g_RelationEClass.getESuperTypes().add(this.getG_OWL_Object());
		g_EntityEClass.getESuperTypes().add(this.getG_OWL_Object());
		dLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		eLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		g_UntypedRelationEClass.getESuperTypes().add(this.getG_Relation());
		iLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		invLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		negatePLinkEClass.getESuperTypes().add(this.getG_UntypedRelation());
		pLinkEClass.getESuperTypes().add(this.getG_UntypedRelation());
		g_PropertyEClass.getESuperTypes().add(this.getG_Entity());
		sLinkEClass.getESuperTypes().add(this.getG_TypedRelation());
		g_AnnotationPropertyEClass.getESuperTypes().add(this.getG_Property());
		g_AnonymousIndividualEClass.getESuperTypes().add(this.getG_Individual());
		g_IndividualEClass.getESuperTypes().add(this.getG_Entity());
		g_ClassContainerEClass.getESuperTypes().add(this.getG_Container());
		g_ContainerEClass.getESuperTypes().add(this.getG_Entity());
		g_CollectionEClass.getESuperTypes().add(this.getG_Entity());
		g_LiteralEClass.getESuperTypes().add(this.getG_SingleObject());
		g_SingleObjectEClass.getESuperTypes().add(this.getG_Entity());
		g_NamedClassEClass.getESuperTypes().add(this.getG_Collection());
		g_NamedIndividualEClass.getESuperTypes().add(this.getG_Individual());
		g_ObjectIntersectionOfEClass.getESuperTypes().add(this.getG_ClassContainer());
		g_ObjectPropertyEClass.getESuperTypes().add(this.getG_Property());
		g_AnnotationEClass.getESuperTypes().add(this.getG_SingleObject());
		g_AnnotationClassEClass.getESuperTypes().add(this.getG_Collection());

		// Initialize classes, features, and operations; add parameters
		initEClass(aLinkEClass, ALink.class, "ALink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_TypedRelationEClass, G_TypedRelation.class, "G_TypedRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_RelationEClass, G_Relation.class, "G_Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getG_Relation_Source(), this.getG_Entity(), this.getG_Entity_IsSourceOf(), "source", null, 0, 1, G_Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_Relation_Target(), this.getG_Entity(), this.getG_Entity_IsTargetOf(), "target", null, 0, 1, G_Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(g_OWL_ObjectEClass, G_OWL_Object.class, "G_OWL_Object", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG_OWL_Object_G_labelType(), this.getG_LABEL_TYPE(), "g_labelType", null, 0, 1, G_OWL_Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_OWL_Object_Label(), ecorePackage.getEString(), "label", null, 1, 1, G_OWL_Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_OWL_Object_G_label(), ecorePackage.getEString(), "g_label", null, 1, 1, G_OWL_Object.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(g_EntityEClass, G_Entity.class, "G_Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getG_Entity_IsTargetOf(), this.getG_Relation(), this.getG_Relation_Target(), "isTargetOf", null, 0, -1, G_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_Entity_Iri(), ecorePackage.getEString(), "iri", null, 1, 1, G_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_Entity_G_iri_status(), this.getG_IRI_Status(), "g_iri_status", null, 0, 1, G_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_Entity_IsSourceOf(), this.getG_Relation(), this.getG_Relation_Source(), "isSourceOf", null, 0, -1, G_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dLinkEClass, DLink.class, "DLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDLink_D(), ecorePackage.getEString(), "D", "D", 1, 1, DLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eLinkEClass, ELink.class, "ELink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_UntypedRelationEClass, G_UntypedRelation.class, "G_UntypedRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iLinkEClass, ILink.class, "ILink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invLinkEClass, InvLink.class, "InvLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negatePLinkEClass, NegatePLink.class, "NegatePLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pLinkEClass, PLink.class, "PLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPLink_G_Property(), this.getG_Property(), null, "g_Property", null, 1, 1, PLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(g_PropertyEClass, G_Property.class, "G_Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sLinkEClass, SLink.class, "SLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_AnnotationPropertyEClass, G_AnnotationProperty.class, "G_AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_AnonymousIndividualEClass, G_AnonymousIndividual.class, "G_AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_IndividualEClass, G_Individual.class, "G_Individual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_ClassContainerEClass, G_ClassContainer.class, "G_ClassContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_ContainerEClass, G_Container.class, "G_Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_CollectionEClass, G_Collection.class, "G_Collection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_LiteralEClass, G_Literal.class, "G_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_SingleObjectEClass, G_SingleObject.class, "G_SingleObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_NamedClassEClass, G_NamedClass.class, "G_NamedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_NamedIndividualEClass, G_NamedIndividual.class, "G_NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_ObjectIntersectionOfEClass, G_ObjectIntersectionOf.class, "G_ObjectIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_ObjectPropertyEClass, G_ObjectProperty.class, "G_ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g_PrefixEClass, G_Prefix.class, "G_Prefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG_Prefix_Ns(), ecorePackage.getEString(), "ns", null, 1, 1, G_Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_Prefix_Iri(), ecorePackage.getEString(), "iri", null, 1, 1, G_Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(g_AnnotationEClass, G_Annotation.class, "G_Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iriEClass, com.cotechnoe.ontocase.eli.gowl.IRI.class, "IRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRI_Iri(), ecorePackage.getEString(), "iri", null, 1, 1, com.cotechnoe.ontocase.eli.gowl.IRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(g_OWL_DocumentEClass, G_OWL_Document.class, "G_OWL_Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getG_OWL_Document_G_prefix(), this.getG_Prefix(), null, "g_prefix", null, 0, -1, G_OWL_Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_OWL_Document_BaseIRI(), ecorePackage.getEString(), "baseIRI", "http://example.org/gowl/example", 1, 1, G_OWL_Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_OWL_Document_GroupOfEntities(), this.getEntitiesGroup(), null, "groupOfEntities", null, 1, 1, G_OWL_Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getG_OWL_Document_GroupOfRelations(), this.getRelationsGroup(), null, "groupOfRelations", null, 1, 1, G_OWL_Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getG_OWL_Document_DefaultNS(), ecorePackage.getEString(), "defaultNS", "http://example.org/gowl/example#", 1, 1, G_OWL_Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entitiesGroupEClass, EntitiesGroup.class, "EntitiesGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntitiesGroup_Name(), ecorePackage.getEString(), "name", "Entities ", 1, 1, EntitiesGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntitiesGroup_G_entities(), this.getG_Entity(), null, "g_entities", null, 0, -1, EntitiesGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationsGroupEClass, RelationsGroup.class, "RelationsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationsGroup_G_relations(), this.getG_Relation(), null, "g_relations", null, 0, -1, RelationsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(g_AnnotationClassEClass, G_AnnotationClass.class, "G_AnnotationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG_AnnotationClass_G_ClassType(), this.getG_ClassType(), "g_ClassType", null, 1, 1, G_AnnotationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(g_LABEL_TYPEEEnum, G_LABEL_TYPE.class, "G_LABEL_TYPE");
		addEEnumLiteral(g_LABEL_TYPEEEnum, G_LABEL_TYPE.LABEL);
		addEEnumLiteral(g_LABEL_TYPEEEnum, G_LABEL_TYPE.RDFS_LABEL);
		addEEnumLiteral(g_LABEL_TYPEEEnum, G_LABEL_TYPE.IRI);
		addEEnumLiteral(g_LABEL_TYPEEEnum, G_LABEL_TYPE.QNAME);
		addEEnumLiteral(g_LABEL_TYPEEEnum, G_LABEL_TYPE.PROPERTY_LABEL);
		addEEnumLiteral(g_LABEL_TYPEEEnum, G_LABEL_TYPE.TYPED_LINK);

		initEEnum(g_IRI_StatusEEnum, G_IRI_Status.class, "G_IRI_Status");
		addEEnumLiteral(g_IRI_StatusEEnum, G_IRI_Status.BASED_ON_LABEL);
		addEEnumLiteral(g_IRI_StatusEEnum, G_IRI_Status.GEN_ID);
		addEEnumLiteral(g_IRI_StatusEEnum, G_IRI_Status.PRESET);

		initEEnum(g_ClassTypeEEnum, G_ClassType.class, "G_ClassType");
		addEEnumLiteral(g_ClassTypeEEnum, G_ClassType.RDFS_CLASS);
		addEEnumLiteral(g_ClassTypeEEnum, G_ClassType.SKOS_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (g_LABEL_TYPEEEnum,
		   source,
		   new String[] {
			   "name", "G_LABEL_TYPE"
		   });
		addAnnotation
		  (g_IRI_StatusEEnum,
		   source,
		   new String[] {
			   "name", "G_IRI_Status"
		   });
	}

} //GowlPackageImpl
