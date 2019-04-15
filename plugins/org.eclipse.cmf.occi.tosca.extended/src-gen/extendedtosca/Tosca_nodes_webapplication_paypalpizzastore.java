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

import org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes webapplication paypalpizzastore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_webapplication_paypalpizzastore#getGithubUrl <em>Github Url</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_webapplication_paypalpizzastore()
 * @model
 * @generated
 */
public interface Tosca_nodes_webapplication_paypalpizzastore extends Tosca_nodes_webapplication, MixinBase {
	/**
	 * Returns the value of the '<em><b>Github Url</b></em>' attribute.
	 * The default value is <code>"https:github.comsample.git"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * location of the application on the github.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Github Url</em>' attribute.
	 * @see #setGithubUrl(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_webapplication_paypalpizzastore_GithubUrl()
	 * @model default="https:github.comsample.git" dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_webapplication_paypalpizzastore!githubUrl'"
	 * @generated
	 */
	String getGithubUrl();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_webapplication_paypalpizzastore#getGithubUrl <em>Github Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Github Url</em>' attribute.
	 * @see #getGithubUrl()
	 * @generated
	 */
	void setGithubUrl(String value);

} // Tosca_nodes_webapplication_paypalpizzastore
