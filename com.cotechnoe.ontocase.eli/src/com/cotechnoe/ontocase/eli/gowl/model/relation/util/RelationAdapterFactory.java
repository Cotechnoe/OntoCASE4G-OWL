/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation.util;

import com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation;

import com.cotechnoe.ontocase.eli.gowl.model.relation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage
 * @generated
 */
public class RelationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RelationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationSwitch<Adapter> modelSwitch =
		new RelationSwitch<Adapter>() {
			@Override
			public Adapter caseG_TypedRelation(G_TypedRelation object) {
				return createG_TypedRelationAdapter();
			}
			@Override
			public Adapter caseILink(ILink object) {
				return createILinkAdapter();
			}
			@Override
			public Adapter casePLink(PLink object) {
				return createPLinkAdapter();
			}
			@Override
			public Adapter caseG_UntypedRelation(G_UntypedRelation object) {
				return createG_UntypedRelationAdapter();
			}
			@Override
			public Adapter caseSLink(SLink object) {
				return createSLinkAdapter();
			}
			@Override
			public Adapter caseELink(ELink object) {
				return createELinkAdapter();
			}
			@Override
			public Adapter caseALink(ALink object) {
				return createALinkAdapter();
			}
			@Override
			public Adapter caseInvLink(InvLink object) {
				return createInvLinkAdapter();
			}
			@Override
			public Adapter caseNegatePLink(NegatePLink object) {
				return createNegatePLinkAdapter();
			}
			@Override
			public Adapter caseDLink(DLink object) {
				return createDLinkAdapter();
			}
			@Override
			public Adapter caseG_Relation(G_Relation object) {
				return createG_RelationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.G_TypedRelation <em>GTyped Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.G_TypedRelation
	 * @generated
	 */
	public Adapter createG_TypedRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ILink <em>ILink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.ILink
	 * @generated
	 */
	public Adapter createILinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.PLink <em>PLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.PLink
	 * @generated
	 */
	public Adapter createPLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.G_UntypedRelation <em>GUntyped Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.G_UntypedRelation
	 * @generated
	 */
	public Adapter createG_UntypedRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.SLink <em>SLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.SLink
	 * @generated
	 */
	public Adapter createSLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ELink <em>ELink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.ELink
	 * @generated
	 */
	public Adapter createELinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.ALink <em>ALink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.ALink
	 * @generated
	 */
	public Adapter createALinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.InvLink <em>Inv Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.InvLink
	 * @generated
	 */
	public Adapter createInvLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink <em>Negate PLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink
	 * @generated
	 */
	public Adapter createNegatePLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.relation.DLink <em>DLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.DLink
	 * @generated
	 */
	public Adapter createDLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation <em>GRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation
	 * @generated
	 */
	public Adapter createG_RelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RelationAdapterFactory
