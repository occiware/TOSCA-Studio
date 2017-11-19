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

import org.eclipse.cmf.occi.sla.SlaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	String eNS_URI = "http://org.occi/tosca/ecore";

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
	 * The meta object id for the '{@link extendedtosca.impl.arraystringImpl <em>arraystring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.arraystringImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarraystring()
	 * @generated
	 */
	int ARRAYSTRING = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYSTRING__VALUES = 0;

	/**
	 * The number of structural features of the '<em>arraystring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYSTRING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>arraystring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYSTRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.NetworkInfoImpl <em>Network Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.NetworkInfoImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getNetworkInfo()
	 * @generated
	 */
	int NETWORK_INFO = 1;

	/**
	 * The feature id for the '<em><b>Networkid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INFO__NETWORKID = 0;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INFO__ADDRESSES = 1;

	/**
	 * The feature id for the '<em><b>Networkname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INFO__NETWORKNAME = 2;

	/**
	 * The number of structural features of the '<em>Network Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INFO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Network Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.PortInfoImpl <em>Port Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.PortInfoImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getPortInfo()
	 * @generated
	 */
	int PORT_INFO = 2;

	/**
	 * The feature id for the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INFO__PORTNAME = 0;

	/**
	 * The feature id for the '<em><b>Networkid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INFO__NETWORKID = 1;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INFO__ADDRESSES = 2;

	/**
	 * The feature id for the '<em><b>Macaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INFO__MACADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Portid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INFO__PORTID = 4;

	/**
	 * The number of structural features of the '<em>Port Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INFO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Port Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.CredentialImpl <em>Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.CredentialImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getCredential()
	 * @generated
	 */
	int CREDENTIAL = 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__KEYS = 1;

	/**
	 * The feature id for the '<em><b>Tokentype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__TOKENTYPE = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__USER = 3;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__TOKEN = 4;

	/**
	 * The number of structural features of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.PortSpecImpl <em>Port Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.PortSpecImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getPortSpec()
	 * @generated
	 */
	int PORT_SPEC = 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Targetrange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC__TARGETRANGE = 1;

	/**
	 * The feature id for the '<em><b>Sourcerange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC__SOURCERANGE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Port Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Port Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.arrayCredentialImpl <em>array Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.arrayCredentialImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayCredential()
	 * @generated
	 */
	int ARRAY_CREDENTIAL = 5;

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
	 * The meta object id for the '{@link extendedtosca.impl.arrayintegerImpl <em>arrayinteger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.arrayintegerImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayinteger()
	 * @generated
	 */
	int ARRAYINTEGER = 6;

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
	 * The meta object id for the '{@link extendedtosca.impl.arrayPortSpecImpl <em>array Port Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.arrayPortSpecImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarrayPortSpec()
	 * @generated
	 */
	int ARRAY_PORT_SPEC = 7;

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
	int ARRAYVERSION = 8;

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
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_rootImpl <em>Tosca capabilities root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_rootImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_root()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_nodeImpl <em>Tosca capabilities node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_nodeImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_node()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_NODE = 10;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_endpointImpl <em>Tosca capabilities endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_endpointImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_endpoint()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ENDPOINT = 11;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__PORT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__INITIATOR = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__SECURE = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__PORTS = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__URL_PATH = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tosca capabilities endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Tosca capabilities endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_scalableImpl <em>Tosca capabilities scalable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_scalableImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_scalable()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_SCALABLE = 12;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tosca capabilities scalable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tosca capabilities scalable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_network_bindableImpl <em>Tosca capabilities network bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_network_bindableImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_network_bindable()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE = 13;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE__MIXIN = TOSCA_CAPABILITIES_NODE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE__ENTITY = TOSCA_CAPABILITIES_NODE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE__ATTRIBUTES = TOSCA_CAPABILITIES_NODE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities network bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE_FEATURE_COUNT = TOSCA_CAPABILITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities network bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE_OPERATION_COUNT = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_containerImpl <em>Tosca capabilities container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_containerImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_container()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca capabilities container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca capabilities container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_endpoint_databaseImpl <em>Tosca capabilities endpoint database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_endpoint_databaseImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_endpoint_database()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE = 15;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__MIXIN = TOSCA_CAPABILITIES_ENDPOINT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__ENTITY = TOSCA_CAPABILITIES_ENDPOINT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__ATTRIBUTES = TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__PORT_NAME = TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__PROTOCOL = TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__PORT = TOSCA_CAPABILITIES_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__INITIATOR = TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__NETWORK_NAME = TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__SECURE = TOSCA_CAPABILITIES_ENDPOINT__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__PORTS = TOSCA_CAPABILITIES_ENDPOINT__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__URL_PATH = TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;

	/**
	 * The number of structural features of the '<em>Tosca capabilities endpoint database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE_FEATURE_COUNT = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities endpoint database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE_OPERATION_COUNT = TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_endpoint_publicImpl <em>Tosca capabilities endpoint public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_endpoint_publicImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_endpoint_public()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC = 16;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__MIXIN = TOSCA_CAPABILITIES_ENDPOINT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__ENTITY = TOSCA_CAPABILITIES_ENDPOINT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__ATTRIBUTES = TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__PORT_NAME = TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__PROTOCOL = TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__PORT = TOSCA_CAPABILITIES_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__INITIATOR = TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__NETWORK_NAME = TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__SECURE = TOSCA_CAPABILITIES_ENDPOINT__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__PORTS = TOSCA_CAPABILITIES_ENDPOINT__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__URL_PATH = TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;

	/**
	 * The feature id for the '<em><b>Floating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dns Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tosca capabilities endpoint public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC_FEATURE_COUNT = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tosca capabilities endpoint public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC_OPERATION_COUNT = TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_endpoint_adminImpl <em>Tosca capabilities endpoint admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_endpoint_adminImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_endpoint_admin()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN = 17;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__MIXIN = TOSCA_CAPABILITIES_ENDPOINT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__ENTITY = TOSCA_CAPABILITIES_ENDPOINT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__ATTRIBUTES = TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__PORT_NAME = TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__PROTOCOL = TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__PORT = TOSCA_CAPABILITIES_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__INITIATOR = TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__NETWORK_NAME = TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__SECURE = TOSCA_CAPABILITIES_ENDPOINT__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__PORTS = TOSCA_CAPABILITIES_ENDPOINT__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__URL_PATH = TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;

	/**
	 * The number of structural features of the '<em>Tosca capabilities endpoint admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN_FEATURE_COUNT = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities endpoint admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN_OPERATION_COUNT = TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_operatingsystemImpl <em>Tosca capabilities operatingsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_operatingsystemImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_operatingsystem()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM = 18;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__TYPE = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__DISTRIBUTION = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__VERSION = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tosca capabilities operatingsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tosca capabilities operatingsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_attachmentImpl <em>Tosca capabilities attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_attachmentImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_attachment()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT = 19;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_rootImpl <em>Tosca nodes root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_rootImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_root()
	 * @generated
	 */
	int TOSCA_NODES_ROOT = 20;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT__MIXIN = TOSCA_CAPABILITIES_NODE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT__ENTITY = TOSCA_CAPABILITIES_NODE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT__ATTRIBUTES = TOSCA_CAPABILITIES_NODE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca nodes root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT_FEATURE_COUNT = TOSCA_CAPABILITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT___CREATE = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT___CONFIGURE = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT___DELETE = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tosca nodes root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT_OPERATION_COUNT = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_webapplicationImpl <em>Tosca nodes webapplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_webapplicationImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webapplication()
	 * @generated
	 */
	int TOSCA_NODES_WEBAPPLICATION = 21;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Context Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Tosca nodes webapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes webapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponentImpl <em>Tosca nodes softwarecomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponentImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT = 22;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_dbmsImpl <em>Tosca nodes dbms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_dbmsImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_dbms()
	 * @generated
	 */
	int TOSCA_NODES_DBMS = 23;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__DISK_SIZE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__PORT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__ROOT_PASSWORD = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tosca nodes dbms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Database</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___SOURCE_MUST_BE_DATABASE__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes dbms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_objectstorageImpl <em>Tosca nodes objectstorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_objectstorageImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_objectstorage()
	 * @generated
	 */
	int TOSCA_NODES_OBJECTSTORAGE = 24;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__SIZE = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Tosca nodes objectstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes objectstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_computeImpl <em>Tosca nodes compute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_computeImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_compute()
	 * @generated
	 */
	int TOSCA_NODES_COMPUTE = 25;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__MIN_INSTANCES = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__MAX_INSTANCES = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__TYPE = TOSCA_NODES_ROOT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__DISTRIBUTION = TOSCA_NODES_ROOT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__VERSION = TOSCA_NODES_ROOT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__DISK_SIZE = TOSCA_NODES_ROOT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS = TOSCA_NODES_ROOT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS = TOSCA_NODES_ROOT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__NETWORKS = TOSCA_NODES_ROOT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Tosca nodes compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Source Must Be Software Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_loadbalancerImpl <em>Tosca nodes loadbalancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_loadbalancerImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_loadbalancer()
	 * @generated
	 */
	int TOSCA_NODES_LOADBALANCER = 26;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Floating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__FLOATING = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dns Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__DNS_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__ALGORITHM = TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Tosca nodes loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_webserverImpl <em>Tosca nodes webserver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_webserverImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webserver()
	 * @generated
	 */
	int TOSCA_NODES_WEBSERVER = 27;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__PORT_NAME = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__PROTOCOL = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__PORT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__INITIATOR = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__NETWORK_NAME = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__SECURE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__PORTS = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__URL_PATH = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__DISK_SIZE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Tosca nodes webserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Web Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___SOURCE_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes webserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_databaseImpl <em>Tosca nodes database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_databaseImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_database()
	 * @generated
	 */
	int TOSCA_NODES_DATABASE = 28;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PASSWORD = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__USER = TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Tosca nodes database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_container_applicationImpl <em>Tosca nodes container application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_container_applicationImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_container_application()
	 * @generated
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION = 29;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca nodes container application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes container application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_container_runtimeImpl <em>Tosca nodes container runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_container_runtimeImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_container_runtime()
	 * @generated
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME = 30;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__MIN_INSTANCES = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__MAX_INSTANCES = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__DEFAULT_INSTANCES = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__DISK_SIZE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tosca nodes container runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes container runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_blockstorageImpl <em>Tosca nodes blockstorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_blockstorageImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_blockstorage()
	 * @generated
	 */
	int TOSCA_NODES_BLOCKSTORAGE = 31;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__SIZE = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volume Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__VOLUME_ID = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Snapshot Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__SNAPSHOT_ID = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tosca nodes blockstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes blockstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_policies_rootImpl <em>Tosca policies root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_policies_rootImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_root()
	 * @generated
	 */
	int TOSCA_POLICIES_ROOT = 32;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__MIXIN = SlaPackage.AGREEMENT_TERM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__ENTITY = SlaPackage.AGREEMENT_TERM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__ATTRIBUTES = SlaPackage.AGREEMENT_TERM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT_FEATURE_COUNT = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT_OPERATION_COUNT = SlaPackage.AGREEMENT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_policies_updateImpl <em>Tosca policies update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_policies_updateImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_update()
	 * @generated
	 */
	int TOSCA_POLICIES_UPDATE = 33;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__MIXIN = TOSCA_POLICIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__ENTITY = TOSCA_POLICIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__ATTRIBUTES = TOSCA_POLICIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__OCCI_AGREEMENT_TERM_TYPE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__OCCI_AGREEMENT_TERM_STATE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__OCCI_AGREEMENT_TERM_DESC = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__OCCI_AGREEMENT_TERM_REMEDY = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE_FEATURE_COUNT = TOSCA_POLICIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE_OPERATION_COUNT = TOSCA_POLICIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_policies_placementImpl <em>Tosca policies placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_policies_placementImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_placement()
	 * @generated
	 */
	int TOSCA_POLICIES_PLACEMENT = 34;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__MIXIN = TOSCA_POLICIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__ENTITY = TOSCA_POLICIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__ATTRIBUTES = TOSCA_POLICIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__OCCI_AGREEMENT_TERM_TYPE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__OCCI_AGREEMENT_TERM_STATE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__OCCI_AGREEMENT_TERM_DESC = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__OCCI_AGREEMENT_TERM_REMEDY = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT_FEATURE_COUNT = TOSCA_POLICIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT_OPERATION_COUNT = TOSCA_POLICIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_policies_scalingImpl <em>Tosca policies scaling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_policies_scalingImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_scaling()
	 * @generated
	 */
	int TOSCA_POLICIES_SCALING = 35;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__MIXIN = TOSCA_POLICIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__ENTITY = TOSCA_POLICIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__ATTRIBUTES = TOSCA_POLICIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__OCCI_AGREEMENT_TERM_TYPE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__OCCI_AGREEMENT_TERM_STATE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__OCCI_AGREEMENT_TERM_DESC = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__OCCI_AGREEMENT_TERM_REMEDY = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING_FEATURE_COUNT = TOSCA_POLICIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING_OPERATION_COUNT = TOSCA_POLICIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_policies_performanceImpl <em>Tosca policies performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_policies_performanceImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_performance()
	 * @generated
	 */
	int TOSCA_POLICIES_PERFORMANCE = 36;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__MIXIN = TOSCA_POLICIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__ENTITY = TOSCA_POLICIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__ATTRIBUTES = TOSCA_POLICIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__OCCI_AGREEMENT_TERM_TYPE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__OCCI_AGREEMENT_TERM_STATE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__OCCI_AGREEMENT_TERM_DESC = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__OCCI_AGREEMENT_TERM_REMEDY = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE_FEATURE_COUNT = TOSCA_POLICIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE_OPERATION_COUNT = TOSCA_POLICIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_groups_rootImpl <em>Tosca groups root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_groups_rootImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_groups_root()
	 * @generated
	 */
	int TOSCA_GROUPS_ROOT = 37;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca groups root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca groups root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_interfaces_rootImpl <em>Tosca interfaces root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_interfaces_rootImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_interfaces_root()
	 * @generated
	 */
	int TOSCA_INTERFACES_ROOT = 38;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca interfaces root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca interfaces root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_interfaces_relationship_configureImpl <em>Tosca interfaces relationship configure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_interfaces_relationship_configureImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_interfaces_relationship_configure()
	 * @generated
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE = 39;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE__MIXIN = TOSCA_INTERFACES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE__ENTITY = TOSCA_INTERFACES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE__ATTRIBUTES = TOSCA_INTERFACES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca interfaces relationship configure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE_FEATURE_COUNT = TOSCA_INTERFACES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Pre configure source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_SOURCE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Pre configure target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_TARGET = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Post configure source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_SOURCE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Post configure target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_TARGET = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___REMOVE_TARGET = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_TARGET = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_SOURCE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Target changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___TARGET_CHANGED = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Tosca interfaces relationship configure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE_OPERATION_COUNT = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_interfaces_node_lifecycle_standardImpl <em>Tosca interfaces node lifecycle standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_interfaces_node_lifecycle_standardImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_interfaces_node_lifecycle_standard()
	 * @generated
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD = 40;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD__MIXIN = TOSCA_INTERFACES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD__ENTITY = TOSCA_INTERFACES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD__ATTRIBUTES = TOSCA_INTERFACES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca interfaces node lifecycle standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD_FEATURE_COUNT = TOSCA_INTERFACES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CREATE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CONFIGURE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___DELETE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tosca interfaces node lifecycle standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD_OPERATION_COUNT = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_rootImpl <em>Tosca relationships root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_rootImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_root()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_ROOT = 41;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__STATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tosca relationships root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca relationships root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_connectstoImpl <em>Tosca relationships connectsto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_connectstoImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_connectsto()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO = 42;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__MIXIN = TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__ENTITY = TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__ATTRIBUTES = TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__TOSCA_NAME = TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__STATE = TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__TOSCA_ID = TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__CREDENTIAL = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca relationships connectsto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO_FEATURE_COUNT = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca relationships connectsto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO_OPERATION_COUNT = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_routestoImpl <em>Tosca relationships routesto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_routestoImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_routesto()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO = 43;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__MIXIN = TOSCA_RELATIONSHIPS_CONNECTSTO__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__ENTITY = TOSCA_RELATIONSHIPS_CONNECTSTO__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__ATTRIBUTES = TOSCA_RELATIONSHIPS_CONNECTSTO__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__TOSCA_NAME = TOSCA_RELATIONSHIPS_CONNECTSTO__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__STATE = TOSCA_RELATIONSHIPS_CONNECTSTO__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__TOSCA_ID = TOSCA_RELATIONSHIPS_CONNECTSTO__TOSCA_ID;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__CREDENTIAL = TOSCA_RELATIONSHIPS_CONNECTSTO__CREDENTIAL;

	/**
	 * The number of structural features of the '<em>Tosca relationships routesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO_FEATURE_COUNT = TOSCA_RELATIONSHIPS_CONNECTSTO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_CONNECTSTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Load Balancer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO___SOURCE_MUST_BE_LOAD_BALANCER__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_CONNECTSTO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca relationships routesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO_OPERATION_COUNT = TOSCA_RELATIONSHIPS_CONNECTSTO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_attachestoImpl <em>Tosca relationships attachesto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_attachestoImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_attachesto()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO = 44;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__MIXIN = TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__ENTITY = TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__ATTRIBUTES = TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__TOSCA_NAME = TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__STATE = TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__TOSCA_ID = TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__LOCATION = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca relationships attachesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO_FEATURE_COUNT = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Source Must Be Compute And Target Must Be Block Storage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO___SOURCE_MUST_BE_COMPUTE_AND_TARGET_MUST_BE_BLOCK_STORAGE__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca relationships attachesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO_OPERATION_COUNT = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_hostedonImpl <em>Tosca relationships hostedon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_hostedonImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_hostedon()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON = 45;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__MIXIN = TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__ENTITY = TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__ATTRIBUTES = TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__TOSCA_NAME = TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__STATE = TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__TOSCA_ID = TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The number of structural features of the '<em>Tosca relationships hostedon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON_FEATURE_COUNT = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Web Server And Target Must Be Web Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_WEB_SERVER_AND_TARGET_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Source Must Be Container Application And Target Must Be Container Runtime</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_CONTAINER_APPLICATION_AND_TARGET_MUST_BE_CONTAINER_RUNTIME__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source Must Be Software Component And Target Must Be Compute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_SOFTWARE_COMPONENT_AND_TARGET_MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Source Must Be Database And Target Must Be DBMS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_DATABASE_AND_TARGET_MUST_BE_DBMS__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tosca relationships hostedon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON_OPERATION_COUNT = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_dependsonImpl <em>Tosca relationships dependson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_dependsonImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_dependson()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON = 46;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__MIXIN = TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__ENTITY = TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__ATTRIBUTES = TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__TOSCA_NAME = TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__STATE = TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__TOSCA_ID = TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The number of structural features of the '<em>Tosca relationships dependson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON_FEATURE_COUNT = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Node And Target Must Be Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON___SOURCE_MUST_BE_NODE_AND_TARGET_MUST_BE_NODE__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca relationships dependson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON_OPERATION_COUNT = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_indigo_endpointImpl <em>Tosca capabilities indigo endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_indigo_endpointImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_indigo_endpoint()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT = 47;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__MIXIN = TOSCA_CAPABILITIES_ENDPOINT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__ENTITY = TOSCA_CAPABILITIES_ENDPOINT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__ATTRIBUTES = TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__PORT_NAME = TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__PROTOCOL = TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__PORT = TOSCA_CAPABILITIES_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__INITIATOR = TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__NETWORK_NAME = TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__SECURE = TOSCA_CAPABILITIES_ENDPOINT__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__PORTS = TOSCA_CAPABILITIES_ENDPOINT__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__URL_PATH = TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT__CREDENTIAL = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca capabilities indigo endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT_FEATURE_COUNT = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca capabilities indigo endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_INDIGO_ENDPOINT_OPERATION_COUNT = TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_somecapImpl <em>Tosca capabilities somecap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_somecapImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_somecap()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_SOMECAP = 48;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP__MIXIN = TOSCA_CAPABILITIES_CONTAINER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP__ENTITY = TOSCA_CAPABILITIES_CONTAINER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP__ATTRIBUTES = TOSCA_CAPABILITIES_CONTAINER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP__DISK_SIZE = TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP__TYPE = TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca capabilities somecap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP_FEATURE_COUNT = TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca capabilities somecap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECAP_OPERATION_COUNT = TOSCA_CAPABILITIES_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_haImpl <em>Tosca capabilities ha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_haImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_ha()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_HA = 49;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities ha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities ha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_HA_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_containerchildImpl <em>Tosca capabilities containerchild</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_containerchildImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_containerchild()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD = 50;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD__MIXIN = TOSCA_CAPABILITIES_CONTAINER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD__ENTITY = TOSCA_CAPABILITIES_CONTAINER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD__ATTRIBUTES = TOSCA_CAPABILITIES_CONTAINER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD__DISK_SIZE = TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE;

	/**
	 * The number of structural features of the '<em>Tosca capabilities containerchild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD_FEATURE_COUNT = TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities containerchild</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINERCHILD_OPERATION_COUNT = TOSCA_CAPABILITIES_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_somechildcapImpl <em>Tosca capabilities somechildcap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_somechildcapImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_somechildcap()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_SOMECHILDCAP = 51;

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
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECHILDCAP__DISK_SIZE = TOSCA_CAPABILITIES_SOMECAP__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SOMECHILDCAP__TYPE = TOSCA_CAPABILITIES_SOMECAP__TYPE;

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
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_database_mysqlImpl <em>Tosca nodes database mysql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_database_mysqlImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_database_mysql()
	 * @generated
	 */
	int TOSCA_NODES_DATABASE_MYSQL = 52;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__MIXIN = TOSCA_NODES_DATABASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__ENTITY = TOSCA_NODES_DATABASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__ATTRIBUTES = TOSCA_NODES_DATABASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PORT_NAME = TOSCA_NODES_DATABASE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PROTOCOL = TOSCA_NODES_DATABASE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PORT = TOSCA_NODES_DATABASE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__INITIATOR = TOSCA_NODES_DATABASE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__NETWORK_NAME = TOSCA_NODES_DATABASE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__SECURE = TOSCA_NODES_DATABASE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PORTS = TOSCA_NODES_DATABASE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__URL_PATH = TOSCA_NODES_DATABASE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__PASSWORD = TOSCA_NODES_DATABASE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__NAME = TOSCA_NODES_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL__USER = TOSCA_NODES_DATABASE__USER;

	/**
	 * The number of structural features of the '<em>Tosca nodes database mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL_FEATURE_COUNT = TOSCA_NODES_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL___CREATE = TOSCA_NODES_DATABASE___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL___CONFIGURE = TOSCA_NODES_DATABASE___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL___DELETE = TOSCA_NODES_DATABASE___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_DATABASE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes database mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_MYSQL_OPERATION_COUNT = TOSCA_NODES_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_computewithpropImpl <em>Tosca nodes computewithprop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_computewithpropImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_computewithprop()
	 * @generated
	 */
	int TOSCA_NODES_COMPUTEWITHPROP = 53;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__MIXIN = TOSCA_NODES_COMPUTE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__ENTITY = TOSCA_NODES_COMPUTE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__ATTRIBUTES = TOSCA_NODES_COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__MIN_INSTANCES = TOSCA_NODES_COMPUTE__MIN_INSTANCES;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__MAX_INSTANCES = TOSCA_NODES_COMPUTE__MAX_INSTANCES;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__DEFAULT_INSTANCES = TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PORT_NAME = TOSCA_NODES_COMPUTE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PROTOCOL = TOSCA_NODES_COMPUTE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PORT = TOSCA_NODES_COMPUTE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__INITIATOR = TOSCA_NODES_COMPUTE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__NETWORK_NAME = TOSCA_NODES_COMPUTE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__SECURE = TOSCA_NODES_COMPUTE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PORTS = TOSCA_NODES_COMPUTE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__URL_PATH = TOSCA_NODES_COMPUTE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__TYPE = TOSCA_NODES_COMPUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__DISTRIBUTION = TOSCA_NODES_COMPUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__VERSION = TOSCA_NODES_COMPUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__DISK_SIZE = TOSCA_NODES_COMPUTE__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PRIVATE_ADDRESS = TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__PUBLIC_ADDRESS = TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__NETWORKS = TOSCA_NODES_COMPUTE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP__TEST = TOSCA_NODES_COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes computewithprop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP_FEATURE_COUNT = TOSCA_NODES_COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP___CREATE = TOSCA_NODES_COMPUTE___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP___CONFIGURE = TOSCA_NODES_COMPUTE___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP___DELETE = TOSCA_NODES_COMPUTE___DELETE;

	/**
	 * The operation id for the '<em>Source Must Be Software Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes computewithprop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHPROP_OPERATION_COUNT = TOSCA_NODES_COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_elasticsearchImpl <em>Tosca nodes softwarecomponent elasticsearch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_elasticsearchImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_elasticsearch()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH = 54;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__PORT_NAME = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__PROTOCOL = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__PORT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__INITIATOR = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__NETWORK_NAME = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__SECURE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__PORTS = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH__URL_PATH = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent elasticsearch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent elasticsearch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_databasewithlistparamImpl <em>Tosca nodes databasewithlistparam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_databasewithlistparamImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_databasewithlistparam()
	 * @generated
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM = 55;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__MIXIN = TOSCA_NODES_DATABASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__ENTITY = TOSCA_NODES_DATABASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__ATTRIBUTES = TOSCA_NODES_DATABASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PORT_NAME = TOSCA_NODES_DATABASE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PROTOCOL = TOSCA_NODES_DATABASE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PORT = TOSCA_NODES_DATABASE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__INITIATOR = TOSCA_NODES_DATABASE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__NETWORK_NAME = TOSCA_NODES_DATABASE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__SECURE = TOSCA_NODES_DATABASE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PORTS = TOSCA_NODES_DATABASE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__URL_PATH = TOSCA_NODES_DATABASE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__PASSWORD = TOSCA_NODES_DATABASE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__NAME = TOSCA_NODES_DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__USER = TOSCA_NODES_DATABASE__USER;

	/**
	 * The feature id for the '<em><b>List Prop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP = TOSCA_NODES_DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes databasewithlistparam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM_FEATURE_COUNT = TOSCA_NODES_DATABASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM___CREATE = TOSCA_NODES_DATABASE___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM___CONFIGURE = TOSCA_NODES_DATABASE___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM___DELETE = TOSCA_NODES_DATABASE___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_DATABASE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes databasewithlistparam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASEWITHLISTPARAM_OPERATION_COUNT = TOSCA_NODES_DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_webapplication_paypalpizzastoreImpl <em>Tosca nodes webapplication paypalpizzastore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_webapplication_paypalpizzastoreImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webapplication_paypalpizzastore()
	 * @generated
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE = 56;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__MIXIN = TOSCA_NODES_WEBAPPLICATION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__ENTITY = TOSCA_NODES_WEBAPPLICATION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__ATTRIBUTES = TOSCA_NODES_WEBAPPLICATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__PORT_NAME = TOSCA_NODES_WEBAPPLICATION__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__PROTOCOL = TOSCA_NODES_WEBAPPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__PORT = TOSCA_NODES_WEBAPPLICATION__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__INITIATOR = TOSCA_NODES_WEBAPPLICATION__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__NETWORK_NAME = TOSCA_NODES_WEBAPPLICATION__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__SECURE = TOSCA_NODES_WEBAPPLICATION__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__PORTS = TOSCA_NODES_WEBAPPLICATION__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__URL_PATH = TOSCA_NODES_WEBAPPLICATION__URL_PATH;

	/**
	 * The feature id for the '<em><b>Context Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__CONTEXT_ROOT = TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT;

	/**
	 * The feature id for the '<em><b>Github Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL = TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes webapplication paypalpizzastore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE_FEATURE_COUNT = TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE___CREATE = TOSCA_NODES_WEBAPPLICATION___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE___CONFIGURE = TOSCA_NODES_WEBAPPLICATION___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE___DELETE = TOSCA_NODES_WEBAPPLICATION___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_WEBAPPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes webapplication paypalpizzastore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE_OPERATION_COUNT = TOSCA_NODES_WEBAPPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_webapplication_wordpressImpl <em>Tosca nodes webapplication wordpress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_webapplication_wordpressImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webapplication_wordpress()
	 * @generated
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS = 57;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__MIXIN = TOSCA_NODES_WEBAPPLICATION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ENTITY = TOSCA_NODES_WEBAPPLICATION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ATTRIBUTES = TOSCA_NODES_WEBAPPLICATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__PORT_NAME = TOSCA_NODES_WEBAPPLICATION__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__PROTOCOL = TOSCA_NODES_WEBAPPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__PORT = TOSCA_NODES_WEBAPPLICATION__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__INITIATOR = TOSCA_NODES_WEBAPPLICATION__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__NETWORK_NAME = TOSCA_NODES_WEBAPPLICATION__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__SECURE = TOSCA_NODES_WEBAPPLICATION__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__PORTS = TOSCA_NODES_WEBAPPLICATION__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__URL_PATH = TOSCA_NODES_WEBAPPLICATION__URL_PATH;

	/**
	 * The feature id for the '<em><b>Context Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__CONTEXT_ROOT = TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT;

	/**
	 * The feature id for the '<em><b>Db Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__DB_HOST = TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Admin Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_PASSWORD = TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Admin User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_USER = TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tosca nodes webapplication wordpress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS_FEATURE_COUNT = TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS___CREATE = TOSCA_NODES_WEBAPPLICATION___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS___CONFIGURE = TOSCA_NODES_WEBAPPLICATION___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS___DELETE = TOSCA_NODES_WEBAPPLICATION___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_WEBAPPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes webapplication wordpress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_WORDPRESS_OPERATION_COUNT = TOSCA_NODES_WEBAPPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_nodewithcapImpl <em>Tosca nodes nodewithcap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_nodewithcapImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_nodewithcap()
	 * @generated
	 */
	int TOSCA_NODES_NODEWITHCAP = 58;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP__DISK_SIZE = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP__TYPE = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tosca nodes nodewithcap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes nodewithcap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHCAP_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_container_application_dockerImpl <em>Tosca nodes container application docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_container_application_dockerImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_container_application_docker()
	 * @generated
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER = 59;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER__MIXIN = TOSCA_NODES_CONTAINER_APPLICATION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER__ENTITY = TOSCA_NODES_CONTAINER_APPLICATION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER__ATTRIBUTES = TOSCA_NODES_CONTAINER_APPLICATION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca nodes container application docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER_FEATURE_COUNT = TOSCA_NODES_CONTAINER_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER___CREATE = TOSCA_NODES_CONTAINER_APPLICATION___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER___CONFIGURE = TOSCA_NODES_CONTAINER_APPLICATION___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER___DELETE = TOSCA_NODES_CONTAINER_APPLICATION___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_CONTAINER_APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes container application docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_DOCKER_OPERATION_COUNT = TOSCA_NODES_CONTAINER_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_kibanaImpl <em>Tosca nodes softwarecomponent kibana</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_kibanaImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_kibana()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA = 60;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent kibana</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent kibana</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_KIBANA_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.RsyslogImpl <em>Rsyslog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.RsyslogImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getRsyslog()
	 * @generated
	 */
	int RSYSLOG = 61;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Rsyslog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Rsyslog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYSLOG_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_computewithattrlistImpl <em>Tosca nodes computewithattrlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_computewithattrlistImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_computewithattrlist()
	 * @generated
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST = 62;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__MIXIN = TOSCA_NODES_COMPUTE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__ENTITY = TOSCA_NODES_COMPUTE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__ATTRIBUTES = TOSCA_NODES_COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__MIN_INSTANCES = TOSCA_NODES_COMPUTE__MIN_INSTANCES;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__MAX_INSTANCES = TOSCA_NODES_COMPUTE__MAX_INSTANCES;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__DEFAULT_INSTANCES = TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PORT_NAME = TOSCA_NODES_COMPUTE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PROTOCOL = TOSCA_NODES_COMPUTE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PORT = TOSCA_NODES_COMPUTE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__INITIATOR = TOSCA_NODES_COMPUTE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__NETWORK_NAME = TOSCA_NODES_COMPUTE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__SECURE = TOSCA_NODES_COMPUTE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PORTS = TOSCA_NODES_COMPUTE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__URL_PATH = TOSCA_NODES_COMPUTE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__TYPE = TOSCA_NODES_COMPUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__DISTRIBUTION = TOSCA_NODES_COMPUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__VERSION = TOSCA_NODES_COMPUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__DISK_SIZE = TOSCA_NODES_COMPUTE__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PRIVATE_ADDRESS = TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__PUBLIC_ADDRESS = TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__NETWORKS = TOSCA_NODES_COMPUTE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Attr List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST = TOSCA_NODES_COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes computewithattrlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST_FEATURE_COUNT = TOSCA_NODES_COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST___CREATE = TOSCA_NODES_COMPUTE___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST___CONFIGURE = TOSCA_NODES_COMPUTE___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST___DELETE = TOSCA_NODES_COMPUTE___DELETE;

	/**
	 * The operation id for the '<em>Source Must Be Software Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes computewithattrlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHATTRLIST_OPERATION_COUNT = TOSCA_NODES_COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_logstashImpl <em>Tosca nodes softwarecomponent logstash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_logstashImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_logstash()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH = 63;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__PORT_NAME = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__PROTOCOL = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__PORT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__INITIATOR = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__NETWORK_NAME = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__SECURE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__PORTS = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH__URL_PATH = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent logstash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent logstash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_collectdImpl <em>Tosca nodes softwarecomponent collectd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_collectdImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_collectd()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD = 64;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent collectd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent collectd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_computewithcapwithattrImpl <em>Tosca nodes computewithcapwithattr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_computewithcapwithattrImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_computewithcapwithattr()
	 * @generated
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR = 65;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__MIXIN = TOSCA_NODES_COMPUTE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__ENTITY = TOSCA_NODES_COMPUTE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__ATTRIBUTES = TOSCA_NODES_COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__MIN_INSTANCES = TOSCA_NODES_COMPUTE__MIN_INSTANCES;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__MAX_INSTANCES = TOSCA_NODES_COMPUTE__MAX_INSTANCES;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__DEFAULT_INSTANCES = TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PORT_NAME = TOSCA_NODES_COMPUTE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PROTOCOL = TOSCA_NODES_COMPUTE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PORT = TOSCA_NODES_COMPUTE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__INITIATOR = TOSCA_NODES_COMPUTE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__NETWORK_NAME = TOSCA_NODES_COMPUTE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__SECURE = TOSCA_NODES_COMPUTE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PORTS = TOSCA_NODES_COMPUTE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__URL_PATH = TOSCA_NODES_COMPUTE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__TYPE = TOSCA_NODES_COMPUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__DISTRIBUTION = TOSCA_NODES_COMPUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__VERSION = TOSCA_NODES_COMPUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__DISK_SIZE = TOSCA_NODES_COMPUTE__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PRIVATE_ADDRESS = TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__PUBLIC_ADDRESS = TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__NETWORKS = TOSCA_NODES_COMPUTE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR__CREDENTIAL = TOSCA_NODES_COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes computewithcapwithattr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR_FEATURE_COUNT = TOSCA_NODES_COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR___CREATE = TOSCA_NODES_COMPUTE___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR___CONFIGURE = TOSCA_NODES_COMPUTE___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR___DELETE = TOSCA_NODES_COMPUTE___DELETE;

	/**
	 * The operation id for the '<em>Source Must Be Software Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes computewithcapwithattr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTEWITHCAPWITHATTR_OPERATION_COUNT = TOSCA_NODES_COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_nodewithreqImpl <em>Tosca nodes nodewithreq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_nodewithreqImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_nodewithreq()
	 * @generated
	 */
	int TOSCA_NODES_NODEWITHREQ = 66;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tosca nodes nodewithreq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes nodewithreq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_NODEWITHREQ_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_rsyslogImpl <em>Tosca nodes softwarecomponent rsyslog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_rsyslogImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_rsyslog()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG = 67;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent rsyslog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent rsyslog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_hacomputeImpl <em>Tosca nodes hacompute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_hacomputeImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_hacompute()
	 * @generated
	 */
	int TOSCA_NODES_HACOMPUTE = 68;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__MIXIN = TOSCA_NODES_COMPUTE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__ENTITY = TOSCA_NODES_COMPUTE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__ATTRIBUTES = TOSCA_NODES_COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__MIN_INSTANCES = TOSCA_NODES_COMPUTE__MIN_INSTANCES;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__MAX_INSTANCES = TOSCA_NODES_COMPUTE__MAX_INSTANCES;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__DEFAULT_INSTANCES = TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PORT_NAME = TOSCA_NODES_COMPUTE__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PROTOCOL = TOSCA_NODES_COMPUTE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PORT = TOSCA_NODES_COMPUTE__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__INITIATOR = TOSCA_NODES_COMPUTE__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__NETWORK_NAME = TOSCA_NODES_COMPUTE__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__SECURE = TOSCA_NODES_COMPUTE__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PORTS = TOSCA_NODES_COMPUTE__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__URL_PATH = TOSCA_NODES_COMPUTE__URL_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__TYPE = TOSCA_NODES_COMPUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__DISTRIBUTION = TOSCA_NODES_COMPUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__VERSION = TOSCA_NODES_COMPUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__DISK_SIZE = TOSCA_NODES_COMPUTE__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PRIVATE_ADDRESS = TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__PUBLIC_ADDRESS = TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE__NETWORKS = TOSCA_NODES_COMPUTE__NETWORKS;

	/**
	 * The number of structural features of the '<em>Tosca nodes hacompute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE_FEATURE_COUNT = TOSCA_NODES_COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE___CREATE = TOSCA_NODES_COMPUTE___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE___CONFIGURE = TOSCA_NODES_COMPUTE___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE___DELETE = TOSCA_NODES_COMPUTE___DELETE;

	/**
	 * The operation id for the '<em>Source Must Be Software Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes hacompute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_HACOMPUTE_OPERATION_COUNT = TOSCA_NODES_COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_somenodeImpl <em>Tosca nodes somenode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_somenodeImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_somenode()
	 * @generated
	 */
	int TOSCA_NODES_SOMENODE = 69;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Some Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE__SOME_PROP = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes somenode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes somenode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_capabilities_container_dockerImpl <em>Tosca capabilities container docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_capabilities_container_dockerImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_container_docker()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER = 70;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__MIXIN = TOSCA_CAPABILITIES_CONTAINER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__ENTITY = TOSCA_CAPABILITIES_CONTAINER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__ATTRIBUTES = TOSCA_CAPABILITIES_CONTAINER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__DISK_SIZE = TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Publish All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL = TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Publish Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS = TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expose Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS = TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES = TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION = TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tosca capabilities container docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER_FEATURE_COUNT = TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Tosca capabilities container docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_DOCKER_OPERATION_COUNT = TOSCA_CAPABILITIES_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_webserver_nodejsImpl <em>Tosca nodes webserver nodejs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_webserver_nodejsImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webserver_nodejs()
	 * @generated
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS = 71;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__MIXIN = TOSCA_NODES_WEBSERVER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__ENTITY = TOSCA_NODES_WEBSERVER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__ATTRIBUTES = TOSCA_NODES_WEBSERVER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__ADMIN_CREDENTIAL = TOSCA_NODES_WEBSERVER__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__COMPONENT_VERSION = TOSCA_NODES_WEBSERVER__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__PORT_NAME = TOSCA_NODES_WEBSERVER__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__PROTOCOL = TOSCA_NODES_WEBSERVER__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__PORT = TOSCA_NODES_WEBSERVER__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__INITIATOR = TOSCA_NODES_WEBSERVER__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__NETWORK_NAME = TOSCA_NODES_WEBSERVER__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__SECURE = TOSCA_NODES_WEBSERVER__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__PORTS = TOSCA_NODES_WEBSERVER__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__URL_PATH = TOSCA_NODES_WEBSERVER__URL_PATH;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__DISK_SIZE = TOSCA_NODES_WEBSERVER__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Github Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS__GITHUB_URL = TOSCA_NODES_WEBSERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes webserver nodejs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS_FEATURE_COUNT = TOSCA_NODES_WEBSERVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS___CREATE = TOSCA_NODES_WEBSERVER___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS___CONFIGURE = TOSCA_NODES_WEBSERVER___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS___DELETE = TOSCA_NODES_WEBSERVER___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_WEBSERVER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Web Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS___SOURCE_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_WEBSERVER___SOURCE_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes webserver nodejs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_NODEJS_OPERATION_COUNT = TOSCA_NODES_WEBSERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_somenode2Impl <em>Tosca nodes somenode2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_somenode2Impl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_somenode2()
	 * @generated
	 */
	int TOSCA_NODES_SOMENODE2 = 72;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2__DISK_SIZE = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca nodes somenode2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes somenode2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOMENODE2_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_nodes_dbms_mysqlImpl <em>Tosca nodes dbms mysql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_nodes_dbms_mysqlImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_dbms_mysql()
	 * @generated
	 */
	int TOSCA_NODES_DBMS_MYSQL = 73;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__MIXIN = TOSCA_NODES_DBMS__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__ENTITY = TOSCA_NODES_DBMS__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__ATTRIBUTES = TOSCA_NODES_DBMS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__ADMIN_CREDENTIAL = TOSCA_NODES_DBMS__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__COMPONENT_VERSION = TOSCA_NODES_DBMS__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__DISK_SIZE = TOSCA_NODES_DBMS__DISK_SIZE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__PORT = TOSCA_NODES_DBMS__PORT;

	/**
	 * The feature id for the '<em><b>Root Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL__ROOT_PASSWORD = TOSCA_NODES_DBMS__ROOT_PASSWORD;

	/**
	 * The number of structural features of the '<em>Tosca nodes dbms mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL_FEATURE_COUNT = TOSCA_NODES_DBMS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL___CREATE = TOSCA_NODES_DBMS___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL___CONFIGURE = TOSCA_NODES_DBMS___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL___DELETE = TOSCA_NODES_DBMS___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_DBMS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Database</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL___SOURCE_MUST_BE_DATABASE__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_DBMS___SOURCE_MUST_BE_DATABASE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes dbms mysql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_MYSQL_OPERATION_COUNT = TOSCA_NODES_DBMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Mycompany_mytypes_myscalingpolicyImpl <em>Mycompany mytypes myscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Mycompany_mytypes_myscalingpolicyImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getMycompany_mytypes_myscalingpolicy()
	 * @generated
	 */
	int MYCOMPANY_MYTYPES_MYSCALINGPOLICY = 74;

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
	 * The meta object id for the '{@link extendedtosca.impl.Tosca_relationships_haImpl <em>Tosca relationships ha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Tosca_relationships_haImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_ha()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_HA = 75;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__MIXIN = TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__ENTITY = TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__ATTRIBUTES = TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__TOSCA_NAME = TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__STATE = TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA__TOSCA_ID = TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The number of structural features of the '<em>Tosca relationships ha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA_FEATURE_COUNT = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca relationships ha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HA_OPERATION_COUNT = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedtosca.impl.Test_relation_connectsImpl <em>Test relation connects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.impl.Test_relation_connectsImpl
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTest_relation_connects()
	 * @generated
	 */
	int TEST_RELATION_CONNECTS = 76;

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
	 * The meta object id for the '{@link extendedtosca.protocolEnum <em>protocol Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.protocolEnum
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getprotocolEnum()
	 * @generated
	 */
	int PROTOCOL_ENUM = 77;

	/**
	 * The meta object id for the '{@link extendedtosca.initiatorEnum <em>initiator Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedtosca.initiatorEnum
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getinitiatorEnum()
	 * @generated
	 */
	int INITIATOR_ENUM = 78;

	/**
	 * The meta object id for the '<em>string</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getstring()
	 * @generated
	 */
	int STRING = 79;

	/**
	 * The meta object id for the '<em>string Min One</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getstringMinOne()
	 * @generated
	 */
	int STRING_MIN_ONE = 80;

	/**
	 * The meta object id for the '<em>boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getboolean()
	 * @generated
	 */
	int BOOLEAN = 81;

	/**
	 * The meta object id for the '<em>byte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getbyte()
	 * @generated
	 */
	int BYTE = 82;

	/**
	 * The meta object id for the '<em>double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getdouble()
	 * @generated
	 */
	int DOUBLE = 83;

	/**
	 * The meta object id for the '<em>float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getfloat()
	 * @generated
	 */
	int FLOAT = 84;

	/**
	 * The meta object id for the '<em>integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getinteger()
	 * @generated
	 */
	int INTEGER = 85;

	/**
	 * The meta object id for the '<em>integer Min One</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getintegerMinOne()
	 * @generated
	 */
	int INTEGER_MIN_ONE = 86;

	/**
	 * The meta object id for the '<em>long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getlong()
	 * @generated
	 */
	int LONG = 87;

	/**
	 * The meta object id for the '<em>short</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getshort()
	 * @generated
	 */
	int SHORT = 88;

	/**
	 * The meta object id for the '<em>map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getmap()
	 * @generated
	 */
	int MAP = 89;

	/**
	 * The meta object id for the '<em>version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getversion()
	 * @generated
	 */
	int VERSION = 90;

	/**
	 * The meta object id for the '<em>range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getrange()
	 * @generated
	 */
	int RANGE = 91;

	/**
	 * The meta object id for the '<em>toscadatatypesnetwork Port Def</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#gettoscadatatypesnetworkPortDef()
	 * @generated
	 */
	int TOSCADATATYPESNETWORK_PORT_DEF = 92;

	/**
	 * The meta object id for the '<em>scalar Frequency</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getscalarFrequency()
	 * @generated
	 */
	int SCALAR_FREQUENCY = 93;

	/**
	 * The meta object id for the '<em>scalar Size Min One MB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getscalarSizeMinOneMB()
	 * @generated
	 */
	int SCALAR_SIZE_MIN_ONE_MB = 94;

	/**
	 * The meta object id for the '<em>scalar Size Min Zero GB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getscalarSizeMinZeroGB()
	 * @generated
	 */
	int SCALAR_SIZE_MIN_ZERO_GB = 95;

	/**
	 * The meta object id for the '<em>scalar Size Min Zero MB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getscalarSizeMinZeroMB()
	 * @generated
	 */
	int SCALAR_SIZE_MIN_ZERO_MB = 96;


	/**
	 * Returns the meta object for class '{@link extendedtosca.arraystring <em>arraystring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>arraystring</em>'.
	 * @see extendedtosca.arraystring
	 * @generated
	 */
	EClass getarraystring();

	/**
	 * Returns the meta object for the attribute list '{@link extendedtosca.arraystring#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see extendedtosca.arraystring#getValues()
	 * @see #getarraystring()
	 * @generated
	 */
	EAttribute getarraystring_Values();

	/**
	 * Returns the meta object for class '{@link extendedtosca.NetworkInfo <em>Network Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Info</em>'.
	 * @see extendedtosca.NetworkInfo
	 * @generated
	 */
	EClass getNetworkInfo();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.NetworkInfo#getNetworkid <em>Networkid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Networkid</em>'.
	 * @see extendedtosca.NetworkInfo#getNetworkid()
	 * @see #getNetworkInfo()
	 * @generated
	 */
	EAttribute getNetworkInfo_Networkid();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.NetworkInfo#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addresses</em>'.
	 * @see extendedtosca.NetworkInfo#getAddresses()
	 * @see #getNetworkInfo()
	 * @generated
	 */
	EReference getNetworkInfo_Addresses();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.NetworkInfo#getNetworkname <em>Networkname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Networkname</em>'.
	 * @see extendedtosca.NetworkInfo#getNetworkname()
	 * @see #getNetworkInfo()
	 * @generated
	 */
	EAttribute getNetworkInfo_Networkname();

	/**
	 * Returns the meta object for class '{@link extendedtosca.PortInfo <em>Port Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Info</em>'.
	 * @see extendedtosca.PortInfo
	 * @generated
	 */
	EClass getPortInfo();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.PortInfo#getPortname <em>Portname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portname</em>'.
	 * @see extendedtosca.PortInfo#getPortname()
	 * @see #getPortInfo()
	 * @generated
	 */
	EAttribute getPortInfo_Portname();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.PortInfo#getNetworkid <em>Networkid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Networkid</em>'.
	 * @see extendedtosca.PortInfo#getNetworkid()
	 * @see #getPortInfo()
	 * @generated
	 */
	EAttribute getPortInfo_Networkid();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.PortInfo#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addresses</em>'.
	 * @see extendedtosca.PortInfo#getAddresses()
	 * @see #getPortInfo()
	 * @generated
	 */
	EReference getPortInfo_Addresses();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.PortInfo#getMacaddress <em>Macaddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macaddress</em>'.
	 * @see extendedtosca.PortInfo#getMacaddress()
	 * @see #getPortInfo()
	 * @generated
	 */
	EAttribute getPortInfo_Macaddress();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.PortInfo#getPortid <em>Portid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portid</em>'.
	 * @see extendedtosca.PortInfo#getPortid()
	 * @see #getPortInfo()
	 * @generated
	 */
	EAttribute getPortInfo_Portid();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credential</em>'.
	 * @see extendedtosca.Credential
	 * @generated
	 */
	EClass getCredential();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Credential#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see extendedtosca.Credential#getProtocol()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Credential#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keys</em>'.
	 * @see extendedtosca.Credential#getKeys()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Keys();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Credential#getTokentype <em>Tokentype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokentype</em>'.
	 * @see extendedtosca.Credential#getTokentype()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Tokentype();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Credential#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see extendedtosca.Credential#getUser()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_User();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Credential#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see extendedtosca.Credential#getToken()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Token();

	/**
	 * Returns the meta object for class '{@link extendedtosca.PortSpec <em>Port Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Spec</em>'.
	 * @see extendedtosca.PortSpec
	 * @generated
	 */
	EClass getPortSpec();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.PortSpec#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see extendedtosca.PortSpec#getProtocol()
	 * @see #getPortSpec()
	 * @generated
	 */
	EAttribute getPortSpec_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.PortSpec#getTargetrange <em>Targetrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetrange</em>'.
	 * @see extendedtosca.PortSpec#getTargetrange()
	 * @see #getPortSpec()
	 * @generated
	 */
	EAttribute getPortSpec_Targetrange();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.PortSpec#getSourcerange <em>Sourcerange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sourcerange</em>'.
	 * @see extendedtosca.PortSpec#getSourcerange()
	 * @see #getPortSpec()
	 * @generated
	 */
	EAttribute getPortSpec_Sourcerange();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.PortSpec#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see extendedtosca.PortSpec#getSource()
	 * @see #getPortSpec()
	 * @generated
	 */
	EAttribute getPortSpec_Source();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.PortSpec#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see extendedtosca.PortSpec#getTarget()
	 * @see #getPortSpec()
	 * @generated
	 */
	EAttribute getPortSpec_Target();

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
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_root <em>Tosca capabilities root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities root</em>'.
	 * @see extendedtosca.Tosca_capabilities_root
	 * @generated
	 */
	EClass getTosca_capabilities_root();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_node <em>Tosca capabilities node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities node</em>'.
	 * @see extendedtosca.Tosca_capabilities_node
	 * @generated
	 */
	EClass getTosca_capabilities_node();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_endpoint <em>Tosca capabilities endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities endpoint</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint
	 * @generated
	 */
	EClass getTosca_capabilities_endpoint();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Name</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint#getPortName()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_PortName();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint#getProtocol()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint#getPort()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Port();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiator</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint#getInitiator()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Initiator();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint#getNetworkName <em>Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Name</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint#getNetworkName()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_NetworkName();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint#getSecure <em>Secure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint#getSecure()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Secure();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ports</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint#getPorts()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Ports();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint#getUrlPath <em>Url Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Path</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint#getUrlPath()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_UrlPath();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_scalable <em>Tosca capabilities scalable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities scalable</em>'.
	 * @see extendedtosca.Tosca_capabilities_scalable
	 * @generated
	 */
	EClass getTosca_capabilities_scalable();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_scalable#getMinInstances <em>Min Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instances</em>'.
	 * @see extendedtosca.Tosca_capabilities_scalable#getMinInstances()
	 * @see #getTosca_capabilities_scalable()
	 * @generated
	 */
	EAttribute getTosca_capabilities_scalable_MinInstances();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_scalable#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see extendedtosca.Tosca_capabilities_scalable#getMaxInstances()
	 * @see #getTosca_capabilities_scalable()
	 * @generated
	 */
	EAttribute getTosca_capabilities_scalable_MaxInstances();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_scalable#getDefaultInstances <em>Default Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Instances</em>'.
	 * @see extendedtosca.Tosca_capabilities_scalable#getDefaultInstances()
	 * @see #getTosca_capabilities_scalable()
	 * @generated
	 */
	EAttribute getTosca_capabilities_scalable_DefaultInstances();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_network_bindable <em>Tosca capabilities network bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities network bindable</em>'.
	 * @see extendedtosca.Tosca_capabilities_network_bindable
	 * @generated
	 */
	EClass getTosca_capabilities_network_bindable();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_container <em>Tosca capabilities container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities container</em>'.
	 * @see extendedtosca.Tosca_capabilities_container
	 * @generated
	 */
	EClass getTosca_capabilities_container();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_container#getDiskSize <em>Disk Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Size</em>'.
	 * @see extendedtosca.Tosca_capabilities_container#getDiskSize()
	 * @see #getTosca_capabilities_container()
	 * @generated
	 */
	EAttribute getTosca_capabilities_container_DiskSize();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_endpoint_database <em>Tosca capabilities endpoint database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities endpoint database</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint_database
	 * @generated
	 */
	EClass getTosca_capabilities_endpoint_database();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_endpoint_public <em>Tosca capabilities endpoint public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities endpoint public</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint_public
	 * @generated
	 */
	EClass getTosca_capabilities_endpoint_public();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint_public#getFloating <em>Floating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint_public#getFloating()
	 * @see #getTosca_capabilities_endpoint_public()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_public_Floating();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_endpoint_public#getDnsName <em>Dns Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dns Name</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint_public#getDnsName()
	 * @see #getTosca_capabilities_endpoint_public()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_public_DnsName();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_endpoint_admin <em>Tosca capabilities endpoint admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities endpoint admin</em>'.
	 * @see extendedtosca.Tosca_capabilities_endpoint_admin
	 * @generated
	 */
	EClass getTosca_capabilities_endpoint_admin();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_operatingsystem <em>Tosca capabilities operatingsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities operatingsystem</em>'.
	 * @see extendedtosca.Tosca_capabilities_operatingsystem
	 * @generated
	 */
	EClass getTosca_capabilities_operatingsystem();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_operatingsystem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see extendedtosca.Tosca_capabilities_operatingsystem#getType()
	 * @see #getTosca_capabilities_operatingsystem()
	 * @generated
	 */
	EAttribute getTosca_capabilities_operatingsystem_Type();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_operatingsystem#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see extendedtosca.Tosca_capabilities_operatingsystem#getDistribution()
	 * @see #getTosca_capabilities_operatingsystem()
	 * @generated
	 */
	EAttribute getTosca_capabilities_operatingsystem_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_operatingsystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see extendedtosca.Tosca_capabilities_operatingsystem#getVersion()
	 * @see #getTosca_capabilities_operatingsystem()
	 * @generated
	 */
	EAttribute getTosca_capabilities_operatingsystem_Version();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_attachment <em>Tosca capabilities attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities attachment</em>'.
	 * @see extendedtosca.Tosca_capabilities_attachment
	 * @generated
	 */
	EClass getTosca_capabilities_attachment();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_root <em>Tosca nodes root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes root</em>'.
	 * @see extendedtosca.Tosca_nodes_root
	 * @generated
	 */
	EClass getTosca_nodes_root();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_root#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_root#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_root__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_webapplication <em>Tosca nodes webapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes webapplication</em>'.
	 * @see extendedtosca.Tosca_nodes_webapplication
	 * @generated
	 */
	EClass getTosca_nodes_webapplication();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_webapplication#getContextRoot <em>Context Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Root</em>'.
	 * @see extendedtosca.Tosca_nodes_webapplication#getContextRoot()
	 * @see #getTosca_nodes_webapplication()
	 * @generated
	 */
	EAttribute getTosca_nodes_webapplication_ContextRoot();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_webapplication#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_webapplication#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_webapplication__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_softwarecomponent <em>Tosca nodes softwarecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes softwarecomponent</em>'.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent
	 * @generated
	 */
	EClass getTosca_nodes_softwarecomponent();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.Tosca_nodes_softwarecomponent#getAdminCredential <em>Admin Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admin Credential</em>'.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent#getAdminCredential()
	 * @see #getTosca_nodes_softwarecomponent()
	 * @generated
	 */
	EReference getTosca_nodes_softwarecomponent_AdminCredential();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_softwarecomponent#getComponentVersion <em>Component Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Version</em>'.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent#getComponentVersion()
	 * @see #getTosca_nodes_softwarecomponent()
	 * @generated
	 */
	EAttribute getTosca_nodes_softwarecomponent_ComponentVersion();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_softwarecomponent#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_softwarecomponent__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_dbms <em>Tosca nodes dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes dbms</em>'.
	 * @see extendedtosca.Tosca_nodes_dbms
	 * @generated
	 */
	EClass getTosca_nodes_dbms();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_dbms#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see extendedtosca.Tosca_nodes_dbms#getPort()
	 * @see #getTosca_nodes_dbms()
	 * @generated
	 */
	EAttribute getTosca_nodes_dbms_Port();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_dbms#getRootPassword <em>Root Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Password</em>'.
	 * @see extendedtosca.Tosca_nodes_dbms#getRootPassword()
	 * @see #getTosca_nodes_dbms()
	 * @generated
	 */
	EAttribute getTosca_nodes_dbms_RootPassword();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_dbms#SourceMustBeDatabase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Database</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Database</em>' operation.
	 * @see extendedtosca.Tosca_nodes_dbms#SourceMustBeDatabase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_dbms__SourceMustBeDatabase__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_objectstorage <em>Tosca nodes objectstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes objectstorage</em>'.
	 * @see extendedtosca.Tosca_nodes_objectstorage
	 * @generated
	 */
	EClass getTosca_nodes_objectstorage();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_objectstorage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see extendedtosca.Tosca_nodes_objectstorage#getSize()
	 * @see #getTosca_nodes_objectstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_objectstorage_Size();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_objectstorage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see extendedtosca.Tosca_nodes_objectstorage#getName()
	 * @see #getTosca_nodes_objectstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_objectstorage_Name();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_objectstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_objectstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_objectstorage__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_compute <em>Tosca nodes compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes compute</em>'.
	 * @see extendedtosca.Tosca_nodes_compute
	 * @generated
	 */
	EClass getTosca_nodes_compute();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_compute#getPrivateAddress <em>Private Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Address</em>'.
	 * @see extendedtosca.Tosca_nodes_compute#getPrivateAddress()
	 * @see #getTosca_nodes_compute()
	 * @generated
	 */
	EAttribute getTosca_nodes_compute_PrivateAddress();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_compute#getPublicAddress <em>Public Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Address</em>'.
	 * @see extendedtosca.Tosca_nodes_compute#getPublicAddress()
	 * @see #getTosca_nodes_compute()
	 * @generated
	 */
	EAttribute getTosca_nodes_compute_PublicAddress();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_compute#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Networks</em>'.
	 * @see extendedtosca.Tosca_nodes_compute#getNetworks()
	 * @see #getTosca_nodes_compute()
	 * @generated
	 */
	EAttribute getTosca_nodes_compute_Networks();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_compute#SourceMustBeSoftwareComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Software Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Software Component</em>' operation.
	 * @see extendedtosca.Tosca_nodes_compute#SourceMustBeSoftwareComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_compute__SourceMustBeSoftwareComponent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_compute#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_compute#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_compute__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_loadbalancer <em>Tosca nodes loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes loadbalancer</em>'.
	 * @see extendedtosca.Tosca_nodes_loadbalancer
	 * @generated
	 */
	EClass getTosca_nodes_loadbalancer();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_loadbalancer#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see extendedtosca.Tosca_nodes_loadbalancer#getAlgorithm()
	 * @see #getTosca_nodes_loadbalancer()
	 * @generated
	 */
	EAttribute getTosca_nodes_loadbalancer_Algorithm();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_webserver <em>Tosca nodes webserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes webserver</em>'.
	 * @see extendedtosca.Tosca_nodes_webserver
	 * @generated
	 */
	EClass getTosca_nodes_webserver();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_webserver#SourceMustBeWebApplication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Web Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Web Application</em>' operation.
	 * @see extendedtosca.Tosca_nodes_webserver#SourceMustBeWebApplication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_webserver__SourceMustBeWebApplication__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_database <em>Tosca nodes database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes database</em>'.
	 * @see extendedtosca.Tosca_nodes_database
	 * @generated
	 */
	EClass getTosca_nodes_database();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_database#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see extendedtosca.Tosca_nodes_database#getPassword()
	 * @see #getTosca_nodes_database()
	 * @generated
	 */
	EAttribute getTosca_nodes_database_Password();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see extendedtosca.Tosca_nodes_database#getName()
	 * @see #getTosca_nodes_database()
	 * @generated
	 */
	EAttribute getTosca_nodes_database_Name();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_database#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see extendedtosca.Tosca_nodes_database#getUser()
	 * @see #getTosca_nodes_database()
	 * @generated
	 */
	EAttribute getTosca_nodes_database_User();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_database#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_database#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_database__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_container_application <em>Tosca nodes container application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes container application</em>'.
	 * @see extendedtosca.Tosca_nodes_container_application
	 * @generated
	 */
	EClass getTosca_nodes_container_application();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_container_application#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_container_application#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_container_application__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_container_runtime <em>Tosca nodes container runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes container runtime</em>'.
	 * @see extendedtosca.Tosca_nodes_container_runtime
	 * @generated
	 */
	EClass getTosca_nodes_container_runtime();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_blockstorage <em>Tosca nodes blockstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes blockstorage</em>'.
	 * @see extendedtosca.Tosca_nodes_blockstorage
	 * @generated
	 */
	EClass getTosca_nodes_blockstorage();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_blockstorage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see extendedtosca.Tosca_nodes_blockstorage#getSize()
	 * @see #getTosca_nodes_blockstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_blockstorage_Size();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_blockstorage#getVolumeId <em>Volume Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Id</em>'.
	 * @see extendedtosca.Tosca_nodes_blockstorage#getVolumeId()
	 * @see #getTosca_nodes_blockstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_blockstorage_VolumeId();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_blockstorage#getSnapshotId <em>Snapshot Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snapshot Id</em>'.
	 * @see extendedtosca.Tosca_nodes_blockstorage#getSnapshotId()
	 * @see #getTosca_nodes_blockstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_blockstorage_SnapshotId();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_nodes_blockstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_nodes_blockstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_blockstorage__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_policies_root <em>Tosca policies root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies root</em>'.
	 * @see extendedtosca.Tosca_policies_root
	 * @generated
	 */
	EClass getTosca_policies_root();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_policies_update <em>Tosca policies update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies update</em>'.
	 * @see extendedtosca.Tosca_policies_update
	 * @generated
	 */
	EClass getTosca_policies_update();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_policies_placement <em>Tosca policies placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies placement</em>'.
	 * @see extendedtosca.Tosca_policies_placement
	 * @generated
	 */
	EClass getTosca_policies_placement();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_policies_scaling <em>Tosca policies scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies scaling</em>'.
	 * @see extendedtosca.Tosca_policies_scaling
	 * @generated
	 */
	EClass getTosca_policies_scaling();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_policies_performance <em>Tosca policies performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies performance</em>'.
	 * @see extendedtosca.Tosca_policies_performance
	 * @generated
	 */
	EClass getTosca_policies_performance();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_groups_root <em>Tosca groups root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca groups root</em>'.
	 * @see extendedtosca.Tosca_groups_root
	 * @generated
	 */
	EClass getTosca_groups_root();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_interfaces_root <em>Tosca interfaces root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca interfaces root</em>'.
	 * @see extendedtosca.Tosca_interfaces_root
	 * @generated
	 */
	EClass getTosca_interfaces_root();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_interfaces_relationship_configure <em>Tosca interfaces relationship configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca interfaces relationship configure</em>'.
	 * @see extendedtosca.Tosca_interfaces_relationship_configure
	 * @generated
	 */
	EClass getTosca_interfaces_relationship_configure();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_relationship_configure#pre_configure_source() <em>Pre configure source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre configure source</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_relationship_configure#pre_configure_source()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Pre_configure_source();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_relationship_configure#pre_configure_target() <em>Pre configure target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre configure target</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_relationship_configure#pre_configure_target()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Pre_configure_target();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_relationship_configure#post_configure_source() <em>Post configure source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post configure source</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_relationship_configure#post_configure_source()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Post_configure_source();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_relationship_configure#post_configure_target() <em>Post configure target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post configure target</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_relationship_configure#post_configure_target()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Post_configure_target();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_relationship_configure#remove_target() <em>Remove target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove target</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_relationship_configure#remove_target()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Remove_target();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_relationship_configure#add_target() <em>Add target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add target</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_relationship_configure#add_target()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Add_target();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_relationship_configure#add_source() <em>Add source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add source</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_relationship_configure#add_source()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Add_source();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_relationship_configure#target_changed() <em>Target changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target changed</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_relationship_configure#target_changed()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Target_changed();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_interfaces_node_lifecycle_standard <em>Tosca interfaces node lifecycle standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca interfaces node lifecycle standard</em>'.
	 * @see extendedtosca.Tosca_interfaces_node_lifecycle_standard
	 * @generated
	 */
	EClass getTosca_interfaces_node_lifecycle_standard();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_node_lifecycle_standard#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_node_lifecycle_standard#create()
	 * @generated
	 */
	EOperation getTosca_interfaces_node_lifecycle_standard__Create();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_node_lifecycle_standard#configure() <em>Configure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Configure</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_node_lifecycle_standard#configure()
	 * @generated
	 */
	EOperation getTosca_interfaces_node_lifecycle_standard__Configure();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_interfaces_node_lifecycle_standard#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see extendedtosca.Tosca_interfaces_node_lifecycle_standard#delete()
	 * @generated
	 */
	EOperation getTosca_interfaces_node_lifecycle_standard__Delete();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_root <em>Tosca relationships root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships root</em>'.
	 * @see extendedtosca.Tosca_relationships_root
	 * @generated
	 */
	EClass getTosca_relationships_root();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_relationships_root#getToscaName <em>Tosca Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tosca Name</em>'.
	 * @see extendedtosca.Tosca_relationships_root#getToscaName()
	 * @see #getTosca_relationships_root()
	 * @generated
	 */
	EAttribute getTosca_relationships_root_ToscaName();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_relationships_root#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see extendedtosca.Tosca_relationships_root#getState()
	 * @see #getTosca_relationships_root()
	 * @generated
	 */
	EAttribute getTosca_relationships_root_State();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_relationships_root#getToscaId <em>Tosca Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tosca Id</em>'.
	 * @see extendedtosca.Tosca_relationships_root#getToscaId()
	 * @see #getTosca_relationships_root()
	 * @generated
	 */
	EAttribute getTosca_relationships_root_ToscaId();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_relationships_root#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_relationships_root#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_root__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_connectsto <em>Tosca relationships connectsto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships connectsto</em>'.
	 * @see extendedtosca.Tosca_relationships_connectsto
	 * @generated
	 */
	EClass getTosca_relationships_connectsto();

	/**
	 * Returns the meta object for the containment reference '{@link extendedtosca.Tosca_relationships_connectsto#getCredential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credential</em>'.
	 * @see extendedtosca.Tosca_relationships_connectsto#getCredential()
	 * @see #getTosca_relationships_connectsto()
	 * @generated
	 */
	EReference getTosca_relationships_connectsto_Credential();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_routesto <em>Tosca relationships routesto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships routesto</em>'.
	 * @see extendedtosca.Tosca_relationships_routesto
	 * @generated
	 */
	EClass getTosca_relationships_routesto();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_relationships_routesto#SourceMustBeLoadBalancer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Load Balancer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Load Balancer</em>' operation.
	 * @see extendedtosca.Tosca_relationships_routesto#SourceMustBeLoadBalancer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_routesto__SourceMustBeLoadBalancer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_attachesto <em>Tosca relationships attachesto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships attachesto</em>'.
	 * @see extendedtosca.Tosca_relationships_attachesto
	 * @generated
	 */
	EClass getTosca_relationships_attachesto();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_relationships_attachesto#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see extendedtosca.Tosca_relationships_attachesto#getLocation()
	 * @see #getTosca_relationships_attachesto()
	 * @generated
	 */
	EAttribute getTosca_relationships_attachesto_Location();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_relationships_attachesto#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see extendedtosca.Tosca_relationships_attachesto#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_attachesto__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_relationships_attachesto#SourceMustBeComputeAndTargetMustBeBlockStorage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Compute And Target Must Be Block Storage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Compute And Target Must Be Block Storage</em>' operation.
	 * @see extendedtosca.Tosca_relationships_attachesto#SourceMustBeComputeAndTargetMustBeBlockStorage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_attachesto__SourceMustBeComputeAndTargetMustBeBlockStorage__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_hostedon <em>Tosca relationships hostedon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships hostedon</em>'.
	 * @see extendedtosca.Tosca_relationships_hostedon
	 * @generated
	 */
	EClass getTosca_relationships_hostedon();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_relationships_hostedon#SourceMustBeWebServerAndTargetMustBeWebApplication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Web Server And Target Must Be Web Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Web Server And Target Must Be Web Application</em>' operation.
	 * @see extendedtosca.Tosca_relationships_hostedon#SourceMustBeWebServerAndTargetMustBeWebApplication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_hostedon__SourceMustBeWebServerAndTargetMustBeWebApplication__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_relationships_hostedon#SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Container Application And Target Must Be Container Runtime</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Container Application And Target Must Be Container Runtime</em>' operation.
	 * @see extendedtosca.Tosca_relationships_hostedon#SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_hostedon__SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_relationships_hostedon#SourceMustBeSoftwareComponentAndTargetMustBeCompute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Software Component And Target Must Be Compute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Software Component And Target Must Be Compute</em>' operation.
	 * @see extendedtosca.Tosca_relationships_hostedon#SourceMustBeSoftwareComponentAndTargetMustBeCompute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_hostedon__SourceMustBeSoftwareComponentAndTargetMustBeCompute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_relationships_hostedon#SourceMustBeDatabaseAndTargetMustBeDBMS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Database And Target Must Be DBMS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Database And Target Must Be DBMS</em>' operation.
	 * @see extendedtosca.Tosca_relationships_hostedon#SourceMustBeDatabaseAndTargetMustBeDBMS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_hostedon__SourceMustBeDatabaseAndTargetMustBeDBMS__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_dependson <em>Tosca relationships dependson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships dependson</em>'.
	 * @see extendedtosca.Tosca_relationships_dependson
	 * @generated
	 */
	EClass getTosca_relationships_dependson();

	/**
	 * Returns the meta object for the '{@link extendedtosca.Tosca_relationships_dependson#SourceMustBeNodeAndTargetMustBeNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Node And Target Must Be Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Node And Target Must Be Node</em>' operation.
	 * @see extendedtosca.Tosca_relationships_dependson#SourceMustBeNodeAndTargetMustBeNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_dependson__SourceMustBeNodeAndTargetMustBeNode__DiagnosticChain_Map();

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
	 * Returns the meta object for class '{@link extendedtosca.Tosca_capabilities_somecap <em>Tosca capabilities somecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities somecap</em>'.
	 * @see extendedtosca.Tosca_capabilities_somecap
	 * @generated
	 */
	EClass getTosca_capabilities_somecap();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_capabilities_somecap#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see extendedtosca.Tosca_capabilities_somecap#getType()
	 * @see #getTosca_capabilities_somecap()
	 * @generated
	 */
	EAttribute getTosca_capabilities_somecap_Type();

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
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_database_mysql <em>Tosca nodes database mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes database mysql</em>'.
	 * @see extendedtosca.Tosca_nodes_database_mysql
	 * @generated
	 */
	EClass getTosca_nodes_database_mysql();

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
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_webapplication_wordpress <em>Tosca nodes webapplication wordpress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes webapplication wordpress</em>'.
	 * @see extendedtosca.Tosca_nodes_webapplication_wordpress
	 * @generated
	 */
	EClass getTosca_nodes_webapplication_wordpress();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_webapplication_wordpress#getDbHost <em>Db Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Host</em>'.
	 * @see extendedtosca.Tosca_nodes_webapplication_wordpress#getDbHost()
	 * @see #getTosca_nodes_webapplication_wordpress()
	 * @generated
	 */
	EAttribute getTosca_nodes_webapplication_wordpress_DbHost();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_webapplication_wordpress#getAdminPassword <em>Admin Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Password</em>'.
	 * @see extendedtosca.Tosca_nodes_webapplication_wordpress#getAdminPassword()
	 * @see #getTosca_nodes_webapplication_wordpress()
	 * @generated
	 */
	EAttribute getTosca_nodes_webapplication_wordpress_AdminPassword();

	/**
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_webapplication_wordpress#getAdminUser <em>Admin User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin User</em>'.
	 * @see extendedtosca.Tosca_nodes_webapplication_wordpress#getAdminUser()
	 * @see #getTosca_nodes_webapplication_wordpress()
	 * @generated
	 */
	EAttribute getTosca_nodes_webapplication_wordpress_AdminUser();

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
	 * Returns the meta object for class '{@link extendedtosca.Rsyslog <em>Rsyslog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rsyslog</em>'.
	 * @see extendedtosca.Rsyslog
	 * @generated
	 */
	EClass getRsyslog();

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
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_softwarecomponent_collectd <em>Tosca nodes softwarecomponent collectd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes softwarecomponent collectd</em>'.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_collectd
	 * @generated
	 */
	EClass getTosca_nodes_softwarecomponent_collectd();

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
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_nodewithreq <em>Tosca nodes nodewithreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes nodewithreq</em>'.
	 * @see extendedtosca.Tosca_nodes_nodewithreq
	 * @generated
	 */
	EClass getTosca_nodes_nodewithreq();

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
	 * Returns the meta object for the attribute '{@link extendedtosca.Tosca_nodes_somenode#getSomeProp <em>Some Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Some Prop</em>'.
	 * @see extendedtosca.Tosca_nodes_somenode#getSomeProp()
	 * @see #getTosca_nodes_somenode()
	 * @generated
	 */
	EAttribute getTosca_nodes_somenode_SomeProp();

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
	 * Returns the meta object for class '{@link extendedtosca.Tosca_nodes_somenode2 <em>Tosca nodes somenode2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes somenode2</em>'.
	 * @see extendedtosca.Tosca_nodes_somenode2
	 * @generated
	 */
	EClass getTosca_nodes_somenode2();

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
	 * Returns the meta object for class '{@link extendedtosca.Tosca_relationships_ha <em>Tosca relationships ha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships ha</em>'.
	 * @see extendedtosca.Tosca_relationships_ha
	 * @generated
	 */
	EClass getTosca_relationships_ha();

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
	 * Returns the meta object for enum '{@link extendedtosca.protocolEnum <em>protocol Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>protocol Enum</em>'.
	 * @see extendedtosca.protocolEnum
	 * @generated
	 */
	EEnum getprotocolEnum();

	/**
	 * Returns the meta object for enum '{@link extendedtosca.initiatorEnum <em>initiator Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>initiator Enum</em>'.
	 * @see extendedtosca.initiatorEnum
	 * @generated
	 */
	EEnum getinitiatorEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>string</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getstring();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>string Min One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>string Min One</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="minLength='1' pattern='null'"
	 * @generated
	 */
	EDataType getstringMinOne();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getboolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Byte <em>byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>byte</em>'.
	 * @see java.lang.Byte
	 * @model instanceClass="java.lang.Byte"
	 * @generated
	 */
	EDataType getbyte();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getdouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>float</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getfloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getinteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>integer Min One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>integer Min One</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="MinInclusive='1'"
	 * @generated
	 */
	EDataType getintegerMinOne();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>long</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getlong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>short</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 * @generated
	 */
	EDataType getshort();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map"
	 * @generated
	 */
	EDataType getmap();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>version</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='((\\d+)((\\.\\d+)+)?)'"
	 * @generated
	 */
	EDataType getversion();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>range</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="MinInclusive='1' MaxInclusive='65535'"
	 * @generated
	 */
	EDataType getrange();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>toscadatatypesnetwork Port Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>toscadatatypesnetwork Port Def</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="MinInclusive='1' MaxInclusive='65535'"
	 * @generated
	 */
	EDataType gettoscadatatypesnetworkPortDef();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>scalar Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>scalar Frequency</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="MinInclusive='0.1 GHz'"
	 * @generated
	 */
	EDataType getscalarFrequency();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>scalar Size Min One MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>scalar Size Min One MB</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="MinInclusive='1 MB'"
	 * @generated
	 */
	EDataType getscalarSizeMinOneMB();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>scalar Size Min Zero GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>scalar Size Min Zero GB</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="MinInclusive='0 GB'"
	 * @generated
	 */
	EDataType getscalarSizeMinZeroGB();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>scalar Size Min Zero MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>scalar Size Min Zero MB</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="MinInclusive='0 MB'"
	 * @generated
	 */
	EDataType getscalarSizeMinZeroMB();

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
		 * The meta object literal for the '{@link extendedtosca.impl.arraystringImpl <em>arraystring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.arraystringImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getarraystring()
		 * @generated
		 */
		EClass ARRAYSTRING = eINSTANCE.getarraystring();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAYSTRING__VALUES = eINSTANCE.getarraystring_Values();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.NetworkInfoImpl <em>Network Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.NetworkInfoImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getNetworkInfo()
		 * @generated
		 */
		EClass NETWORK_INFO = eINSTANCE.getNetworkInfo();

		/**
		 * The meta object literal for the '<em><b>Networkid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INFO__NETWORKID = eINSTANCE.getNetworkInfo_Networkid();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INFO__ADDRESSES = eINSTANCE.getNetworkInfo_Addresses();

		/**
		 * The meta object literal for the '<em><b>Networkname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INFO__NETWORKNAME = eINSTANCE.getNetworkInfo_Networkname();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.PortInfoImpl <em>Port Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.PortInfoImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getPortInfo()
		 * @generated
		 */
		EClass PORT_INFO = eINSTANCE.getPortInfo();

		/**
		 * The meta object literal for the '<em><b>Portname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INFO__PORTNAME = eINSTANCE.getPortInfo_Portname();

		/**
		 * The meta object literal for the '<em><b>Networkid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INFO__NETWORKID = eINSTANCE.getPortInfo_Networkid();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INFO__ADDRESSES = eINSTANCE.getPortInfo_Addresses();

		/**
		 * The meta object literal for the '<em><b>Macaddress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INFO__MACADDRESS = eINSTANCE.getPortInfo_Macaddress();

		/**
		 * The meta object literal for the '<em><b>Portid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INFO__PORTID = eINSTANCE.getPortInfo_Portid();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.CredentialImpl <em>Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.CredentialImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getCredential()
		 * @generated
		 */
		EClass CREDENTIAL = eINSTANCE.getCredential();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__PROTOCOL = eINSTANCE.getCredential_Protocol();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__KEYS = eINSTANCE.getCredential_Keys();

		/**
		 * The meta object literal for the '<em><b>Tokentype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__TOKENTYPE = eINSTANCE.getCredential_Tokentype();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__USER = eINSTANCE.getCredential_User();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__TOKEN = eINSTANCE.getCredential_Token();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.PortSpecImpl <em>Port Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.PortSpecImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getPortSpec()
		 * @generated
		 */
		EClass PORT_SPEC = eINSTANCE.getPortSpec();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_SPEC__PROTOCOL = eINSTANCE.getPortSpec_Protocol();

		/**
		 * The meta object literal for the '<em><b>Targetrange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_SPEC__TARGETRANGE = eINSTANCE.getPortSpec_Targetrange();

		/**
		 * The meta object literal for the '<em><b>Sourcerange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_SPEC__SOURCERANGE = eINSTANCE.getPortSpec_Sourcerange();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_SPEC__SOURCE = eINSTANCE.getPortSpec_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_SPEC__TARGET = eINSTANCE.getPortSpec_Target();

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
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_rootImpl <em>Tosca capabilities root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_rootImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_root()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ROOT = eINSTANCE.getTosca_capabilities_root();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_nodeImpl <em>Tosca capabilities node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_nodeImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_node()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_NODE = eINSTANCE.getTosca_capabilities_node();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_endpointImpl <em>Tosca capabilities endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_endpointImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_endpoint()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ENDPOINT = eINSTANCE.getTosca_capabilities_endpoint();

		/**
		 * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME = eINSTANCE.getTosca_capabilities_endpoint_PortName();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL = eINSTANCE.getTosca_capabilities_endpoint_Protocol();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__PORT = eINSTANCE.getTosca_capabilities_endpoint_Port();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__INITIATOR = eINSTANCE.getTosca_capabilities_endpoint_Initiator();

		/**
		 * The meta object literal for the '<em><b>Network Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME = eINSTANCE.getTosca_capabilities_endpoint_NetworkName();

		/**
		 * The meta object literal for the '<em><b>Secure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__SECURE = eINSTANCE.getTosca_capabilities_endpoint_Secure();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__PORTS = eINSTANCE.getTosca_capabilities_endpoint_Ports();

		/**
		 * The meta object literal for the '<em><b>Url Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__URL_PATH = eINSTANCE.getTosca_capabilities_endpoint_UrlPath();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_scalableImpl <em>Tosca capabilities scalable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_scalableImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_scalable()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_SCALABLE = eINSTANCE.getTosca_capabilities_scalable();

		/**
		 * The meta object literal for the '<em><b>Min Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES = eINSTANCE.getTosca_capabilities_scalable_MinInstances();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES = eINSTANCE.getTosca_capabilities_scalable_MaxInstances();

		/**
		 * The meta object literal for the '<em><b>Default Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES = eINSTANCE.getTosca_capabilities_scalable_DefaultInstances();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_network_bindableImpl <em>Tosca capabilities network bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_network_bindableImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_network_bindable()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_NETWORK_BINDABLE = eINSTANCE.getTosca_capabilities_network_bindable();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_containerImpl <em>Tosca capabilities container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_containerImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_container()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_CONTAINER = eINSTANCE.getTosca_capabilities_container();

		/**
		 * The meta object literal for the '<em><b>Disk Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE = eINSTANCE.getTosca_capabilities_container_DiskSize();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_endpoint_databaseImpl <em>Tosca capabilities endpoint database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_endpoint_databaseImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_endpoint_database()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ENDPOINT_DATABASE = eINSTANCE.getTosca_capabilities_endpoint_database();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_endpoint_publicImpl <em>Tosca capabilities endpoint public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_endpoint_publicImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_endpoint_public()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ENDPOINT_PUBLIC = eINSTANCE.getTosca_capabilities_endpoint_public();

		/**
		 * The meta object literal for the '<em><b>Floating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING = eINSTANCE.getTosca_capabilities_endpoint_public_Floating();

		/**
		 * The meta object literal for the '<em><b>Dns Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME = eINSTANCE.getTosca_capabilities_endpoint_public_DnsName();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_endpoint_adminImpl <em>Tosca capabilities endpoint admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_endpoint_adminImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_endpoint_admin()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ENDPOINT_ADMIN = eINSTANCE.getTosca_capabilities_endpoint_admin();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_operatingsystemImpl <em>Tosca capabilities operatingsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_operatingsystemImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_operatingsystem()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_OPERATINGSYSTEM = eINSTANCE.getTosca_capabilities_operatingsystem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_OPERATINGSYSTEM__TYPE = eINSTANCE.getTosca_capabilities_operatingsystem_Type();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_OPERATINGSYSTEM__DISTRIBUTION = eINSTANCE.getTosca_capabilities_operatingsystem_Distribution();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_OPERATINGSYSTEM__VERSION = eINSTANCE.getTosca_capabilities_operatingsystem_Version();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_attachmentImpl <em>Tosca capabilities attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_attachmentImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_attachment()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ATTACHMENT = eINSTANCE.getTosca_capabilities_attachment();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_rootImpl <em>Tosca nodes root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_rootImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_root()
		 * @generated
		 */
		EClass TOSCA_NODES_ROOT = eINSTANCE.getTosca_nodes_root();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_root__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_webapplicationImpl <em>Tosca nodes webapplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_webapplicationImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webapplication()
		 * @generated
		 */
		EClass TOSCA_NODES_WEBAPPLICATION = eINSTANCE.getTosca_nodes_webapplication();

		/**
		 * The meta object literal for the '<em><b>Context Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT = eINSTANCE.getTosca_nodes_webapplication_ContextRoot();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_WEBAPPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_webapplication__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponentImpl <em>Tosca nodes softwarecomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_softwarecomponentImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent()
		 * @generated
		 */
		EClass TOSCA_NODES_SOFTWARECOMPONENT = eINSTANCE.getTosca_nodes_softwarecomponent();

		/**
		 * The meta object literal for the '<em><b>Admin Credential</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL = eINSTANCE.getTosca_nodes_softwarecomponent_AdminCredential();

		/**
		 * The meta object literal for the '<em><b>Component Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION = eINSTANCE.getTosca_nodes_softwarecomponent_ComponentVersion();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_softwarecomponent__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_dbmsImpl <em>Tosca nodes dbms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_dbmsImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_dbms()
		 * @generated
		 */
		EClass TOSCA_NODES_DBMS = eINSTANCE.getTosca_nodes_dbms();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DBMS__PORT = eINSTANCE.getTosca_nodes_dbms_Port();

		/**
		 * The meta object literal for the '<em><b>Root Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DBMS__ROOT_PASSWORD = eINSTANCE.getTosca_nodes_dbms_RootPassword();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Database</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_DBMS___SOURCE_MUST_BE_DATABASE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_dbms__SourceMustBeDatabase__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_objectstorageImpl <em>Tosca nodes objectstorage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_objectstorageImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_objectstorage()
		 * @generated
		 */
		EClass TOSCA_NODES_OBJECTSTORAGE = eINSTANCE.getTosca_nodes_objectstorage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_OBJECTSTORAGE__SIZE = eINSTANCE.getTosca_nodes_objectstorage_Size();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_OBJECTSTORAGE__NAME = eINSTANCE.getTosca_nodes_objectstorage_Name();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_OBJECTSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_objectstorage__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_computeImpl <em>Tosca nodes compute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_computeImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_compute()
		 * @generated
		 */
		EClass TOSCA_NODES_COMPUTE = eINSTANCE.getTosca_nodes_compute();

		/**
		 * The meta object literal for the '<em><b>Private Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS = eINSTANCE.getTosca_nodes_compute_PrivateAddress();

		/**
		 * The meta object literal for the '<em><b>Public Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS = eINSTANCE.getTosca_nodes_compute_PublicAddress();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_COMPUTE__NETWORKS = eINSTANCE.getTosca_nodes_compute_Networks();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Software Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_compute__SourceMustBeSoftwareComponent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_compute__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_loadbalancerImpl <em>Tosca nodes loadbalancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_loadbalancerImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_loadbalancer()
		 * @generated
		 */
		EClass TOSCA_NODES_LOADBALANCER = eINSTANCE.getTosca_nodes_loadbalancer();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_LOADBALANCER__ALGORITHM = eINSTANCE.getTosca_nodes_loadbalancer_Algorithm();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_webserverImpl <em>Tosca nodes webserver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_webserverImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webserver()
		 * @generated
		 */
		EClass TOSCA_NODES_WEBSERVER = eINSTANCE.getTosca_nodes_webserver();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Web Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_WEBSERVER___SOURCE_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_webserver__SourceMustBeWebApplication__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_databaseImpl <em>Tosca nodes database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_databaseImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_database()
		 * @generated
		 */
		EClass TOSCA_NODES_DATABASE = eINSTANCE.getTosca_nodes_database();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DATABASE__PASSWORD = eINSTANCE.getTosca_nodes_database_Password();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DATABASE__NAME = eINSTANCE.getTosca_nodes_database_Name();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DATABASE__USER = eINSTANCE.getTosca_nodes_database_User();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_DATABASE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_database__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_container_applicationImpl <em>Tosca nodes container application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_container_applicationImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_container_application()
		 * @generated
		 */
		EClass TOSCA_NODES_CONTAINER_APPLICATION = eINSTANCE.getTosca_nodes_container_application();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_CONTAINER_APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_container_application__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_container_runtimeImpl <em>Tosca nodes container runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_container_runtimeImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_container_runtime()
		 * @generated
		 */
		EClass TOSCA_NODES_CONTAINER_RUNTIME = eINSTANCE.getTosca_nodes_container_runtime();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_blockstorageImpl <em>Tosca nodes blockstorage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_blockstorageImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_blockstorage()
		 * @generated
		 */
		EClass TOSCA_NODES_BLOCKSTORAGE = eINSTANCE.getTosca_nodes_blockstorage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_BLOCKSTORAGE__SIZE = eINSTANCE.getTosca_nodes_blockstorage_Size();

		/**
		 * The meta object literal for the '<em><b>Volume Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_BLOCKSTORAGE__VOLUME_ID = eINSTANCE.getTosca_nodes_blockstorage_VolumeId();

		/**
		 * The meta object literal for the '<em><b>Snapshot Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_BLOCKSTORAGE__SNAPSHOT_ID = eINSTANCE.getTosca_nodes_blockstorage_SnapshotId();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_BLOCKSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_blockstorage__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_policies_rootImpl <em>Tosca policies root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_policies_rootImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_root()
		 * @generated
		 */
		EClass TOSCA_POLICIES_ROOT = eINSTANCE.getTosca_policies_root();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_policies_updateImpl <em>Tosca policies update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_policies_updateImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_update()
		 * @generated
		 */
		EClass TOSCA_POLICIES_UPDATE = eINSTANCE.getTosca_policies_update();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_policies_placementImpl <em>Tosca policies placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_policies_placementImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_placement()
		 * @generated
		 */
		EClass TOSCA_POLICIES_PLACEMENT = eINSTANCE.getTosca_policies_placement();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_policies_scalingImpl <em>Tosca policies scaling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_policies_scalingImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_scaling()
		 * @generated
		 */
		EClass TOSCA_POLICIES_SCALING = eINSTANCE.getTosca_policies_scaling();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_policies_performanceImpl <em>Tosca policies performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_policies_performanceImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_policies_performance()
		 * @generated
		 */
		EClass TOSCA_POLICIES_PERFORMANCE = eINSTANCE.getTosca_policies_performance();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_groups_rootImpl <em>Tosca groups root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_groups_rootImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_groups_root()
		 * @generated
		 */
		EClass TOSCA_GROUPS_ROOT = eINSTANCE.getTosca_groups_root();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_interfaces_rootImpl <em>Tosca interfaces root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_interfaces_rootImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_interfaces_root()
		 * @generated
		 */
		EClass TOSCA_INTERFACES_ROOT = eINSTANCE.getTosca_interfaces_root();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_interfaces_relationship_configureImpl <em>Tosca interfaces relationship configure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_interfaces_relationship_configureImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_interfaces_relationship_configure()
		 * @generated
		 */
		EClass TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE = eINSTANCE.getTosca_interfaces_relationship_configure();

		/**
		 * The meta object literal for the '<em><b>Pre configure source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_SOURCE = eINSTANCE.getTosca_interfaces_relationship_configure__Pre_configure_source();

		/**
		 * The meta object literal for the '<em><b>Pre configure target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_TARGET = eINSTANCE.getTosca_interfaces_relationship_configure__Pre_configure_target();

		/**
		 * The meta object literal for the '<em><b>Post configure source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_SOURCE = eINSTANCE.getTosca_interfaces_relationship_configure__Post_configure_source();

		/**
		 * The meta object literal for the '<em><b>Post configure target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_TARGET = eINSTANCE.getTosca_interfaces_relationship_configure__Post_configure_target();

		/**
		 * The meta object literal for the '<em><b>Remove target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___REMOVE_TARGET = eINSTANCE.getTosca_interfaces_relationship_configure__Remove_target();

		/**
		 * The meta object literal for the '<em><b>Add target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_TARGET = eINSTANCE.getTosca_interfaces_relationship_configure__Add_target();

		/**
		 * The meta object literal for the '<em><b>Add source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_SOURCE = eINSTANCE.getTosca_interfaces_relationship_configure__Add_source();

		/**
		 * The meta object literal for the '<em><b>Target changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___TARGET_CHANGED = eINSTANCE.getTosca_interfaces_relationship_configure__Target_changed();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_interfaces_node_lifecycle_standardImpl <em>Tosca interfaces node lifecycle standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_interfaces_node_lifecycle_standardImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_interfaces_node_lifecycle_standard()
		 * @generated
		 */
		EClass TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD = eINSTANCE.getTosca_interfaces_node_lifecycle_standard();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CREATE = eINSTANCE.getTosca_interfaces_node_lifecycle_standard__Create();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CONFIGURE = eINSTANCE.getTosca_interfaces_node_lifecycle_standard__Configure();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___DELETE = eINSTANCE.getTosca_interfaces_node_lifecycle_standard__Delete();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_rootImpl <em>Tosca relationships root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_rootImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_root()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_ROOT = eINSTANCE.getTosca_relationships_root();

		/**
		 * The meta object literal for the '<em><b>Tosca Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME = eINSTANCE.getTosca_relationships_root_ToscaName();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_RELATIONSHIPS_ROOT__STATE = eINSTANCE.getTosca_relationships_root_State();

		/**
		 * The meta object literal for the '<em><b>Tosca Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID = eINSTANCE.getTosca_relationships_root_ToscaId();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_root__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_connectstoImpl <em>Tosca relationships connectsto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_connectstoImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_connectsto()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_CONNECTSTO = eINSTANCE.getTosca_relationships_connectsto();

		/**
		 * The meta object literal for the '<em><b>Credential</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_RELATIONSHIPS_CONNECTSTO__CREDENTIAL = eINSTANCE.getTosca_relationships_connectsto_Credential();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_routestoImpl <em>Tosca relationships routesto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_routestoImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_routesto()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_ROUTESTO = eINSTANCE.getTosca_relationships_routesto();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Load Balancer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_ROUTESTO___SOURCE_MUST_BE_LOAD_BALANCER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_routesto__SourceMustBeLoadBalancer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_attachestoImpl <em>Tosca relationships attachesto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_attachestoImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_attachesto()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_ATTACHESTO = eINSTANCE.getTosca_relationships_attachesto();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_RELATIONSHIPS_ATTACHESTO__LOCATION = eINSTANCE.getTosca_relationships_attachesto_Location();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_ATTACHESTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_attachesto__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Compute And Target Must Be Block Storage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_ATTACHESTO___SOURCE_MUST_BE_COMPUTE_AND_TARGET_MUST_BE_BLOCK_STORAGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_attachesto__SourceMustBeComputeAndTargetMustBeBlockStorage__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_hostedonImpl <em>Tosca relationships hostedon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_hostedonImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_hostedon()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_HOSTEDON = eINSTANCE.getTosca_relationships_hostedon();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Web Server And Target Must Be Web Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_WEB_SERVER_AND_TARGET_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_hostedon__SourceMustBeWebServerAndTargetMustBeWebApplication__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Container Application And Target Must Be Container Runtime</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_CONTAINER_APPLICATION_AND_TARGET_MUST_BE_CONTAINER_RUNTIME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_hostedon__SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Software Component And Target Must Be Compute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_SOFTWARE_COMPONENT_AND_TARGET_MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_hostedon__SourceMustBeSoftwareComponentAndTargetMustBeCompute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Database And Target Must Be DBMS</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_DATABASE_AND_TARGET_MUST_BE_DBMS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_hostedon__SourceMustBeDatabaseAndTargetMustBeDBMS__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_dependsonImpl <em>Tosca relationships dependson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_dependsonImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_dependson()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_DEPENDSON = eINSTANCE.getTosca_relationships_dependson();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Node And Target Must Be Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_DEPENDSON___SOURCE_MUST_BE_NODE_AND_TARGET_MUST_BE_NODE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_dependson__SourceMustBeNodeAndTargetMustBeNode__DiagnosticChain_Map();

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
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_capabilities_somecapImpl <em>Tosca capabilities somecap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_capabilities_somecapImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_capabilities_somecap()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_SOMECAP = eINSTANCE.getTosca_capabilities_somecap();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_SOMECAP__TYPE = eINSTANCE.getTosca_capabilities_somecap_Type();

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
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_database_mysqlImpl <em>Tosca nodes database mysql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_database_mysqlImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_database_mysql()
		 * @generated
		 */
		EClass TOSCA_NODES_DATABASE_MYSQL = eINSTANCE.getTosca_nodes_database_mysql();

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
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_webapplication_wordpressImpl <em>Tosca nodes webapplication wordpress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_webapplication_wordpressImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_webapplication_wordpress()
		 * @generated
		 */
		EClass TOSCA_NODES_WEBAPPLICATION_WORDPRESS = eINSTANCE.getTosca_nodes_webapplication_wordpress();

		/**
		 * The meta object literal for the '<em><b>Db Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_WEBAPPLICATION_WORDPRESS__DB_HOST = eINSTANCE.getTosca_nodes_webapplication_wordpress_DbHost();

		/**
		 * The meta object literal for the '<em><b>Admin Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_PASSWORD = eINSTANCE.getTosca_nodes_webapplication_wordpress_AdminPassword();

		/**
		 * The meta object literal for the '<em><b>Admin User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_USER = eINSTANCE.getTosca_nodes_webapplication_wordpress_AdminUser();

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
		 * The meta object literal for the '{@link extendedtosca.impl.RsyslogImpl <em>Rsyslog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.RsyslogImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getRsyslog()
		 * @generated
		 */
		EClass RSYSLOG = eINSTANCE.getRsyslog();

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
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_softwarecomponent_collectdImpl <em>Tosca nodes softwarecomponent collectd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_softwarecomponent_collectdImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_softwarecomponent_collectd()
		 * @generated
		 */
		EClass TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD = eINSTANCE.getTosca_nodes_softwarecomponent_collectd();

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
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_nodewithreqImpl <em>Tosca nodes nodewithreq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_nodewithreqImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_nodewithreq()
		 * @generated
		 */
		EClass TOSCA_NODES_NODEWITHREQ = eINSTANCE.getTosca_nodes_nodewithreq();

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
		 * The meta object literal for the '<em><b>Some Prop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_SOMENODE__SOME_PROP = eINSTANCE.getTosca_nodes_somenode_SomeProp();

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
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_nodes_somenode2Impl <em>Tosca nodes somenode2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_nodes_somenode2Impl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_nodes_somenode2()
		 * @generated
		 */
		EClass TOSCA_NODES_SOMENODE2 = eINSTANCE.getTosca_nodes_somenode2();

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
		 * The meta object literal for the '{@link extendedtosca.impl.Tosca_relationships_haImpl <em>Tosca relationships ha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.impl.Tosca_relationships_haImpl
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getTosca_relationships_ha()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_HA = eINSTANCE.getTosca_relationships_ha();

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
		 * The meta object literal for the '{@link extendedtosca.protocolEnum <em>protocol Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.protocolEnum
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getprotocolEnum()
		 * @generated
		 */
		EEnum PROTOCOL_ENUM = eINSTANCE.getprotocolEnum();

		/**
		 * The meta object literal for the '{@link extendedtosca.initiatorEnum <em>initiator Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedtosca.initiatorEnum
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getinitiatorEnum()
		 * @generated
		 */
		EEnum INITIATOR_ENUM = eINSTANCE.getinitiatorEnum();

		/**
		 * The meta object literal for the '<em>string</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getstring()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getstring();

		/**
		 * The meta object literal for the '<em>string Min One</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getstringMinOne()
		 * @generated
		 */
		EDataType STRING_MIN_ONE = eINSTANCE.getstringMinOne();

		/**
		 * The meta object literal for the '<em>boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getboolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getboolean();

		/**
		 * The meta object literal for the '<em>byte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Byte
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getbyte()
		 * @generated
		 */
		EDataType BYTE = eINSTANCE.getbyte();

		/**
		 * The meta object literal for the '<em>double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getdouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getdouble();

		/**
		 * The meta object literal for the '<em>float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getfloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getfloat();

		/**
		 * The meta object literal for the '<em>integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getinteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getinteger();

		/**
		 * The meta object literal for the '<em>integer Min One</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getintegerMinOne()
		 * @generated
		 */
		EDataType INTEGER_MIN_ONE = eINSTANCE.getintegerMinOne();

		/**
		 * The meta object literal for the '<em>long</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getlong()
		 * @generated
		 */
		EDataType LONG = eINSTANCE.getlong();

		/**
		 * The meta object literal for the '<em>short</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getshort()
		 * @generated
		 */
		EDataType SHORT = eINSTANCE.getshort();

		/**
		 * The meta object literal for the '<em>map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getmap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getmap();

		/**
		 * The meta object literal for the '<em>version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getversion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getversion();

		/**
		 * The meta object literal for the '<em>range</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getrange()
		 * @generated
		 */
		EDataType RANGE = eINSTANCE.getrange();

		/**
		 * The meta object literal for the '<em>toscadatatypesnetwork Port Def</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#gettoscadatatypesnetworkPortDef()
		 * @generated
		 */
		EDataType TOSCADATATYPESNETWORK_PORT_DEF = eINSTANCE.gettoscadatatypesnetworkPortDef();

		/**
		 * The meta object literal for the '<em>scalar Frequency</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getscalarFrequency()
		 * @generated
		 */
		EDataType SCALAR_FREQUENCY = eINSTANCE.getscalarFrequency();

		/**
		 * The meta object literal for the '<em>scalar Size Min One MB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getscalarSizeMinOneMB()
		 * @generated
		 */
		EDataType SCALAR_SIZE_MIN_ONE_MB = eINSTANCE.getscalarSizeMinOneMB();

		/**
		 * The meta object literal for the '<em>scalar Size Min Zero GB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getscalarSizeMinZeroGB()
		 * @generated
		 */
		EDataType SCALAR_SIZE_MIN_ZERO_GB = eINSTANCE.getscalarSizeMinZeroGB();

		/**
		 * The meta object literal for the '<em>scalar Size Min Zero MB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see extendedtosca.impl.ExtendedtoscaPackageImpl#getscalarSizeMinZeroMB()
		 * @generated
		 */
		EDataType SCALAR_SIZE_MIN_ZERO_MB = eINSTANCE.getscalarSizeMinZeroMB();

	}

} //ExtendedtoscaPackage
