/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation.impl;

import com.cotechnoe.ontocase.eli.gowl.model.relation.NegatePLink;
import com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negate PLink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.relation.impl.NegatePLinkImpl#getNOT <em>NOT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegatePLinkImpl extends G_UntypedRelationImpl implements NegatePLink {
	/**
	 * The default value of the '{@link #getNOT() <em>NOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOT()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_EDEFAULT = "NOT";

	/**
	 * The cached value of the '{@link #getNOT() <em>NOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOT()
	 * @generated
	 * @ordered
	 */
	protected String not = NOT_EDEFAULT;

	/**
	 * This is true if the NOT attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegatePLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationPackage.Literals.NEGATE_PLINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNOT() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNOT() {
		return notESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationPackage.NEGATE_PLINK__NOT:
				return getNOT();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RelationPackage.NEGATE_PLINK__NOT:
				return isSetNOT();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (NOT: ");
		if (notESet) result.append(not); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NegatePLinkImpl
