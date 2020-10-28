/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.model.relation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.model.relation.RelationPackage
 * @generated
 */
public interface RelationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationFactory eINSTANCE = com.cotechnoe.ontocase.eli.gowl.model.relation.impl.RelationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ILink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ILink</em>'.
	 * @generated
	 */
	ILink createILink();

	/**
	 * Returns a new object of class '<em>PLink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLink</em>'.
	 * @generated
	 */
	PLink createPLink();

	/**
	 * Returns a new object of class '<em>SLink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLink</em>'.
	 * @generated
	 */
	SLink createSLink();

	/**
	 * Returns a new object of class '<em>ELink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ELink</em>'.
	 * @generated
	 */
	ELink createELink();

	/**
	 * Returns a new object of class '<em>ALink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ALink</em>'.
	 * @generated
	 */
	ALink createALink();

	/**
	 * Returns a new object of class '<em>Inv Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inv Link</em>'.
	 * @generated
	 */
	InvLink createInvLink();

	/**
	 * Returns a new object of class '<em>Negate PLink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negate PLink</em>'.
	 * @generated
	 */
	NegatePLink createNegatePLink();

	/**
	 * Returns a new object of class '<em>DLink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DLink</em>'.
	 * @generated
	 */
	DLink createDLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RelationPackage getRelationPackage();

} //RelationFactory
