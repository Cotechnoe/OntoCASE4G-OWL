/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.impl;

import com.cotechnoe.ontocase.eli.gowl.G_Entity;
import com.cotechnoe.ontocase.eli.gowl.G_OWL_Document;
import com.cotechnoe.ontocase.eli.gowl.G_Property;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;
import com.cotechnoe.ontocase.eli.gowl.PLink;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PLink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.impl.PLinkImpl#getG_Property <em>GProperty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PLinkImpl extends G_UntypedRelationImpl implements PLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GowlPackage.Literals.PLINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<G_Property> getG_Property() {
		 G_OWL_Document Doc = (G_OWL_Document)this.eContainer;
		 EList<G_Property> g_PropertyList = new BasicEList<>();
		 EList<G_Entity> entities = Doc.getG_entities();
		 for (Iterator iterator = entities.iterator(); iterator.hasNext();) {
			G_Entity g_Entity = (G_Entity) iterator.next();
			if (g_Entity instanceof G_Property) {
				g_PropertyList.add((G_Property) g_Entity);
			}
		}
		 return g_PropertyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GowlPackage.PLINK__GPROPERTY:
				return ((InternalEList<?>)getG_Property()).basicRemove(otherEnd, msgs);
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
			case GowlPackage.PLINK__GPROPERTY:
				return getG_Property();
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
			case GowlPackage.PLINK__GPROPERTY:
				getG_Property().clear();
				getG_Property().addAll((Collection<? extends G_Property>)newValue);
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
			case GowlPackage.PLINK__GPROPERTY:
				getG_Property().clear();
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
			case GowlPackage.PLINK__GPROPERTY:
				return !getG_Property().isEmpty();
		}
		return super.eIsSet(featureID);
	}


} //PLinkImpl
