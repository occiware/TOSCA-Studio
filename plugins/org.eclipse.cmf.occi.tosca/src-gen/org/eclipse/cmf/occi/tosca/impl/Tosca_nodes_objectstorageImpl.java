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
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_root;
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
 * An implementation of the model object '<em><b>Tosca nodes objectstorage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getSecure <em>Secure</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getUrlPath <em>Url Path</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_objectstorageImpl extends Tosca_nodes_rootImpl implements Tosca_nodes_objectstorage {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer size = SIZE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_objectstorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCA_NODES_OBJECTSTORAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT_NAME, oldPortName, portName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__INITIATOR, oldInitiator, initiator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NETWORK_NAME, oldNetworkName, networkName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SECURE, oldSecure, secure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORTS, oldPorts, ports));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__URL_PATH, oldUrlPath, urlPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Integer newSize) {
		Integer oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NAME, oldName, name));
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
		 *     severity : Integer[1] = 'Tosca_nodes_objectstorage::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Storage)
		 *       in
		 *         'Tosca_nodes_objectstorage::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ToscaTables.STR_Tosca_nodes_objectstorage_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ToscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Storage = idResolver.getClass(ToscaTables.CLSSid_Storage, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Storage).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ToscaTables.STR_Tosca_nodes_objectstorage_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ToscaTables.INT_0).booleanValue();
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
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT_NAME:
				return getPortName();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PROTOCOL:
				return getProtocol();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT:
				return getPort();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__INITIATOR:
				return getInitiator();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NETWORK_NAME:
				return getNetworkName();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SECURE:
				return getSecure();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORTS:
				return getPorts();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__URL_PATH:
				return getUrlPath();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SIZE:
				return getSize();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NAME:
				return getName();
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
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT_NAME:
				setPortName((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT:
				setPort((Short)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__INITIATOR:
				setInitiator((initiatorEnum)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NETWORK_NAME:
				setNetworkName((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SECURE:
				setSecure((Boolean)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORTS:
				setPorts((Map)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__URL_PATH:
				setUrlPath((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SIZE:
				setSize((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NAME:
				setName((String)newValue);
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
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT_NAME:
				setPortName(PORT_NAME_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__INITIATOR:
				setInitiator(INITIATOR_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NETWORK_NAME:
				setNetworkName(NETWORK_NAME_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SECURE:
				setSecure(SECURE_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORTS:
				setPorts(PORTS_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__URL_PATH:
				setUrlPath(URL_PATH_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NAME:
				setName(NAME_EDEFAULT);
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
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT_NAME:
				return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__INITIATOR:
				return initiator != INITIATOR_EDEFAULT;
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NETWORK_NAME:
				return NETWORK_NAME_EDEFAULT == null ? networkName != null : !NETWORK_NAME_EDEFAULT.equals(networkName);
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SECURE:
				return SECURE_EDEFAULT == null ? secure != null : !SECURE_EDEFAULT.equals(secure);
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORTS:
				return PORTS_EDEFAULT == null ? ports != null : !PORTS_EDEFAULT.equals(ports);
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__URL_PATH:
				return URL_PATH_EDEFAULT == null ? urlPath != null : !URL_PATH_EDEFAULT.equals(urlPath);
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
				case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT_NAME: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;
				case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PROTOCOL: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;
				case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT;
				case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__INITIATOR: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;
				case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NETWORK_NAME: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;
				case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SECURE: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE;
				case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORTS: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS;
				case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__URL_PATH: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;
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
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME: return ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT_NAME;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL: return ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PROTOCOL;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT: return ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORT;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR: return ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__INITIATOR;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME: return ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__NETWORK_NAME;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE: return ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__SECURE;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS: return ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__PORTS;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH: return ToscaPackage.TOSCA_NODES_OBJECTSTORAGE__URL_PATH;
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
				case ToscaPackage.TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return ToscaPackage.TOSCA_NODES_OBJECTSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Tosca_capabilities_endpoint.class) {
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
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(", size: ");
		result.append(size);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_objectstorageImpl
