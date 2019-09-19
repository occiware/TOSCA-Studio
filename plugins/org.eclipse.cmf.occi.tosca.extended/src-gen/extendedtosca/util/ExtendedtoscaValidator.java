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
package extendedtosca.util;

import extendedtosca.*;

import java.util.Map;

import modmacao.util.ModmacaoValidator;

import org.eclipse.cmf.occi.tosca.util.ToscaValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.modmacao.occi.platform.util.PlatformValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see extendedtosca.ExtendedtoscaPackage
 * @generated
 */
public class ExtendedtoscaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExtendedtoscaValidator INSTANCE = new ExtendedtoscaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "extendedtosca";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes network network'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_NETWORK_NETWORK__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes network port'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_NETWORK_PORT__APPLIES_CONSTRAINT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToscaValidator toscaValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformValidator platformValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModmacaoValidator modmacaoValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedtoscaValidator() {
		super();
		toscaValidator = ToscaValidator.INSTANCE;
		platformValidator = PlatformValidator.INSTANCE;
		modmacaoValidator = ModmacaoValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ExtendedtoscaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL:
				return validatearrayCredential((arrayCredential)value, diagnostics, context);
			case ExtendedtoscaPackage.ARRAY_PORT_SPEC:
				return validatearrayPortSpec((arrayPortSpec)value, diagnostics, context);
			case ExtendedtoscaPackage.ARRAYVERSION:
				return validatearrayversion((arrayversion)value, diagnostics, context);
			case ExtendedtoscaPackage.ARRAYINTEGER:
				return validatearrayinteger((arrayinteger)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECAP:
				return validateTosca_capabilities_somecap((Tosca_capabilities_somecap)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_INDIGO_ENDPOINT:
				return validateTosca_capabilities_indigo_endpoint((Tosca_capabilities_indigo_endpoint)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_HA:
				return validateTosca_capabilities_ha((Tosca_capabilities_ha)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER:
				return validateTosca_capabilities_container_docker((Tosca_capabilities_container_docker)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINERCHILD:
				return validateTosca_capabilities_containerchild((Tosca_capabilities_containerchild)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECHILDCAP:
				return validateTosca_capabilities_somechildcap((Tosca_capabilities_somechildcap)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHPROP:
				return validateTosca_nodes_computewithprop((Tosca_nodes_computewithprop)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE:
				return validateTosca_nodes_webapplication_paypalpizzastore((Tosca_nodes_webapplication_paypalpizzastore)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK:
				return validateTosca_nodes_network_network((Tosca_nodes_network_network)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_CONTAINER_APPLICATION_DOCKER:
				return validateTosca_nodes_container_application_docker((Tosca_nodes_container_application_docker)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_KIBANA:
				return validateTosca_nodes_softwarecomponent_kibana((Tosca_nodes_softwarecomponent_kibana)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST:
				return validateTosca_nodes_computewithattrlist((Tosca_nodes_computewithattrlist)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH:
				return validateTosca_nodes_softwarecomponent_logstash((Tosca_nodes_softwarecomponent_logstash)value, diagnostics, context);
			case ExtendedtoscaPackage.EXAMPLE_DATABASESUBSYSTEM:
				return validateExample_databasesubsystem((Example_databasesubsystem)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD:
				return validateTosca_nodes_softwarecomponent_collectd((Tosca_nodes_softwarecomponent_collectd)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHREQ:
				return validateTosca_nodes_nodewithreq((Tosca_nodes_nodewithreq)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE2:
				return validateTosca_nodes_somenode2((Tosca_nodes_somenode2)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_PHP:
				return validateTosca_nodes_php((Tosca_nodes_php)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE_MYSQL:
				return validateTosca_nodes_database_mysql((Tosca_nodes_database_mysql)value, diagnostics, context);
			case ExtendedtoscaPackage.EXAMPLE_QUEUINGSUBSYSTEM:
				return validateExample_queuingsubsystem((Example_queuingsubsystem)value, diagnostics, context);
			case ExtendedtoscaPackage.EXAMPLE_TRANSACTIONSUBSYSTEM:
				return validateExample_transactionsubsystem((Example_transactionsubsystem)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_ABSTRACTMYSQL:
				return validateTosca_nodes_abstractmysql((Tosca_nodes_abstractmysql)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL:
				return validateTosca_nodes_mysql((Tosca_nodes_mysql)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH:
				return validateTosca_nodes_softwarecomponent_elasticsearch((Tosca_nodes_softwarecomponent_elasticsearch)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM:
				return validateTosca_nodes_databasewithlistparam((Tosca_nodes_databasewithlistparam)value, diagnostics, context);
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP:
				return validateExample_someapp((Example_someapp)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP:
				return validateTosca_nodes_nodewithcap((Tosca_nodes_nodewithcap)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_APACHE:
				return validateTosca_nodes_apache((Tosca_nodes_apache)value, diagnostics, context);
			case ExtendedtoscaPackage.RSYSLOG:
				return validateRsyslog((Rsyslog)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_WORDPRESS:
				return validateTosca_nodes_wordpress((Tosca_nodes_wordpress)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT:
				return validateTosca_nodes_network_port((Tosca_nodes_network_port)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHCAPWITHATTR:
				return validateTosca_nodes_computewithcapwithattr((Tosca_nodes_computewithcapwithattr)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG:
				return validateTosca_nodes_softwarecomponent_rsyslog((Tosca_nodes_softwarecomponent_rsyslog)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_HACOMPUTE:
				return validateTosca_nodes_hacompute((Tosca_nodes_hacompute)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE:
				return validateTosca_nodes_somenode((Tosca_nodes_somenode)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER_NODEJS:
				return validateTosca_nodes_webserver_nodejs((Tosca_nodes_webserver_nodejs)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_DBMS_MYSQL:
				return validateTosca_nodes_dbms_mysql((Tosca_nodes_dbms_mysql)value, diagnostics, context);
			case ExtendedtoscaPackage.MYCOMPANY_MYTYPES_MYSCALINGPOLICY:
				return validateMycompany_mytypes_myscalingpolicy((Mycompany_mytypes_myscalingpolicy)value, diagnostics, context);
			case ExtendedtoscaPackage.TEST_RELATION_CONNECTS:
				return validateTest_relation_connects((Test_relation_connects)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_NETWORK_BINDSTO:
				return validateTosca_relationships_network_bindsto((Tosca_relationships_network_bindsto)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_HA:
				return validateTosca_relationships_ha((Tosca_relationships_ha)value, diagnostics, context);
			case ExtendedtoscaPackage.MYATTACHESTO:
				return validateMyattachesto((Myattachesto)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_NETWORK_LINKSTO:
				return validateTosca_relationships_network_linksto((Tosca_relationships_network_linksto)value, diagnostics, context);
			case ExtendedtoscaPackage.IP_VERSION_ENUM:
				return validateip_versionEnum((ip_versionEnum)value, diagnostics, context);
			case ExtendedtoscaPackage.STORAGE_PATH_ENUM:
				return validatestorage_pathEnum((storage_pathEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearrayCredential(arrayCredential arrayCredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayCredential, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearrayPortSpec(arrayPortSpec arrayPortSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayPortSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearrayversion(arrayversion arrayversion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayversion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearrayinteger(arrayinteger arrayinteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayinteger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_somecap(Tosca_capabilities_somecap tosca_capabilities_somecap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_somecap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_indigo_endpoint(Tosca_capabilities_indigo_endpoint tosca_capabilities_indigo_endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_indigo_endpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_ha(Tosca_capabilities_ha tosca_capabilities_ha, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_ha, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_container_docker(Tosca_capabilities_container_docker tosca_capabilities_container_docker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_container_docker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_containerchild(Tosca_capabilities_containerchild tosca_capabilities_containerchild, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_containerchild, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_somechildcap(Tosca_capabilities_somechildcap tosca_capabilities_somechildcap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_somechildcap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_computewithprop(Tosca_nodes_computewithprop tosca_nodes_computewithprop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_computewithprop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_compute_SourceMustBeSoftwareComponent(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_compute_appliesConstraint(tosca_nodes_computewithprop, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_webapplication_paypalpizzastore(Tosca_nodes_webapplication_paypalpizzastore tosca_nodes_webapplication_paypalpizzastore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_webapplication_appliesConstraint(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_network_network(Tosca_nodes_network_network tosca_nodes_network_network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_network_network, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_network_network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_network_network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_network_network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_network_network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_network_network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_network_network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_network_network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_network_network, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_network_network_appliesConstraint(tosca_nodes_network_network, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes network network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_network_network_appliesConstraint(Tosca_nodes_network_network tosca_nodes_network_network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_network_network.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_container_application_docker(Tosca_nodes_container_application_docker tosca_nodes_container_application_docker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_container_application_docker, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_container_application_appliesConstraint(tosca_nodes_container_application_docker, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_kibana(Tosca_nodes_softwarecomponent_kibana tosca_nodes_softwarecomponent_kibana, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_kibana, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_computewithattrlist(Tosca_nodes_computewithattrlist tosca_nodes_computewithattrlist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_computewithattrlist, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_compute_SourceMustBeSoftwareComponent(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_compute_appliesConstraint(tosca_nodes_computewithattrlist, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_logstash(Tosca_nodes_softwarecomponent_logstash tosca_nodes_softwarecomponent_logstash, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_logstash, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExample_databasesubsystem(Example_databasesubsystem example_databasesubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(example_databasesubsystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_collectd(Tosca_nodes_softwarecomponent_collectd tosca_nodes_softwarecomponent_collectd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_collectd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_nodewithreq(Tosca_nodes_nodewithreq tosca_nodes_nodewithreq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_nodewithreq, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_nodewithreq, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_somenode2(Tosca_nodes_somenode2 tosca_nodes_somenode2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_nodes_somenode2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_php(Tosca_nodes_php tosca_nodes_php, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_php, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_php, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_php, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_php, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_php, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_php, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_php, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_php, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_php, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_php, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_database_mysql(Tosca_nodes_database_mysql tosca_nodes_database_mysql, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_database_mysql, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_database_appliesConstraint(tosca_nodes_database_mysql, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExample_queuingsubsystem(Example_queuingsubsystem example_queuingsubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(example_queuingsubsystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExample_transactionsubsystem(Example_transactionsubsystem example_transactionsubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(example_transactionsubsystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_abstractmysql(Tosca_nodes_abstractmysql tosca_nodes_abstractmysql, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_abstractmysql, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_abstractmysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_abstractmysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_abstractmysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_abstractmysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_abstractmysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_abstractmysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_abstractmysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_abstractmysql, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_database_appliesConstraint(tosca_nodes_abstractmysql, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_mysql(Tosca_nodes_mysql tosca_nodes_mysql, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_mysql, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_database_appliesConstraint(tosca_nodes_mysql, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_elasticsearch(Tosca_nodes_softwarecomponent_elasticsearch tosca_nodes_softwarecomponent_elasticsearch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_databasewithlistparam(Tosca_nodes_databasewithlistparam tosca_nodes_databasewithlistparam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_databasewithlistparam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_database_appliesConstraint(tosca_nodes_databasewithlistparam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExample_someapp(Example_someapp example_someapp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(example_someapp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_nodewithcap(Tosca_nodes_nodewithcap tosca_nodes_nodewithcap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_nodes_nodewithcap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_apache(Tosca_nodes_apache tosca_nodes_apache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_apache, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_apache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_apache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_apache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_apache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_apache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_apache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_apache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_apache, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_apache, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_webserver_SourceMustBeWebApplication(tosca_nodes_apache, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRsyslog(Rsyslog rsyslog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rsyslog, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(rsyslog, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_wordpress(Tosca_nodes_wordpress tosca_nodes_wordpress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_wordpress, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_webapplication_appliesConstraint(tosca_nodes_wordpress, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_network_port(Tosca_nodes_network_port tosca_nodes_network_port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_network_port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_network_port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_network_port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_network_port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_network_port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_network_port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_network_port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_network_port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_network_port, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_network_port_appliesConstraint(tosca_nodes_network_port, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes network port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_network_port_appliesConstraint(Tosca_nodes_network_port tosca_nodes_network_port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_network_port.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_computewithcapwithattr(Tosca_nodes_computewithcapwithattr tosca_nodes_computewithcapwithattr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_computewithcapwithattr, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_compute_SourceMustBeSoftwareComponent(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_compute_appliesConstraint(tosca_nodes_computewithcapwithattr, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_rsyslog(Tosca_nodes_softwarecomponent_rsyslog tosca_nodes_softwarecomponent_rsyslog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_hacompute(Tosca_nodes_hacompute tosca_nodes_hacompute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_hacompute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_compute_SourceMustBeSoftwareComponent(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_compute_appliesConstraint(tosca_nodes_hacompute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_somenode(Tosca_nodes_somenode tosca_nodes_somenode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_nodes_somenode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_webserver_nodejs(Tosca_nodes_webserver_nodejs tosca_nodes_webserver_nodejs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_webserver_nodejs, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_webserver_SourceMustBeWebApplication(tosca_nodes_webserver_nodejs, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_dbms_mysql(Tosca_nodes_dbms_mysql tosca_nodes_dbms_mysql, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_dbms_mysql, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_nodes_dbms_SourceMustBeDatabase(tosca_nodes_dbms_mysql, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMycompany_mytypes_myscalingpolicy(Mycompany_mytypes_myscalingpolicy mycompany_mytypes_myscalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mycompany_mytypes_myscalingpolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_relation_connects(Test_relation_connects test_relation_connects, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(test_relation_connects, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_network_bindsto(Tosca_relationships_network_bindsto tosca_relationships_network_bindsto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_network_bindsto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_SourceMustBeComponent(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_TargetMustBeComponent(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_relationships_root_appliesConstraint(tosca_relationships_network_bindsto, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_relationships_dependson_SourceMustBeNodeAndTargetMustBeNode(tosca_relationships_network_bindsto, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_ha(Tosca_relationships_ha tosca_relationships_ha, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_ha, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_SourceMustBeComponent(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_TargetMustBeComponent(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_relationships_root_appliesConstraint(tosca_relationships_ha, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyattachesto(Myattachesto myattachesto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(myattachesto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_SourceMustBeComponent(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_TargetMustBeComponent(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_relationships_attachesto_appliesConstraint(myattachesto, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_relationships_attachesto_SourceMustBeComputeAndTargetMustBeBlockStorage(myattachesto, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_network_linksto(Tosca_relationships_network_linksto tosca_relationships_network_linksto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_network_linksto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_SourceMustBeComponent(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= modmacaoValidator.validateDependency_TargetMustBeComponent(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_relationships_root_appliesConstraint(tosca_relationships_network_linksto, diagnostics, context);
		if (result || diagnostics != null) result &= toscaValidator.validateTosca_relationships_dependson_SourceMustBeNodeAndTargetMustBeNode(tosca_relationships_network_linksto, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateip_versionEnum(ip_versionEnum ip_versionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestorage_pathEnum(storage_pathEnum storage_pathEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ExtendedtoscaValidator
