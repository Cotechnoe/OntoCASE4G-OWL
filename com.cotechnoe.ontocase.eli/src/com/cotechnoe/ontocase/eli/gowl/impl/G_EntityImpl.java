/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.impl;

import com.cotechnoe.ontocase.eli.util.StringConvert;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Document;
import com.cotechnoe.ontocase.eli.gowl.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.G_IRI_Status;
import com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE;
import com.cotechnoe.ontocase.eli.gowl.G_Relation;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEntity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_EntityImpl#getIsTargetOf <em>Is Target Of</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_EntityImpl#getIri <em>Iri</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_EntityImpl#getG_iri_status <em>Giri status</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_EntityImpl#getIsSourceOf <em>Is Source Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class G_EntityImpl extends G_OWL_ObjectImpl implements G_Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

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
	 * The default value of the '{@link #getG_iri_status() <em>Giri status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_iri_status()
	 * @generated
	 * @ordered
	 */
	protected static final G_IRI_Status GIRI_STATUS_EDEFAULT = G_IRI_Status.BASED_ON_LABEL;

	/**
	 * The cached value of the '{@link #getG_iri_status() <em>Giri status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_iri_status()
	 * @generated
	 * @ordered
	 */
	protected G_IRI_Status g_iri_status = GIRI_STATUS_EDEFAULT;

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
		return GowlPackage.Literals.GENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<G_Relation> getIsSourceOf() {
		if (isSourceOf == null) {
			isSourceOf = new EObjectWithInverseResolvingEList<G_Relation>(G_Relation.class, this, GowlPackage.GENTITY__IS_SOURCE_OF, GowlPackage.GRELATION__SOURCE);
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
			isTargetOf = new EObjectWithInverseResolvingEList<G_Relation>(G_Relation.class, this, GowlPackage.GENTITY__IS_TARGET_OF, GowlPackage.GRELATION__TARGET);
		}
		return isTargetOf;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GowlPackage.GENTITY__IRI, oldIri, iri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_IRI_Status getG_iri_status() {
		return g_iri_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setG_iri_status(G_IRI_Status newG_iri_status) {
		G_IRI_Status oldG_iri_status = g_iri_status;
		g_iri_status = newG_iri_status == null ? GIRI_STATUS_EDEFAULT : newG_iri_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GowlPackage.GENTITY__GIRI_STATUS, oldG_iri_status, g_iri_status));
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
			case GowlPackage.GENTITY__IS_TARGET_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsTargetOf()).basicAdd(otherEnd, msgs);
			case GowlPackage.GENTITY__IS_SOURCE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSourceOf()).basicAdd(otherEnd, msgs);
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
			case GowlPackage.GENTITY__IS_TARGET_OF:
				return ((InternalEList<?>)getIsTargetOf()).basicRemove(otherEnd, msgs);
			case GowlPackage.GENTITY__IS_SOURCE_OF:
				return ((InternalEList<?>)getIsSourceOf()).basicRemove(otherEnd, msgs);
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
			case GowlPackage.GENTITY__IS_TARGET_OF:
				return getIsTargetOf();
			case GowlPackage.GENTITY__IRI:
				return getIri();
			case GowlPackage.GENTITY__GIRI_STATUS:
				return getG_iri_status();
			case GowlPackage.GENTITY__IS_SOURCE_OF:
				return getIsSourceOf();
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
			case GowlPackage.GENTITY__IS_TARGET_OF:
				getIsTargetOf().clear();
				getIsTargetOf().addAll((Collection<? extends G_Relation>)newValue);
				return;
			case GowlPackage.GENTITY__IRI:
				setIri((String)newValue);
				return;
			case GowlPackage.GENTITY__GIRI_STATUS:
				setG_iri_status((G_IRI_Status)newValue);
				return;
			case GowlPackage.GENTITY__IS_SOURCE_OF:
				getIsSourceOf().clear();
				getIsSourceOf().addAll((Collection<? extends G_Relation>)newValue);
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
			case GowlPackage.GENTITY__IS_TARGET_OF:
				getIsTargetOf().clear();
				return;
			case GowlPackage.GENTITY__IRI:
				setIri(IRI_EDEFAULT);
				return;
			case GowlPackage.GENTITY__GIRI_STATUS:
				setG_iri_status(GIRI_STATUS_EDEFAULT);
				return;
			case GowlPackage.GENTITY__IS_SOURCE_OF:
				getIsSourceOf().clear();
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
			case GowlPackage.GENTITY__IS_TARGET_OF:
				return isTargetOf != null && !isTargetOf.isEmpty();
			case GowlPackage.GENTITY__IRI:
				return IRI_EDEFAULT == null ? iri != null : !IRI_EDEFAULT.equals(iri);
			case GowlPackage.GENTITY__GIRI_STATUS:
				return g_iri_status != GIRI_STATUS_EDEFAULT;
			case GowlPackage.GENTITY__IS_SOURCE_OF:
				return isSourceOf != null && !isSourceOf.isEmpty();
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
		result.append(" (iri: ");
		result.append(iri);
		result.append(", g_iri_status: ");
		result.append(g_iri_status);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Le labelType est l'une de ces possibilités (IRI, LABEL, QNAME, RDFS_LABEL, LABEL)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setG_labelType(G_LABEL_TYPE newG_labelType) {
		if (newG_labelType.equals(G_LABEL_TYPE.IRI) || 
				newG_labelType.equals(G_LABEL_TYPE.QNAME) ||
				newG_labelType.equals(G_LABEL_TYPE.RDFS_LABEL) ||
				newG_labelType.equals(G_LABEL_TYPE.LABEL)
				) {
			super.setG_labelType(newG_labelType);
		}
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
	 * @generated NOT
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GowlPackage.GOWL_OBJECT__LABEL, oldLabel, label));
			if (getG_iri_status().equals(G_IRI_Status.BASED_ON_LABEL)) {
				this.setIri(((G_OWL_Document)EcoreUtil.getRootContainer(this)).getDefaultNS()+StringConvert.convert(label));
			}
		}
	}


} //G_EntityImpl
