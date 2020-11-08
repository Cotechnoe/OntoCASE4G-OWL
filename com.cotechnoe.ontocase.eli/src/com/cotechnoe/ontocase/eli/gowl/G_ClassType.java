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
 * A representation of the literals of the enumeration '<em><b>GClass Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_ClassType()
 * @model
 * @generated
 */
public enum G_ClassType implements Enumerator {
	/**
	 * The '<em><b>OWL CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWL_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	OWL_CLASS(0, "OWL_CLASS", "OWL_CLASS"),

	/**
	 * The '<em><b>RDFS CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDFS_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	RDFS_CLASS(1, "RDFS_CLASS", "RDFS_CLASS"),

	/**
	 * The '<em><b>SKOS CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKOS_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	SKOS_CLASS(2, "SKOS_CLASS", "SKOS_CLASS");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * The '<em><b>OWL CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWL_CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OWL_CLASS_VALUE = 0;

	/**
	 * The '<em><b>RDFS CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDFS_CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RDFS_CLASS_VALUE = 1;

	/**
	 * The '<em><b>SKOS CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKOS_CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SKOS_CLASS_VALUE = 2;

	/**
	 * An array of all the '<em><b>GClass Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final G_ClassType[] VALUES_ARRAY =
		new G_ClassType[] {
			OWL_CLASS,
			RDFS_CLASS,
			SKOS_CLASS,
		};

	/**
	 * A public read-only list of all the '<em><b>GClass Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<G_ClassType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GClass Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static G_ClassType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			G_ClassType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GClass Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static G_ClassType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			G_ClassType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GClass Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static G_ClassType get(int value) {
		switch (value) {
			case OWL_CLASS_VALUE: return OWL_CLASS;
			case RDFS_CLASS_VALUE: return RDFS_CLASS;
			case SKOS_CLASS_VALUE: return SKOS_CLASS;
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
	private G_ClassType(int value, String name, String literal) {
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
	
} //G_ClassType
