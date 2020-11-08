/**
 * Copyright Text	(c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GLABEL TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_LABEL_TYPE()
 * @model extendedMetaData="name='G_LABEL_TYPE'"
 * @generated
 */
public enum G_LABEL_TYPE implements Enumerator {
	/**
	 * The '<em><b>LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(0, "LABEL", "LABEL"),

	/**
	 * The '<em><b>RDFS LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDFS_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	RDFS_LABEL(1, "RDFS_LABEL", "RDFS_LABEL"),

	/**
	 * The '<em><b>IRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRI_VALUE
	 * @generated
	 * @ordered
	 */
	IRI(2, "IRI", "IRI"),

	/**
	 * The '<em><b>QNAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QNAME_VALUE
	 * @generated
	 * @ordered
	 */
	QNAME(3, "QNAME", "QNAME"),

	/**
	 * The '<em><b>PROPERTY LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY_LABEL(4, "PROPERTY_LABEL", "PROPERTY_LABEL"),

	/**
	 * The '<em><b>TYPED LINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPED_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	TYPED_LINK(5, "TYPED_LINK", "TYPED_LINK");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * The '<em><b>LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 0;

	/**
	 * The '<em><b>RDFS LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDFS_LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RDFS_LABEL_VALUE = 1;

	/**
	 * The '<em><b>IRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IRI_VALUE = 2;

	/**
	 * The '<em><b>QNAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QNAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QNAME_VALUE = 3;

	/**
	 * The '<em><b>PROPERTY LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_LABEL_VALUE = 4;

	/**
	 * The '<em><b>TYPED LINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPED_LINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TYPED_LINK_VALUE = 5;

	/**
	 * An array of all the '<em><b>GLABEL TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final G_LABEL_TYPE[] VALUES_ARRAY =
		new G_LABEL_TYPE[] {
			LABEL,
			RDFS_LABEL,
			IRI,
			QNAME,
			PROPERTY_LABEL,
			TYPED_LINK,
		};

	/**
	 * A public read-only list of all the '<em><b>GLABEL TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<G_LABEL_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GLABEL TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static G_LABEL_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			G_LABEL_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GLABEL TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static G_LABEL_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			G_LABEL_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GLABEL TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static G_LABEL_TYPE get(int value) {
		switch (value) {
			case LABEL_VALUE: return LABEL;
			case RDFS_LABEL_VALUE: return RDFS_LABEL;
			case IRI_VALUE: return IRI;
			case QNAME_VALUE: return QNAME;
			case PROPERTY_LABEL_VALUE: return PROPERTY_LABEL;
			case TYPED_LINK_VALUE: return TYPED_LINK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private G_LABEL_TYPE(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //G_LABEL_TYPE
