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

import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_root;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example transactionsubsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Example_transactionsubsystem#getReceiverPort <em>Receiver Port</em>}</li>
 *   <li>{@link extendedtosca.Example_transactionsubsystem#getMqServiceIp <em>Mq Service Ip</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getExample_transactionsubsystem()
 * @model
 * @generated
 */
public interface Example_transactionsubsystem extends Tosca_nodes_root, Tosca_capabilities_endpoint, MixinBase {
	/**
	 * Returns the value of the '<em><b>Receiver Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Port</em>' attribute.
	 * @see #setReceiverPort(Integer)
	 * @see extendedtosca.ExtendedtoscaPackage#getExample_transactionsubsystem_ReceiverPort()
	 * @model dataType="org.eclipse.cmf.occi.tosca.integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/extendedTosca/ecore!Example_transactionsubsystem!receiverPort'"
	 * @generated
	 */
	Integer getReceiverPort();

	/**
	 * Sets the value of the '{@link extendedtosca.Example_transactionsubsystem#getReceiverPort <em>Receiver Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Port</em>' attribute.
	 * @see #getReceiverPort()
	 * @generated
	 */
	void setReceiverPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Mq Service Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mq Service Ip</em>' attribute.
	 * @see #setMqServiceIp(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getExample_transactionsubsystem_MqServiceIp()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/extendedTosca/ecore!Example_transactionsubsystem!mqServiceIp'"
	 * @generated
	 */
	String getMqServiceIp();

	/**
	 * Sets the value of the '{@link extendedtosca.Example_transactionsubsystem#getMqServiceIp <em>Mq Service Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mq Service Ip</em>' attribute.
	 * @see #getMqServiceIp()
	 * @generated
	 */
	void setMqServiceIp(String value);

} // Example_transactionsubsystem
