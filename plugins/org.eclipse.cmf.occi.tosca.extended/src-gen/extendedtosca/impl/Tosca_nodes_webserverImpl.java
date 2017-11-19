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
package extendedtosca.impl;

import extendedtosca.ExtendedtoscaPackage;
import extendedtosca.Tosca_capabilities_container;
import extendedtosca.Tosca_capabilities_endpoint;
import extendedtosca.Tosca_capabilities_endpoint_admin;
import extendedtosca.Tosca_nodes_webserver;
import extendedtosca.initiatorEnum;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes webserver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webserverImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webserverImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webserverImpl#getPort <em>Port</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webserverImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webserverImpl#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webserverImpl#getSecure <em>Secure</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webserverImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webserverImpl#getUrlPath <em>Url Path</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webserverImpl#getDiskSize <em>Disk Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_webserverImpl extends Tosca_nodes_softwarecomponentImpl implements Tosca_nodes_webserver {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_webserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_WEBSERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME, oldPortName, portName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR, oldInitiator, initiator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME, oldNetworkName, networkName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__SECURE, oldSecure, secure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORTS, oldPorts, ports));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH, oldUrlPath, urlPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeWebApplication(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SourceMustBeWebApplication: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME:
				return getPortName();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL:
				return getProtocol();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT:
				return getPort();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR:
				return getInitiator();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME:
				return getNetworkName();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__SECURE:
				return getSecure();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORTS:
				return getPorts();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH:
				return getUrlPath();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE:
				return getDiskSize();
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME:
				setPortName((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT:
				setPort((Short)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR:
				setInitiator((initiatorEnum)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME:
				setNetworkName((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__SECURE:
				setSecure((Boolean)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORTS:
				setPorts((Map)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH:
				setUrlPath((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE:
				setDiskSize((Integer)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME:
				setPortName(PORT_NAME_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR:
				setInitiator(INITIATOR_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME:
				setNetworkName(NETWORK_NAME_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__SECURE:
				setSecure(SECURE_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORTS:
				setPorts(PORTS_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH:
				setUrlPath(URL_PATH_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME:
				return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR:
				return initiator != INITIATOR_EDEFAULT;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME:
				return NETWORK_NAME_EDEFAULT == null ? networkName != null : !NETWORK_NAME_EDEFAULT.equals(networkName);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__SECURE:
				return SECURE_EDEFAULT == null ? secure != null : !SECURE_EDEFAULT.equals(secure);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORTS:
				return PORTS_EDEFAULT == null ? ports != null : !PORTS_EDEFAULT.equals(ports);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH:
				return URL_PATH_EDEFAULT == null ? urlPath != null : !URL_PATH_EDEFAULT.equals(urlPath);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
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
		if (baseClass == Tosca_capabilities_endpoint.class) {
			switch (derivedFeatureID) {
				case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;
				case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;
				case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT;
				case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;
				case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;
				case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__SECURE: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE;
				case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORTS: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS;
				case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint_admin.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_container.class) {
			switch (derivedFeatureID) {
				case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE;
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
		if (baseClass == Tosca_capabilities_endpoint.class) {
			switch (baseFeatureID) {
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME: return ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL: return ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT: return ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORT;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR: return ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME: return ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE: return ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__SECURE;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS: return ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__PORTS;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH: return ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint_admin.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_container.class) {
			switch (baseFeatureID) {
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE: return ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE;
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER___SOURCE_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeWebApplication((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (portName: ");
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
		result.append(", diskSize: ");
		result.append(diskSize);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_webserverImpl
