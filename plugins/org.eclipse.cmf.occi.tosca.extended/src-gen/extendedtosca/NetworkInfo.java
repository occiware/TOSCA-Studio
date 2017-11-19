/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package extendedtosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.NetworkInfo#getNetworkid <em>Networkid</em>}</li>
 *   <li>{@link extendedtosca.NetworkInfo#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link extendedtosca.NetworkInfo#getNetworkname <em>Networkname</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getNetworkInfo()
 * @model
 * @generated
 */
public interface NetworkInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Networkid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networkid</em>' attribute.
	 * @see #setNetworkid(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getNetworkInfo_Networkid()
	 * @model dataType="extendedtosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!NetworkInfo!networkid'"
	 * @generated
	 */
	String getNetworkid();

	/**
	 * Sets the value of the '{@link extendedtosca.NetworkInfo#getNetworkid <em>Networkid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networkid</em>' attribute.
	 * @see #getNetworkid()
	 * @generated
	 */
	void setNetworkid(String value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference.
	 * @see #setAddresses(arraystring)
	 * @see extendedtosca.ExtendedtoscaPackage#getNetworkInfo_Addresses()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!NetworkInfo!addresses'"
	 * @generated
	 */
	arraystring getAddresses();

	/**
	 * Sets the value of the '{@link extendedtosca.NetworkInfo#getAddresses <em>Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addresses</em>' containment reference.
	 * @see #getAddresses()
	 * @generated
	 */
	void setAddresses(arraystring value);

	/**
	 * Returns the value of the '<em><b>Networkname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networkname</em>' attribute.
	 * @see #setNetworkname(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getNetworkInfo_Networkname()
	 * @model dataType="extendedtosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!NetworkInfo!networkname'"
	 * @generated
	 */
	String getNetworkname();

	/**
	 * Sets the value of the '{@link extendedtosca.NetworkInfo#getNetworkname <em>Networkname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networkname</em>' attribute.
	 * @see #getNetworkname()
	 * @generated
	 */
	void setNetworkname(String value);

} // NetworkInfo
