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
package org.eclipse.cmf.occi.tosca.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.cmf.occi.tosca.ToscaTables;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_container;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_admin;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_network_bindable;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_compute;
import org.eclipse.cmf.occi.tosca.initiatorEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes compute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getDefaultInstances <em>Default Instances</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getSecure <em>Secure</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getUrlPath <em>Url Path</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getPrivateAddress <em>Private Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getPublicAddress <em>Public Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl#getNetworks <em>Networks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_computeImpl extends Tosca_nodes_rootImpl implements Tosca_nodes_compute {
	/**
	 * The default value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_INSTANCES_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer minInstances = MIN_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_INSTANCES_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer maxInstances = MAX_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInstances() <em>Default Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_INSTANCES_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getDefaultInstances() <em>Default Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultInstances = DEFAULT_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected String portName = PORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = "tcp";

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final Short PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Short port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected static final initiatorEnum INITIATOR_EDEFAULT = initiatorEnum.SOURCE;

	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected initiatorEnum initiator = INITIATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkName() <em>Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NAME_EDEFAULT = "PRIVATE";

	/**
	 * The cached value of the '{@link #getNetworkName() <em>Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkName()
	 * @generated
	 * @ordered
	 */
	protected String networkName = NETWORK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecure() <em>Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SECURE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSecure() <em>Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecure()
	 * @generated
	 * @ordered
	 */
	protected Boolean secure = SECURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected static final Map PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected Map ports = PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlPath() <em>Url Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPath()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlPath() <em>Url Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPath()
	 * @generated
	 * @ordered
	 */
	protected String urlPath = URL_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected String distribution = DISTRIBUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected Integer diskSize = DISK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateAddress() <em>Private Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateAddress() <em>Private Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateAddress()
	 * @generated
	 * @ordered
	 */
	protected String privateAddress = PRIVATE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicAddress() <em>Public Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicAddress() <em>Public Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicAddress()
	 * @generated
	 * @ordered
	 */
	protected String publicAddress = PUBLIC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworks() <em>Networks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected static final Map NETWORKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected Map networks = NETWORKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_computeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCA_NODES_COMPUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinInstances() {
		return minInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInstances(Integer newMinInstances) {
		Integer oldMinInstances = minInstances;
		minInstances = newMinInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES, oldMinInstances, minInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxInstances() {
		return maxInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInstances(Integer newMaxInstances) {
		Integer oldMaxInstances = maxInstances;
		maxInstances = newMaxInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES, oldMaxInstances, maxInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDefaultInstances() {
		return defaultInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultInstances(Integer newDefaultInstances) {
		Integer oldDefaultInstances = defaultInstances;
		defaultInstances = newDefaultInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES, oldDefaultInstances, defaultInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortName() {
		return portName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortName(String newPortName) {
		String oldPortName = portName;
		portName = newPortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME, oldPortName, portName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Short newPort) {
		Short oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public initiatorEnum getInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiator(initiatorEnum newInitiator) {
		initiatorEnum oldInitiator = initiator;
		initiator = newInitiator == null ? INITIATOR_EDEFAULT : newInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR, oldInitiator, initiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkName() {
		return networkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkName(String newNetworkName) {
		String oldNetworkName = networkName;
		networkName = newNetworkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME, oldNetworkName, networkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSecure() {
		return secure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecure(Boolean newSecure) {
		Boolean oldSecure = secure;
		secure = newSecure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__SECURE, oldSecure, secure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(Map newPorts) {
		Map oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__PORTS, oldPorts, ports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlPath() {
		return urlPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlPath(String newUrlPath) {
		String oldUrlPath = urlPath;
		urlPath = newUrlPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH, oldUrlPath, urlPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(String newDistribution) {
		String oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION, oldDistribution, distribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDiskSize() {
		return diskSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskSize(Integer newDiskSize) {
		Integer oldDiskSize = diskSize;
		diskSize = newDiskSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateAddress() {
		return privateAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateAddress(String newPrivateAddress) {
		String oldPrivateAddress = privateAddress;
		privateAddress = newPrivateAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS, oldPrivateAddress, privateAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicAddress() {
		return publicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicAddress(String newPublicAddress) {
		String oldPublicAddress = publicAddress;
		publicAddress = newPublicAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS, oldPublicAddress, publicAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getNetworks() {
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworks(Map newNetworks) {
		Map oldNetworks = networks;
		networks = newNetworks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_COMPUTE__NETWORKS, oldNetworks, networks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeSoftwareComponent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SourceMustBeSoftwareComponent: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let
		 *     severity : Integer[1] = 'Tosca_nodes_compute::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Compute)
		 *       in
		 *         'Tosca_nodes_compute::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ToscaTables.STR_Tosca_nodes_compute_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ToscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Compute = idResolver.getClass(ToscaTables.CLSSid_Compute, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Compute).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ToscaTables.STR_Tosca_nodes_compute_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ToscaTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES:
				return getMinInstances();
			case ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES:
				return getMaxInstances();
			case ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES:
				return getDefaultInstances();
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME:
				return getPortName();
			case ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL:
				return getProtocol();
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORT:
				return getPort();
			case ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR:
				return getInitiator();
			case ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME:
				return getNetworkName();
			case ToscaPackage.TOSCA_NODES_COMPUTE__SECURE:
				return getSecure();
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORTS:
				return getPorts();
			case ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH:
				return getUrlPath();
			case ToscaPackage.TOSCA_NODES_COMPUTE__TYPE:
				return getType();
			case ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION:
				return getDistribution();
			case ToscaPackage.TOSCA_NODES_COMPUTE__VERSION:
				return getVersion();
			case ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE:
				return getDiskSize();
			case ToscaPackage.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS:
				return getPrivateAddress();
			case ToscaPackage.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS:
				return getPublicAddress();
			case ToscaPackage.TOSCA_NODES_COMPUTE__NETWORKS:
				return getNetworks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES:
				setMinInstances((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES:
				setMaxInstances((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES:
				setDefaultInstances((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME:
				setPortName((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORT:
				setPort((Short)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR:
				setInitiator((initiatorEnum)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME:
				setNetworkName((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__SECURE:
				setSecure((Boolean)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORTS:
				setPorts((Map)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH:
				setUrlPath((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__TYPE:
				setType((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION:
				setDistribution((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__VERSION:
				setVersion((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE:
				setDiskSize((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS:
				setPrivateAddress((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS:
				setPublicAddress((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__NETWORKS:
				setNetworks((Map)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES:
				setMinInstances(MIN_INSTANCES_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES:
				setMaxInstances(MAX_INSTANCES_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES:
				setDefaultInstances(DEFAULT_INSTANCES_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME:
				setPortName(PORT_NAME_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR:
				setInitiator(INITIATOR_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME:
				setNetworkName(NETWORK_NAME_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__SECURE:
				setSecure(SECURE_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORTS:
				setPorts(PORTS_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH:
				setUrlPath(URL_PATH_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION:
				setDistribution(DISTRIBUTION_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS:
				setPrivateAddress(PRIVATE_ADDRESS_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS:
				setPublicAddress(PUBLIC_ADDRESS_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_COMPUTE__NETWORKS:
				setNetworks(NETWORKS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES:
				return MIN_INSTANCES_EDEFAULT == null ? minInstances != null : !MIN_INSTANCES_EDEFAULT.equals(minInstances);
			case ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES:
				return MAX_INSTANCES_EDEFAULT == null ? maxInstances != null : !MAX_INSTANCES_EDEFAULT.equals(maxInstances);
			case ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES:
				return DEFAULT_INSTANCES_EDEFAULT == null ? defaultInstances != null : !DEFAULT_INSTANCES_EDEFAULT.equals(defaultInstances);
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME:
				return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
			case ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR:
				return initiator != INITIATOR_EDEFAULT;
			case ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME:
				return NETWORK_NAME_EDEFAULT == null ? networkName != null : !NETWORK_NAME_EDEFAULT.equals(networkName);
			case ToscaPackage.TOSCA_NODES_COMPUTE__SECURE:
				return SECURE_EDEFAULT == null ? secure != null : !SECURE_EDEFAULT.equals(secure);
			case ToscaPackage.TOSCA_NODES_COMPUTE__PORTS:
				return PORTS_EDEFAULT == null ? ports != null : !PORTS_EDEFAULT.equals(ports);
			case ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH:
				return URL_PATH_EDEFAULT == null ? urlPath != null : !URL_PATH_EDEFAULT.equals(urlPath);
			case ToscaPackage.TOSCA_NODES_COMPUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION:
				return DISTRIBUTION_EDEFAULT == null ? distribution != null : !DISTRIBUTION_EDEFAULT.equals(distribution);
			case ToscaPackage.TOSCA_NODES_COMPUTE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
			case ToscaPackage.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS:
				return PRIVATE_ADDRESS_EDEFAULT == null ? privateAddress != null : !PRIVATE_ADDRESS_EDEFAULT.equals(privateAddress);
			case ToscaPackage.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS:
				return PUBLIC_ADDRESS_EDEFAULT == null ? publicAddress != null : !PUBLIC_ADDRESS_EDEFAULT.equals(publicAddress);
			case ToscaPackage.TOSCA_NODES_COMPUTE__NETWORKS:
				return NETWORKS_EDEFAULT == null ? networks != null : !NETWORKS_EDEFAULT.equals(networks);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Tosca_capabilities_scalable.class) {
			switch (derivedFeatureID) {
				case ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES: return ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES;
				case ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES: return ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES;
				case ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES: return ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint.class) {
			switch (derivedFeatureID) {
				case ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;
				case ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;
				case ToscaPackage.TOSCA_NODES_COMPUTE__PORT: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT;
				case ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;
				case ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;
				case ToscaPackage.TOSCA_NODES_COMPUTE__SECURE: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE;
				case ToscaPackage.TOSCA_NODES_COMPUTE__PORTS: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS;
				case ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint_admin.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_operatingsystem.class) {
			switch (derivedFeatureID) {
				case ToscaPackage.TOSCA_NODES_COMPUTE__TYPE: return ToscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM__TYPE;
				case ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION: return ToscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM__DISTRIBUTION;
				case ToscaPackage.TOSCA_NODES_COMPUTE__VERSION: return ToscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM__VERSION;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_container.class) {
			switch (derivedFeatureID) {
				case ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE: return ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_network_bindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Tosca_capabilities_scalable.class) {
			switch (baseFeatureID) {
				case ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES: return ToscaPackage.TOSCA_NODES_COMPUTE__MIN_INSTANCES;
				case ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES: return ToscaPackage.TOSCA_NODES_COMPUTE__MAX_INSTANCES;
				case ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES: return ToscaPackage.TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint.class) {
			switch (baseFeatureID) {
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME: return ToscaPackage.TOSCA_NODES_COMPUTE__PORT_NAME;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL: return ToscaPackage.TOSCA_NODES_COMPUTE__PROTOCOL;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT: return ToscaPackage.TOSCA_NODES_COMPUTE__PORT;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR: return ToscaPackage.TOSCA_NODES_COMPUTE__INITIATOR;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME: return ToscaPackage.TOSCA_NODES_COMPUTE__NETWORK_NAME;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE: return ToscaPackage.TOSCA_NODES_COMPUTE__SECURE;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS: return ToscaPackage.TOSCA_NODES_COMPUTE__PORTS;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH: return ToscaPackage.TOSCA_NODES_COMPUTE__URL_PATH;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint_admin.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_operatingsystem.class) {
			switch (baseFeatureID) {
				case ToscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM__TYPE: return ToscaPackage.TOSCA_NODES_COMPUTE__TYPE;
				case ToscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM__DISTRIBUTION: return ToscaPackage.TOSCA_NODES_COMPUTE__DISTRIBUTION;
				case ToscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM__VERSION: return ToscaPackage.TOSCA_NODES_COMPUTE__VERSION;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_container.class) {
			switch (baseFeatureID) {
				case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE: return ToscaPackage.TOSCA_NODES_COMPUTE__DISK_SIZE;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_network_bindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToscaPackage.TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeSoftwareComponent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ToscaPackage.TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minInstances: ");
		result.append(minInstances);
		result.append(", maxInstances: ");
		result.append(maxInstances);
		result.append(", defaultInstances: ");
		result.append(defaultInstances);
		result.append(", portName: ");
		result.append(portName);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", port: ");
		result.append(port);
		result.append(", initiator: ");
		result.append(initiator);
		result.append(", networkName: ");
		result.append(networkName);
		result.append(", secure: ");
		result.append(secure);
		result.append(", ports: ");
		result.append(ports);
		result.append(", urlPath: ");
		result.append(urlPath);
		result.append(", type: ");
		result.append(type);
		result.append(", distribution: ");
		result.append(distribution);
		result.append(", version: ");
		result.append(version);
		result.append(", diskSize: ");
		result.append(diskSize);
		result.append(", privateAddress: ");
		result.append(privateAddress);
		result.append(", publicAddress: ");
		result.append(publicAddress);
		result.append(", networks: ");
		result.append(networks);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_computeImpl
