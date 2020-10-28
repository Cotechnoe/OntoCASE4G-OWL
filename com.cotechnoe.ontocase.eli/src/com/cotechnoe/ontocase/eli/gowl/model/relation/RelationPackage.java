/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation;

import com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationFactory
 * @model kind="package"
 * @generated
 */
public interface RelationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cotechnoe.com/vocabulary/gowl-relation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationPackage eINSTANCE = com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.G_TypedRelationImpl <em>GTyped Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.G_TypedRelationImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getG_TypedRelation()
	 * @generated
	 */
	int GTYPED_RELATION = 0;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION__GLABEL = CorePackage.GRELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION__IRI = CorePackage.GRELATION__IRI;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION__SOURCE = CorePackage.GRELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION__TARGET = CorePackage.GRELATION__TARGET;

	/**
	 * The number of structural features of the '<em>GTyped Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION_FEATURE_COUNT = CorePackage.GRELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GTyped Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTYPED_RELATION_OPERATION_COUNT = CorePackage.GRELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ILinkImpl <em>ILink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ILinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getILink()
	 * @generated
	 */
	int ILINK = 1;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK__IRI = GTYPED_RELATION__IRI;

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
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK__I = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ILink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ILink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.G_UntypedRelationImpl <em>GUntyped Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.G_UntypedRelationImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getG_UntypedRelation()
	 * @generated
	 */
	int GUNTYPED_RELATION = 3;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION__GLABEL = CorePackage.GRELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION__IRI = CorePackage.GRELATION__IRI;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION__SOURCE = CorePackage.GRELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION__TARGET = CorePackage.GRELATION__TARGET;

	/**
	 * The number of structural features of the '<em>GUntyped Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION_FEATURE_COUNT = CorePackage.GRELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GUntyped Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNTYPED_RELATION_OPERATION_COUNT = CorePackage.GRELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.PLinkImpl <em>PLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.PLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getPLink()
	 * @generated
	 */
	int PLINK = 2;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK__GLABEL = GUNTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK__IRI = GUNTYPED_RELATION__IRI;

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
	 * The number of structural features of the '<em>PLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK_FEATURE_COUNT = GUNTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLINK_OPERATION_COUNT = GUNTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.SLinkImpl <em>SLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.SLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getSLink()
	 * @generated
	 */
	int SLINK = 4;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK__IRI = GTYPED_RELATION__IRI;

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
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK__S = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ELinkImpl <em>ELink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ELinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getELink()
	 * @generated
	 */
	int ELINK = 5;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__IRI = GTYPED_RELATION__IRI;

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
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__E = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ELink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ELink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ALinkImpl <em>ALink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ALinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getALink()
	 * @generated
	 */
	int ALINK = 6;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK__IRI = GTYPED_RELATION__IRI;

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
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK__A = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ALink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ALink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.InvLinkImpl <em>Inv Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.InvLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getInvLink()
	 * @generated
	 */
	int INV_LINK = 7;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK__IRI = GTYPED_RELATION__IRI;

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
	 * The feature id for the '<em><b>Inv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK__INV = GTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inv Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK_FEATURE_COUNT = GTYPED_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inv Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_LINK_OPERATION_COUNT = GTYPED_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.NegatePLinkImpl <em>Negate PLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.NegatePLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getNegatePLink()
	 * @generated
	 */
	int NEGATE_PLINK = 8;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK__GLABEL = GUNTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK__IRI = GUNTYPED_RELATION__IRI;

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
	 * The feature id for the '<em><b>NOT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK__NOT = GUNTYPED_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negate PLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK_FEATURE_COUNT = GUNTYPED_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negate PLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_PLINK_OPERATION_COUNT = GUNTYPED_RELATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.DLinkImpl <em>DLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.DLinkImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getDLink()
	 * @generated
	 */
	int DLINK = 9;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK__GLABEL = GTYPED_RELATION__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLINK__IRI = GTYPED_RELATION__IRI;

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
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.G_TypedRelation <em>GTyped Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTyped Relation</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.G_TypedRelation
	 * @generated
	 */
	EClass getG_TypedRelation();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ILink <em>ILink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.ILink
	 * @generated
	 */
	EClass getILink();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ILink#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.ILink#getI()
	 * @see #getILink()
	 * @generated
	 */
	EAttribute getILink_I();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.PLink <em>PLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.PLink
	 * @generated
	 */
	EClass getPLink();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.G_UntypedRelation <em>GUntyped Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUntyped Relation</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.G_UntypedRelation
	 * @generated
	 */
	EClass getG_UntypedRelation();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.SLink <em>SLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.SLink
	 * @generated
	 */
	EClass getSLink();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.SLink#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.SLink#getS()
	 * @see #getSLink()
	 * @generated
	 */
	EAttribute getSLink_S();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ELink <em>ELink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.ELink
	 * @generated
	 */
	EClass getELink();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ELink#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.ELink#getE()
	 * @see #getELink()
	 * @generated
	 */
	EAttribute getELink_E();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ALink <em>ALink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.ALink
	 * @generated
	 */
	EClass getALink();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ALink#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.ALink#getA()
	 * @see #getALink()
	 * @generated
	 */
	EAttribute getALink_A();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.InvLink <em>Inv Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inv Link</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.InvLink
	 * @generated
	 */
	EClass getInvLink();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.InvLink#getInv <em>Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inv</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.InvLink#getInv()
	 * @see #getInvLink()
	 * @generated
	 */
	EAttribute getInvLink_Inv();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink <em>Negate PLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negate PLink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink
	 * @generated
	 */
	EClass getNegatePLink();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink#getNOT <em>NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NOT</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink#getNOT()
	 * @see #getNegatePLink()
	 * @generated
	 */
	EAttribute getNegatePLink_NOT();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.DLink <em>DLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DLink</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.DLink
	 * @generated
	 */
	EClass getDLink();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.DLink#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.DLink#getD()
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
	RelationFactory getRelationFactory();

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
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.G_TypedRelationImpl <em>GTyped Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.G_TypedRelationImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getG_TypedRelation()
		 * @generated
		 */
		EClass GTYPED_RELATION = eINSTANCE.getG_TypedRelation();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ILinkImpl <em>ILink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ILinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getILink()
		 * @generated
		 */
		EClass ILINK = eINSTANCE.getILink();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ILINK__I = eINSTANCE.getILink_I();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.PLinkImpl <em>PLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.PLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getPLink()
		 * @generated
		 */
		EClass PLINK = eINSTANCE.getPLink();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.G_UntypedRelationImpl <em>GUntyped Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.G_UntypedRelationImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getG_UntypedRelation()
		 * @generated
		 */
		EClass GUNTYPED_RELATION = eINSTANCE.getG_UntypedRelation();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.SLinkImpl <em>SLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.SLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getSLink()
		 * @generated
		 */
		EClass SLINK = eINSTANCE.getSLink();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLINK__S = eINSTANCE.getSLink_S();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ELinkImpl <em>ELink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ELinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getELink()
		 * @generated
		 */
		EClass ELINK = eINSTANCE.getELink();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELINK__E = eINSTANCE.getELink_E();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ALinkImpl <em>ALink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.ALinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getALink()
		 * @generated
		 */
		EClass ALINK = eINSTANCE.getALink();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALINK__A = eINSTANCE.getALink_A();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.InvLinkImpl <em>Inv Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.InvLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getInvLink()
		 * @generated
		 */
		EClass INV_LINK = eINSTANCE.getInvLink();

		/**
		 * The meta object literal for the '<em><b>Inv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INV_LINK__INV = eINSTANCE.getInvLink_Inv();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.NegatePLinkImpl <em>Negate PLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.NegatePLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getNegatePLink()
		 * @generated
		 */
		EClass NEGATE_PLINK = eINSTANCE.getNegatePLink();

		/**
		 * The meta object literal for the '<em><b>NOT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEGATE_PLINK__NOT = eINSTANCE.getNegatePLink_NOT();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.DLinkImpl <em>DLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.DLinkImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationPackageImpl#getDLink()
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

} //RelationPackage
