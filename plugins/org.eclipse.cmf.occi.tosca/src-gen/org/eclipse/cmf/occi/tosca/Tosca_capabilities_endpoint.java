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

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca capabilities endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getSecure <em>Secure</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getUrlPath <em>Url Path</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint()
 * @model
 * @generated
 */
public interface Tosca_capabilities_endpoint extends Tosca_capabilities_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional name (or ID) of the network port this endpoint should be bound to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Name</em>' attribute.
	 * @see #setPortName(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_PortName()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint!portName'"
	 * @generated
	 */
	String getPortName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPortName <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Name</em>' attribute.
	 * @see #getPortName()
	 * @generated
	 */
	void setPortName(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The default value is <code>"tcp"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the protocol (i.e., the protocol prefix) that the endpoint accepts (any OSI Layer 4-7 protocols) Examples: http, https, ftp, tcp, udp, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_Protocol()
	 * @model default="tcp" dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint!protocol'"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional port of the endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Short)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_Port()
	 * @model dataType="org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortDef"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint!port'"
	 * @generated
	 */
	Short getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Short value);

	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' attribute.
	 * The default value is <code>"source"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.tosca.initiatorEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional indicator of the direction of the connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator</em>' attribute.
	 * @see org.eclipse.cmf.occi.tosca.initiatorEnum
	 * @see #setInitiator(initiatorEnum)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_Initiator()
	 * @model default="source"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint!initiator'"
	 * @generated
	 */
	initiatorEnum getInitiator();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getInitiator <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' attribute.
	 * @see org.eclipse.cmf.occi.tosca.initiatorEnum
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(initiatorEnum value);

	/**
	 * Returns the value of the '<em><b>Network Name</b></em>' attribute.
	 * The default value is <code>"PRIVATE"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional name (or ID) of the network this endpoint should be bound to. network_name: PRIVATE | PUBLIC |<network_name> | <network_id>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Name</em>' attribute.
	 * @see #setNetworkName(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_NetworkName()
	 * @model default="PRIVATE" dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint!networkName'"
	 * @generated
	 */
	String getNetworkName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getNetworkName <em>Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Name</em>' attribute.
	 * @see #getNetworkName()
	 * @generated
	 */
	void setNetworkName(String value);

	/**
	 * Returns the value of the '<em><b>Secure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests for the endpoint to be secure and use credentials supplied on the ConnectsTo relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secure</em>' attribute.
	 * @see #setSecure(Boolean)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_Secure()
	 * @model default="false" dataType="org.eclipse.cmf.occi.tosca.boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint!secure'"
	 * @generated
	 */
	Boolean getSecure();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getSecure <em>Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure</em>' attribute.
	 * @see #getSecure()
	 * @generated
	 */
	void setSecure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional map of ports the Endpoint supports (if more than one).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' attribute.
	 * @see #setPorts(Map)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_Ports()
	 * @model dataType="org.eclipse.cmf.occi.tosca.map"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint!ports'"
	 * @generated
	 */
	Map getPorts();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPorts <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' attribute.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(Map value);

	/**
	 * Returns the value of the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional URL path of the endpoint’s address if applicable for the protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url Path</em>' attribute.
	 * @see #setUrlPath(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_endpoint_UrlPath()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_capabilities_endpoint!urlPath'"
	 * @generated
	 */
	String getUrlPath();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getUrlPath <em>Url Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Path</em>' attribute.
	 * @see #getUrlPath()
	 * @generated
	 */
	void setUrlPath(String value);

} // Tosca_capabilities_endpoint
