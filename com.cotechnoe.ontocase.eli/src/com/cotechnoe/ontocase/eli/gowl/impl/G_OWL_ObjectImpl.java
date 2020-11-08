/**
 * Copyright Text	(c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.impl;

import com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Object;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GOWL Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_ObjectImpl#getG_labelType <em>Glabel Type</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_ObjectImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_ObjectImpl#getIri <em>Iri</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_ObjectImpl#getG_label <em>Glabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class G_OWL_ObjectImpl extends MinimalEObjectImpl.Container implements G_OWL_Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * The default value of the '{@link #getG_labelType() <em>Glabel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_labelType()
	 * @generated
	 * @ordered
	 */
	protected static final G_LABEL_TYPE GLABEL_TYPE_EDEFAULT = G_LABEL_TYPE.LABEL;

	/**
	 * The cached value of the '{@link #getG_labelType() <em>Glabel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_labelType()
	 * @generated
	 * @ordered
	 */
	protected G_LABEL_TYPE g_labelType = GLABEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected static final String IRI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected String iri = IRI_EDEFAULT;

	/**
	 * The default value of the '{@link #getG_label() <em>Glabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_label()
	 * @generated
	 * @ordered
	 */
	protected static final String GLABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected G_OWL_ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GowlPackage.Literals.GOWL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_LABEL_TYPE getG_labelType() {
		return g_labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setG_labelType(G_LABEL_TYPE newG_labelType) {
		G_LABEL_TYPE oldG_labelType = g_labelType;
		g_labelType = newG_labelType == null ? GLABEL_TYPE_EDEFAULT : newG_labelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GowlPackage.GOWL_OBJECT__GLABEL_TYPE, oldG_labelType, g_labelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GowlPackage.GOWL_OBJECT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIri() {
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIri(String newIri) {
		String oldIri = iri;
		iri = newIri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GowlPackage.GOWL_OBJECT__IRI, oldIri, iri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getG_label() {
		return this.getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setG_label(String newG_label) {
		this.setLabel(newG_label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GowlPackage.GOWL_OBJECT__GLABEL_TYPE:
				return getG_labelType();
			case GowlPackage.GOWL_OBJECT__LABEL:
				return getLabel();
			case GowlPackage.GOWL_OBJECT__IRI:
				return getIri();
			case GowlPackage.GOWL_OBJECT__GLABEL:
				return getG_label();
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
			case GowlPackage.GOWL_OBJECT__GLABEL_TYPE:
				setG_labelType((G_LABEL_TYPE)newValue);
				return;
			case GowlPackage.GOWL_OBJECT__LABEL:
				setLabel((String)newValue);
				return;
			case GowlPackage.GOWL_OBJECT__IRI:
				setIri((String)newValue);
				return;
			case GowlPackage.GOWL_OBJECT__GLABEL:
				setG_label((String)newValue);
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
			case GowlPackage.GOWL_OBJECT__GLABEL_TYPE:
				setG_labelType(GLABEL_TYPE_EDEFAULT);
				return;
			case GowlPackage.GOWL_OBJECT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GowlPackage.GOWL_OBJECT__IRI:
				setIri(IRI_EDEFAULT);
				return;
			case GowlPackage.GOWL_OBJECT__GLABEL:
				setG_label(GLABEL_EDEFAULT);
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
			case GowlPackage.GOWL_OBJECT__GLABEL_TYPE:
				return g_labelType != GLABEL_TYPE_EDEFAULT;
			case GowlPackage.GOWL_OBJECT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case GowlPackage.GOWL_OBJECT__IRI:
				return IRI_EDEFAULT == null ? iri != null : !IRI_EDEFAULT.equals(iri);
			case GowlPackage.GOWL_OBJECT__GLABEL:
				return GLABEL_EDEFAULT == null ? getG_label() != null : !GLABEL_EDEFAULT.equals(getG_label());
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
		result.append(" (g_labelType: ");
		result.append(g_labelType);
		result.append(", label: ");
		result.append(label);
		result.append(", iri: ");
		result.append(iri);
		result.append(')');
		return result.toString();
	}

} //G_OWL_ObjectImpl
