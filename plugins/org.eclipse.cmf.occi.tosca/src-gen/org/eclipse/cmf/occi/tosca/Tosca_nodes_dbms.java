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

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes dbms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#getRootPassword <em>Root Password</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_dbms()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SourceMustBeDatabase'"
 * @generated
 */
public interface Tosca_nodes_dbms extends Tosca_nodes_softwarecomponent, Tosca_capabilities_container, MixinBase {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the port the DBMS service will listen to for data and requests
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Integer)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_dbms_Port()
	 * @model dataType="org.eclipse.cmf.occi.tosca.integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_nodes_dbms!port'"
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Root Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the optional root password for the DBMS service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Password</em>' attribute.
	 * @see #setRootPassword(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_dbms_RootPassword()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_nodes_dbms!rootPassword'"
	 * @generated
	 */
	String getRootPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#getRootPassword <em>Root Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Password</em>' attribute.
	 * @see #getRootPassword()
	 * @generated
	 */
	void setRootPassword(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv SourceMustBeDatabase: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean SourceMustBeDatabase(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tosca_nodes_dbms
