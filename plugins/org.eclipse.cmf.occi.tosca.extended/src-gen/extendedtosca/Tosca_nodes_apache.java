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

import org.eclipse.cmf.occi.tosca.Tosca_capabilities_container;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes apache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_apache#getDocumentRoot <em>Document Root</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_apache()
 * @model
 * @generated
 */
public interface Tosca_nodes_apache extends Tosca_nodes_webserver, Tosca_capabilities_container, MixinBase {
	/**
	 * Returns the value of the '<em><b>Document Root</b></em>' attribute.
	 * The default value is <code>"var/www"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Root</em>' attribute.
	 * @see #setDocumentRoot(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_apache_DocumentRoot()
	 * @model default="var/www" dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_apache!documentRoot'"
	 * @generated
	 */
	String getDocumentRoot();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_apache#getDocumentRoot <em>Document Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Root</em>' attribute.
	 * @see #getDocumentRoot()
	 * @generated
	 */
	void setDocumentRoot(String value);

} // Tosca_nodes_apache
