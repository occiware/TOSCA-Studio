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

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Credential type is a complex TOSCA data Type used when describing authorization credentials used to access network accessible resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Credential#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link extendedtosca.Credential#getKeys <em>Keys</em>}</li>
 *   <li>{@link extendedtosca.Credential#getTokentype <em>Tokentype</em>}</li>
 *   <li>{@link extendedtosca.Credential#getUser <em>User</em>}</li>
 *   <li>{@link extendedtosca.Credential#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getCredential()
 * @model
 * @generated
 */
public interface Credential extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional protocol name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getCredential_Protocol()
	 * @model dataType="extendedtosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Credential!protocol'"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link extendedtosca.Credential#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional list of protocol-specific keys or assertions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keys</em>' attribute.
	 * @see #setKeys(Map)
	 * @see extendedtosca.ExtendedtoscaPackage#getCredential_Keys()
	 * @model dataType="extendedtosca.map" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Credential!keys'"
	 * @generated
	 */
	Map getKeys();

	/**
	 * Sets the value of the '{@link extendedtosca.Credential#getKeys <em>Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys</em>' attribute.
	 * @see #getKeys()
	 * @generated
	 */
	void setKeys(Map value);

	/**
	 * Returns the value of the '<em><b>Tokentype</b></em>' attribute.
	 * The default value is <code>"The required token type."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required token type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tokentype</em>' attribute.
	 * @see #setTokentype(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getCredential_Tokentype()
	 * @model default="The required token type." dataType="extendedtosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Credential!tokentype'"
	 * @generated
	 */
	String getTokentype();

	/**
	 * Sets the value of the '{@link extendedtosca.Credential#getTokentype <em>Tokentype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokentype</em>' attribute.
	 * @see #getTokentype()
	 * @generated
	 */
	void setTokentype(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional user (name or ID) used for non-token based credentials.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getCredential_User()
	 * @model dataType="extendedtosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Credential!user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link extendedtosca.Credential#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required token used as a credential for authorization or access to a networked resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getCredential_Token()
	 * @model dataType="extendedtosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Credential!token'"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link extendedtosca.Credential#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // Credential
