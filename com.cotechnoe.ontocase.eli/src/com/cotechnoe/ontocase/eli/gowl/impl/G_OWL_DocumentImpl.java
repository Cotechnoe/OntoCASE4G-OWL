/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.impl;

import com.cotechnoe.ontocase.eli.gowl.Entities;
import com.cotechnoe.ontocase.eli.gowl.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Document;
import com.cotechnoe.ontocase.eli.gowl.G_Prefix;
import com.cotechnoe.ontocase.eli.gowl.G_Relation;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;
import com.cotechnoe.ontocase.eli.gowl.IRI;

import com.cotechnoe.ontocase.eli.gowl.Relations;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GOWL Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl#getG_relations <em>Grelations</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl#getG_prefix <em>Gprefix</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl#getBaseIRI <em>Base IRI</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl#getGroupOfEntities <em>Group Of Entities</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl#getGroupOfRelations <em>Group Of Relations</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.G_OWL_DocumentImpl#getG_entities <em>Gentities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class G_OWL_DocumentImpl extends MinimalEObjectImpl.Container implements G_OWL_Document {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * The cached value of the '{@link #getG_relations() <em>Grelations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_relations()
	 * @generated
	 * @ordered
	 */
	protected EList<G_Relation> g_relations;

	/**
	 * The cached value of the '{@link #getG_prefix() <em>Gprefix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_prefix()
	 * @generated
	 * @ordered
	 */
	protected EList<G_Prefix> g_prefix;

	/**
	 * The cached value of the '{@link #getBaseIRI() <em>Base IRI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseIRI()
	 * @generated
	 * @ordered
	 */
	protected IRI baseIRI;

	/**
	 * The cached value of the '{@link #getGroupOfEntities() <em>Group Of Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupOfEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entities> groupOfEntities ;

	/**
	 * The cached value of the '{@link #getGroupOfRelations() <em>Group Of Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupOfRelations()
	 * @generated
	 * @ordered
	 */
	protected Relations groupOfRelations ;

	/**
	 * The cached value of the '{@link #getG_entities() <em>Gentities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG_entities()
	 * @generated
	 * @ordered
	 */
	protected EList<G_Entity> g_entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected G_OWL_DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GowlPackage.Literals.GOWL_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<G_Relation> getG_relations() {
		if (g_relations == null) {
			g_relations = new EObjectContainmentEList<G_Relation>(G_Relation.class, this, GowlPackage.GOWL_DOCUMENT__GRELATIONS);
		}
		return g_relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<G_Prefix> getG_prefix() {
		if (g_prefix == null) {
			g_prefix = new EObjectContainmentEList<G_Prefix>(G_Prefix.class, this, GowlPackage.GOWL_DOCUMENT__GPREFIX);
		}
		return g_prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IRI getBaseIRI() {
		if (baseIRI != null && baseIRI.eIsProxy()) {
			InternalEObject oldBaseIRI = (InternalEObject)baseIRI;
			baseIRI = (IRI)eResolveProxy(oldBaseIRI);
			if (baseIRI != oldBaseIRI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GowlPackage.GOWL_DOCUMENT__BASE_IRI, oldBaseIRI, baseIRI));
			}
		}
		return baseIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRI basicGetBaseIRI() {
		return baseIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseIRI(IRI newBaseIRI) {
		IRI oldBaseIRI = baseIRI;
		baseIRI = newBaseIRI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GowlPackage.GOWL_DOCUMENT__BASE_IRI, oldBaseIRI, baseIRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entities> getGroupOfEntities() {
		if (groupOfEntities == null) {
			groupOfEntities = new EObjectContainmentEList<Entities>(Entities.class, this, GowlPackage.GOWL_DOCUMENT__GROUP_OF_ENTITIES);
		}
		return groupOfEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relations getGroupOfRelations() {
		return groupOfRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupOfRelations(Relations newGroupOfRelations, NotificationChain msgs) {
		Relations oldGroupOfRelations = groupOfRelations;
		groupOfRelations = newGroupOfRelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GowlPackage.GOWL_DOCUMENT__GROUP_OF_RELATIONS, oldGroupOfRelations, newGroupOfRelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupOfRelations(Relations newGroupOfRelations) {
		if (newGroupOfRelations != groupOfRelations) {
			NotificationChain msgs = null;
			if (groupOfRelations != null)
				msgs = ((InternalEObject)groupOfRelations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GowlPackage.GOWL_DOCUMENT__GROUP_OF_RELATIONS, null, msgs);
			if (newGroupOfRelations != null)
				msgs = ((InternalEObject)newGroupOfRelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GowlPackage.GOWL_DOCUMENT__GROUP_OF_RELATIONS, null, msgs);
			msgs = basicSetGroupOfRelations(newGroupOfRelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GowlPackage.GOWL_DOCUMENT__GROUP_OF_RELATIONS, newGroupOfRelations, newGroupOfRelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<G_Entity> getG_entities() {
		if (g_entities == null) {
			g_entities = new EObjectContainmentEList<G_Entity>(G_Entity.class, this, GowlPackage.GOWL_DOCUMENT__GENTITIES);
		}
		return g_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GowlPackage.GOWL_DOCUMENT__GRELATIONS:
				return ((InternalEList<?>)getG_relations()).basicRemove(otherEnd, msgs);
			case GowlPackage.GOWL_DOCUMENT__GPREFIX:
				return ((InternalEList<?>)getG_prefix()).basicRemove(otherEnd, msgs);
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_ENTITIES:
				return ((InternalEList<?>)getGroupOfEntities()).basicRemove(otherEnd, msgs);
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_RELATIONS:
				return basicSetGroupOfRelations(null, msgs);
			case GowlPackage.GOWL_DOCUMENT__GENTITIES:
				return ((InternalEList<?>)getG_entities()).basicRemove(otherEnd, msgs);
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
			case GowlPackage.GOWL_DOCUMENT__GRELATIONS:
				return getG_relations();
			case GowlPackage.GOWL_DOCUMENT__GPREFIX:
				return getG_prefix();
			case GowlPackage.GOWL_DOCUMENT__BASE_IRI:
				if (resolve) return getBaseIRI();
				return basicGetBaseIRI();
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_ENTITIES:
				return getGroupOfEntities();
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_RELATIONS:
				return getGroupOfRelations();
			case GowlPackage.GOWL_DOCUMENT__GENTITIES:
				return getG_entities();
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
			case GowlPackage.GOWL_DOCUMENT__GRELATIONS:
				getG_relations().clear();
				getG_relations().addAll((Collection<? extends G_Relation>)newValue);
				return;
			case GowlPackage.GOWL_DOCUMENT__GPREFIX:
				getG_prefix().clear();
				getG_prefix().addAll((Collection<? extends G_Prefix>)newValue);
				return;
			case GowlPackage.GOWL_DOCUMENT__BASE_IRI:
				setBaseIRI((IRI)newValue);
				return;
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_ENTITIES:
				getGroupOfEntities().clear();
				getGroupOfEntities().addAll((Collection<? extends Entities>)newValue);
				return;
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_RELATIONS:
				setGroupOfRelations((Relations)newValue);
				return;
			case GowlPackage.GOWL_DOCUMENT__GENTITIES:
				getG_entities().clear();
				getG_entities().addAll((Collection<? extends G_Entity>)newValue);
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
			case GowlPackage.GOWL_DOCUMENT__GRELATIONS:
				getG_relations().clear();
				return;
			case GowlPackage.GOWL_DOCUMENT__GPREFIX:
				getG_prefix().clear();
				return;
			case GowlPackage.GOWL_DOCUMENT__BASE_IRI:
				setBaseIRI((IRI)null);
				return;
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_ENTITIES:
				getGroupOfEntities().clear();
				return;
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_RELATIONS:
				setGroupOfRelations((Relations)null);
				return;
			case GowlPackage.GOWL_DOCUMENT__GENTITIES:
				getG_entities().clear();
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
			case GowlPackage.GOWL_DOCUMENT__GRELATIONS:
				return g_relations != null && !g_relations.isEmpty();
			case GowlPackage.GOWL_DOCUMENT__GPREFIX:
				return g_prefix != null && !g_prefix.isEmpty();
			case GowlPackage.GOWL_DOCUMENT__BASE_IRI:
				return baseIRI != null;
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_ENTITIES:
				return groupOfEntities != null && !groupOfEntities.isEmpty();
			case GowlPackage.GOWL_DOCUMENT__GROUP_OF_RELATIONS:
				return groupOfRelations != null;
			case GowlPackage.GOWL_DOCUMENT__GENTITIES:
				return g_entities != null && !g_entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //G_OWL_DocumentImpl
