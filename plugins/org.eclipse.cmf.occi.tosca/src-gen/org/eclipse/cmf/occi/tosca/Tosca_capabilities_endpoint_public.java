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

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca capabilities endpoint public</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public#getFloating <em>Floating</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public#getDnsName <em>Dns Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_public()
 * @model
 * @generated
 */
public interface Tosca_capabilities_endpoint_public extends Tosca_capabilities_endpoint, MixinBase {
	/**
	 * Returns the value of the '<em><b>Floating</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the public address should be allocated from a pool of floating IPs that are associated with the network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Floating</em>' attribute.
	 * @see #setFloating(Boolean)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_public_Floating()
	 * @model default="false" dataType="org.eclipse.cmf.occi.tosca.boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint_public!floating'"
	 * @generated
	 */
	Boolean getFloating();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public#getFloating <em>Floating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating</em>' attribute.
	 * @see #getFloating()
	 * @generated
	 */
	void setFloating(Boolean value);

	/**
	 * Returns the value of the '<em><b>Dns Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional name to register with DNS
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dns Name</em>' attribute.
	 * @see #setDnsName(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_public_DnsName()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint_public!dnsName'"
	 * @generated
	 */
	String getDnsName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public#getDnsName <em>Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns Name</em>' attribute.
	 * @see #getDnsName()
	 * @generated
	 */
	void setDnsName(String value);

} // Tosca_capabilities_endpoint_public
