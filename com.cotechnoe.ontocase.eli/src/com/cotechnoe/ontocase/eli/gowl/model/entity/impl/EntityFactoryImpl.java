/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.entity.impl;

import com.cotechnoe.ontocase.eli.gowl.model.entity.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityFactoryImpl extends EFactoryImpl implements EntityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityFactory init() {
		try {
			EntityFactory theEntityFactory = (EntityFactory)EPackage.Registry.INSTANCE.getEFactory(EntityPackage.eNS_URI);
			if (theEntityFactory != null) {
				return theEntityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EntityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EntityPackage.GOBJECT_INTERSECTION_OF: return createG_ObjectIntersectionOf();
			case EntityPackage.GANNOTATION_PROPERTY: return createG_AnnotationProperty();
			case EntityPackage.GOBJECT_PROPERTY: return createG_ObjectProperty();
			case EntityPackage.GANONYMOUS_INDIVIDUAL: return createG_AnonymousIndividual();
			case EntityPackage.GNAMED_INDIVIDUAL: return createG_NamedIndividual();
			case EntityPackage.GNAMED_CLASS: return createG_NamedClass();
			case EntityPackage.GRESOURCE: return createG_Resource();
			case EntityPackage.GLITERAL: return createG_Literal();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_ObjectIntersectionOf createG_ObjectIntersectionOf() {
		G_ObjectIntersectionOfImpl g_ObjectIntersectionOf = new G_ObjectIntersectionOfImpl();
		return g_ObjectIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_AnnotationProperty createG_AnnotationProperty() {
		G_AnnotationPropertyImpl g_AnnotationProperty = new G_AnnotationPropertyImpl();
		return g_AnnotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_ObjectProperty createG_ObjectProperty() {
		G_ObjectPropertyImpl g_ObjectProperty = new G_ObjectPropertyImpl();
		return g_ObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_AnonymousIndividual createG_AnonymousIndividual() {
		G_AnonymousIndividualImpl g_AnonymousIndividual = new G_AnonymousIndividualImpl();
		return g_AnonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_NamedIndividual createG_NamedIndividual() {
		G_NamedIndividualImpl g_NamedIndividual = new G_NamedIndividualImpl();
		return g_NamedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_NamedClass createG_NamedClass() {
		G_NamedClassImpl g_NamedClass = new G_NamedClassImpl();
		return g_NamedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_Resource createG_Resource() {
		G_ResourceImpl g_Resource = new G_ResourceImpl();
		return g_Resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_Literal createG_Literal() {
		G_LiteralImpl g_Literal = new G_LiteralImpl();
		return g_Literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityPackage getEntityPackage() {
		return (EntityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EntityPackage getPackage() {
		return EntityPackage.eINSTANCE;
	}

} //EntityFactoryImpl
