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
import extendedtosca.Tosca_nodes_network_port;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_rootImpl;

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
 * An implementation of the model object '<em><b>Tosca nodes network port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_portImpl#getIpRangeEnd <em>Ip Range End</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_portImpl#getIpRangeStart <em>Ip Range Start</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_portImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_portImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_portImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_network_portImpl extends Tosca_nodes_rootImpl implements Tosca_nodes_network_port {
	/**
	 * The default value of the '{@link #getIpRangeEnd() <em>Ip Range End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpRangeEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_RANGE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpRangeEnd() <em>Ip Range End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpRangeEnd()
	 * @generated
	 * @ordered
	 */
	protected String ipRangeEnd = IP_RANGE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpRangeStart() <em>Ip Range Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpRangeStart()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_RANGE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpRangeStart() <em>Ip Range Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpRangeStart()
	 * @generated
	 * @ordered
	 */
	protected String ipRangeStart = IP_RANGE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDER_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Integer order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_network_portImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpRangeEnd() {
		return ipRangeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpRangeEnd(String newIpRangeEnd) {
		String oldIpRangeEnd = ipRangeEnd;
		ipRangeEnd = newIpRangeEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_END, oldIpRangeEnd, ipRangeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpRangeStart() {
		return ipRangeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpRangeStart(String newIpRangeStart) {
		String oldIpRangeStart = ipRangeStart;
		ipRangeStart = newIpRangeStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_START, oldIpRangeStart, ipRangeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpAddress(String newIpAddress) {
		String oldIpAddress = ipAddress;
		ipAddress = newIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_ADDRESS, oldIpAddress, ipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(Boolean newIsDefault) {
		Boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Integer newOrder) {
		Integer oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__ORDER, oldOrder, order));
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
		 *     severity : Integer[1] = 'Tosca_nodes_network_port::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Network)
		 *       in
		 *         'Tosca_nodes_network_port::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ExtendedtoscaTables.STR_Tosca_nodes_network_port_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ExtendedtoscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Network_0 = idResolver.getClass(ExtendedtoscaTables.CLSSid_Network, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Network_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ExtendedtoscaTables.STR_Tosca_nodes_network_port_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ExtendedtoscaTables.INT_0).booleanValue();
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
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_END:
				return getIpRangeEnd();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_START:
				return getIpRangeStart();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_ADDRESS:
				return getIpAddress();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IS_DEFAULT:
				return getIsDefault();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__ORDER:
				return getOrder();
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
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_END:
				setIpRangeEnd((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_START:
				setIpRangeStart((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_ADDRESS:
				setIpAddress((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__ORDER:
				setOrder((Integer)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_END:
				setIpRangeEnd(IP_RANGE_END_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_START:
				setIpRangeStart(IP_RANGE_START_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_ADDRESS:
				setIpAddress(IP_ADDRESS_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__ORDER:
				setOrder(ORDER_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_END:
				return IP_RANGE_END_EDEFAULT == null ? ipRangeEnd != null : !IP_RANGE_END_EDEFAULT.equals(ipRangeEnd);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_START:
				return IP_RANGE_START_EDEFAULT == null ? ipRangeStart != null : !IP_RANGE_START_EDEFAULT.equals(ipRangeStart);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IS_DEFAULT:
				return IS_DEFAULT_EDEFAULT == null ? isDefault != null : !IS_DEFAULT_EDEFAULT.equals(isDefault);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
		}
		return super.eIsSet(featureID);
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
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (ipRangeEnd: ");
		result.append(ipRangeEnd);
		result.append(", ipRangeStart: ");
		result.append(ipRangeStart);
		result.append(", ipAddress: ");
		result.append(ipAddress);
		result.append(", isDefault: ");
		result.append(isDefault);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_network_portImpl
