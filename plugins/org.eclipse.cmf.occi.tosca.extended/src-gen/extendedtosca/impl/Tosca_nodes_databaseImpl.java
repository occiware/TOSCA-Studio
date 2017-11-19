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
import extendedtosca.ExtendedtoscaTables;
import extendedtosca.Tosca_capabilities_endpoint;
import extendedtosca.Tosca_capabilities_endpoint_database;
import extendedtosca.Tosca_nodes_database;
import extendedtosca.Tosca_nodes_root;
import extendedtosca.initiatorEnum;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

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
 * An implementation of the model object '<em><b>Tosca nodes database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getPort <em>Port</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getSecure <em>Secure</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getUrlPath <em>Url Path</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databaseImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_databaseImpl extends Tosca_nodes_rootImpl implements Tosca_nodes_database {
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
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_databaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_DATABASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT_NAME, oldPortName, portName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__INITIATOR, oldInitiator, initiator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME, oldNetworkName, networkName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__SECURE, oldSecure, secure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORTS, oldPorts, ports));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__URL_PATH, oldUrlPath, urlPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASE__USER, oldUser, user));
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
		 *     severity : Integer[1] = 'Tosca_nodes_database::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Component)
		 *       in
		 *         'Tosca_nodes_database::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ExtendedtoscaTables.STR_Tosca_nodes_database_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ExtendedtoscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Component_0 = idResolver.getClass(ExtendedtoscaTables.CLSSid_Component, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Component_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ExtendedtoscaTables.STR_Tosca_nodes_database_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ExtendedtoscaTables.INT_0).booleanValue();
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
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT_NAME:
				return getPortName();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PROTOCOL:
				return getProtocol();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT:
				return getPort();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__INITIATOR:
				return getInitiator();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME:
				return getNetworkName();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__SECURE:
				return getSecure();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORTS:
				return getPorts();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__URL_PATH:
				return getUrlPath();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PASSWORD:
				return getPassword();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NAME:
				return getName();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__USER:
				return getUser();
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
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT_NAME:
				setPortName((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT:
				setPort((Short)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__INITIATOR:
				setInitiator((initiatorEnum)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME:
				setNetworkName((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__SECURE:
				setSecure((Boolean)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORTS:
				setPorts((Map)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__URL_PATH:
				setUrlPath((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PASSWORD:
				setPassword((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NAME:
				setName((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__USER:
				setUser((String)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT_NAME:
				setPortName(PORT_NAME_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__INITIATOR:
				setInitiator(INITIATOR_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME:
				setNetworkName(NETWORK_NAME_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__SECURE:
				setSecure(SECURE_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORTS:
				setPorts(PORTS_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__URL_PATH:
				setUrlPath(URL_PATH_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__USER:
				setUser(USER_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT_NAME:
				return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__INITIATOR:
				return initiator != INITIATOR_EDEFAULT;
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME:
				return NETWORK_NAME_EDEFAULT == null ? networkName != null : !NETWORK_NAME_EDEFAULT.equals(networkName);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__SECURE:
				return SECURE_EDEFAULT == null ? secure != null : !SECURE_EDEFAULT.equals(secure);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORTS:
				return PORTS_EDEFAULT == null ? ports != null : !PORTS_EDEFAULT.equals(ports);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__URL_PATH:
				return URL_PATH_EDEFAULT == null ? urlPath != null : !URL_PATH_EDEFAULT.equals(urlPath);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
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
				case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT_NAME: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;
				case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PROTOCOL: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;
				case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT;
				case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__INITIATOR: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;
				case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;
				case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__SECURE: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE;
				case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORTS: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS;
				case ExtendedtoscaPackage.TOSCA_NODES_DATABASE__URL_PATH: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint_database.class) {
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
		if (baseClass == Tosca_capabilities_endpoint.class) {
			switch (baseFeatureID) {
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME: return ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT_NAME;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL: return ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PROTOCOL;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT: return ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORT;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR: return ExtendedtoscaPackage.TOSCA_NODES_DATABASE__INITIATOR;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME: return ExtendedtoscaPackage.TOSCA_NODES_DATABASE__NETWORK_NAME;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE: return ExtendedtoscaPackage.TOSCA_NODES_DATABASE__SECURE;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS: return ExtendedtoscaPackage.TOSCA_NODES_DATABASE__PORTS;
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH: return ExtendedtoscaPackage.TOSCA_NODES_DATABASE__URL_PATH;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint_database.class) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Tosca_nodes_root.class) {
			switch (baseOperationID) {
				case ExtendedtoscaPackage.TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return ExtendedtoscaPackage.TOSCA_NODES_DATABASE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Tosca_capabilities_endpoint.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint_database.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(", password: ");
		result.append(password);
		result.append(", name: ");
		result.append(name);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_databaseImpl
