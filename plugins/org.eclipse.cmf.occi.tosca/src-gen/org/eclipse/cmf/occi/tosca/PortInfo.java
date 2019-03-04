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
package org.eclipse.cmf.occi.tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.PortInfo#getPortname <em>Portname</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.PortInfo#getNetworkid <em>Networkid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.PortInfo#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.PortInfo#getMacaddress <em>Macaddress</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.PortInfo#getPortid <em>Portid</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getPortInfo()
 * @model
 * @generated
 */
public interface PortInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Portname</em>' attribute.
	 * @see #setPortname(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getPortInfo_Portname()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!PortInfo!portname'"
	 * @generated
	 */
	String getPortname();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.PortInfo#getPortname <em>Portname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portname</em>' attribute.
	 * @see #getPortname()
	 * @generated
	 */
	void setPortname(String value);

	/**
	 * Returns the value of the '<em><b>Networkid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networkid</em>' attribute.
	 * @see #setNetworkid(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getPortInfo_Networkid()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!PortInfo!networkid'"
	 * @generated
	 */
	String getNetworkid();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.PortInfo#getNetworkid <em>Networkid</em>}' attribute.
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
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getPortInfo_Addresses()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!PortInfo!addresses'"
	 * @generated
	 */
	arraystring getAddresses();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.PortInfo#getAddresses <em>Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addresses</em>' containment reference.
	 * @see #getAddresses()
	 * @generated
	 */
	void setAddresses(arraystring value);

	/**
	 * Returns the value of the '<em><b>Macaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Macaddress</em>' attribute.
	 * @see #setMacaddress(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getPortInfo_Macaddress()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!PortInfo!macaddress'"
	 * @generated
	 */
	String getMacaddress();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.PortInfo#getMacaddress <em>Macaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macaddress</em>' attribute.
	 * @see #getMacaddress()
	 * @generated
	 */
	void setMacaddress(String value);

	/**
	 * Returns the value of the '<em><b>Portid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Portid</em>' attribute.
	 * @see #setPortid(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getPortInfo_Portid()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!PortInfo!portid'"
	 * @generated
	 */
	String getPortid();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.PortInfo#getPortid <em>Portid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portid</em>' attribute.
	 * @see #getPortid()
	 * @generated
	 */
	void setPortid(String value);

} // PortInfo
