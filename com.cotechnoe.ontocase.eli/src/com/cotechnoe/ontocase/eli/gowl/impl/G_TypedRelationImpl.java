/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.impl;

import com.cotechnoe.ontocase.eli.gowl.G_LABEL_TYPE;
import com.cotechnoe.ontocase.eli.gowl.G_TypedRelation;
import com.cotechnoe.ontocase.eli.gowl.GowlPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GTyped Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class G_TypedRelationImpl extends G_RelationImpl implements G_TypedRelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected G_TypedRelationImpl() {
		super();
		setG_labelType(G_LABEL_TYPE.TYPED_LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GowlPackage.Literals.GTYPED_RELATION;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setG_labelType(G_LABEL_TYPE newG_labelType) {
		if (newG_labelType.equals(G_LABEL_TYPE.IRI) || 
				newG_labelType.equals(G_LABEL_TYPE.QNAME) ||
				newG_labelType.equals(G_LABEL_TYPE.TYPED_LINK))
		{
			super.setG_labelType(newG_labelType);
		}
	}


} //G_TypedRelationImpl
