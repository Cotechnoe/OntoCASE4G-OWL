/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

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
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_ObjectImpl <em>GOWL Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_ObjectImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_OWL_Object()
	 * @generated
	 */
	int GOWL_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_OBJECT__GLABEL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_OBJECT__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_OBJECT__GLABEL = 2;

	/**
	 * The number of structural features of the '<em>GOWL Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GOWL Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl <em>GOWL Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_OWL_Document()
	 * @generated
	 */
	int GOWL_DOCUMENT = 29;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_EntityImpl <em>GEntity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_EntityImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Entity()
	 * @generated
	 */
	int GENTITY = 4;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_IndividualImpl <em>GIndividual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_IndividualImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Individual()
	 * @generated
	 */
	int GINDIVIDUAL = 16;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_RelationImpl <em>GRelation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_RelationImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Relation()
	 * @generated
	 */
	int GRELATION = 2;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION__GLABEL_TYPE = GOWL_OBJECT__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION__LABEL = GOWL_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION__GLABEL = GOWL_OBJECT__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION__SOURCE = GOWL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION__TARGET = GOWL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION_FEATURE_COUNT = GOWL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION_OPERATION_COUNT = GOWL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_SingleObjectImpl <em>GSingle Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_SingleObjectImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_SingleObject()
	 * @generated
	 */
	int GSINGLE_OBJECT = 21;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_PrefixImpl <em>GPrefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_PrefixImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Prefix()
	 * @generated
	 */
	int GPREFIX = 26;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.IRIImpl <em>IRI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.IRIImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getIRI()
	 * @generated
	 */
	int IRI = 28;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_ContainerImpl <em>GContainer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_ContainerImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Container()
	 * @generated
	 */
	int GCONTAINER = 18;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_ClassContainerImpl <em>GClass Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_ClassContainerImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_ClassContainer()
	 * @generated
	 */
	int GCLASS_CONTAINER = 17;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_ObjectIntersectionOfImpl <em>GObject Intersection Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_ObjectIntersectionOfImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_ObjectIntersectionOf()
	 * @generated
	 */
	int GOBJECT_INTERSECTION_OF = 24;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_CollectionImpl <em>GCollection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_CollectionImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Collection()
	 * @generated
	 */
	int GCOLLECTION = 19;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_PropertyImpl <em>GProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_PropertyImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Property()
	 * @generated
	 */
	int GPROPERTY = 12;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_AnnotationPropertyImpl <em>GAnnotation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_AnnotationPropertyImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_AnnotationProperty()
	 * @generated
	 */
	int GANNOTATION_PROPERTY = 14;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_ObjectPropertyImpl <em>GObject Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_ObjectPropertyImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_ObjectProperty()
	 * @generated
	 */
	int GOBJECT_PROPERTY = 25;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_AnonymousIndividualImpl <em>GAnonymous Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_AnonymousIndividualImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_AnonymousIndividual()
	 * @generated
	 */
	int GANONYMOUS_INDIVIDUAL = 15;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_NamedIndividualImpl <em>GNamed Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_NamedIndividualImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_NamedIndividual()
	 * @generated
	 */
	int GNAMED_INDIVIDUAL = 23;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_NamedClassImpl <em>GNamed Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_NamedClassImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_NamedClass()
	 * @generated
	 */
	int GNAMED_CLASS = 22;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_LiteralImpl <em>GLiteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_LiteralImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Literal()
	 * @generated
	 */
	int GLITERAL = 20;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_TypedRelationImpl <em>GTyped Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_TypedRelationImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_TypedRelation()
	 * @generated
	 */
	int GTYPED_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION__GLABEL_TYPE = GRELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION__LABEL = GRELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION__GLABEL = GRELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION__SOURCE = GRELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION__TARGET = GRELATION__TARGET;

	/**
	 * The number of structural features of the '<em>GTyped Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION_FEATURE_COUNT = GRELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GTyped Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION_OPERATION_COUNT = GRELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.ILinkImpl <em>ILink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.ILinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getILink()
	 * @generated
	 */
	int ILINK = 8;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_UntypedRelationImpl <em>GUntyped Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_UntypedRelationImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_UntypedRelation()
	 * @generated
	 */
	int GUNTYPED_RELATION = 7;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.PLinkImpl <em>PLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.PLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getPLink()
	 * @generated
	 */
	int PLINK = 11;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.SLinkImpl <em>SLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.SLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getSLink()
	 * @generated
	 */
	int SLINK = 13;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.ELinkImpl <em>ELink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.ELinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getELink()
	 * @generated
	 */
	int ELINK = 6;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.ALinkImpl <em>ALink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.ALinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getALink()
	 * @generated
	 */
	int ALINK = 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK__GLABEL_TYPE = GTYPED_RELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK__LABEL = GTYPED_RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK__SOURCE = GTYPED_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK__TARGET = GTYPED_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>ALink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ALink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__GLABEL_TYPE = GOWL_OBJECT__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__LABEL = GOWL_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__GLABEL = GOWL_OBJECT__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__IS_TARGET_OF = GOWL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__IRI = GOWL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__IS_SOURCE_OF = GOWL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GEntity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY_FEATURE_COUNT = GOWL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>GEntity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY_OPERATION_COUNT = GOWL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.InvLinkImpl <em>Inv Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.InvLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getInvLink()
	 * @generated
	 */
	int INV_LINK = 9;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.NegatePLinkImpl <em>Negate PLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.NegatePLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getNegatePLink()
	 * @generated
	 */
	int NEGATE_PLINK = 10;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.DLinkImpl <em>DLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.DLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getDLink()
	 * @generated
	 */
	int DLINK = 5;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK__GLABEL_TYPE = GTYPED_RELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK__LABEL = GTYPED_RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK__SOURCE = GTYPED_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK__TARGET = GTYPED_RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK__D = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__GLABEL_TYPE = GTYPED_RELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__LABEL = GTYPED_RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__SOURCE = GTYPED_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__TARGET = GTYPED_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>ELink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ELink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION__GLABEL_TYPE = GRELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION__LABEL = GRELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION__GLABEL = GRELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION__SOURCE = GRELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION__TARGET = GRELATION__TARGET;

	/**
	 * The number of structural features of the '<em>GUntyped Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION_FEATURE_COUNT = GRELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GUntyped Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION_OPERATION_COUNT = GRELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK__GLABEL_TYPE = GTYPED_RELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK__LABEL = GTYPED_RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK__SOURCE = GTYPED_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK__TARGET = GTYPED_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>ILink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ILink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK__GLABEL_TYPE = GTYPED_RELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK__LABEL = GTYPED_RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK__SOURCE = GTYPED_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK__TARGET = GTYPED_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Inv Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inv Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK__GLABEL_TYPE = GUNTYPED_RELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK__LABEL = GUNTYPED_RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK__GLABEL = GUNTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK__SOURCE = GUNTYPED_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK__TARGET = GUNTYPED_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Negate PLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK_FEATURE_COUNT = GUNTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negate PLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK_OPERATION_COUNT = GUNTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK__GLABEL_TYPE = GUNTYPED_RELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK__LABEL = GUNTYPED_RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK__GLABEL = GUNTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK__SOURCE = GUNTYPED_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK__TARGET = GUNTYPED_RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>GProperty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK__GPROPERTY = GUNTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK_FEATURE_COUNT = GUNTYPED_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK_OPERATION_COUNT = GUNTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__GLABEL_TYPE = GENTITY__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__LABEL = GENTITY__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__GLABEL = GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__IS_TARGET_OF = GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__IRI = GENTITY__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__IS_SOURCE_OF = GENTITY__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY_FEATURE_COUNT = GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY_OPERATION_COUNT = GENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK__GLABEL_TYPE = GTYPED_RELATION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK__LABEL = GTYPED_RELATION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK__SOURCE = GTYPED_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK__TARGET = GTYPED_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>SLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__GLABEL_TYPE = GPROPERTY__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__LABEL = GPROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__GLABEL = GPROPERTY__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__IS_TARGET_OF = GPROPERTY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__IRI = GPROPERTY__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__IS_SOURCE_OF = GPROPERTY__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GAnnotation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY_FEATURE_COUNT = GPROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GAnnotation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY_OPERATION_COUNT = GPROPERTY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__GLABEL_TYPE = GENTITY__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__LABEL = GENTITY__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__GLABEL = GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__IS_TARGET_OF = GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__IRI = GENTITY__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__IS_SOURCE_OF = GENTITY__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GIndividual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL_FEATURE_COUNT = GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GIndividual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL_OPERATION_COUNT = GENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__GLABEL_TYPE = GINDIVIDUAL__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__LABEL = GINDIVIDUAL__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__GLABEL = GINDIVIDUAL__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__IS_TARGET_OF = GINDIVIDUAL__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__IRI = GINDIVIDUAL__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__IS_SOURCE_OF = GINDIVIDUAL__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GAnonymous Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL_FEATURE_COUNT = GINDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GAnonymous Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL_OPERATION_COUNT = GINDIVIDUAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__GLABEL_TYPE = GENTITY__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__LABEL = GENTITY__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__GLABEL = GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__IS_TARGET_OF = GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__IRI = GENTITY__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__IS_SOURCE_OF = GENTITY__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER_FEATURE_COUNT = GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER_OPERATION_COUNT = GENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__GLABEL_TYPE = GCONTAINER__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__LABEL = GCONTAINER__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__GLABEL = GCONTAINER__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__IS_TARGET_OF = GCONTAINER__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__IRI = GCONTAINER__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__IS_SOURCE_OF = GCONTAINER__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GClass Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER_FEATURE_COUNT = GCONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GClass Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER_OPERATION_COUNT = GCONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__GLABEL_TYPE = GENTITY__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__LABEL = GENTITY__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__GLABEL = GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__IS_TARGET_OF = GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__IRI = GENTITY__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__IS_SOURCE_OF = GENTITY__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GCollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION_FEATURE_COUNT = GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GCollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION_OPERATION_COUNT = GENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__GLABEL_TYPE = GENTITY__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__LABEL = GENTITY__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__GLABEL = GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__IS_TARGET_OF = GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__IRI = GENTITY__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__IS_SOURCE_OF = GENTITY__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GSingle Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT_FEATURE_COUNT = GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSingle Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT_OPERATION_COUNT = GENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__GLABEL_TYPE = GSINGLE_OBJECT__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__LABEL = GSINGLE_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__GLABEL = GSINGLE_OBJECT__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__IS_TARGET_OF = GSINGLE_OBJECT__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__IRI = GSINGLE_OBJECT__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__IS_SOURCE_OF = GSINGLE_OBJECT__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL_FEATURE_COUNT = GSINGLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL_OPERATION_COUNT = GSINGLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__GLABEL_TYPE = GCOLLECTION__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__LABEL = GCOLLECTION__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__GLABEL = GCOLLECTION__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__IS_TARGET_OF = GCOLLECTION__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__IRI = GCOLLECTION__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__IS_SOURCE_OF = GCOLLECTION__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>GClass Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__GCLASS_TYPE = GCOLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GNamed Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS_FEATURE_COUNT = GCOLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GNamed Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS_OPERATION_COUNT = GCOLLECTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__GLABEL_TYPE = GINDIVIDUAL__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__LABEL = GINDIVIDUAL__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__GLABEL = GINDIVIDUAL__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__IS_TARGET_OF = GINDIVIDUAL__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__IRI = GINDIVIDUAL__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__IS_SOURCE_OF = GINDIVIDUAL__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GNamed Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL_FEATURE_COUNT = GINDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GNamed Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL_OPERATION_COUNT = GINDIVIDUAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__GLABEL_TYPE = GCLASS_CONTAINER__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__LABEL = GCLASS_CONTAINER__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__GLABEL = GCLASS_CONTAINER__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__IS_TARGET_OF = GCLASS_CONTAINER__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__IRI = GCLASS_CONTAINER__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__IS_SOURCE_OF = GCLASS_CONTAINER__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GObject Intersection Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF_FEATURE_COUNT = GCLASS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GObject Intersection Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF_OPERATION_COUNT = GCLASS_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__GLABEL_TYPE = GPROPERTY__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__LABEL = GPROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__GLABEL = GPROPERTY__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__IS_TARGET_OF = GPROPERTY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__IRI = GPROPERTY__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__IS_SOURCE_OF = GPROPERTY__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GObject Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY_FEATURE_COUNT = GPROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GObject Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY_OPERATION_COUNT = GPROPERTY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPREFIX__NS = 0;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPREFIX__IRI = 1;

	/**
	 * The number of structural features of the '<em>GPrefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPREFIX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GPrefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPREFIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_AnnotationImpl <em>GAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_AnnotationImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Annotation()
	 * @generated
	 */
	int GANNOTATION = 27;

	/**
	 * The feature id for the '<em><b>Glabel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION__GLABEL_TYPE = GSINGLE_OBJECT__GLABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION__LABEL = GSINGLE_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION__GLABEL = GSINGLE_OBJECT__GLABEL;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION__IS_TARGET_OF = GSINGLE_OBJECT__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION__IRI = GSINGLE_OBJECT__IRI;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION__IS_SOURCE_OF = GSINGLE_OBJECT__IS_SOURCE_OF;

	/**
	 * The number of structural features of the '<em>GAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_FEATURE_COUNT = GSINGLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_OPERATION_COUNT = GSINGLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI__IRI = 0;

	/**
	 * The number of structural features of the '<em>IRI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IRI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Gprefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT__GPREFIX = 0;

	/**
	 * The feature id for the '<em><b>Base IRI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT__BASE_IRI = 1;

	/**
	 * The feature id for the '<em><b>Group Of Entities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT__GROUP_OF_ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Group Of Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOWL_DOCUMENT__GROUP_OF_RELATIONS = 3;

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
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.EntitiesGroupImpl <em>Entities Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.EntitiesGroupImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getEntitiesGroup()
	 * @generated
	 */
	int ENTITIES_GROUP = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES_GROUP__GENTITIES = 1;

	/**
	 * The number of structural features of the '<em>Entities Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entities Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITIES_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.RelationsGroupImpl <em>Relations Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.RelationsGroupImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getRelationsGroup()
	 * @generated
	 */
	int RELATIONS_GROUP = 31;

	/**
	 * The feature id for the '<em><b>Grelations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_GROUP__GRELATIONS = 0;

	/**
	 * The number of structural features of the '<em>Relations Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relations Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE <em>GLABEL TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_LABEL_TYPE()
	 * @generated
	 */
	int GLABEL_TYPE = 32;


	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.G_ClassType <em>GClass Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ClassType
	 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_ClassType()
	 * @generated
	 */
	int GCLASS_TYPE = 33;


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
	 * Returns the meta object for the containment reference '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getGroupOfEntities <em>Group Of Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Of Entities</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getGroupOfEntities()
	 * @see #getG_OWL_Document()
	 * @generated
	 */
	EReference getG_OWL_Document_GroupOfEntities();

	/**
	 * Returns the meta object for the containment reference '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getGroupOfRelations <em>Group Of Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Of Relations</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getGroupOfRelations()
	 * @see #getG_OWL_Document()
	 * @generated
	 */
	EReference getG_OWL_Document_GroupOfRelations();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.EntitiesGroup <em>Entities Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entities Group</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.EntitiesGroup
	 * @generated
	 */
	EClass getEntitiesGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.EntitiesGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.EntitiesGroup#getName()
	 * @see #getEntitiesGroup()
	 * @generated
	 */
	EAttribute getEntitiesGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cotechnoe.ontocase.eli.gowl.EntitiesGroup#getG_entities <em>Gentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gentities</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.EntitiesGroup#getG_entities()
	 * @see #getEntitiesGroup()
	 * @generated
	 */
	EReference getEntitiesGroup_G_entities();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.RelationsGroup <em>Relations Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relations Group</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.RelationsGroup
	 * @generated
	 */
	EClass getRelationsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cotechnoe.ontocase.eli.gowl.RelationsGroup#getG_relations <em>Grelations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grelations</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.RelationsGroup#getG_relations()
	 * @see #getRelationsGroup()
	 * @generated
	 */
	EReference getRelationsGroup_G_relations();

	/**
	 * Returns the meta object for enum '{@link com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE <em>GLABEL TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GLABEL TYPE</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE
	 * @generated
	 */
	EEnum getG_LABEL_TYPE();

	/**
	 * Returns the meta object for enum '{@link com.cotechnoe.ontocase.eli.gowl.G_ClassType <em>GClass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GClass Type</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ClassType
	 * @generated
	 */
	EEnum getG_ClassType();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_Individual <em>GIndividual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GIndividual</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Individual
	 * @generated
	 */
	EClass getG_Individual();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_Relation <em>GRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRelation</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Relation
	 * @generated
	 */
	EClass getG_Relation();

	/**
	 * Returns the meta object for the reference '{@link com.cotechnoe.ontocase.eli.gowl.G_Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Relation#getSource()
	 * @see #getG_Relation()
	 * @generated
	 */
	EReference getG_Relation_Source();

	/**
	 * Returns the meta object for the reference '{@link com.cotechnoe.ontocase.eli.gowl.G_Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Relation#getTarget()
	 * @see #getG_Relation()
	 * @generated
	 */
	EReference getG_Relation_Target();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object <em>GOWL Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GOWL Object</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Object
	 * @generated
	 */
	EClass getG_OWL_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getG_labelType <em>Glabel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glabel Type</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getG_labelType()
	 * @see #getG_OWL_Object()
	 * @generated
	 */
	EAttribute getG_OWL_Object_G_labelType();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getLabel()
	 * @see #getG_OWL_Object()
	 * @generated
	 */
	EAttribute getG_OWL_Object_Label();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getG_label <em>Glabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glabel</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Object#getG_label()
	 * @see #getG_OWL_Object()
	 * @generated
	 */
	EAttribute getG_OWL_Object_G_label();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_Prefix <em>GPrefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPrefix</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Prefix
	 * @generated
	 */
	EClass getG_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.G_Prefix#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Prefix#getNs()
	 * @see #getG_Prefix()
	 * @generated
	 */
	EAttribute getG_Prefix_Ns();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.G_Prefix#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Prefix#getIri()
	 * @see #getG_Prefix()
	 * @generated
	 */
	EAttribute getG_Prefix_Iri();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_Annotation <em>GAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAnnotation</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Annotation
	 * @generated
	 */
	EClass getG_Annotation();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.IRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRI</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.IRI
	 * @generated
	 */
	EClass getIRI();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.IRI#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.IRI#getIri()
	 * @see #getIRI()
	 * @generated
	 */
	EAttribute getIRI_Iri();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_Entity <em>GEntity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEntity</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Entity
	 * @generated
	 */
	EClass getG_Entity();

	/**
	 * Returns the meta object for the reference list '{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsSourceOf <em>Is Source Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Source Of</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsSourceOf()
	 * @see #getG_Entity()
	 * @generated
	 */
	EReference getG_Entity_IsSourceOf();

	/**
	 * Returns the meta object for the reference list '{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsTargetOf <em>Is Target Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Target Of</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Entity#getIsTargetOf()
	 * @see #getG_Entity()
	 * @generated
	 */
	EReference getG_Entity_IsTargetOf();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.G_Entity#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Entity#getIri()
	 * @see #getG_Entity()
	 * @generated
	 */
	EAttribute getG_Entity_Iri();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_ObjectIntersectionOf <em>GObject Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GObject Intersection Of</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ObjectIntersectionOf
	 * @generated
	 */
	EClass getG_ObjectIntersectionOf();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_ClassContainer <em>GClass Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GClass Container</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ClassContainer
	 * @generated
	 */
	EClass getG_ClassContainer();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_Container <em>GContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GContainer</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Container
	 * @generated
	 */
	EClass getG_Container();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_Collection <em>GCollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GCollection</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Collection
	 * @generated
	 */
	EClass getG_Collection();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_AnnotationProperty <em>GAnnotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAnnotation Property</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_AnnotationProperty
	 * @generated
	 */
	EClass getG_AnnotationProperty();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_Property <em>GProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GProperty</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Property
	 * @generated
	 */
	EClass getG_Property();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_ObjectProperty <em>GObject Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GObject Property</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ObjectProperty
	 * @generated
	 */
	EClass getG_ObjectProperty();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_AnonymousIndividual <em>GAnonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAnonymous Individual</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_AnonymousIndividual
	 * @generated
	 */
	EClass getG_AnonymousIndividual();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_NamedIndividual <em>GNamed Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNamed Individual</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_NamedIndividual
	 * @generated
	 */
	EClass getG_NamedIndividual();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_NamedClass <em>GNamed Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNamed Class</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_NamedClass
	 * @generated
	 */
	EClass getG_NamedClass();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.G_NamedClass#getG_ClassType <em>GClass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GClass Type</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_NamedClass#getG_ClassType()
	 * @see #getG_NamedClass()
	 * @generated
	 */
	EAttribute getG_NamedClass_G_ClassType();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_SingleObject <em>GSingle Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSingle Object</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_SingleObject
	 * @generated
	 */
	EClass getG_SingleObject();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_Literal <em>GLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GLiteral</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Literal
	 * @generated
	 */
	EClass getG_Literal();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_TypedRelation <em>GTyped Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTyped Relation</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_TypedRelation
	 * @generated
	 */
	EClass getG_TypedRelation();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.ILink <em>ILink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.ILink
	 * @generated
	 */
	EClass getILink();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.PLink <em>PLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.PLink
	 * @generated
	 */
	EClass getPLink();

	/**
	 * Returns the meta object for the reference '{@link com.cotechnoe.ontocase.eli.gowl.PLink#getG_Property <em>GProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>GProperty</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.PLink#getG_Property()
	 * @see #getPLink()
	 * @generated
	 */
	EReference getPLink_G_Property();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.G_UntypedRelation <em>GUntyped Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUntyped Relation</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_UntypedRelation
	 * @generated
	 */
	EClass getG_UntypedRelation();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.SLink <em>SLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.SLink
	 * @generated
	 */
	EClass getSLink();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.ELink <em>ELink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.ELink
	 * @generated
	 */
	EClass getELink();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.ALink <em>ALink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.ALink
	 * @generated
	 */
	EClass getALink();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.InvLink <em>Inv Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inv Link</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.InvLink
	 * @generated
	 */
	EClass getInvLink();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.NegatePLink <em>Negate PLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negate PLink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.NegatePLink
	 * @generated
	 */
	EClass getNegatePLink();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.DLink <em>DLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DLink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.DLink
	 * @generated
	 */
	EClass getDLink();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.DLink#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.DLink#getD()
	 * @see #getDLink()
	 * @generated
	 */
	EAttribute getDLink_D();

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

		/**
		 * The meta object literal for the '<em><b>Group Of Entities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOWL_DOCUMENT__GROUP_OF_ENTITIES = eINSTANCE.getG_OWL_Document_GroupOfEntities();

		/**
		 * The meta object literal for the '<em><b>Group Of Relations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOWL_DOCUMENT__GROUP_OF_RELATIONS = eINSTANCE.getG_OWL_Document_GroupOfRelations();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.EntitiesGroupImpl <em>Entities Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.EntitiesGroupImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getEntitiesGroup()
		 * @generated
		 */
		EClass ENTITIES_GROUP = eINSTANCE.getEntitiesGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITIES_GROUP__NAME = eINSTANCE.getEntitiesGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Gentities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITIES_GROUP__GENTITIES = eINSTANCE.getEntitiesGroup_G_entities();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.RelationsGroupImpl <em>Relations Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.RelationsGroupImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getRelationsGroup()
		 * @generated
		 */
		EClass RELATIONS_GROUP = eINSTANCE.getRelationsGroup();

		/**
		 * The meta object literal for the '<em><b>Grelations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS_GROUP__GRELATIONS = eINSTANCE.getRelationsGroup_G_relations();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE <em>GLABEL TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_LABEL_TYPE()
		 * @generated
		 */
		EEnum GLABEL_TYPE = eINSTANCE.getG_LABEL_TYPE();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.G_ClassType <em>GClass Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.G_ClassType
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_ClassType()
		 * @generated
		 */
		EEnum GCLASS_TYPE = eINSTANCE.getG_ClassType();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_IndividualImpl <em>GIndividual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_IndividualImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Individual()
		 * @generated
		 */
		EClass GINDIVIDUAL = eINSTANCE.getG_Individual();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_RelationImpl <em>GRelation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_RelationImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Relation()
		 * @generated
		 */
		EClass GRELATION = eINSTANCE.getG_Relation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRELATION__SOURCE = eINSTANCE.getG_Relation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRELATION__TARGET = eINSTANCE.getG_Relation_Target();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_ObjectImpl <em>GOWL Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_ObjectImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_OWL_Object()
		 * @generated
		 */
		EClass GOWL_OBJECT = eINSTANCE.getG_OWL_Object();

		/**
		 * The meta object literal for the '<em><b>Glabel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOWL_OBJECT__GLABEL_TYPE = eINSTANCE.getG_OWL_Object_G_labelType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOWL_OBJECT__LABEL = eINSTANCE.getG_OWL_Object_Label();

		/**
		 * The meta object literal for the '<em><b>Glabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOWL_OBJECT__GLABEL = eINSTANCE.getG_OWL_Object_G_label();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_PrefixImpl <em>GPrefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_PrefixImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Prefix()
		 * @generated
		 */
		EClass GPREFIX = eINSTANCE.getG_Prefix();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPREFIX__NS = eINSTANCE.getG_Prefix_Ns();

		/**
		 * The meta object literal for the '<em><b>Iri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPREFIX__IRI = eINSTANCE.getG_Prefix_Iri();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_AnnotationImpl <em>GAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_AnnotationImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Annotation()
		 * @generated
		 */
		EClass GANNOTATION = eINSTANCE.getG_Annotation();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.IRIImpl <em>IRI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.IRIImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getIRI()
		 * @generated
		 */
		EClass IRI = eINSTANCE.getIRI();

		/**
		 * The meta object literal for the '<em><b>Iri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRI__IRI = eINSTANCE.getIRI_Iri();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_EntityImpl <em>GEntity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_EntityImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Entity()
		 * @generated
		 */
		EClass GENTITY = eINSTANCE.getG_Entity();

		/**
		 * The meta object literal for the '<em><b>Is Source Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENTITY__IS_SOURCE_OF = eINSTANCE.getG_Entity_IsSourceOf();

		/**
		 * The meta object literal for the '<em><b>Is Target Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENTITY__IS_TARGET_OF = eINSTANCE.getG_Entity_IsTargetOf();

		/**
		 * The meta object literal for the '<em><b>Iri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENTITY__IRI = eINSTANCE.getG_Entity_Iri();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_ObjectIntersectionOfImpl <em>GObject Intersection Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_ObjectIntersectionOfImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_ObjectIntersectionOf()
		 * @generated
		 */
		EClass GOBJECT_INTERSECTION_OF = eINSTANCE.getG_ObjectIntersectionOf();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_ClassContainerImpl <em>GClass Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_ClassContainerImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_ClassContainer()
		 * @generated
		 */
		EClass GCLASS_CONTAINER = eINSTANCE.getG_ClassContainer();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_ContainerImpl <em>GContainer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_ContainerImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Container()
		 * @generated
		 */
		EClass GCONTAINER = eINSTANCE.getG_Container();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_CollectionImpl <em>GCollection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_CollectionImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Collection()
		 * @generated
		 */
		EClass GCOLLECTION = eINSTANCE.getG_Collection();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_AnnotationPropertyImpl <em>GAnnotation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_AnnotationPropertyImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_AnnotationProperty()
		 * @generated
		 */
		EClass GANNOTATION_PROPERTY = eINSTANCE.getG_AnnotationProperty();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_PropertyImpl <em>GProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_PropertyImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Property()
		 * @generated
		 */
		EClass GPROPERTY = eINSTANCE.getG_Property();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_ObjectPropertyImpl <em>GObject Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_ObjectPropertyImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_ObjectProperty()
		 * @generated
		 */
		EClass GOBJECT_PROPERTY = eINSTANCE.getG_ObjectProperty();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_AnonymousIndividualImpl <em>GAnonymous Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_AnonymousIndividualImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_AnonymousIndividual()
		 * @generated
		 */
		EClass GANONYMOUS_INDIVIDUAL = eINSTANCE.getG_AnonymousIndividual();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_NamedIndividualImpl <em>GNamed Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_NamedIndividualImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_NamedIndividual()
		 * @generated
		 */
		EClass GNAMED_INDIVIDUAL = eINSTANCE.getG_NamedIndividual();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_NamedClassImpl <em>GNamed Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_NamedClassImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_NamedClass()
		 * @generated
		 */
		EClass GNAMED_CLASS = eINSTANCE.getG_NamedClass();

		/**
		 * The meta object literal for the '<em><b>GClass Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNAMED_CLASS__GCLASS_TYPE = eINSTANCE.getG_NamedClass_G_ClassType();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_SingleObjectImpl <em>GSingle Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_SingleObjectImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_SingleObject()
		 * @generated
		 */
		EClass GSINGLE_OBJECT = eINSTANCE.getG_SingleObject();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_LiteralImpl <em>GLiteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_LiteralImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_Literal()
		 * @generated
		 */
		EClass GLITERAL = eINSTANCE.getG_Literal();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_TypedRelationImpl <em>GTyped Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_TypedRelationImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_TypedRelation()
		 * @generated
		 */
		EClass GTYPED_RELATION = eINSTANCE.getG_TypedRelation();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.ILinkImpl <em>ILink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.ILinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getILink()
		 * @generated
		 */
		EClass ILINK = eINSTANCE.getILink();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.PLinkImpl <em>PLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.PLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getPLink()
		 * @generated
		 */
		EClass PLINK = eINSTANCE.getPLink();

		/**
		 * The meta object literal for the '<em><b>GProperty</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLINK__GPROPERTY = eINSTANCE.getPLink_G_Property();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.G_UntypedRelationImpl <em>GUntyped Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.G_UntypedRelationImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getG_UntypedRelation()
		 * @generated
		 */
		EClass GUNTYPED_RELATION = eINSTANCE.getG_UntypedRelation();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.SLinkImpl <em>SLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.SLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getSLink()
		 * @generated
		 */
		EClass SLINK = eINSTANCE.getSLink();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.ELinkImpl <em>ELink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.ELinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getELink()
		 * @generated
		 */
		EClass ELINK = eINSTANCE.getELink();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.ALinkImpl <em>ALink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.ALinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getALink()
		 * @generated
		 */
		EClass ALINK = eINSTANCE.getALink();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.InvLinkImpl <em>Inv Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.InvLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getInvLink()
		 * @generated
		 */
		EClass INV_LINK = eINSTANCE.getInvLink();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.NegatePLinkImpl <em>Negate PLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.NegatePLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getNegatePLink()
		 * @generated
		 */
		EClass NEGATE_PLINK = eINSTANCE.getNegatePLink();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.impl.DLinkImpl <em>DLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.DLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.impl.GowlPackageImpl#getDLink()
		 * @generated
		 */
		EClass DLINK = eINSTANCE.getDLink();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DLINK__D = eINSTANCE.getDLink_D();

	}

} //GowlPackage
