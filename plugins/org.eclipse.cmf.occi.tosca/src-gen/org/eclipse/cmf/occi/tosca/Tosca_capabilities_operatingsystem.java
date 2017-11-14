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
 * A representation of the model object '<em><b>Tosca capabilities operatingsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_operatingsystem()
 * @model
 * @generated
 */
public interface Tosca_capabilities_operatingsystem extends Tosca_capabilities_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operating System (OS) type. Examples of valid values include: linux, aix, mac, windows, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_operatingsystem_Type()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_operatingsystem!type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operating System (OS) distribution. Examples of valid values for an â€œtypeâ€? of â€œLinuxâ€? would include:  debian, fedora, rhel and ubuntu.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distribution</em>' attribute.
	 * @see #setDistribution(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_operatingsystem_Distribution()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_operatingsystem!distribution'"
	 * @generated
	 */
	String getDistribution();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getDistribution <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' attribute.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operating System version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_operatingsystem_Version()
	 * @model dataType="org.eclipse.cmf.occi.tosca.version"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_operatingsystem!version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operating System (OS) architecture. Examples of valid values include: x86_32, x86_64, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_operatingsystem_Architecture()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_operatingsystem!architecture'"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

} // Tosca_capabilities_operatingsystem
