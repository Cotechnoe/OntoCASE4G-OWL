/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage
 * @generated
 */
public interface GowlFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GowlFactory eINSTANCE = com.cotechnoe.ontocase.eli.gowl.impl.GowlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GOWL Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GOWL Document</em>'.
	 * @generated
	 */
	G_OWL_Document createG_OWL_Document();

	/**
	 * Returns a new object of class '<em>Entities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entities</em>'.
	 * @generated
	 */
	Entities createEntities();

	/**
	 * Returns a new object of class '<em>Relations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relations</em>'.
	 * @generated
	 */
	Relations createRelations();

	/**
	 * Returns a new object of class '<em>GPrefix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPrefix</em>'.
	 * @generated
	 */
	G_Prefix createG_Prefix();

	/**
	 * Returns a new object of class '<em>GAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAnnotation</em>'.
	 * @generated
	 */
	G_Annotation createG_Annotation();

	/**
	 * Returns a new object of class '<em>IRI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IRI</em>'.
	 * @generated
	 */
	IRI createIRI();

	/**
	 * Returns a new object of class '<em>GObject Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GObject Intersection Of</em>'.
	 * @generated
	 */
	G_ObjectIntersectionOf createG_ObjectIntersectionOf();

	/**
	 * Returns a new object of class '<em>GAnnotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAnnotation Property</em>'.
	 * @generated
	 */
	G_AnnotationProperty createG_AnnotationProperty();

	/**
	 * Returns a new object of class '<em>GObject Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GObject Property</em>'.
	 * @generated
	 */
	G_ObjectProperty createG_ObjectProperty();

	/**
	 * Returns a new object of class '<em>GAnonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAnonymous Individual</em>'.
	 * @generated
	 */
	G_AnonymousIndividual createG_AnonymousIndividual();

	/**
	 * Returns a new object of class '<em>GNamed Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNamed Individual</em>'.
	 * @generated
	 */
	G_NamedIndividual createG_NamedIndividual();

	/**
	 * Returns a new object of class '<em>GNamed Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNamed Class</em>'.
	 * @generated
	 */
	G_NamedClass createG_NamedClass();

	/**
	 * Returns a new object of class '<em>GLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GLiteral</em>'.
	 * @generated
	 */
	G_Literal createG_Literal();

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
	GowlPackage getGowlPackage();

} //GowlFactory
