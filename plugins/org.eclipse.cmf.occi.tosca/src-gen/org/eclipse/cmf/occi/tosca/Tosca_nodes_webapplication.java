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
 * A representation of the model object '<em><b>Tosca nodes webapplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication#getContextRoot <em>Context Root</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_webapplication()
 * @model
 * @generated
 */
public interface Tosca_nodes_webapplication extends Tosca_nodes_root, Tosca_capabilities_endpoint, MixinBase {
	/**
	 * Returns the value of the '<em><b>Context Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The web application’s context root which designates the application’s URL path within the web server it is hosted on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Root</em>' attribute.
	 * @see #setContextRoot(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_webapplication_ContextRoot()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_nodes_webapplication!contextRoot'"
	 * @generated
	 */
	String getContextRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication#getContextRoot <em>Context Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Root</em>' attribute.
	 * @see #getContextRoot()
	 * @generated
	 */
	void setContextRoot(String value);

} // Tosca_nodes_webapplication
