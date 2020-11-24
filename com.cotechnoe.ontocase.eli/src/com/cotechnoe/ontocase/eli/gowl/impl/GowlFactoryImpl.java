/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl.impl;

import com.cotechnoe.ontocase.eli.gowl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GowlFactoryImpl extends EFactoryImpl implements GowlFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GowlFactory init() {
		try {
			GowlFactory theGowlFactory = (GowlFactory)EPackage.Registry.INSTANCE.getEFactory(GowlPackage.eNS_URI);
			if (theGowlFactory != null) {
				return theGowlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GowlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GowlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GowlPackage.ALINK: return createALink();
			case GowlPackage.DLINK: return createDLink();
			case GowlPackage.ELINK: return createELink();
			case GowlPackage.ILINK: return createILink();
			case GowlPackage.INV_LINK: return createInvLink();
			case GowlPackage.NEGATE_PLINK: return createNegatePLink();
			case GowlPackage.PLINK: return createPLink();
			case GowlPackage.SLINK: return createSLink();
			case GowlPackage.GANNOTATION_PROPERTY: return createG_AnnotationProperty();
			case GowlPackage.GANONYMOUS_INDIVIDUAL: return createG_AnonymousIndividual();
			case GowlPackage.GLITERAL: return createG_Literal();
			case GowlPackage.GNAMED_CLASS: return createG_NamedClass();
			case GowlPackage.GNAMED_INDIVIDUAL: return createG_NamedIndividual();
			case GowlPackage.GOBJECT_INTERSECTION_OF: return createG_ObjectIntersectionOf();
			case GowlPackage.GOBJECT_PROPERTY: return createG_ObjectProperty();
			case GowlPackage.GPREFIX: return createG_Prefix();
			case GowlPackage.GANNOTATION: return createG_Annotation();
			case GowlPackage.IRI: return createIRI();
			case GowlPackage.GOWL_DOCUMENT: return createG_OWL_Document();
			case GowlPackage.ENTITIES_GROUP: return createEntitiesGroup();
			case GowlPackage.RELATIONS_GROUP: return createRelationsGroup();
			case GowlPackage.GANNOTATION_CLASS: return createG_AnnotationClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GowlPackage.GLABEL_TYPE:
				return createG_LABEL_TYPEFromString(eDataType, initialValue);
			case GowlPackage.GIRI_STATUS:
				return createG_IRI_StatusFromString(eDataType, initialValue);
			case GowlPackage.GCLASS_TYPE:
				return createG_ClassTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GowlPackage.GLABEL_TYPE:
				return convertG_LABEL_TYPEToString(eDataType, instanceValue);
			case GowlPackage.GIRI_STATUS:
				return convertG_IRI_StatusToString(eDataType, instanceValue);
			case GowlPackage.GCLASS_TYPE:
				return convertG_ClassTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */ 
	@Override
	public G_OWL_Document createG_OWL_Document() {
		G_OWL_DocumentImpl g_OWL_Document = new G_OWL_DocumentImpl();
		EntitiesGroup entitiesGroup = createEntitiesGroup();
		RelationsGroup relationsGroup = createRelationsGroup();

		g_OWL_Document.setGroupOfEntities(entitiesGroup);
		g_OWL_Document.setGroupOfRelations(relationsGroup);	
		return g_OWL_Document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitiesGroup createEntitiesGroup() {
		EntitiesGroupImpl entitiesGroup = new EntitiesGroupImpl();
		return entitiesGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationsGroup createRelationsGroup() {
		RelationsGroupImpl relationsGroup = new RelationsGroupImpl();
		return relationsGroup;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_AnnotationClass createG_AnnotationClass() {
		G_AnnotationClassImpl g_AnnotationClass = new G_AnnotationClassImpl();
		return g_AnnotationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_LABEL_TYPE createG_LABEL_TYPEFromString(EDataType eDataType, String initialValue) {
		G_LABEL_TYPE result = G_LABEL_TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertG_LABEL_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_IRI_Status createG_IRI_StatusFromString(EDataType eDataType, String initialValue) {
		G_IRI_Status result = G_IRI_Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertG_IRI_StatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G_ClassType createG_ClassTypeFromString(EDataType eDataType, String initialValue) {
		G_ClassType result = G_ClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertG_ClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_Prefix createG_Prefix() {
		G_PrefixImpl g_Prefix = new G_PrefixImpl();
		return g_Prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_Annotation createG_Annotation() {
		G_AnnotationImpl g_Annotation = new G_AnnotationImpl();
		return g_Annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IRI createIRI() {
		IRIImpl iri = new IRIImpl();
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_ObjectIntersectionOf createG_ObjectIntersectionOf() {
		G_ObjectIntersectionOfImpl g_ObjectIntersectionOf = new G_ObjectIntersectionOfImpl();
		return g_ObjectIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_AnnotationProperty createG_AnnotationProperty() {
		G_AnnotationPropertyImpl g_AnnotationProperty = new G_AnnotationPropertyImpl();
		return g_AnnotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_ObjectProperty createG_ObjectProperty() {
		G_ObjectPropertyImpl g_ObjectProperty = new G_ObjectPropertyImpl();
		return g_ObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_AnonymousIndividual createG_AnonymousIndividual() {
		G_AnonymousIndividualImpl g_AnonymousIndividual = new G_AnonymousIndividualImpl();
		return g_AnonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_NamedIndividual createG_NamedIndividual() {
		G_NamedIndividualImpl g_NamedIndividual = new G_NamedIndividualImpl();
		return g_NamedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_NamedClass createG_NamedClass() {
		G_NamedClassImpl g_NamedClass = new G_NamedClassImpl();
		return g_NamedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G_Literal createG_Literal() {
		G_LiteralImpl g_Literal = new G_LiteralImpl();
		return g_Literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ILink createILink() {
		ILinkImpl iLink = new ILinkImpl();
		return iLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PLink createPLink() {
		PLinkImpl pLink = new PLinkImpl();
		return pLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SLink createSLink() {
		SLinkImpl sLink = new SLinkImpl();
		return sLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ELink createELink() {
		ELinkImpl eLink = new ELinkImpl();
		return eLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ALink createALink() {
		ALinkImpl aLink = new ALinkImpl();
		return aLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvLink createInvLink() {
		InvLinkImpl invLink = new InvLinkImpl();
		return invLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NegatePLink createNegatePLink() {
		NegatePLinkImpl negatePLink = new NegatePLinkImpl();
		return negatePLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DLink createDLink() {
		DLinkImpl dLink = new DLinkImpl();
		return dLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GowlPackage getGowlPackage() {
		return (GowlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GowlPackage getPackage() {
		return GowlPackage.eINSTANCE;
	}

} //GowlFactoryImpl
