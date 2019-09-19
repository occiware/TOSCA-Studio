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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.tosca.ToscaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see extendedtosca.ExtendedtoscaFactory
 * @model kind="package"
 * @generated
 */
public interface ExtendedtoscaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extendedtosca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/tosca/extended/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extendedtosca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtendedtoscaPackage eINSTANCE = extendedtosca.impl.ExtendedtoscaPackageImpl.init();

	/**
	 * The meta object id for the '{@link extendedtosca.impl.arrayCredentialImpl <em>array Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.arrayCredentialImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayCredential()
	 * @generated
	 */
	int ARRAY_CREDENTIAL = 0;

	/**
	 * The feature id for the '<em><b>Arraycredential Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES = 0;

	/**
	 * The number of structural features of the '<em>array Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREDENTIAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREDENTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.arrayPortSpecImpl <em>array Port Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.arrayPortSpecImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayPortSpec()
	 * @generated
	 */
	int ARRAY_PORT_SPEC = 1;

	/**
	 * The feature id for the '<em><b>Arrayportspec Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PORT_SPEC__ARRAYPORTSPEC_VALUES = 0;

	/**
	 * The number of structural features of the '<em>array Port Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PORT_SPEC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array Port Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PORT_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.arrayversionImpl <em>arrayversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.arrayversionImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayversion()
	 * @generated
	 */
	int ARRAYVERSION = 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYVERSION__VALUES = 0;

	/**
	 * The number of structural features of the '<em>arrayversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYVERSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>arrayversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYVERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.arrayintegerImpl <em>arrayinteger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.arrayintegerImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayinteger()
	 * @generated
	 */
	int ARRAYINTEGER = 3;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYINTEGER__VALUES = 0;

	/**
	 * The number of structural features of the '<em>arrayinteger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYINTEGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>arrayinteger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYINTEGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_somecapImpl <em>Tosca capabilities somecap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_somecapImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_somecap()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_SOMECAP = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP__MIXIN = ToscaPackage.TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP__ENTITY = ToscaPackage.TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP__ATTRIBUTES = ToscaPackage.TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities somecap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP_FEATURE_COUNT = ToscaPackage.TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities somecap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP_OPERATION_COUNT = ToscaPackage.TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_indigo_endpointImpl <em>Tosca capabilities indigo endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_indigo_endpointImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_indigo_endpoint()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__MIXIN = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__ENTITY = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__ATTRIBUTES = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__PORT_NAME = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__PROTOCOL = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__PORT = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__INITIATOR = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__NETWORK_NAME = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__SECURE = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__PORTS = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__URL_PATH = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__CREDENTIAL = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca capabilities indigo endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT_FEATURE_COUNT = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca capabilities indigo endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT_OPERATION_COUNT = ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_haImpl <em>Tosca capabilities ha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_haImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_ha()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_HA = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA__MIXIN = ToscaPackage.TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA__ENTITY = ToscaPackage.TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA__ATTRIBUTES = ToscaPackage.TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities ha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA_FEATURE_COUNT = ToscaPackage.TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities ha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA_OPERATION_COUNT = ToscaPackage.TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_container_dockerImpl <em>Tosca capabilities container docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_container_dockerImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_container_docker()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__MIXIN = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__ENTITY = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__ATTRIBUTES = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__DISK_SIZE = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Publish All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Publish Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expose Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tosca capabilities container docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER_FEATURE_COUNT = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Tosca capabilities container docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER_OPERATION_COUNT = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_containerchildImpl <em>Tosca capabilities containerchild</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_containerchildImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_containerchild()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD__MIXIN = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD__ENTITY = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD__ATTRIBUTES = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD__DISK_SIZE = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE;

	/**
	 * The number of structural features of the '<em>Tosca capabilities containerchild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD_FEATURE_COUNT = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities containerchild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD_OPERATION_COUNT = ToscaPackage.TOSCA_CAPABILITIES_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_somechildcapImpl <em>Tosca capabilities somechildcap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_somechildcapImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_somechildcap()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_SOMECHILDCAP = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECHILDCAP__MIXIN = TOSCA_CAPABILITIES_SOMECAP__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECHILDCAP__ENTITY = TOSCA_CAPABILITIES_SOMECAP__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECHILDCAP__ATTRIBUTES = TOSCA_CAPABILITIES_SOMECAP__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities somechildcap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECHILDCAP_FEATURE_COUNT = TOSCA_CAPABILITIES_SOMECAP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities somechildcap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECHILDCAP_OPERATION_COUNT = TOSCA_CAPABILITIES_SOMECAP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_computewithpropImpl <em>Tosca nodes computewithprop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_computewithpropImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_computewithprop()
	 * @generated
	 */
	int TOSCA_NODES_COMPUTEWITHPROP = 10;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__MIXIN = ToscaPackage.TOSCA_NODES_COMPUTE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__ENTITY = ToscaPackage.TOSCA_NODES_COMPUTE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__ATTRIBUTES = ToscaPackage.TOSCA_NODES_COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__MIN_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__MAX_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__DEFAULT_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PORT_NAME = ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PROTOCOL = ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PORT = ToscaPackage.TOSCA_NODES_COMPUTE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__INITIATOR = ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__NETWORK_NAME = ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__SECURE = ToscaPackage.TOSCA_NODES_COMPUTE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PORTS = ToscaPackage.TOSCA_NODES_COMPUTE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__URL_PATH = ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__TYPE = ToscaPackage.TOSCA_NODES_COMPUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__DISTRIBUTION = ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__VERSION = ToscaPackage.TOSCA_NODES_COMPUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__DISK_SIZE = ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PRIVATE_ADDRESS = ToscaPackage.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PUBLIC_ADDRESS = ToscaPackage.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__NETWORKS = ToscaPackage.TOSCA_NODES_COMPUTE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__TEST = ToscaPackage.TOSCA_NODES_COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes computewithprop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes computewithprop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_webapplication_paypalpizzastoreImpl <em>Tosca nodes webapplication paypalpizzastore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_webapplication_paypalpizzastoreImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webapplication_paypalpizzastore()
	 * @generated
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE = 11;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__MIXIN = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__ENTITY = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__ATTRIBUTES = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__PORT_NAME = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__PROTOCOL = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__PORT = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__INITIATOR = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__NETWORK_NAME = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__SECURE = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__PORTS = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__URL_PATH = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__URL_PATH;

	/**
	 * The feature id for the '<em><b>Context Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__CONTEXT_ROOT = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT;

	/**
	 * The feature id for the '<em><b>Github Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL = ToscaPackage.TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes webapplication paypalpizzastore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes webapplication paypalpizzastore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_WEBAPPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_network_networkImpl <em>Tosca nodes network network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_network_networkImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_network_network()
	 * @generated
	 */
	int TOSCA_NODES_NETWORK_NETWORK = 12;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__MIXIN = ToscaPackage.TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__ENTITY = ToscaPackage.TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__ATTRIBUTES = ToscaPackage.TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Physical Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Segmentation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Network Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ip Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__IP_VERSION = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__START_IP = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__CIDR = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gateway Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Network Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>End Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK__END_IP = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Tosca nodes network network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes network network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_NETWORK_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_container_application_dockerImpl <em>Tosca nodes container application docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_container_application_dockerImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_container_application_docker()
	 * @generated
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER = 13;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER__MIXIN = ToscaPackage.TOSCA_NODES_CONTAINER_APPLICATION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER__ENTITY = ToscaPackage.TOSCA_NODES_CONTAINER_APPLICATION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER__ATTRIBUTES = ToscaPackage.TOSCA_NODES_CONTAINER_APPLICATION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca nodes container application docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_CONTAINER_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes container application docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_CONTAINER_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_kibanaImpl <em>Tosca nodes softwarecomponent kibana</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_kibanaImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_kibana()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA = 14;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__MIXIN = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__ENTITY = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__ATTRIBUTES = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent kibana</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent kibana</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_computewithattrlistImpl <em>Tosca nodes computewithattrlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_computewithattrlistImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_computewithattrlist()
	 * @generated
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST = 15;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__MIXIN = ToscaPackage.TOSCA_NODES_COMPUTE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__ENTITY = ToscaPackage.TOSCA_NODES_COMPUTE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__ATTRIBUTES = ToscaPackage.TOSCA_NODES_COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__MIN_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__MAX_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__DEFAULT_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PORT_NAME = ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PROTOCOL = ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PORT = ToscaPackage.TOSCA_NODES_COMPUTE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__INITIATOR = ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__NETWORK_NAME = ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__SECURE = ToscaPackage.TOSCA_NODES_COMPUTE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PORTS = ToscaPackage.TOSCA_NODES_COMPUTE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__URL_PATH = ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__TYPE = ToscaPackage.TOSCA_NODES_COMPUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__DISTRIBUTION = ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__VERSION = ToscaPackage.TOSCA_NODES_COMPUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__DISK_SIZE = ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PRIVATE_ADDRESS = ToscaPackage.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PUBLIC_ADDRESS = ToscaPackage.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__NETWORKS = ToscaPackage.TOSCA_NODES_COMPUTE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Attr List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST = ToscaPackage.TOSCA_NODES_COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes computewithattrlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes computewithattrlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_logstashImpl <em>Tosca nodes softwarecomponent logstash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_logstashImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_logstash()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH = 16;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__MIXIN = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__ENTITY = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__ATTRIBUTES = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__PORT_NAME = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__PROTOCOL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__PORT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__INITIATOR = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__NETWORK_NAME = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__SECURE = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__PORTS = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__URL_PATH = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent logstash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent logstash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Example_databasesubsystemImpl <em>Example databasesubsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Example_databasesubsystemImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getExample_databasesubsystem()
	 * @generated
	 */
	int EXAMPLE_DATABASESUBSYSTEM = 17;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__MIXIN = ToscaPackage.TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__ENTITY = ToscaPackage.TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__ATTRIBUTES = ToscaPackage.TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__PORT_NAME = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__PROTOCOL = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__PORT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__INITIATOR = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__NETWORK_NAME = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__SECURE = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__PORTS = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM__URL_PATH = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Example databasesubsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Example databasesubsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DATABASESUBSYSTEM_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_collectdImpl <em>Tosca nodes softwarecomponent collectd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_collectdImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_collectd()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD = 18;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__MIXIN = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__ENTITY = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__ATTRIBUTES = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent collectd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent collectd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_nodewithreqImpl <em>Tosca nodes nodewithreq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_nodewithreqImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_nodewithreq()
	 * @generated
	 */
	int TOSCA_NODES_NODEWITHREQ = 19;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__MIXIN = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__ENTITY = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__ATTRIBUTES = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tosca nodes nodewithreq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes nodewithreq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_somenode2Impl <em>Tosca nodes somenode2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_somenode2Impl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_somenode2()
	 * @generated
	 */
	int TOSCA_NODES_SOMENODE2 = 20;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2__MIXIN = ToscaPackage.TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2__ENTITY = ToscaPackage.TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2__ATTRIBUTES = ToscaPackage.TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2__DISK_SIZE = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes somenode2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes somenode2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_phpImpl <em>Tosca nodes php</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_phpImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_php()
	 * @generated
	 */
	int TOSCA_NODES_PHP = 21;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_PHP__MIXIN = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_PHP__ENTITY = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_PHP__ATTRIBUTES = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_PHP__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_PHP__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tosca nodes php</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_PHP_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes php</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_PHP_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_database_mysqlImpl <em>Tosca nodes database mysql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_database_mysqlImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_database_mysql()
	 * @generated
	 */
	int TOSCA_NODES_DATABASE_MYSQL = 22;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__MIXIN = ToscaPackage.TOSCA_NODES_DATABASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__ENTITY = ToscaPackage.TOSCA_NODES_DATABASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__ATTRIBUTES = ToscaPackage.TOSCA_NODES_DATABASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PORT_NAME = ToscaPackage.TOSCA_NODES_DATABASE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PROTOCOL = ToscaPackage.TOSCA_NODES_DATABASE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PORT = ToscaPackage.TOSCA_NODES_DATABASE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__INITIATOR = ToscaPackage.TOSCA_NODES_DATABASE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__NETWORK_NAME = ToscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__SECURE = ToscaPackage.TOSCA_NODES_DATABASE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PORTS = ToscaPackage.TOSCA_NODES_DATABASE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__URL_PATH = ToscaPackage.TOSCA_NODES_DATABASE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PASSWORD = ToscaPackage.TOSCA_NODES_DATABASE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__NAME = ToscaPackage.TOSCA_NODES_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__USER = ToscaPackage.TOSCA_NODES_DATABASE__USER;

	/**
	 * The number of structural features of the '<em>Tosca nodes database mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes database mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Example_queuingsubsystemImpl <em>Example queuingsubsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Example_queuingsubsystemImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getExample_queuingsubsystem()
	 * @generated
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM = 23;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__MIXIN = ToscaPackage.TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__ENTITY = ToscaPackage.TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__ATTRIBUTES = ToscaPackage.TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__PORT_NAME = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__PROTOCOL = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__PORT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__INITIATOR = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__NETWORK_NAME = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__SECURE = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__PORTS = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM__URL_PATH = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Example queuingsubsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Example queuingsubsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_QUEUINGSUBSYSTEM_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Example_transactionsubsystemImpl <em>Example transactionsubsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Example_transactionsubsystemImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getExample_transactionsubsystem()
	 * @generated
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM = 24;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__MIXIN = ToscaPackage.TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__ENTITY = ToscaPackage.TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__ATTRIBUTES = ToscaPackage.TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__PORT_NAME = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__PROTOCOL = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__PORT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__INITIATOR = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__NETWORK_NAME = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__SECURE = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__PORTS = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__URL_PATH = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Receiver Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__RECEIVER_PORT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mq Service Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM__MQ_SERVICE_IP = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Example transactionsubsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Example transactionsubsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TRANSACTIONSUBSYSTEM_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_abstractmysqlImpl <em>Tosca nodes abstractmysql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_abstractmysqlImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_abstractmysql()
	 * @generated
	 */
	int TOSCA_NODES_ABSTRACTMYSQL = 25;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__MIXIN = ToscaPackage.TOSCA_NODES_DATABASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__ENTITY = ToscaPackage.TOSCA_NODES_DATABASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__ATTRIBUTES = ToscaPackage.TOSCA_NODES_DATABASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__PORT_NAME = ToscaPackage.TOSCA_NODES_DATABASE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__PROTOCOL = ToscaPackage.TOSCA_NODES_DATABASE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__PORT = ToscaPackage.TOSCA_NODES_DATABASE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__INITIATOR = ToscaPackage.TOSCA_NODES_DATABASE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__NETWORK_NAME = ToscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__SECURE = ToscaPackage.TOSCA_NODES_DATABASE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__PORTS = ToscaPackage.TOSCA_NODES_DATABASE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__URL_PATH = ToscaPackage.TOSCA_NODES_DATABASE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__PASSWORD = ToscaPackage.TOSCA_NODES_DATABASE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__NAME = ToscaPackage.TOSCA_NODES_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL__USER = ToscaPackage.TOSCA_NODES_DATABASE__USER;

	/**
	 * The number of structural features of the '<em>Tosca nodes abstractmysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes abstractmysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ABSTRACTMYSQL_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_mysqlImpl <em>Tosca nodes mysql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_mysqlImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_mysql()
	 * @generated
	 */
	int TOSCA_NODES_MYSQL = 26;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__MIXIN = TOSCA_NODES_ABSTRACTMYSQL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__ENTITY = TOSCA_NODES_ABSTRACTMYSQL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__ATTRIBUTES = TOSCA_NODES_ABSTRACTMYSQL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__PORT_NAME = TOSCA_NODES_ABSTRACTMYSQL__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__PROTOCOL = TOSCA_NODES_ABSTRACTMYSQL__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__PORT = TOSCA_NODES_ABSTRACTMYSQL__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__INITIATOR = TOSCA_NODES_ABSTRACTMYSQL__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__NETWORK_NAME = TOSCA_NODES_ABSTRACTMYSQL__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__SECURE = TOSCA_NODES_ABSTRACTMYSQL__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__PORTS = TOSCA_NODES_ABSTRACTMYSQL__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__URL_PATH = TOSCA_NODES_ABSTRACTMYSQL__URL_PATH;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__PASSWORD = TOSCA_NODES_ABSTRACTMYSQL__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__NAME = TOSCA_NODES_ABSTRACTMYSQL__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__USER = TOSCA_NODES_ABSTRACTMYSQL__USER;

	/**
	 * The feature id for the '<em><b>Storage Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__STORAGE_PATH = TOSCA_NODES_ABSTRACTMYSQL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Db User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__DB_USER = TOSCA_NODES_ABSTRACTMYSQL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bind Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__BIND_ADDRESS = TOSCA_NODES_ABSTRACTMYSQL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL__DB_PASSWORD = TOSCA_NODES_ABSTRACTMYSQL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tosca nodes mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL_FEATURE_COUNT = TOSCA_NODES_ABSTRACTMYSQL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tosca nodes mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_MYSQL_OPERATION_COUNT = TOSCA_NODES_ABSTRACTMYSQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_elasticsearchImpl <em>Tosca nodes softwarecomponent elasticsearch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_elasticsearchImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_elasticsearch()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH = 27;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__MIXIN = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__ENTITY = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__ATTRIBUTES = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__PORT_NAME = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__PROTOCOL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__PORT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__INITIATOR = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__NETWORK_NAME = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__SECURE = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__PORTS = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__URL_PATH = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent elasticsearch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent elasticsearch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_databasewithlistparamImpl <em>Tosca nodes databasewithlistparam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_databasewithlistparamImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_databasewithlistparam()
	 * @generated
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM = 28;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__MIXIN = ToscaPackage.TOSCA_NODES_DATABASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__ENTITY = ToscaPackage.TOSCA_NODES_DATABASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__ATTRIBUTES = ToscaPackage.TOSCA_NODES_DATABASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PORT_NAME = ToscaPackage.TOSCA_NODES_DATABASE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PROTOCOL = ToscaPackage.TOSCA_NODES_DATABASE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PORT = ToscaPackage.TOSCA_NODES_DATABASE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__INITIATOR = ToscaPackage.TOSCA_NODES_DATABASE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__NETWORK_NAME = ToscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__SECURE = ToscaPackage.TOSCA_NODES_DATABASE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PORTS = ToscaPackage.TOSCA_NODES_DATABASE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__URL_PATH = ToscaPackage.TOSCA_NODES_DATABASE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PASSWORD = ToscaPackage.TOSCA_NODES_DATABASE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__NAME = ToscaPackage.TOSCA_NODES_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__USER = ToscaPackage.TOSCA_NODES_DATABASE__USER;

	/**
	 * The feature id for the '<em><b>List Prop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP = ToscaPackage.TOSCA_NODES_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes databasewithlistparam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_DATABASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes databasewithlistparam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Example_someappImpl <em>Example someapp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Example_someappImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getExample_someapp()
	 * @generated
	 */
	int EXAMPLE_SOMEAPP = 29;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__MIXIN = ToscaPackage.TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__ENTITY = ToscaPackage.TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__ATTRIBUTES = ToscaPackage.TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__PORT_NAME = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__PROTOCOL = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__PORT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__INITIATOR = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__NETWORK_NAME = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__SECURE = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__PORTS = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP__URL_PATH = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Example someapp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Example someapp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SOMEAPP_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_nodewithcapImpl <em>Tosca nodes nodewithcap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_nodewithcapImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_nodewithcap()
	 * @generated
	 */
	int TOSCA_NODES_NODEWITHCAP = 30;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP__MIXIN = ToscaPackage.TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP__ENTITY = ToscaPackage.TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP__ATTRIBUTES = ToscaPackage.TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca nodes nodewithcap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes nodewithcap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_apacheImpl <em>Tosca nodes apache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_apacheImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_apache()
	 * @generated
	 */
	int TOSCA_NODES_APACHE = 31;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__MIXIN = ToscaPackage.TOSCA_NODES_WEBSERVER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__ENTITY = ToscaPackage.TOSCA_NODES_WEBSERVER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__ATTRIBUTES = ToscaPackage.TOSCA_NODES_WEBSERVER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_WEBSERVER__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_WEBSERVER__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__PORT_NAME = ToscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__PROTOCOL = ToscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__PORT = ToscaPackage.TOSCA_NODES_WEBSERVER__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__INITIATOR = ToscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__NETWORK_NAME = ToscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__SECURE = ToscaPackage.TOSCA_NODES_WEBSERVER__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__PORTS = ToscaPackage.TOSCA_NODES_WEBSERVER__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__URL_PATH = ToscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__DISK_SIZE = ToscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Document Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE__DOCUMENT_ROOT = ToscaPackage.TOSCA_NODES_WEBSERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes apache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_WEBSERVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes apache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_APACHE_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_WEBSERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.RsyslogImpl <em>Rsyslog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.RsyslogImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getRsyslog()
	 * @generated
	 */
	int RSYSLOG = 32;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__MIXIN = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__ENTITY = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__ATTRIBUTES = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Rsyslog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rsyslog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_wordpressImpl <em>Tosca nodes wordpress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_wordpressImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_wordpress()
	 * @generated
	 */
	int TOSCA_NODES_WORDPRESS = 33;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__MIXIN = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__ENTITY = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__ATTRIBUTES = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__PORT_NAME = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__PROTOCOL = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__PORT = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__INITIATOR = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__NETWORK_NAME = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__SECURE = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__PORTS = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__URL_PATH = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__URL_PATH;

	/**
	 * The feature id for the '<em><b>Context Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__CONTEXT_ROOT = ToscaPackage.TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT;

	/**
	 * The feature id for the '<em><b>Zip Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS__ZIP_URL = ToscaPackage.TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes wordpress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes wordpress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WORDPRESS_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_WEBAPPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_network_portImpl <em>Tosca nodes network port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_network_portImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_network_port()
	 * @generated
	 */
	int TOSCA_NODES_NETWORK_PORT = 34;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT__MIXIN = ToscaPackage.TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT__ENTITY = ToscaPackage.TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT__ATTRIBUTES = ToscaPackage.TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Ip Range End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT__IP_RANGE_END = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip Range Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT__IP_RANGE_START = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT__IP_ADDRESS = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT__IS_DEFAULT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT__ORDER = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tosca nodes network port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes network port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NETWORK_PORT_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_computewithcapwithattrImpl <em>Tosca nodes computewithcapwithattr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_computewithcapwithattrImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_computewithcapwithattr()
	 * @generated
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR = 35;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__MIXIN = ToscaPackage.TOSCA_NODES_COMPUTE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__ENTITY = ToscaPackage.TOSCA_NODES_COMPUTE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__ATTRIBUTES = ToscaPackage.TOSCA_NODES_COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__MIN_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__MAX_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__DEFAULT_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PORT_NAME = ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PROTOCOL = ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PORT = ToscaPackage.TOSCA_NODES_COMPUTE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__INITIATOR = ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__NETWORK_NAME = ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__SECURE = ToscaPackage.TOSCA_NODES_COMPUTE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PORTS = ToscaPackage.TOSCA_NODES_COMPUTE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__URL_PATH = ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__TYPE = ToscaPackage.TOSCA_NODES_COMPUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__DISTRIBUTION = ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__VERSION = ToscaPackage.TOSCA_NODES_COMPUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__DISK_SIZE = ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PRIVATE_ADDRESS = ToscaPackage.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PUBLIC_ADDRESS = ToscaPackage.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__NETWORKS = ToscaPackage.TOSCA_NODES_COMPUTE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__CREDENTIAL = ToscaPackage.TOSCA_NODES_COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes computewithcapwithattr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes computewithcapwithattr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_rsyslogImpl <em>Tosca nodes softwarecomponent rsyslog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_rsyslogImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_rsyslog()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG = 36;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__MIXIN = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__ENTITY = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__ATTRIBUTES = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent rsyslog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent rsyslog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_hacomputeImpl <em>Tosca nodes hacompute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_hacomputeImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_hacompute()
	 * @generated
	 */
	int TOSCA_NODES_HACOMPUTE = 37;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__MIXIN = ToscaPackage.TOSCA_NODES_COMPUTE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__ENTITY = ToscaPackage.TOSCA_NODES_COMPUTE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__ATTRIBUTES = ToscaPackage.TOSCA_NODES_COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__MIN_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__MAX_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__DEFAULT_INSTANCES = ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PORT_NAME = ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PROTOCOL = ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PORT = ToscaPackage.TOSCA_NODES_COMPUTE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__INITIATOR = ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__NETWORK_NAME = ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__SECURE = ToscaPackage.TOSCA_NODES_COMPUTE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PORTS = ToscaPackage.TOSCA_NODES_COMPUTE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__URL_PATH = ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__TYPE = ToscaPackage.TOSCA_NODES_COMPUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__DISTRIBUTION = ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__VERSION = ToscaPackage.TOSCA_NODES_COMPUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__DISK_SIZE = ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PRIVATE_ADDRESS = ToscaPackage.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PUBLIC_ADDRESS = ToscaPackage.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__NETWORKS = ToscaPackage.TOSCA_NODES_COMPUTE__NETWORKS;

	/**
	 * The number of structural features of the '<em>Tosca nodes hacompute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes hacompute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_somenodeImpl <em>Tosca nodes somenode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_somenodeImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_somenode()
	 * @generated
	 */
	int TOSCA_NODES_SOMENODE = 38;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE__MIXIN = ToscaPackage.TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE__ENTITY = ToscaPackage.TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE__ATTRIBUTES = ToscaPackage.TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca nodes somenode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes somenode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_webserver_nodejsImpl <em>Tosca nodes webserver nodejs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_webserver_nodejsImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webserver_nodejs()
	 * @generated
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS = 39;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__MIXIN = ToscaPackage.TOSCA_NODES_WEBSERVER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__ENTITY = ToscaPackage.TOSCA_NODES_WEBSERVER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__ATTRIBUTES = ToscaPackage.TOSCA_NODES_WEBSERVER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_WEBSERVER__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_WEBSERVER__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__PORT_NAME = ToscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__PROTOCOL = ToscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__PORT = ToscaPackage.TOSCA_NODES_WEBSERVER__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__INITIATOR = ToscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__NETWORK_NAME = ToscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__SECURE = ToscaPackage.TOSCA_NODES_WEBSERVER__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__PORTS = ToscaPackage.TOSCA_NODES_WEBSERVER__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__URL_PATH = ToscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__DISK_SIZE = ToscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Github Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__GITHUB_URL = ToscaPackage.TOSCA_NODES_WEBSERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes webserver nodejs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_WEBSERVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes webserver nodejs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_WEBSERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_dbms_mysqlImpl <em>Tosca nodes dbms mysql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_dbms_mysqlImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_dbms_mysql()
	 * @generated
	 */
	int TOSCA_NODES_DBMS_MYSQL = 40;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__MIXIN = ToscaPackage.TOSCA_NODES_DBMS__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__ENTITY = ToscaPackage.TOSCA_NODES_DBMS__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__ATTRIBUTES = ToscaPackage.TOSCA_NODES_DBMS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__ADMIN_CREDENTIAL = ToscaPackage.TOSCA_NODES_DBMS__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__COMPONENT_VERSION = ToscaPackage.TOSCA_NODES_DBMS__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__DISK_SIZE = ToscaPackage.TOSCA_NODES_DBMS__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Occi Database Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__OCCI_DATABASE_VERSION = ToscaPackage.TOSCA_NODES_DBMS__OCCI_DATABASE_VERSION;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__PORT = ToscaPackage.TOSCA_NODES_DBMS__PORT;

	/**
	 * The feature id for the '<em><b>Root Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__ROOT_PASSWORD = ToscaPackage.TOSCA_NODES_DBMS__ROOT_PASSWORD;

	/**
	 * The number of structural features of the '<em>Tosca nodes dbms mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL_FEATURE_COUNT = ToscaPackage.TOSCA_NODES_DBMS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes dbms mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL_OPERATION_COUNT = ToscaPackage.TOSCA_NODES_DBMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Mycompany_mytypes_myscalingpolicyImpl <em>Mycompany mytypes myscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Mycompany_mytypes_myscalingpolicyImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getMycompany_mytypes_myscalingpolicy()
	 * @generated
	 */
	int MYCOMPANY_MYTYPES_MYSCALINGPOLICY = 41;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYCOMPANY_MYTYPES_MYSCALINGPOLICY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYCOMPANY_MYTYPES_MYSCALINGPOLICY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYCOMPANY_MYTYPES_MYSCALINGPOLICY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Mycompany mytypes myscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYCOMPANY_MYTYPES_MYSCALINGPOLICY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mycompany mytypes myscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYCOMPANY_MYTYPES_MYSCALINGPOLICY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Test_relation_connectsImpl <em>Test relation connects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Test_relation_connectsImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTest_relation_connects()
	 * @generated
	 */
	int TEST_RELATION_CONNECTS = 42;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RELATION_CONNECTS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RELATION_CONNECTS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RELATION_CONNECTS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Test relation connects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RELATION_CONNECTS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Test relation connects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RELATION_CONNECTS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_network_bindstoImpl <em>Tosca relationships network bindsto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_network_bindstoImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_network_bindsto()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_BINDSTO = 43;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_BINDSTO__MIXIN = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_BINDSTO__ENTITY = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_BINDSTO__ATTRIBUTES = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_BINDSTO__TOSCA_NAME = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_BINDSTO__STATE = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_BINDSTO__TOSCA_ID = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__TOSCA_ID;

	/**
	 * The number of structural features of the '<em>Tosca relationships network bindsto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_BINDSTO_FEATURE_COUNT = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca relationships network bindsto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_BINDSTO_OPERATION_COUNT = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_haImpl <em>Tosca relationships ha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_haImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_ha()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_HA = 44;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__MIXIN = ToscaPackage.TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__ENTITY = ToscaPackage.TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__ATTRIBUTES = ToscaPackage.TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__TOSCA_NAME = ToscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__STATE = ToscaPackage.TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__TOSCA_ID = ToscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The number of structural features of the '<em>Tosca relationships ha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA_FEATURE_COUNT = ToscaPackage.TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca relationships ha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA_OPERATION_COUNT = ToscaPackage.TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.MyattachestoImpl <em>Myattachesto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.MyattachestoImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getMyattachesto()
	 * @generated
	 */
	int MYATTACHESTO = 45;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYATTACHESTO__MIXIN = ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYATTACHESTO__ENTITY = ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYATTACHESTO__ATTRIBUTES = ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYATTACHESTO__TOSCA_NAME = ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYATTACHESTO__STATE = ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYATTACHESTO__TOSCA_ID = ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO__TOSCA_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYATTACHESTO__LOCATION = ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO__LOCATION;

	/**
	 * The number of structural features of the '<em>Myattachesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYATTACHESTO_FEATURE_COUNT = ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Myattachesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYATTACHESTO_OPERATION_COUNT = ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_network_linkstoImpl <em>Tosca relationships network linksto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_network_linkstoImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_network_linksto()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_LINKSTO = 46;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_LINKSTO__MIXIN = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_LINKSTO__ENTITY = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_LINKSTO__ATTRIBUTES = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_LINKSTO__TOSCA_NAME = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_LINKSTO__STATE = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_LINKSTO__TOSCA_ID = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON__TOSCA_ID;

	/**
	 * The number of structural features of the '<em>Tosca relationships network linksto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_LINKSTO_FEATURE_COUNT = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca relationships network linksto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_NETWORK_LINKSTO_OPERATION_COUNT = ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.ip_versionEnum <em>ip version Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.ip_versionEnum
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getip_versionEnum()
	 * @generated
	 */
	int IP_VERSION_ENUM = 47;

	/**
	 * The meta object id for the '{@link extendedtosca.storage_pathEnum <em>storage path Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.storage_pathEnum
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getstorage_pathEnum()
	 * @generated
	 */
	int STORAGE_PATH_ENUM = 48;


	/**
	 * Returns the meta object for class '{@link extendedtosca.arrayCredential <em>array Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array Credential</em>'.
	 * @see extendedtosca.arrayCredential
	 * @generated
	 */
	EClass getarrayCredential();

	/**
	 * Returns the meta object for the containment reference list '{@link extendedtosca.arrayCredential#getArraycredentialValues <em>Arraycredential Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arraycredential Values</em>'.
	 * @see extendedtosca.arrayCredential#getArraycredentialValues()
	 * @see #getarrayCredential()
	 * @generated
	 */
	EReference getarrayCredential_ArraycredentialValues();

	/**
	 * Returns the meta object for class '{@link extendedtosca.arrayPortSpec <em>array Port Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array Port Spec</em>'.
	 * @see extendedtosca.arrayPortSpec
	 * @generated
	 */
	EClass getarrayPortSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link extendedtosca.arrayPortSpec#getArrayportspecValues <em>Arrayportspec Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrayportspec Values</em>'.
	 * @see extendedtosca.arrayPortSpec#getArrayportspecValues()
	 * @see #getarrayPortSpec()
	 * @generated
	 */
	EReference getarrayPortSpec_ArrayportspecValues();

	/**
	 * Returns the meta object for class '{@link extendedtosca.arrayversion <em>arrayversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>arrayversion</em>'.
	 * @see extendedtosca.arrayversion
	 * @generated
	 */
	EClass getarrayversion();

	/**
	 * Returns the meta object for the attribute list '{@link extendedtosca.arrayversion#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see extendedtosca.arrayversion#getValues()
	 * @see #getarrayversion()
	 * @generated
	 */
	EAttribute getarrayversion_Values();

	/**
	 * Returns the meta object for class '{@link extendedtosca.arrayinteger <em>arrayinteger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>arrayinteger</em>'.
	 * @see extendedtosca.arrayinteger
	 * @generated
	 */
	EClass getarrayinteger();

	/**
	 * Returns the meta object for the attribute list '{@link extendedtosca.arrayinteger#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see extendedtosca.arrayinteger#getValues()
	 * @see #getarrayinteger()
	 * @generated
	 */
	EAttribute getarrayinteger_Values();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_somecap <em>Tosca capabilities somecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities somecap</em>'.
	 * @see extendedtosca.Tosca_capabilities_somecap
	 * @generated
	 */
	EClass getTosca_capabilities_somecap();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_indigo_endpoint <em>Tosca capabilities indigo endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities indigo endpoint</em>'.
	 * @see extendedtosca.Tosca_capabilities_indigo_endpoint
	 * @generated
	 */
	EClass getTosca_capabilities_indigo_endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.Tosca_capabilities_indigo_endpoint#getCredential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credential</em>'.
	 * @see extendedtosca.Tosca_capabilities_indigo_endpoint#getCredential()
	 * @see #getTosca_capabilities_indigo_endpoint()
	 * @generated
	 */
	EReference getTosca_capabilities_indigo_endpoint_Credential();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_ha <em>Tosca capabilities ha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities ha</em>'.
	 * @see extendedtosca.Tosca_capabilities_ha
	 * @generated
	 */
	EClass getTosca_capabilities_ha();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_container_docker <em>Tosca capabilities container docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities container docker</em>'.
	 * @see extendedtosca.Tosca_capabilities_container_docker
	 * @generated
	 */
	EClass getTosca_capabilities_container_docker();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_container_docker#getPublishAll <em>Publish All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publish All</em>'.
	 * @see extendedtosca.Tosca_capabilities_container_docker#getPublishAll()
	 * @see #getTosca_capabilities_container_docker()
	 * @generated
	 */
	EAttribute getTosca_capabilities_container_docker_PublishAll();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.Tosca_capabilities_container_docker#getPublishPorts <em>Publish Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publish Ports</em>'.
	 * @see extendedtosca.Tosca_capabilities_container_docker#getPublishPorts()
	 * @see #getTosca_capabilities_container_docker()
	 * @generated
	 */
	EReference getTosca_capabilities_container_docker_PublishPorts();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.Tosca_capabilities_container_docker#getExposePorts <em>Expose Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expose Ports</em>'.
	 * @see extendedtosca.Tosca_capabilities_container_docker#getExposePorts()
	 * @see #getTosca_capabilities_container_docker()
	 * @generated
	 */
	EReference getTosca_capabilities_container_docker_ExposePorts();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.Tosca_capabilities_container_docker#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Volumes</em>'.
	 * @see extendedtosca.Tosca_capabilities_container_docker#getVolumes()
	 * @see #getTosca_capabilities_container_docker()
	 * @generated
	 */
	EReference getTosca_capabilities_container_docker_Volumes();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.Tosca_capabilities_container_docker#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see extendedtosca.Tosca_capabilities_container_docker#getVersion()
	 * @see #getTosca_capabilities_container_docker()
	 * @generated
	 */
	EReference getTosca_capabilities_container_docker_Version();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_containerchild <em>Tosca capabilities containerchild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities containerchild</em>'.
	 * @see extendedtosca.Tosca_capabilities_containerchild
	 * @generated
	 */
	EClass getTosca_capabilities_containerchild();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_somechildcap <em>Tosca capabilities somechildcap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities somechildcap</em>'.
	 * @see extendedtosca.Tosca_capabilities_somechildcap
	 * @generated
	 */
	EClass getTosca_capabilities_somechildcap();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_computewithprop <em>Tosca nodes computewithprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes computewithprop</em>'.
	 * @see extendedtosca.Tosca_nodes_computewithprop
	 * @generated
	 */
	EClass getTosca_nodes_computewithprop();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_computewithprop#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see extendedtosca.Tosca_nodes_computewithprop#getTest()
	 * @see #getTosca_nodes_computewithprop()
	 * @generated
	 */
	EAttribute getTosca_nodes_computewithprop_Test();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_webapplication_paypalpizzastore <em>Tosca nodes webapplication paypalpizzastore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes webapplication paypalpizzastore</em>'.
	 * @see extendedtosca.Tosca_nodes_webapplication_paypalpizzastore
	 * @generated
	 */
	EClass getTosca_nodes_webapplication_paypalpizzastore();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_webapplication_paypalpizzastore#getGithubUrl <em>Github Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Github Url</em>'.
	 * @see extendedtosca.Tosca_nodes_webapplication_paypalpizzastore#getGithubUrl()
	 * @see #getTosca_nodes_webapplication_paypalpizzastore()
	 * @generated
	 */
	EAttribute getTosca_nodes_webapplication_paypalpizzastore_GithubUrl();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_network_network <em>Tosca nodes network network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes network network</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network
	 * @generated
	 */
	EClass getTosca_nodes_network_network();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getPhysicalNetwork <em>Physical Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Network</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getPhysicalNetwork()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_PhysicalNetwork();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getSegmentationId <em>Segmentation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segmentation Id</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getSegmentationId()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_SegmentationId();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getNetworkId <em>Network Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Id</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getNetworkId()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_NetworkId();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getIpVersion <em>Ip Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Version</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getIpVersion()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_IpVersion();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getStartIp <em>Start Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Ip</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getStartIp()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_StartIp();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getNetworkName <em>Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Name</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getNetworkName()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_NetworkName();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getCidr()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_Cidr();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getGatewayIp <em>Gateway Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Ip</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getGatewayIp()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_GatewayIp();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getNetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Type</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getNetworkType()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_NetworkType();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_network#getEndIp <em>End Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Ip</em>'.
	 * @see extendedtosca.Tosca_nodes_network_network#getEndIp()
	 * @see #getTosca_nodes_network_network()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_network_EndIp();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_network_network#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_network_network#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_network_network__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_container_application_docker <em>Tosca nodes container application docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes container application docker</em>'.
	 * @see extendedtosca.Tosca_nodes_container_application_docker
	 * @generated
	 */
	EClass getTosca_nodes_container_application_docker();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_softwarecomponent_kibana <em>Tosca nodes softwarecomponent kibana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes softwarecomponent kibana</em>'.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_kibana
	 * @generated
	 */
	EClass getTosca_nodes_softwarecomponent_kibana();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_computewithattrlist <em>Tosca nodes computewithattrlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes computewithattrlist</em>'.
	 * @see extendedtosca.Tosca_nodes_computewithattrlist
	 * @generated
	 */
	EClass getTosca_nodes_computewithattrlist();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_computewithattrlist#getAttrList <em>Attr List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr List</em>'.
	 * @see extendedtosca.Tosca_nodes_computewithattrlist#getAttrList()
	 * @see #getTosca_nodes_computewithattrlist()
	 * @generated
	 */
	EAttribute getTosca_nodes_computewithattrlist_AttrList();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_softwarecomponent_logstash <em>Tosca nodes softwarecomponent logstash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes softwarecomponent logstash</em>'.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_logstash
	 * @generated
	 */
	EClass getTosca_nodes_softwarecomponent_logstash();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Example_databasesubsystem <em>Example databasesubsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example databasesubsystem</em>'.
	 * @see extendedtosca.Example_databasesubsystem
	 * @generated
	 */
	EClass getExample_databasesubsystem();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_softwarecomponent_collectd <em>Tosca nodes softwarecomponent collectd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes softwarecomponent collectd</em>'.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_collectd
	 * @generated
	 */
	EClass getTosca_nodes_softwarecomponent_collectd();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_nodewithreq <em>Tosca nodes nodewithreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes nodewithreq</em>'.
	 * @see extendedtosca.Tosca_nodes_nodewithreq
	 * @generated
	 */
	EClass getTosca_nodes_nodewithreq();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_somenode2 <em>Tosca nodes somenode2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes somenode2</em>'.
	 * @see extendedtosca.Tosca_nodes_somenode2
	 * @generated
	 */
	EClass getTosca_nodes_somenode2();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_php <em>Tosca nodes php</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes php</em>'.
	 * @see extendedtosca.Tosca_nodes_php
	 * @generated
	 */
	EClass getTosca_nodes_php();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_database_mysql <em>Tosca nodes database mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes database mysql</em>'.
	 * @see extendedtosca.Tosca_nodes_database_mysql
	 * @generated
	 */
	EClass getTosca_nodes_database_mysql();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Example_queuingsubsystem <em>Example queuingsubsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example queuingsubsystem</em>'.
	 * @see extendedtosca.Example_queuingsubsystem
	 * @generated
	 */
	EClass getExample_queuingsubsystem();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Example_transactionsubsystem <em>Example transactionsubsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example transactionsubsystem</em>'.
	 * @see extendedtosca.Example_transactionsubsystem
	 * @generated
	 */
	EClass getExample_transactionsubsystem();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Example_transactionsubsystem#getReceiverPort <em>Receiver Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Port</em>'.
	 * @see extendedtosca.Example_transactionsubsystem#getReceiverPort()
	 * @see #getExample_transactionsubsystem()
	 * @generated
	 */
	EAttribute getExample_transactionsubsystem_ReceiverPort();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Example_transactionsubsystem#getMqServiceIp <em>Mq Service Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mq Service Ip</em>'.
	 * @see extendedtosca.Example_transactionsubsystem#getMqServiceIp()
	 * @see #getExample_transactionsubsystem()
	 * @generated
	 */
	EAttribute getExample_transactionsubsystem_MqServiceIp();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_abstractmysql <em>Tosca nodes abstractmysql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes abstractmysql</em>'.
	 * @see extendedtosca.Tosca_nodes_abstractmysql
	 * @generated
	 */
	EClass getTosca_nodes_abstractmysql();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_mysql <em>Tosca nodes mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes mysql</em>'.
	 * @see extendedtosca.Tosca_nodes_mysql
	 * @generated
	 */
	EClass getTosca_nodes_mysql();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_mysql#getStoragePath <em>Storage Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Path</em>'.
	 * @see extendedtosca.Tosca_nodes_mysql#getStoragePath()
	 * @see #getTosca_nodes_mysql()
	 * @generated
	 */
	EAttribute getTosca_nodes_mysql_StoragePath();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_mysql#getDbUser <em>Db User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db User</em>'.
	 * @see extendedtosca.Tosca_nodes_mysql#getDbUser()
	 * @see #getTosca_nodes_mysql()
	 * @generated
	 */
	EAttribute getTosca_nodes_mysql_DbUser();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_mysql#getBindAddress <em>Bind Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind Address</em>'.
	 * @see extendedtosca.Tosca_nodes_mysql#getBindAddress()
	 * @see #getTosca_nodes_mysql()
	 * @generated
	 */
	EAttribute getTosca_nodes_mysql_BindAddress();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_mysql#getDbPassword <em>Db Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Password</em>'.
	 * @see extendedtosca.Tosca_nodes_mysql#getDbPassword()
	 * @see #getTosca_nodes_mysql()
	 * @generated
	 */
	EAttribute getTosca_nodes_mysql_DbPassword();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_softwarecomponent_elasticsearch <em>Tosca nodes softwarecomponent elasticsearch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes softwarecomponent elasticsearch</em>'.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_elasticsearch
	 * @generated
	 */
	EClass getTosca_nodes_softwarecomponent_elasticsearch();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_databasewithlistparam <em>Tosca nodes databasewithlistparam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes databasewithlistparam</em>'.
	 * @see extendedtosca.Tosca_nodes_databasewithlistparam
	 * @generated
	 */
	EClass getTosca_nodes_databasewithlistparam();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.Tosca_nodes_databasewithlistparam#getListProp <em>List Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Prop</em>'.
	 * @see extendedtosca.Tosca_nodes_databasewithlistparam#getListProp()
	 * @see #getTosca_nodes_databasewithlistparam()
	 * @generated
	 */
	EReference getTosca_nodes_databasewithlistparam_ListProp();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Example_someapp <em>Example someapp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example someapp</em>'.
	 * @see extendedtosca.Example_someapp
	 * @generated
	 */
	EClass getExample_someapp();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_nodewithcap <em>Tosca nodes nodewithcap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes nodewithcap</em>'.
	 * @see extendedtosca.Tosca_nodes_nodewithcap
	 * @generated
	 */
	EClass getTosca_nodes_nodewithcap();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_apache <em>Tosca nodes apache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes apache</em>'.
	 * @see extendedtosca.Tosca_nodes_apache
	 * @generated
	 */
	EClass getTosca_nodes_apache();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_apache#getDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Root</em>'.
	 * @see extendedtosca.Tosca_nodes_apache#getDocumentRoot()
	 * @see #getTosca_nodes_apache()
	 * @generated
	 */
	EAttribute getTosca_nodes_apache_DocumentRoot();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Rsyslog <em>Rsyslog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rsyslog</em>'.
	 * @see extendedtosca.Rsyslog
	 * @generated
	 */
	EClass getRsyslog();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_wordpress <em>Tosca nodes wordpress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes wordpress</em>'.
	 * @see extendedtosca.Tosca_nodes_wordpress
	 * @generated
	 */
	EClass getTosca_nodes_wordpress();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_wordpress#getZipUrl <em>Zip Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Url</em>'.
	 * @see extendedtosca.Tosca_nodes_wordpress#getZipUrl()
	 * @see #getTosca_nodes_wordpress()
	 * @generated
	 */
	EAttribute getTosca_nodes_wordpress_ZipUrl();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_network_port <em>Tosca nodes network port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes network port</em>'.
	 * @see extendedtosca.Tosca_nodes_network_port
	 * @generated
	 */
	EClass getTosca_nodes_network_port();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_port#getIpRangeEnd <em>Ip Range End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Range End</em>'.
	 * @see extendedtosca.Tosca_nodes_network_port#getIpRangeEnd()
	 * @see #getTosca_nodes_network_port()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_port_IpRangeEnd();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_port#getIpRangeStart <em>Ip Range Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Range Start</em>'.
	 * @see extendedtosca.Tosca_nodes_network_port#getIpRangeStart()
	 * @see #getTosca_nodes_network_port()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_port_IpRangeStart();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_port#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see extendedtosca.Tosca_nodes_network_port#getIpAddress()
	 * @see #getTosca_nodes_network_port()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_port_IpAddress();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_port#getIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see extendedtosca.Tosca_nodes_network_port#getIsDefault()
	 * @see #getTosca_nodes_network_port()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_port_IsDefault();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_network_port#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see extendedtosca.Tosca_nodes_network_port#getOrder()
	 * @see #getTosca_nodes_network_port()
	 * @generated
	 */
	EAttribute getTosca_nodes_network_port_Order();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_network_port#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_network_port#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_network_port__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_computewithcapwithattr <em>Tosca nodes computewithcapwithattr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes computewithcapwithattr</em>'.
	 * @see extendedtosca.Tosca_nodes_computewithcapwithattr
	 * @generated
	 */
	EClass getTosca_nodes_computewithcapwithattr();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_softwarecomponent_rsyslog <em>Tosca nodes softwarecomponent rsyslog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes softwarecomponent rsyslog</em>'.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_rsyslog
	 * @generated
	 */
	EClass getTosca_nodes_softwarecomponent_rsyslog();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_hacompute <em>Tosca nodes hacompute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes hacompute</em>'.
	 * @see extendedtosca.Tosca_nodes_hacompute
	 * @generated
	 */
	EClass getTosca_nodes_hacompute();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_somenode <em>Tosca nodes somenode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes somenode</em>'.
	 * @see extendedtosca.Tosca_nodes_somenode
	 * @generated
	 */
	EClass getTosca_nodes_somenode();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_webserver_nodejs <em>Tosca nodes webserver nodejs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes webserver nodejs</em>'.
	 * @see extendedtosca.Tosca_nodes_webserver_nodejs
	 * @generated
	 */
	EClass getTosca_nodes_webserver_nodejs();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_webserver_nodejs#getGithubUrl <em>Github Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Github Url</em>'.
	 * @see extendedtosca.Tosca_nodes_webserver_nodejs#getGithubUrl()
	 * @see #getTosca_nodes_webserver_nodejs()
	 * @generated
	 */
	EAttribute getTosca_nodes_webserver_nodejs_GithubUrl();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_dbms_mysql <em>Tosca nodes dbms mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes dbms mysql</em>'.
	 * @see extendedtosca.Tosca_nodes_dbms_mysql
	 * @generated
	 */
	EClass getTosca_nodes_dbms_mysql();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Mycompany_mytypes_myscalingpolicy <em>Mycompany mytypes myscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mycompany mytypes myscalingpolicy</em>'.
	 * @see extendedtosca.Mycompany_mytypes_myscalingpolicy
	 * @generated
	 */
	EClass getMycompany_mytypes_myscalingpolicy();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Test_relation_connects <em>Test relation connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test relation connects</em>'.
	 * @see extendedtosca.Test_relation_connects
	 * @generated
	 */
	EClass getTest_relation_connects();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_network_bindsto <em>Tosca relationships network bindsto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships network bindsto</em>'.
	 * @see extendedtosca.Tosca_relationships_network_bindsto
	 * @generated
	 */
	EClass getTosca_relationships_network_bindsto();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_ha <em>Tosca relationships ha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships ha</em>'.
	 * @see extendedtosca.Tosca_relationships_ha
	 * @generated
	 */
	EClass getTosca_relationships_ha();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Myattachesto <em>Myattachesto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Myattachesto</em>'.
	 * @see extendedtosca.Myattachesto
	 * @generated
	 */
	EClass getMyattachesto();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_network_linksto <em>Tosca relationships network linksto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships network linksto</em>'.
	 * @see extendedtosca.Tosca_relationships_network_linksto
	 * @generated
	 */
	EClass getTosca_relationships_network_linksto();

	/**
	 * Returns the meta object for enum '{@link extendedtosca.ip_versionEnum <em>ip version Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ip version Enum</em>'.
	 * @see extendedtosca.ip_versionEnum
	 * @generated
	 */
	EEnum getip_versionEnum();

	/**
	 * Returns the meta object for enum '{@link extendedtosca.storage_pathEnum <em>storage path Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>storage path Enum</em>'.
	 * @see extendedtosca.storage_pathEnum
	 * @generated
	 */
	EEnum getstorage_pathEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtendedtoscaFactory getExtendedtoscaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link extendedtosca.impl.arrayCredentialImpl <em>array Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.arrayCredentialImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayCredential()
		 * @generated
		 */
		EClass ARRAY_CREDENTIAL = eINSTANCE.getarrayCredential();

		/**
		 * The meta object literal for the '<em><b>Arraycredential Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES = eINSTANCE.getarrayCredential_ArraycredentialValues();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.arrayPortSpecImpl <em>array Port Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.arrayPortSpecImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayPortSpec()
		 * @generated
		 */
		EClass ARRAY_PORT_SPEC = eINSTANCE.getarrayPortSpec();

		/**
		 * The meta object literal for the '<em><b>Arrayportspec Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_PORT_SPEC__ARRAYPORTSPEC_VALUES = eINSTANCE.getarrayPortSpec_ArrayportspecValues();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.arrayversionImpl <em>arrayversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.arrayversionImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayversion()
		 * @generated
		 */
		EClass ARRAYVERSION = eINSTANCE.getarrayversion();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAYVERSION__VALUES = eINSTANCE.getarrayversion_Values();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.arrayintegerImpl <em>arrayinteger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.arrayintegerImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayinteger()
		 * @generated
		 */
		EClass ARRAYINTEGER = eINSTANCE.getarrayinteger();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAYINTEGER__VALUES = eINSTANCE.getarrayinteger_Values();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_somecapImpl <em>Tosca capabilities somecap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_somecapImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_somecap()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_SOMECAP = eINSTANCE.getTosca_capabilities_somecap();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_indigo_endpointImpl <em>Tosca capabilities indigo endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_indigo_endpointImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_indigo_endpoint()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_INDIGO_ENDPOINT = eINSTANCE.getTosca_capabilities_indigo_endpoint();

		/**
		 * The meta object literal for the '<em><b>Credential</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_CAPABILITIES_INDIGO_ENDPOINT__CREDENTIAL = eINSTANCE.getTosca_capabilities_indigo_endpoint_Credential();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_haImpl <em>Tosca capabilities ha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_haImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_ha()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_HA = eINSTANCE.getTosca_capabilities_ha();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_container_dockerImpl <em>Tosca capabilities container docker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_container_dockerImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_container_docker()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_CONTAINER_DOCKER = eINSTANCE.getTosca_capabilities_container_docker();

		/**
		 * The meta object literal for the '<em><b>Publish All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL = eINSTANCE.getTosca_capabilities_container_docker_PublishAll();

		/**
		 * The meta object literal for the '<em><b>Publish Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS = eINSTANCE.getTosca_capabilities_container_docker_PublishPorts();

		/**
		 * The meta object literal for the '<em><b>Expose Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS = eINSTANCE.getTosca_capabilities_container_docker_ExposePorts();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES = eINSTANCE.getTosca_capabilities_container_docker_Volumes();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION = eINSTANCE.getTosca_capabilities_container_docker_Version();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_containerchildImpl <em>Tosca capabilities containerchild</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_containerchildImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_containerchild()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_CONTAINERCHILD = eINSTANCE.getTosca_capabilities_containerchild();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_somechildcapImpl <em>Tosca capabilities somechildcap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_somechildcapImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_somechildcap()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_SOMECHILDCAP = eINSTANCE.getTosca_capabilities_somechildcap();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_computewithpropImpl <em>Tosca nodes computewithprop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_computewithpropImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_computewithprop()
		 * @generated
		 */
		EClass TOSCA_NODES_COMPUTEWITHPROP = eINSTANCE.getTosca_nodes_computewithprop();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_COMPUTEWITHPROP__TEST = eINSTANCE.getTosca_nodes_computewithprop_Test();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_webapplication_paypalpizzastoreImpl <em>Tosca nodes webapplication paypalpizzastore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_webapplication_paypalpizzastoreImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webapplication_paypalpizzastore()
		 * @generated
		 */
		EClass TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE = eINSTANCE.getTosca_nodes_webapplication_paypalpizzastore();

		/**
		 * The meta object literal for the '<em><b>Github Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL = eINSTANCE.getTosca_nodes_webapplication_paypalpizzastore_GithubUrl();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_network_networkImpl <em>Tosca nodes network network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_network_networkImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_network_network()
		 * @generated
		 */
		EClass TOSCA_NODES_NETWORK_NETWORK = eINSTANCE.getTosca_nodes_network_network();

		/**
		 * The meta object literal for the '<em><b>Physical Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK = eINSTANCE.getTosca_nodes_network_network_PhysicalNetwork();

		/**
		 * The meta object literal for the '<em><b>Segmentation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID = eINSTANCE.getTosca_nodes_network_network_SegmentationId();

		/**
		 * The meta object literal for the '<em><b>Network Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID = eINSTANCE.getTosca_nodes_network_network_NetworkId();

		/**
		 * The meta object literal for the '<em><b>Ip Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__IP_VERSION = eINSTANCE.getTosca_nodes_network_network_IpVersion();

		/**
		 * The meta object literal for the '<em><b>Start Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__START_IP = eINSTANCE.getTosca_nodes_network_network_StartIp();

		/**
		 * The meta object literal for the '<em><b>Network Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME = eINSTANCE.getTosca_nodes_network_network_NetworkName();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__CIDR = eINSTANCE.getTosca_nodes_network_network_Cidr();

		/**
		 * The meta object literal for the '<em><b>Gateway Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP = eINSTANCE.getTosca_nodes_network_network_GatewayIp();

		/**
		 * The meta object literal for the '<em><b>Network Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE = eINSTANCE.getTosca_nodes_network_network_NetworkType();

		/**
		 * The meta object literal for the '<em><b>End Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_NETWORK__END_IP = eINSTANCE.getTosca_nodes_network_network_EndIp();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_NETWORK_NETWORK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_network_network__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_container_application_dockerImpl <em>Tosca nodes container application docker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_container_application_dockerImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_container_application_docker()
		 * @generated
		 */
		EClass TOSCA_NODES_CONTAINER_APPLICATION_DOCKER = eINSTANCE.getTosca_nodes_container_application_docker();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_kibanaImpl <em>Tosca nodes softwarecomponent kibana</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_kibanaImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_kibana()
		 * @generated
		 */
		EClass TOSCA_NODES_SOFTWARECOMPONENT_KIBANA = eINSTANCE.getTosca_nodes_softwarecomponent_kibana();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_computewithattrlistImpl <em>Tosca nodes computewithattrlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_computewithattrlistImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_computewithattrlist()
		 * @generated
		 */
		EClass TOSCA_NODES_COMPUTEWITHATTRLIST = eINSTANCE.getTosca_nodes_computewithattrlist();

		/**
		 * The meta object literal for the '<em><b>Attr List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST = eINSTANCE.getTosca_nodes_computewithattrlist_AttrList();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_logstashImpl <em>Tosca nodes softwarecomponent logstash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_logstashImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_logstash()
		 * @generated
		 */
		EClass TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH = eINSTANCE.getTosca_nodes_softwarecomponent_logstash();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Example_databasesubsystemImpl <em>Example databasesubsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Example_databasesubsystemImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getExample_databasesubsystem()
		 * @generated
		 */
		EClass EXAMPLE_DATABASESUBSYSTEM = eINSTANCE.getExample_databasesubsystem();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_collectdImpl <em>Tosca nodes softwarecomponent collectd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_collectdImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_collectd()
		 * @generated
		 */
		EClass TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD = eINSTANCE.getTosca_nodes_softwarecomponent_collectd();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_nodewithreqImpl <em>Tosca nodes nodewithreq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_nodewithreqImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_nodewithreq()
		 * @generated
		 */
		EClass TOSCA_NODES_NODEWITHREQ = eINSTANCE.getTosca_nodes_nodewithreq();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_somenode2Impl <em>Tosca nodes somenode2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_somenode2Impl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_somenode2()
		 * @generated
		 */
		EClass TOSCA_NODES_SOMENODE2 = eINSTANCE.getTosca_nodes_somenode2();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_phpImpl <em>Tosca nodes php</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_phpImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_php()
		 * @generated
		 */
		EClass TOSCA_NODES_PHP = eINSTANCE.getTosca_nodes_php();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_database_mysqlImpl <em>Tosca nodes database mysql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_database_mysqlImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_database_mysql()
		 * @generated
		 */
		EClass TOSCA_NODES_DATABASE_MYSQL = eINSTANCE.getTosca_nodes_database_mysql();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Example_queuingsubsystemImpl <em>Example queuingsubsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Example_queuingsubsystemImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getExample_queuingsubsystem()
		 * @generated
		 */
		EClass EXAMPLE_QUEUINGSUBSYSTEM = eINSTANCE.getExample_queuingsubsystem();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Example_transactionsubsystemImpl <em>Example transactionsubsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Example_transactionsubsystemImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getExample_transactionsubsystem()
		 * @generated
		 */
		EClass EXAMPLE_TRANSACTIONSUBSYSTEM = eINSTANCE.getExample_transactionsubsystem();

		/**
		 * The meta object literal for the '<em><b>Receiver Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TRANSACTIONSUBSYSTEM__RECEIVER_PORT = eINSTANCE.getExample_transactionsubsystem_ReceiverPort();

		/**
		 * The meta object literal for the '<em><b>Mq Service Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TRANSACTIONSUBSYSTEM__MQ_SERVICE_IP = eINSTANCE.getExample_transactionsubsystem_MqServiceIp();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_abstractmysqlImpl <em>Tosca nodes abstractmysql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_abstractmysqlImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_abstractmysql()
		 * @generated
		 */
		EClass TOSCA_NODES_ABSTRACTMYSQL = eINSTANCE.getTosca_nodes_abstractmysql();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_mysqlImpl <em>Tosca nodes mysql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_mysqlImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_mysql()
		 * @generated
		 */
		EClass TOSCA_NODES_MYSQL = eINSTANCE.getTosca_nodes_mysql();

		/**
		 * The meta object literal for the '<em><b>Storage Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_MYSQL__STORAGE_PATH = eINSTANCE.getTosca_nodes_mysql_StoragePath();

		/**
		 * The meta object literal for the '<em><b>Db User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_MYSQL__DB_USER = eINSTANCE.getTosca_nodes_mysql_DbUser();

		/**
		 * The meta object literal for the '<em><b>Bind Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_MYSQL__BIND_ADDRESS = eINSTANCE.getTosca_nodes_mysql_BindAddress();

		/**
		 * The meta object literal for the '<em><b>Db Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_MYSQL__DB_PASSWORD = eINSTANCE.getTosca_nodes_mysql_DbPassword();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_elasticsearchImpl <em>Tosca nodes softwarecomponent elasticsearch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_elasticsearchImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_elasticsearch()
		 * @generated
		 */
		EClass TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH = eINSTANCE.getTosca_nodes_softwarecomponent_elasticsearch();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_databasewithlistparamImpl <em>Tosca nodes databasewithlistparam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_databasewithlistparamImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_databasewithlistparam()
		 * @generated
		 */
		EClass TOSCA_NODES_DATABASEWITHLISTPARAM = eINSTANCE.getTosca_nodes_databasewithlistparam();

		/**
		 * The meta object literal for the '<em><b>List Prop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP = eINSTANCE.getTosca_nodes_databasewithlistparam_ListProp();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Example_someappImpl <em>Example someapp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Example_someappImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getExample_someapp()
		 * @generated
		 */
		EClass EXAMPLE_SOMEAPP = eINSTANCE.getExample_someapp();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_nodewithcapImpl <em>Tosca nodes nodewithcap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_nodewithcapImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_nodewithcap()
		 * @generated
		 */
		EClass TOSCA_NODES_NODEWITHCAP = eINSTANCE.getTosca_nodes_nodewithcap();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_apacheImpl <em>Tosca nodes apache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_apacheImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_apache()
		 * @generated
		 */
		EClass TOSCA_NODES_APACHE = eINSTANCE.getTosca_nodes_apache();

		/**
		 * The meta object literal for the '<em><b>Document Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_APACHE__DOCUMENT_ROOT = eINSTANCE.getTosca_nodes_apache_DocumentRoot();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.RsyslogImpl <em>Rsyslog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.RsyslogImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getRsyslog()
		 * @generated
		 */
		EClass RSYSLOG = eINSTANCE.getRsyslog();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_wordpressImpl <em>Tosca nodes wordpress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_wordpressImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_wordpress()
		 * @generated
		 */
		EClass TOSCA_NODES_WORDPRESS = eINSTANCE.getTosca_nodes_wordpress();

		/**
		 * The meta object literal for the '<em><b>Zip Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_WORDPRESS__ZIP_URL = eINSTANCE.getTosca_nodes_wordpress_ZipUrl();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_network_portImpl <em>Tosca nodes network port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_network_portImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_network_port()
		 * @generated
		 */
		EClass TOSCA_NODES_NETWORK_PORT = eINSTANCE.getTosca_nodes_network_port();

		/**
		 * The meta object literal for the '<em><b>Ip Range End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_PORT__IP_RANGE_END = eINSTANCE.getTosca_nodes_network_port_IpRangeEnd();

		/**
		 * The meta object literal for the '<em><b>Ip Range Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_PORT__IP_RANGE_START = eINSTANCE.getTosca_nodes_network_port_IpRangeStart();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_PORT__IP_ADDRESS = eINSTANCE.getTosca_nodes_network_port_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_PORT__IS_DEFAULT = eINSTANCE.getTosca_nodes_network_port_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_NETWORK_PORT__ORDER = eINSTANCE.getTosca_nodes_network_port_Order();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_NETWORK_PORT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_network_port__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_computewithcapwithattrImpl <em>Tosca nodes computewithcapwithattr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_computewithcapwithattrImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_computewithcapwithattr()
		 * @generated
		 */
		EClass TOSCA_NODES_COMPUTEWITHCAPWITHATTR = eINSTANCE.getTosca_nodes_computewithcapwithattr();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_rsyslogImpl <em>Tosca nodes softwarecomponent rsyslog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_rsyslogImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_rsyslog()
		 * @generated
		 */
		EClass TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG = eINSTANCE.getTosca_nodes_softwarecomponent_rsyslog();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_hacomputeImpl <em>Tosca nodes hacompute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_hacomputeImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_hacompute()
		 * @generated
		 */
		EClass TOSCA_NODES_HACOMPUTE = eINSTANCE.getTosca_nodes_hacompute();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_somenodeImpl <em>Tosca nodes somenode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_somenodeImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_somenode()
		 * @generated
		 */
		EClass TOSCA_NODES_SOMENODE = eINSTANCE.getTosca_nodes_somenode();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_webserver_nodejsImpl <em>Tosca nodes webserver nodejs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_webserver_nodejsImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webserver_nodejs()
		 * @generated
		 */
		EClass TOSCA_NODES_WEBSERVER_NODEJS = eINSTANCE.getTosca_nodes_webserver_nodejs();

		/**
		 * The meta object literal for the '<em><b>Github Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_WEBSERVER_NODEJS__GITHUB_URL = eINSTANCE.getTosca_nodes_webserver_nodejs_GithubUrl();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_dbms_mysqlImpl <em>Tosca nodes dbms mysql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_dbms_mysqlImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_dbms_mysql()
		 * @generated
		 */
		EClass TOSCA_NODES_DBMS_MYSQL = eINSTANCE.getTosca_nodes_dbms_mysql();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Mycompany_mytypes_myscalingpolicyImpl <em>Mycompany mytypes myscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Mycompany_mytypes_myscalingpolicyImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getMycompany_mytypes_myscalingpolicy()
		 * @generated
		 */
		EClass MYCOMPANY_MYTYPES_MYSCALINGPOLICY = eINSTANCE.getMycompany_mytypes_myscalingpolicy();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Test_relation_connectsImpl <em>Test relation connects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Test_relation_connectsImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTest_relation_connects()
		 * @generated
		 */
		EClass TEST_RELATION_CONNECTS = eINSTANCE.getTest_relation_connects();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_network_bindstoImpl <em>Tosca relationships network bindsto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_network_bindstoImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_network_bindsto()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_NETWORK_BINDSTO = eINSTANCE.getTosca_relationships_network_bindsto();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_haImpl <em>Tosca relationships ha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_haImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_ha()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_HA = eINSTANCE.getTosca_relationships_ha();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.MyattachestoImpl <em>Myattachesto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.MyattachestoImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getMyattachesto()
		 * @generated
		 */
		EClass MYATTACHESTO = eINSTANCE.getMyattachesto();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_network_linkstoImpl <em>Tosca relationships network linksto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_network_linkstoImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_network_linksto()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_NETWORK_LINKSTO = eINSTANCE.getTosca_relationships_network_linksto();

		/**
		 * The meta object literal for the '{@link extendedtosca.ip_versionEnum <em>ip version Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.ip_versionEnum
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getip_versionEnum()
		 * @generated
		 */
		EEnum IP_VERSION_ENUM = eINSTANCE.getip_versionEnum();

		/**
		 * The meta object literal for the '{@link extendedtosca.storage_pathEnum <em>storage path Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.storage_pathEnum
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getstorage_pathEnum()
		 * @generated
		 */
		EEnum STORAGE_PATH_ENUM = eINSTANCE.getstorage_pathEnum();

	}

} //ExtendedtoscaPackage
