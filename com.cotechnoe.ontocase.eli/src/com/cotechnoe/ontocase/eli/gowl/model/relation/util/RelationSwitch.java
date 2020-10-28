/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation.util;

import com.cotechnoe.ontocase.eli.gowl.model.core.G_Relation;

import com.cotechnoe.ontocase.eli.gowl.model.relation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage
 * @generated
 */
public class RelationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationSwitch() {
		if (modelPackage == null) {
			modelPackage = RelationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RelationPackage.GTYPED_RELATION: {
				G_TypedRelation g_TypedRelation = (G_TypedRelation)theEObject;
				T result = caseG_TypedRelation(g_TypedRelation);
				if (result == null) result = caseG_Relation(g_TypedRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationPackage.ILINK: {
				ILink iLink = (ILink)theEObject;
				T result = caseILink(iLink);
				if (result == null) result = caseG_TypedRelation(iLink);
				if (result == null) result = caseG_Relation(iLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationPackage.PLINK: {
				PLink pLink = (PLink)theEObject;
				T result = casePLink(pLink);
				if (result == null) result = caseG_UntypedRelation(pLink);
				if (result == null) result = caseG_Relation(pLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationPackage.GUNTYPED_RELATION: {
				G_UntypedRelation g_UntypedRelation = (G_UntypedRelation)theEObject;
				T result = caseG_UntypedRelation(g_UntypedRelation);
				if (result == null) result = caseG_Relation(g_UntypedRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationPackage.SLINK: {
				SLink sLink = (SLink)theEObject;
				T result = caseSLink(sLink);
				if (result == null) result = caseG_TypedRelation(sLink);
				if (result == null) result = caseG_Relation(sLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationPackage.ELINK: {
				ELink eLink = (ELink)theEObject;
				T result = caseELink(eLink);
				if (result == null) result = caseG_TypedRelation(eLink);
				if (result == null) result = caseG_Relation(eLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationPackage.ALINK: {
				ALink aLink = (ALink)theEObject;
				T result = caseALink(aLink);
				if (result == null) result = caseG_TypedRelation(aLink);
				if (result == null) result = caseG_Relation(aLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationPackage.INV_LINK: {
				InvLink invLink = (InvLink)theEObject;
				T result = caseInvLink(invLink);
				if (result == null) result = caseG_TypedRelation(invLink);
				if (result == null) result = caseG_Relation(invLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationPackage.NEGATE_PLINK: {
				NegatePLink negatePLink = (NegatePLink)theEObject;
				T result = caseNegatePLink(negatePLink);
				if (result == null) result = caseG_UntypedRelation(negatePLink);
				if (result == null) result = caseG_Relation(negatePLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationPackage.DLINK: {
				DLink dLink = (DLink)theEObject;
				T result = caseDLink(dLink);
				if (result == null) result = caseG_TypedRelation(dLink);
				if (result == null) result = caseG_Relation(dLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTyped Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTyped Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_TypedRelation(G_TypedRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILink(ILink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePLink(PLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUntyped Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUntyped Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_UntypedRelation(G_UntypedRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLink(SLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELink(ELink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALink(ALink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inv Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inv Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvLink(InvLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negate PLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negate PLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatePLink(NegatePLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDLink(DLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRelation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRelation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG_Relation(G_Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RelationSwitch
