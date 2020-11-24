/**
 * Copyright Text	(c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.impl;

import com.cotechnoe.ontocase.eli.gowl.G_AnnotationClass;
import com.cotechnoe.ontocase.eli.gowl.G_ClassType;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GAnnotation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_AnnotationClassImpl#getG_ClassType <em>GClass Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class G_AnnotationClassImpl extends G_CollectionImpl implements G_AnnotationClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * The default value of the '{@link #getG_ClassType() <em>GClass Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_ClassType()
	 * @generated
	 * @ordered
	 */
	protected static final G_ClassType GCLASS_TYPE_EDEFAULT = G_ClassType.RDFS_CLASS;

	/**
	 * The cached value of the '{@link #getG_ClassType() <em>GClass Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_ClassType()
	 * @generated
	 * @ordered
	 */
	protected G_ClassType g_ClassType = GCLASS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected G_AnnotationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GowlPackage.Literals.GANNOTATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_ClassType getG_ClassType() {
		return g_ClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setG_ClassType(G_ClassType newG_ClassType) {
		G_ClassType oldG_ClassType = g_ClassType;
		g_ClassType = newG_ClassType == null ? GCLASS_TYPE_EDEFAULT : newG_ClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GowlPackage.GANNOTATION_CLASS__GCLASS_TYPE, oldG_ClassType, g_ClassType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GowlPackage.GANNOTATION_CLASS__GCLASS_TYPE:
				return getG_ClassType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GowlPackage.GANNOTATION_CLASS__GCLASS_TYPE:
				setG_ClassType((G_ClassType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GowlPackage.GANNOTATION_CLASS__GCLASS_TYPE:
				setG_ClassType(GCLASS_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GowlPackage.GANNOTATION_CLASS__GCLASS_TYPE:
				return g_ClassType != GCLASS_TYPE_EDEFAULT;
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
		result.append(" (g_ClassType: ");
		result.append(g_ClassType);
		result.append(')');
		return result.toString();
	}

} //G_AnnotationClassImpl
