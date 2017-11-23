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

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.tosca.Tosca_nodes_root;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes network network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getIpVersion <em>Ip Version</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network()
 * @model
 * @generated
 */
public interface Tosca_nodes_network_network extends Tosca_nodes_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Ip Version</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Version</em>' attribute.
	 * @see #setIpVersion(Integer)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_IpVersion()
	 * @model default="4" dataType="org.eclipse.cmf.occi.tosca.integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/extendedTosca/ecore!Tosca_nodes_network_network!ipVersion'"
	 * @generated
	 */
	Integer getIpVersion();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getIpVersion <em>Ip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Version</em>' attribute.
	 * @see #getIpVersion()
	 * @generated
	 */
	void setIpVersion(Integer value);

} // Tosca_nodes_network_network
