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
import org.eclipse.cmf.occi.tosca.arraystring;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca capabilities container docker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_capabilities_container_docker#getPublishAll <em>Publish All</em>}</li>
 *   <li>{@link extendedtosca.Tosca_capabilities_container_docker#getPublishPorts <em>Publish Ports</em>}</li>
 *   <li>{@link extendedtosca.Tosca_capabilities_container_docker#getExposePorts <em>Expose Ports</em>}</li>
 *   <li>{@link extendedtosca.Tosca_capabilities_container_docker#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link extendedtosca.Tosca_capabilities_container_docker#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_capabilities_container_docker()
 * @model
 * @generated
 */
public interface Tosca_capabilities_container_docker extends Tosca_capabilities_container, MixinBase {
	/**
	 * Returns the value of the '<em><b>Publish All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publish All</em>' attribute.
	 * @see #setPublishAll(Boolean)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_capabilities_container_docker_PublishAll()
	 * @model default="false" dataType="org.eclipse.cmf.occi.tosca.boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_capabilities_container_docker!publishAll'"
	 * @generated
	 */
	Boolean getPublishAll();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_capabilities_container_docker#getPublishAll <em>Publish All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish All</em>' attribute.
	 * @see #getPublishAll()
	 * @generated
	 */
	void setPublishAll(Boolean value);

	/**
	 * Returns the value of the '<em><b>Publish Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publish Ports</em>' containment reference.
	 * @see #setPublishPorts(arrayPortSpec)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_capabilities_container_docker_PublishPorts()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_capabilities_container_docker!publishPorts'"
	 * @generated
	 */
	arrayPortSpec getPublishPorts();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_capabilities_container_docker#getPublishPorts <em>Publish Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Ports</em>' containment reference.
	 * @see #getPublishPorts()
	 * @generated
	 */
	void setPublishPorts(arrayPortSpec value);

	/**
	 * Returns the value of the '<em><b>Expose Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expose Ports</em>' containment reference.
	 * @see #setExposePorts(arrayPortSpec)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_capabilities_container_docker_ExposePorts()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_capabilities_container_docker!exposePorts'"
	 * @generated
	 */
	arrayPortSpec getExposePorts();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_capabilities_container_docker#getExposePorts <em>Expose Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose Ports</em>' containment reference.
	 * @see #getExposePorts()
	 * @generated
	 */
	void setExposePorts(arrayPortSpec value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference.
	 * @see #setVolumes(arraystring)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_capabilities_container_docker_Volumes()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_capabilities_container_docker!volumes'"
	 * @generated
	 */
	arraystring getVolumes();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_capabilities_container_docker#getVolumes <em>Volumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumes</em>' containment reference.
	 * @see #getVolumes()
	 * @generated
	 */
	void setVolumes(arraystring value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(arrayversion)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_capabilities_container_docker_Version()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_capabilities_container_docker!version'"
	 * @generated
	 */
	arrayversion getVersion();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_capabilities_container_docker#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(arrayversion value);

} // Tosca_capabilities_container_docker
