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
 * A representation of the model object '<em><b>Tosca nodes webserver</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_webserver()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SourceMustBeWebApplication'"
 * @generated
 */
public interface Tosca_nodes_webserver extends Tosca_nodes_softwarecomponent, Tosca_capabilities_endpoint, Tosca_capabilities_endpoint_admin, Tosca_capabilities_container, MixinBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv SourceMustBeWebApplication: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean SourceMustBeWebApplication(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tosca_nodes_webserver
