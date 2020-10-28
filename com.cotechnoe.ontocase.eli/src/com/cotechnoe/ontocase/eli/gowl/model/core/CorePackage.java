/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.core;

import com.cotechnoe.ontocase.eli.gowl.model.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cotechnoe.com/vocabulary/gowl-core.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_RelationImpl <em>GRelation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_RelationImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getG_Relation()
	 * @generated
	 */
	int GRELATION = 0;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION__GLABEL = 0;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION__IRI = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION__TARGET = 3;

	/**
	 * The number of structural features of the '<em>GRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_EntityImpl <em>GEntity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_EntityImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getG_Entity()
	 * @generated
	 */
	int GENTITY = 4;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__IS_SOURCE_OF = 0;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__IS_TARGET_OF = 1;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__GLABEL = 2;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY__IRI = 3;

	/**
	 * The number of structural features of the '<em>GEntity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GEntity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_ResourceImpl <em>GResource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_ResourceImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getG_Resource()
	 * @generated
	 */
	int GRESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Is Source Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE__IS_SOURCE_OF = EntityPackage.GSINGLE_OBJECT__IS_SOURCE_OF;

	/**
	 * The feature id for the '<em><b>Is Target Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE__IS_TARGET_OF = EntityPackage.GSINGLE_OBJECT__IS_TARGET_OF;

	/**
	 * The feature id for the '<em><b>Glabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE__GLABEL = EntityPackage.GSINGLE_OBJECT__GLABEL;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE__IRI = EntityPackage.GSINGLE_OBJECT__IRI;

	/**
	 * The number of structural features of the '<em>GResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_FEATURE_COUNT = EntityPackage.GSINGLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESOURCE_OPERATION_COUNT = EntityPackage.GSINGLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_PrefixImpl <em>GPrefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_PrefixImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getG_Prefix()
	 * @generated
	 */
	int GPREFIX = 2;

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
	 * The meta object id for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.IRIImpl <em>IRI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.IRIImpl
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getIRI()
	 * @generated
	 */
	int IRI = 3;

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
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation <em>GRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRelation</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation
	 * @generated
	 */
	EClass getG_Relation();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getG_label <em>Glabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glabel</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getG_label()
	 * @see #getG_Relation()
	 * @generated
	 */
	EAttribute getG_Relation_G_label();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getIri()
	 * @see #getG_Relation()
	 * @generated
	 */
	EAttribute getG_Relation_Iri();

	/**
	 * Returns the meta object for the reference '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getSource()
	 * @see #getG_Relation()
	 * @generated
	 */
	EReference getG_Relation_Source();

	/**
	 * Returns the meta object for the reference '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation#getTarget()
	 * @see #getG_Relation()
	 * @generated
	 */
	EReference getG_Relation_Target();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Resource <em>GResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GResource</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Resource
	 * @generated
	 */
	EClass getG_Resource();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix <em>GPrefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPrefix</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix
	 * @generated
	 */
	EClass getG_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix#getNs()
	 * @see #getG_Prefix()
	 * @generated
	 */
	EAttribute getG_Prefix_Ns();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix#getIri()
	 * @see #getG_Prefix()
	 * @generated
	 */
	EAttribute getG_Prefix_Iri();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.IRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRI</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.IRI
	 * @generated
	 */
	EClass getIRI();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.core.IRI#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.IRI#getIri()
	 * @see #getIRI()
	 * @generated
	 */
	EAttribute getIRI_Iri();

	/**
	 * Returns the meta object for class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity <em>GEntity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEntity</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity
	 * @generated
	 */
	EClass getG_Entity();

	/**
	 * Returns the meta object for the reference list '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsSourceOf <em>Is Source Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Source Of</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsSourceOf()
	 * @see #getG_Entity()
	 * @generated
	 */
	EReference getG_Entity_IsSourceOf();

	/**
	 * Returns the meta object for the reference list '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsTargetOf <em>Is Target Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Target Of</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIsTargetOf()
	 * @see #getG_Entity()
	 * @generated
	 */
	EReference getG_Entity_IsTargetOf();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getG_label <em>Glabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glabel</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getG_label()
	 * @see #getG_Entity()
	 * @generated
	 */
	EAttribute getG_Entity_G_label();

	/**
	 * Returns the meta object for the attribute '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity#getIri()
	 * @see #getG_Entity()
	 * @generated
	 */
	EAttribute getG_Entity_Iri();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_RelationImpl <em>GRelation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_RelationImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getG_Relation()
		 * @generated
		 */
		EClass GRELATION = eINSTANCE.getG_Relation();

		/**
		 * The meta object literal for the '<em><b>Glabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRELATION__GLABEL = eINSTANCE.getG_Relation_G_label();

		/**
		 * The meta object literal for the '<em><b>Iri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRELATION__IRI = eINSTANCE.getG_Relation_Iri();

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
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_ResourceImpl <em>GResource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_ResourceImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getG_Resource()
		 * @generated
		 */
		EClass GRESOURCE = eINSTANCE.getG_Resource();

		/**
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_PrefixImpl <em>GPrefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_PrefixImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getG_Prefix()
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
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.IRIImpl <em>IRI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.IRIImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getIRI()
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
		 * The meta object literal for the '{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_EntityImpl <em>GEntity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_EntityImpl
		 * @see com.cotechnoe.ontocase.eli.gowl.model.core.impl.CorePackageImpl#getG_Entity()
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
		 * The meta object literal for the '<em><b>Glabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENTITY__GLABEL = eINSTANCE.getG_Entity_G_label();

		/**
		 * The meta object literal for the '<em><b>Iri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENTITY__IRI = eINSTANCE.getG_Entity_Iri();

	}

} //CorePackage
