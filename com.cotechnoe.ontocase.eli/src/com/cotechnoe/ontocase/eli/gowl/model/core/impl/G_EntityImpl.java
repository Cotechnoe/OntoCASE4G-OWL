/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.core.impl;

import com.cotechnoe.ontocase.eli.gowl.model.core.CorePackage;
import com.cotechnoe.ontocase.eli.gowl.model.core.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEntity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_EntityImpl#getIsSourceOf <em>Is Source Of</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_EntityImpl#getIsTargetOf <em>Is Target Of</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_EntityImpl#getG_label <em>Glabel</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.model.core.impl.G_EntityImpl#getIri <em>Iri</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class G_EntityImpl extends MinimalEObjectImpl.Container implements G_Entity {
	/**
	 * The cached value of the '{@link #getIsSourceOf() <em>Is Source Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSourceOf()
	 * @generated
	 * @ordered
	 */
	protected EList<G_Relation> isSourceOf;

	/**
	 * The cached value of the '{@link #getIsTargetOf() <em>Is Target Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTargetOf()
	 * @generated
	 * @ordered
	 */
	protected EList<G_Relation> isTargetOf;

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
	 * The cached value of the '{@link #getG_label() <em>Glabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_label()
	 * @generated
	 * @ordered
	 */
	protected String g_label = GLABEL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected G_EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.GENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<G_Relation> getIsSourceOf() {
		if (isSourceOf == null) {
			isSourceOf = new EObjectWithInverseResolvingEList<G_Relation>(G_Relation.class, this, CorePackage.GENTITY__IS_SOURCE_OF, CorePackage.GRELATION__SOURCE);
		}
		return isSourceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<G_Relation> getIsTargetOf() {
		if (isTargetOf == null) {
			isTargetOf = new EObjectWithInverseResolvingEList<G_Relation>(G_Relation.class, this, CorePackage.GENTITY__IS_TARGET_OF, CorePackage.GRELATION__TARGET);
		}
		return isTargetOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getG_label() {
		return g_label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setG_label(String newG_label) {
		String oldG_label = g_label;
		g_label = newG_label;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENTITY__GLABEL, oldG_label, g_label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENTITY__IRI, oldIri, iri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GENTITY__IS_SOURCE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSourceOf()).basicAdd(otherEnd, msgs);
			case CorePackage.GENTITY__IS_TARGET_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsTargetOf()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GENTITY__IS_SOURCE_OF:
				return ((InternalEList<?>)getIsSourceOf()).basicRemove(otherEnd, msgs);
			case CorePackage.GENTITY__IS_TARGET_OF:
				return ((InternalEList<?>)getIsTargetOf()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.GENTITY__IS_SOURCE_OF:
				return getIsSourceOf();
			case CorePackage.GENTITY__IS_TARGET_OF:
				return getIsTargetOf();
			case CorePackage.GENTITY__GLABEL:
				return getG_label();
			case CorePackage.GENTITY__IRI:
				return getIri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.GENTITY__IS_SOURCE_OF:
				getIsSourceOf().clear();
				getIsSourceOf().addAll((Collection<? extends G_Relation>)newValue);
				return;
			case CorePackage.GENTITY__IS_TARGET_OF:
				getIsTargetOf().clear();
				getIsTargetOf().addAll((Collection<? extends G_Relation>)newValue);
				return;
			case CorePackage.GENTITY__GLABEL:
				setG_label((String)newValue);
				return;
			case CorePackage.GENTITY__IRI:
				setIri((String)newValue);
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
			case CorePackage.GENTITY__IS_SOURCE_OF:
				getIsSourceOf().clear();
				return;
			case CorePackage.GENTITY__IS_TARGET_OF:
				getIsTargetOf().clear();
				return;
			case CorePackage.GENTITY__GLABEL:
				setG_label(GLABEL_EDEFAULT);
				return;
			case CorePackage.GENTITY__IRI:
				setIri(IRI_EDEFAULT);
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
			case CorePackage.GENTITY__IS_SOURCE_OF:
				return isSourceOf != null && !isSourceOf.isEmpty();
			case CorePackage.GENTITY__IS_TARGET_OF:
				return isTargetOf != null && !isTargetOf.isEmpty();
			case CorePackage.GENTITY__GLABEL:
				return GLABEL_EDEFAULT == null ? g_label != null : !GLABEL_EDEFAULT.equals(g_label);
			case CorePackage.GENTITY__IRI:
				return IRI_EDEFAULT == null ? iri != null : !IRI_EDEFAULT.equals(iri);
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
		result.append(" (g_label: ");
		result.append(g_label);
		result.append(", iri: ");
		result.append(iri);
		result.append(')');
		return result.toString();
	}

} //G_EntityImpl
