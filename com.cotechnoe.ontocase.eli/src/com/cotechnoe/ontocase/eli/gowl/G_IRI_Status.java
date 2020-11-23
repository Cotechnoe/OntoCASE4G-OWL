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
 * A representation of the literals of the enumeration '<em><b>GIRI Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_IRI_Status()
 * @model extendedMetaData="name='G_IRI_Status'"
 * @generated
 */
public enum G_IRI_Status implements Enumerator {
	/**
	 * The '<em><b>BASED ON LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASED_ON_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	BASED_ON_LABEL(0, "BASED_ON_LABEL", "BASED_ON_LABEL"),

	/**
	 * The '<em><b>GEN ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEN_ID_VALUE
	 * @generated
	 * @ordered
	 */
	GEN_ID(1, "GEN_ID", "GEN_ID"),

	/**
	 * The '<em><b>PRESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESET_VALUE
	 * @generated
	 * @ordered
	 */
	PRESET(2, "PRESET", "PRESET");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * The '<em><b>BASED ON LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASED_ON_LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASED_ON_LABEL_VALUE = 0;

	/**
	 * The '<em><b>GEN ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEN_ID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GEN_ID_VALUE = 1;

	/**
	 * The '<em><b>PRESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESET_VALUE = 2;

	/**
	 * An array of all the '<em><b>GIRI Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final G_IRI_Status[] VALUES_ARRAY =
		new G_IRI_Status[] {
			BASED_ON_LABEL,
			GEN_ID,
			PRESET,
		};

	/**
	 * A public read-only list of all the '<em><b>GIRI Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<G_IRI_Status> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GIRI Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static G_IRI_Status get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			G_IRI_Status result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GIRI Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static G_IRI_Status getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			G_IRI_Status result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GIRI Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static G_IRI_Status get(int value) {
		switch (value) {
			case BASED_ON_LABEL_VALUE: return BASED_ON_LABEL;
			case GEN_ID_VALUE: return GEN_ID;
			case PRESET_VALUE: return PRESET;
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
	private G_IRI_Status(int value, String name, String literal) {
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
	
} //G_IRI_Status
