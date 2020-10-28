/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation.impl;

import com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_RelationImpl;

import com.cotechnoe.ontocase.eli.gowl.model.relation.G_TypedRelation;
import com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GTyped Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class G_TypedRelationImpl extends G_RelationImpl implements G_TypedRelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected G_TypedRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationPackage.Literals.GTYPED_RELATION;
	}

} //G_TypedRelationImpl
