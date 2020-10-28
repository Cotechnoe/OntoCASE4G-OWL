/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation.impl;

import com.cotechnoe.ontocase.eli.gowl.model.relation.*;

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
public class RelationFactoryImpl extends EFactoryImpl implements RelationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationFactory init() {
		try {
			RelationFactory theRelationFactory = (RelationFactory)EPackage.Registry.INSTANCE.getEFactory(RelationPackage.eNS_URI);
			if (theRelationFactory != null) {
				return theRelationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationFactoryImpl() {
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
			case RelationPackage.ILINK: return createILink();
			case RelationPackage.PLINK: return createPLink();
			case RelationPackage.SLINK: return createSLink();
			case RelationPackage.ELINK: return createELink();
			case RelationPackage.ALINK: return createALink();
			case RelationPackage.INV_LINK: return createInvLink();
			case RelationPackage.NEGATE_PLINK: return createNegatePLink();
			case RelationPackage.DLINK: return createDLink();
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
	public ILink createILink() {
		ILinkImpl iLink = new ILinkImpl();
		return iLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PLink createPLink() {
		PLinkImpl pLink = new PLinkImpl();
		return pLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SLink createSLink() {
		SLinkImpl sLink = new SLinkImpl();
		return sLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ELink createELink() {
		ELinkImpl eLink = new ELinkImpl();
		return eLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ALink createALink() {
		ALinkImpl aLink = new ALinkImpl();
		return aLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvLink createInvLink() {
		InvLinkImpl invLink = new InvLinkImpl();
		return invLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NegatePLink createNegatePLink() {
		NegatePLinkImpl negatePLink = new NegatePLinkImpl();
		return negatePLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DLink createDLink() {
		DLinkImpl dLink = new DLinkImpl();
		return dLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationPackage getRelationPackage() {
		return (RelationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationPackage getPackage() {
		return RelationPackage.eINSTANCE;
	}

} //RelationFactoryImpl
