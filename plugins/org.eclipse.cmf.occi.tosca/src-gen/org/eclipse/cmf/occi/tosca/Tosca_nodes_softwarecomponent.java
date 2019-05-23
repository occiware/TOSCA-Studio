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
 * A representation of the model object '<em><b>Tosca nodes softwarecomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getAdminCredential <em>Admin Credential</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getComponentVersion <em>Component Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_softwarecomponent()
 * @model
 * @generated
 */
public interface Tosca_nodes_softwarecomponent extends Tosca_nodes_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional credential that can be used to authenticate to the software component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admin Credential</em>' containment reference.
	 * @see #setAdminCredential(Credential)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_softwarecomponent_AdminCredential()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_nodes_softwarecomponent!adminCredential'"
	 * @generated
	 */
	Credential getAdminCredential();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getAdminCredential <em>Admin Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Credential</em>' containment reference.
	 * @see #getAdminCredential()
	 * @generated
	 */
	void setAdminCredential(Credential value);

	/**
	 * Returns the value of the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional software component’s version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Version</em>' attribute.
	 * @see #setComponentVersion(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_softwarecomponent_ComponentVersion()
	 * @model dataType="org.eclipse.cmf.occi.tosca.version"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_nodes_softwarecomponent!componentVersion'"
	 * @generated
	 */
	String getComponentVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getComponentVersion <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Version</em>' attribute.
	 * @see #getComponentVersion()
	 * @generated
	 */
	void setComponentVersion(String value);

} // Tosca_nodes_softwarecomponent
