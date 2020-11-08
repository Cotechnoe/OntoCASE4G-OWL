/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.util;

import com.cotechnoe.ontocase.eli.gowl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage
 * @generated
 */
public class GowlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GowlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GowlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GowlPackage.eINSTANCE;
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
	protected GowlSwitch<Adapter> modelSwitch =
		new GowlSwitch<Adapter>() {
			@Override
			public Adapter caseALink(ALink object) {
				return createALinkAdapter();
			}
			@Override
			public Adapter caseG_TypedRelation(G_TypedRelation object) {
				return createG_TypedRelationAdapter();
			}
			@Override
			public Adapter caseG_Relation(G_Relation object) {
				return createG_RelationAdapter();
			}
			@Override
			public Adapter caseG_OWL_Object(G_OWL_Object object) {
				return createG_OWL_ObjectAdapter();
			}
			@Override
			public Adapter caseG_Entity(G_Entity object) {
				return createG_EntityAdapter();
			}
			@Override
			public Adapter caseDLink(DLink object) {
				return createDLinkAdapter();
			}
			@Override
			public Adapter caseELink(ELink object) {
				return createELinkAdapter();
			}
			@Override
			public Adapter caseG_UntypedRelation(G_UntypedRelation object) {
				return createG_UntypedRelationAdapter();
			}
			@Override
			public Adapter caseILink(ILink object) {
				return createILinkAdapter();
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
			public Adapter casePLink(PLink object) {
				return createPLinkAdapter();
			}
			@Override
			public Adapter caseG_Property(G_Property object) {
				return createG_PropertyAdapter();
			}
			@Override
			public Adapter caseSLink(SLink object) {
				return createSLinkAdapter();
			}
			@Override
			public Adapter caseG_AnnotationProperty(G_AnnotationProperty object) {
				return createG_AnnotationPropertyAdapter();
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
			public Adapter caseG_Literal(G_Literal object) {
				return createG_LiteralAdapter();
			}
			@Override
			public Adapter caseG_SingleObject(G_SingleObject object) {
				return createG_SingleObjectAdapter();
			}
			@Override
			public Adapter caseG_NamedClass(G_NamedClass object) {
				return createG_NamedClassAdapter();
			}
			@Override
			public Adapter caseG_NamedIndividual(G_NamedIndividual object) {
				return createG_NamedIndividualAdapter();
			}
			@Override
			public Adapter caseG_ObjectIntersectionOf(G_ObjectIntersectionOf object) {
				return createG_ObjectIntersectionOfAdapter();
			}
			@Override
			public Adapter caseG_ObjectProperty(G_ObjectProperty object) {
				return createG_ObjectPropertyAdapter();
			}
			@Override
			public Adapter caseG_Prefix(G_Prefix object) {
				return createG_PrefixAdapter();
			}
			@Override
			public Adapter caseG_Annotation(G_Annotation object) {
				return createG_AnnotationAdapter();
			}
			@Override
			public Adapter caseIRI(IRI object) {
				return createIRIAdapter();
			}
			@Override
			public Adapter caseG_OWL_Document(G_OWL_Document object) {
				return createG_OWL_DocumentAdapter();
			}
			@Override
			public Adapter caseEntities(Entities object) {
				return createEntitiesAdapter();
			}
			@Override
			public Adapter caseRelations(Relations object) {
				return createRelationsAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document <em>GOWL Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Document
	 * @generated
	 */
	public Adapter createG_OWL_DocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.Entities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.Entities
	 * @generated
	 */
	public Adapter createEntitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.Relations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.Relations
	 * @generated
	 */
	public Adapter createRelationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_Individual <em>GIndividual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Individual
	 * @generated
	 */
	public Adapter createG_IndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_Relation <em>GRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Relation
	 * @generated
	 */
	public Adapter createG_RelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Object <em>GOWL Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_OWL_Object
	 * @generated
	 */
	public Adapter createG_OWL_ObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_Prefix <em>GPrefix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Prefix
	 * @generated
	 */
	public Adapter createG_PrefixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_Annotation <em>GAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Annotation
	 * @generated
	 */
	public Adapter createG_AnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.IRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.IRI
	 * @generated
	 */
	public Adapter createIRIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_Entity <em>GEntity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Entity
	 * @generated
	 */
	public Adapter createG_EntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_ObjectIntersectionOf <em>GObject Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ObjectIntersectionOf
	 * @generated
	 */
	public Adapter createG_ObjectIntersectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_ClassContainer <em>GClass Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ClassContainer
	 * @generated
	 */
	public Adapter createG_ClassContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_Container <em>GContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Container
	 * @generated
	 */
	public Adapter createG_ContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_Collection <em>GCollection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Collection
	 * @generated
	 */
	public Adapter createG_CollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_AnnotationProperty <em>GAnnotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_AnnotationProperty
	 * @generated
	 */
	public Adapter createG_AnnotationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_Property <em>GProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Property
	 * @generated
	 */
	public Adapter createG_PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_ObjectProperty <em>GObject Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_ObjectProperty
	 * @generated
	 */
	public Adapter createG_ObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_AnonymousIndividual <em>GAnonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_AnonymousIndividual
	 * @generated
	 */
	public Adapter createG_AnonymousIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_NamedIndividual <em>GNamed Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_NamedIndividual
	 * @generated
	 */
	public Adapter createG_NamedIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_NamedClass <em>GNamed Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_NamedClass
	 * @generated
	 */
	public Adapter createG_NamedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_SingleObject <em>GSingle Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_SingleObject
	 * @generated
	 */
	public Adapter createG_SingleObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_Literal <em>GLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_Literal
	 * @generated
	 */
	public Adapter createG_LiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_TypedRelation <em>GTyped Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_TypedRelation
	 * @generated
	 */
	public Adapter createG_TypedRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.ILink <em>ILink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.ILink
	 * @generated
	 */
	public Adapter createILinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.PLink <em>PLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.PLink
	 * @generated
	 */
	public Adapter createPLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.G_UntypedRelation <em>GUntyped Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.G_UntypedRelation
	 * @generated
	 */
	public Adapter createG_UntypedRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.SLink <em>SLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.SLink
	 * @generated
	 */
	public Adapter createSLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.ELink <em>ELink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.ELink
	 * @generated
	 */
	public Adapter createELinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.ALink <em>ALink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.ALink
	 * @generated
	 */
	public Adapter createALinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.InvLink <em>Inv Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.InvLink
	 * @generated
	 */
	public Adapter createInvLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.NegatePLink <em>Negate PLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.NegatePLink
	 * @generated
	 */
	public Adapter createNegatePLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cotechnoe.ontocase.eli.gowl.DLink <em>DLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.cotechnoe.ontocase.eli.gowl.DLink
	 * @generated
	 */
	public Adapter createDLinkAdapter() {
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

} //GowlAdapterFactory
