/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.entity.util;

import com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity;

import com.cotechnoe.ontocase.eli.gowl.model.entity.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.EntityPackage
 * @generated
 */
public class EntityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EntityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EntityPackage.eINSTANCE;
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
	protected EntitySwitch<Adapter> modelSwitch =
		new EntitySwitch<Adapter>() {
			@Override
			public Adapter caseG_ObjectIntersectionOf(G_ObjectIntersectionOf object) {
				return createG_ObjectIntersectionOfAdapter();
			}
			@Override
			public Adapter caseG_ClassContainer(G_ClassContainer object) {
				return createG_ClassContainerAdapter();
			}
			@Override
			public Adapter caseG_Container(G_Container object) {
				return createG_ContainerAdapter();
			}
			@Override
			public Adapter caseG_Collection(G_Collection object) {
				return createG_CollectionAdapter();
			}
			@Override
			public Adapter caseG_AnnotationProperty(G_AnnotationProperty object) {
				return createG_AnnotationPropertyAdapter();
			}
			@Override
			public Adapter caseG_Property(G_Property object) {
				return createG_PropertyAdapter();
			}
			@Override
			public Adapter caseG_ObjectProperty(G_ObjectProperty object) {
				return createG_ObjectPropertyAdapter();
			}
			@Override
			public Adapter caseG_AnonymousIndividual(G_AnonymousIndividual object) {
				return createG_AnonymousIndividualAdapter();
			}
			@Override
			public Adapter caseG_Individual(G_Individual object) {
				return createG_IndividualAdapter();
			}
			@Override
			public Adapter caseG_NamedIndividual(G_NamedIndividual object) {
				return createG_NamedIndividualAdapter();
			}
			@Override
			public Adapter caseG_NamedClass(G_NamedClass object) {
				return createG_NamedClassAdapter();
			}
			@Override
			public Adapter caseG_Resource(G_Resource object) {
				return createG_ResourceAdapter();
			}
			@Override
			public Adapter caseG_SingleObject(G_SingleObject object) {
				return createG_SingleObjectAdapter();
			}
			@Override
			public Adapter caseG_Literal(G_Literal object) {
				return createG_LiteralAdapter();
			}
			@Override
			public Adapter caseG_Entity(G_Entity object) {
				return createG_EntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectIntersectionOf <em>GObject Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectIntersectionOf
	 * @generated
	 */
	public Adapter createG_ObjectIntersectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_ClassContainer <em>GClass Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_ClassContainer
	 * @generated
	 */
	public Adapter createG_ClassContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Container <em>GContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Container
	 * @generated
	 */
	public Adapter createG_ContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Collection <em>GCollection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Collection
	 * @generated
	 */
	public Adapter createG_CollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnnotationProperty <em>GAnnotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnnotationProperty
	 * @generated
	 */
	public Adapter createG_AnnotationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Property <em>GProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Property
	 * @generated
	 */
	public Adapter createG_PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectProperty <em>GObject Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_ObjectProperty
	 * @generated
	 */
	public Adapter createG_ObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnonymousIndividual <em>GAnonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_AnonymousIndividual
	 * @generated
	 */
	public Adapter createG_AnonymousIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Individual <em>GIndividual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Individual
	 * @generated
	 */
	public Adapter createG_IndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedIndividual <em>GNamed Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedIndividual
	 * @generated
	 */
	public Adapter createG_NamedIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedClass <em>GNamed Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_NamedClass
	 * @generated
	 */
	public Adapter createG_NamedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Resource <em>GResource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Resource
	 * @generated
	 */
	public Adapter createG_ResourceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.model.entity.G_Literal <em>GLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.model.entity.G_Literal
	 * @generated
	 */
	public Adapter createG_LiteralAdapter() {
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

} //EntityAdapterFactory
