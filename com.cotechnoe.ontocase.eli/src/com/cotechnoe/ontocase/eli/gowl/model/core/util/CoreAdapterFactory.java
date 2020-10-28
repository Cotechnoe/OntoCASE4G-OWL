/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.core.util;

import com.cotechnoe.ontocase.eli.gowl.model.core.*;

import com.cotechnoe.ontocase.eli.gowl.model.entity.G_SingleObject;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseG_Relation(G_Relation object) {
				return createG_RelationAdapter();
			}
			@Override
			public Adapter caseG_Resource(G_Resource object) {
				return createG_ResourceAdapter();
			}
			@Override
			public Adapter caseG_Prefix(G_Prefix object) {
				return createG_PrefixAdapter();
			}
			@Override
			public Adapter caseIRI(IRI object) {
				return createIRIAdapter();
			}
			@Override
			public Adapter caseG_Entity(G_Entity object) {
				return createG_EntityAdapter();
			}
			@Override
			public Adapter caseG_SingleObject(G_SingleObject object) {
				return createG_SingleObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Resource <em>GResource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Resource
	 * @generated
	 */
	public Adapter createG_ResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix <em>GPrefix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Prefix
	 * @generated
	 */
	public Adapter createG_PrefixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.IRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.IRI
	 * @generated
	 */
	public Adapter createIRIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity <em>GEntity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity
	 * @generated
	 */
	public Adapter createG_EntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_SingleObject <em>GSingle Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_SingleObject
	 * @generated
	 */
	public Adapter createG_SingleObjectAdapter() {
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

} //CoreAdapterFactory
