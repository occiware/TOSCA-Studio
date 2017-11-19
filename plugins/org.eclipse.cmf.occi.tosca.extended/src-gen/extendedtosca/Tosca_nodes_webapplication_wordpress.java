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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes webapplication wordpress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_webapplication_wordpress#getDbHost <em>Db Host</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_webapplication_wordpress#getAdminPassword <em>Admin Password</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_webapplication_wordpress#getAdminUser <em>Admin User</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_webapplication_wordpress()
 * @model
 * @generated
 */
public interface Tosca_nodes_webapplication_wordpress extends Tosca_nodes_webapplication, MixinBase {
	/**
	 * Returns the value of the '<em><b>Db Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Db Host</em>' attribute.
	 * @see #setDbHost(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_webapplication_wordpress_DbHost()
	 * @model dataType="extendedtosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_webapplication_wordpress!dbHost'"
	 * @generated
	 */
	String getDbHost();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_webapplication_wordpress#getDbHost <em>Db Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Host</em>' attribute.
	 * @see #getDbHost()
	 * @generated
	 */
	void setDbHost(String value);

	/**
	 * Returns the value of the '<em><b>Admin Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admin Password</em>' attribute.
	 * @see #setAdminPassword(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_webapplication_wordpress_AdminPassword()
	 * @model dataType="extendedtosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_webapplication_wordpress!adminPassword'"
	 * @generated
	 */
	String getAdminPassword();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_webapplication_wordpress#getAdminPassword <em>Admin Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Password</em>' attribute.
	 * @see #getAdminPassword()
	 * @generated
	 */
	void setAdminPassword(String value);

	/**
	 * Returns the value of the '<em><b>Admin User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admin User</em>' attribute.
	 * @see #setAdminUser(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_webapplication_wordpress_AdminUser()
	 * @model dataType="extendedtosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_webapplication_wordpress!adminUser'"
	 * @generated
	 */
	String getAdminUser();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_webapplication_wordpress#getAdminUser <em>Admin User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin User</em>' attribute.
	 * @see #getAdminUser()
	 * @generated
	 */
	void setAdminUser(String value);

} // Tosca_nodes_webapplication_wordpress
