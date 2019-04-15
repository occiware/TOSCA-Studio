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
 * A representation of the model object '<em><b>Tosca nodes mysql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_mysql#getStoragePath <em>Storage Path</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_mysql#getDbUser <em>Db User</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_mysql#getBindAddress <em>Bind Address</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_mysql#getDbPassword <em>Db Password</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_mysql()
 * @model
 * @generated
 */
public interface Tosca_nodes_mysql extends Tosca_nodes_abstractmysql, MixinBase {
	/**
	 * Returns the value of the '<em><b>Storage Path</b></em>' attribute.
	 * The default value is <code>"mountedStorage"</code>.
	 * The literals are from the enumeration {@link extendedtosca.storage_pathEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Path</em>' attribute.
	 * @see extendedtosca.storage_pathEnum
	 * @see #setStoragePath(storage_pathEnum)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_mysql_StoragePath()
	 * @model default="mountedStorage"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_mysql!storagePath'"
	 * @generated
	 */
	storage_pathEnum getStoragePath();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_mysql#getStoragePath <em>Storage Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Path</em>' attribute.
	 * @see extendedtosca.storage_pathEnum
	 * @see #getStoragePath()
	 * @generated
	 */
	void setStoragePath(storage_pathEnum value);

	/**
	 * Returns the value of the '<em><b>Db User</b></em>' attribute.
	 * The default value is <code>"pass"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user account used for database administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Db User</em>' attribute.
	 * @see #setDbUser(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_mysql_DbUser()
	 * @model default="pass" dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_mysql!dbUser'"
	 * @generated
	 */
	String getDbUser();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_mysql#getDbUser <em>Db User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db User</em>' attribute.
	 * @see #getDbUser()
	 * @generated
	 */
	void setDbUser(String value);

	/**
	 * Returns the value of the '<em><b>Bind Address</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true,the server accepts TCP/IP connections on all server host IPv4 interfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bind Address</em>' attribute.
	 * @see #setBindAddress(Boolean)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_mysql_BindAddress()
	 * @model default="true" dataType="org.eclipse.cmf.occi.tosca.boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_mysql!bindAddress'"
	 * @generated
	 */
	Boolean getBindAddress();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_mysql#getBindAddress <em>Bind Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Address</em>' attribute.
	 * @see #getBindAddress()
	 * @generated
	 */
	void setBindAddress(Boolean value);

	/**
	 * Returns the value of the '<em><b>Db Password</b></em>' attribute.
	 * The default value is <code>"pass"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The password associated with the user account for database administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Db Password</em>' attribute.
	 * @see #setDbPassword(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_mysql_DbPassword()
	 * @model default="pass" dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_mysql!dbPassword'"
	 * @generated
	 */
	String getDbPassword();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_mysql#getDbPassword <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Password</em>' attribute.
	 * @see #getDbPassword()
	 * @generated
	 */
	void setDbPassword(String value);

} // Tosca_nodes_mysql
