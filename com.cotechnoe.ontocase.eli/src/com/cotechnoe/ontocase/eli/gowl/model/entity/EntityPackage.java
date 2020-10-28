/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.entity;

import com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.EntityFactory
 * @model kind="package"
 * @generated
 */
public interface EntityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cotechnoe.com/vocabulary/gowl-entity.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "entity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityPackage eINSTANCE = com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ContainerImpl <em>GContainer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ContainerImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Container()
	 * @generated
	 */
	int GCONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__IS_SOURCE_OF = CorePackage.GENTITY__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__IS_TARGET_OF = CorePackage.GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__GLABEL = CorePackage.GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER__IRI = CorePackage.GENTITY__IRI;

	/**
	 * The number of structural features of the '<em>GContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER_FEATURE_COUNT = CorePackage.GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONTAINER_OPERATION_COUNT = CorePackage.GENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ClassContainerImpl <em>GClass Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ClassContainerImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_ClassContainer()
	 * @generated
	 */
	int GCLASS_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__IS_SOURCE_OF = GCONTAINER__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__IS_TARGET_OF = GCONTAINER__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__GLABEL = GCONTAINER__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLASS_CONTAINER__IRI = GCONTAINER__IRI;

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
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ObjectIntersectionOfImpl <em>GObject Intersection Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ObjectIntersectionOfImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_ObjectIntersectionOf()
	 * @generated
	 */
	int GOBJECT_INTERSECTION_OF = 0;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__IS_SOURCE_OF = GCLASS_CONTAINER__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__IS_TARGET_OF = GCLASS_CONTAINER__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__GLABEL = GCLASS_CONTAINER__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_INTERSECTION_OF__IRI = GCLASS_CONTAINER__IRI;

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
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_CollectionImpl <em>GCollection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_CollectionImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Collection()
	 * @generated
	 */
	int GCOLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__IS_SOURCE_OF = CorePackage.GENTITY__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__IS_TARGET_OF = CorePackage.GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__GLABEL = CorePackage.GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION__IRI = CorePackage.GENTITY__IRI;

	/**
	 * The number of structural features of the '<em>GCollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION_FEATURE_COUNT = CorePackage.GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GCollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCOLLECTION_OPERATION_COUNT = CorePackage.GENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_PropertyImpl <em>GProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_PropertyImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Property()
	 * @generated
	 */
	int GPROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__IS_SOURCE_OF = CorePackage.GENTITY__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__IS_TARGET_OF = CorePackage.GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__GLABEL = CorePackage.GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY__IRI = CorePackage.GENTITY__IRI;

	/**
	 * The number of structural features of the '<em>GProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY_FEATURE_COUNT = CorePackage.GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROPERTY_OPERATION_COUNT = CorePackage.GENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_AnnotationPropertyImpl <em>GAnnotation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_AnnotationPropertyImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_AnnotationProperty()
	 * @generated
	 */
	int GANNOTATION_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__IS_SOURCE_OF = GPROPERTY__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__IS_TARGET_OF = GPROPERTY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__GLABEL = GPROPERTY__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANNOTATION_PROPERTY__IRI = GPROPERTY__IRI;

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
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ObjectPropertyImpl <em>GObject Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ObjectPropertyImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_ObjectProperty()
	 * @generated
	 */
	int GOBJECT_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__IS_SOURCE_OF = GPROPERTY__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__IS_TARGET_OF = GPROPERTY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__GLABEL = GPROPERTY__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_PROPERTY__IRI = GPROPERTY__IRI;

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
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_IndividualImpl <em>GIndividual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_IndividualImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Individual()
	 * @generated
	 */
	int GINDIVIDUAL = 8;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__IS_SOURCE_OF = CorePackage.GENTITY__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__IS_TARGET_OF = CorePackage.GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__GLABEL = CorePackage.GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL__IRI = CorePackage.GENTITY__IRI;

	/**
	 * The number of structural features of the '<em>GIndividual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL_FEATURE_COUNT = CorePackage.GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GIndividual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINDIVIDUAL_OPERATION_COUNT = CorePackage.GENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_AnonymousIndividualImpl <em>GAnonymous Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_AnonymousIndividualImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_AnonymousIndividual()
	 * @generated
	 */
	int GANONYMOUS_INDIVIDUAL = 7;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__IS_SOURCE_OF = GINDIVIDUAL__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__IS_TARGET_OF = GINDIVIDUAL__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__GLABEL = GINDIVIDUAL__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GANONYMOUS_INDIVIDUAL__IRI = GINDIVIDUAL__IRI;

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
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_NamedIndividualImpl <em>GNamed Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_NamedIndividualImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_NamedIndividual()
	 * @generated
	 */
	int GNAMED_INDIVIDUAL = 9;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__IS_SOURCE_OF = GINDIVIDUAL__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__IS_TARGET_OF = GINDIVIDUAL__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__GLABEL = GINDIVIDUAL__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_INDIVIDUAL__IRI = GINDIVIDUAL__IRI;

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
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_NamedClassImpl <em>GNamed Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_NamedClassImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_NamedClass()
	 * @generated
	 */
	int GNAMED_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__IS_SOURCE_OF = GCOLLECTION__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__IS_TARGET_OF = GCOLLECTION__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__GLABEL = GCOLLECTION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS__IRI = GCOLLECTION__IRI;

	/**
	 * The number of structural features of the '<em>GNamed Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS_FEATURE_COUNT = GCOLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GNamed Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAMED_CLASS_OPERATION_COUNT = GCOLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_SingleObjectImpl <em>GSingle Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_SingleObjectImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_SingleObject()
	 * @generated
	 */
	int GSINGLE_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__IS_SOURCE_OF = CorePackage.GENTITY__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__IS_TARGET_OF = CorePackage.GENTITY__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__GLABEL = CorePackage.GENTITY__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT__IRI = CorePackage.GENTITY__IRI;

	/**
	 * The number of structural features of the '<em>GSingle Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT_FEATURE_COUNT = CorePackage.GENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSingle Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSINGLE_OBJECT_OPERATION_COUNT = CorePackage.GENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ResourceImpl <em>GResource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ResourceImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Resource()
	 * @generated
	 */
	int GRESOURCE = 11;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE__IS_SOURCE_OF = GSINGLE_OBJECT__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE__IS_TARGET_OF = GSINGLE_OBJECT__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE__GLABEL = GSINGLE_OBJECT__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE__IRI = GSINGLE_OBJECT__IRI;

	/**
	 * The number of structural features of the '<em>GResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_FEATURE_COUNT = GSINGLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_OPERATION_COUNT = GSINGLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_LiteralImpl <em>GLiteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_LiteralImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Literal()
	 * @generated
	 */
	int GLITERAL = 13;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__IS_SOURCE_OF = GSINGLE_OBJECT__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__IS_TARGET_OF = GSINGLE_OBJECT__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__GLABEL = GSINGLE_OBJECT__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLITERAL__IRI = GSINGLE_OBJECT__IRI;

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
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectIntersectionOf <em>GObject Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GObject Intersection Of</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectIntersectionOf
	 * @generated
	 */
	EClass getG_ObjectIntersectionOf();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_ClassContainer <em>GClass Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GClass Container</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_ClassContainer
	 * @generated
	 */
	EClass getG_ClassContainer();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Container <em>GContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GContainer</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Container
	 * @generated
	 */
	EClass getG_Container();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Collection <em>GCollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GCollection</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Collection
	 * @generated
	 */
	EClass getG_Collection();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnnotationProperty <em>GAnnotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAnnotation Property</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnnotationProperty
	 * @generated
	 */
	EClass getG_AnnotationProperty();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Property <em>GProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GProperty</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Property
	 * @generated
	 */
	EClass getG_Property();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectProperty <em>GObject Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GObject Property</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectProperty
	 * @generated
	 */
	EClass getG_ObjectProperty();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnonymousIndividual <em>GAnonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAnonymous Individual</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnonymousIndividual
	 * @generated
	 */
	EClass getG_AnonymousIndividual();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Individual <em>GIndividual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GIndividual</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Individual
	 * @generated
	 */
	EClass getG_Individual();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedIndividual <em>GNamed Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNamed Individual</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedIndividual
	 * @generated
	 */
	EClass getG_NamedIndividual();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedClass <em>GNamed Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNamed Class</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedClass
	 * @generated
	 */
	EClass getG_NamedClass();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Resource <em>GResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GResource</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Resource
	 * @generated
	 */
	EClass getG_Resource();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_SingleObject <em>GSingle Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSingle Object</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_SingleObject
	 * @generated
	 */
	EClass getG_SingleObject();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Literal <em>GLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GLiteral</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Literal
	 * @generated
	 */
	EClass getG_Literal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntityFactory getEntityFactory();

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
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ObjectIntersectionOfImpl <em>GObject Intersection Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ObjectIntersectionOfImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_ObjectIntersectionOf()
		 * @generated
		 */
		EClass GOBJECT_INTERSECTION_OF = eINSTANCE.getG_ObjectIntersectionOf();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ClassContainerImpl <em>GClass Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ClassContainerImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_ClassContainer()
		 * @generated
		 */
		EClass GCLASS_CONTAINER = eINSTANCE.getG_ClassContainer();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ContainerImpl <em>GContainer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ContainerImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Container()
		 * @generated
		 */
		EClass GCONTAINER = eINSTANCE.getG_Container();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_CollectionImpl <em>GCollection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_CollectionImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Collection()
		 * @generated
		 */
		EClass GCOLLECTION = eINSTANCE.getG_Collection();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_AnnotationPropertyImpl <em>GAnnotation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_AnnotationPropertyImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_AnnotationProperty()
		 * @generated
		 */
		EClass GANNOTATION_PROPERTY = eINSTANCE.getG_AnnotationProperty();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_PropertyImpl <em>GProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_PropertyImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Property()
		 * @generated
		 */
		EClass GPROPERTY = eINSTANCE.getG_Property();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ObjectPropertyImpl <em>GObject Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ObjectPropertyImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_ObjectProperty()
		 * @generated
		 */
		EClass GOBJECT_PROPERTY = eINSTANCE.getG_ObjectProperty();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_AnonymousIndividualImpl <em>GAnonymous Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_AnonymousIndividualImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_AnonymousIndividual()
		 * @generated
		 */
		EClass GANONYMOUS_INDIVIDUAL = eINSTANCE.getG_AnonymousIndividual();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_IndividualImpl <em>GIndividual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_IndividualImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Individual()
		 * @generated
		 */
		EClass GINDIVIDUAL = eINSTANCE.getG_Individual();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_NamedIndividualImpl <em>GNamed Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_NamedIndividualImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_NamedIndividual()
		 * @generated
		 */
		EClass GNAMED_INDIVIDUAL = eINSTANCE.getG_NamedIndividual();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_NamedClassImpl <em>GNamed Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_NamedClassImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_NamedClass()
		 * @generated
		 */
		EClass GNAMED_CLASS = eINSTANCE.getG_NamedClass();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ResourceImpl <em>GResource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_ResourceImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Resource()
		 * @generated
		 */
		EClass GRESOURCE = eINSTANCE.getG_Resource();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_SingleObjectImpl <em>GSingle Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_SingleObjectImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_SingleObject()
		 * @generated
		 */
		EClass GSINGLE_OBJECT = eINSTANCE.getG_SingleObject();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_LiteralImpl <em>GLiteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.G_LiteralImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.impl.EntityPackageImpl#getG_Literal()
		 * @generated
		 */
		EClass GLITERAL = eINSTANCE.getG_Literal();

	}

} //EntityPackage
