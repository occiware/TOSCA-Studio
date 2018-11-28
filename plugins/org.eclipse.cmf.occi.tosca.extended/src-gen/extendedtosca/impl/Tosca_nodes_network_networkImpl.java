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
import extendedtosca.Tosca_nodes_network_network;
import extendedtosca.ip_versionEnum;

import org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_rootImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes network network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getPhysicalNetwork <em>Physical Network</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getSegmentationId <em>Segmentation Id</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getNetworkId <em>Network Id</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getIpVersion <em>Ip Version</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getStartIp <em>Start Ip</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getGatewayIp <em>Gateway Ip</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getNetworkType <em>Network Type</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_network_networkImpl#getEndIp <em>End Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_network_networkImpl extends Tosca_nodes_rootImpl implements Tosca_nodes_network_network {
	/**
	 * The default value of the '{@link #getPhysicalNetwork() <em>Physical Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalNetwork() <em>Physical Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalNetwork()
	 * @generated
	 * @ordered
	 */
	protected String physicalNetwork = PHYSICAL_NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSegmentationId() <em>Segmentation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentationId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENTATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentationId() <em>Segmentation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentationId()
	 * @generated
	 * @ordered
	 */
	protected String segmentationId = SEGMENTATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkId() <em>Network Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkId()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkId() <em>Network Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkId()
	 * @generated
	 * @ordered
	 */
	protected String networkId = NETWORK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpVersion() <em>Ip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpVersion()
	 * @generated
	 * @ordered
	 */
	protected static final ip_versionEnum IP_VERSION_EDEFAULT = ip_versionEnum.IPV4;

	/**
	 * The cached value of the '{@link #getIpVersion() <em>Ip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpVersion()
	 * @generated
	 * @ordered
	 */
	protected ip_versionEnum ipVersion = IP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartIp() <em>Start Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIp()
	 * @generated
	 * @ordered
	 */
	protected static final String START_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartIp() <em>Start Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIp()
	 * @generated
	 * @ordered
	 */
	protected String startIp = START_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkName() <em>Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected String cidr = CIDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGatewayIp() <em>Gateway Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayIp()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayIp() <em>Gateway Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayIp()
	 * @generated
	 * @ordered
	 */
	protected String gatewayIp = GATEWAY_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected String networkType = NETWORK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndIp() <em>End Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIp()
	 * @generated
	 * @ordered
	 */
	protected static final String END_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndIp() <em>End Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIp()
	 * @generated
	 * @ordered
	 */
	protected String endIp = END_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_network_networkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicalNetwork() {
		return physicalNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalNetwork(String newPhysicalNetwork) {
		String oldPhysicalNetwork = physicalNetwork;
		physicalNetwork = newPhysicalNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK, oldPhysicalNetwork, physicalNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSegmentationId() {
		return segmentationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegmentationId(String newSegmentationId) {
		String oldSegmentationId = segmentationId;
		segmentationId = newSegmentationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID, oldSegmentationId, segmentationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkId() {
		return networkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkId(String newNetworkId) {
		String oldNetworkId = networkId;
		networkId = newNetworkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID, oldNetworkId, networkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ip_versionEnum getIpVersion() {
		return ipVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpVersion(ip_versionEnum newIpVersion) {
		ip_versionEnum oldIpVersion = ipVersion;
		ipVersion = newIpVersion == null ? IP_VERSION_EDEFAULT : newIpVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__IP_VERSION, oldIpVersion, ipVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartIp() {
		return startIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIp(String newStartIp) {
		String oldStartIp = startIp;
		startIp = newStartIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__START_IP, oldStartIp, startIp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME, oldNetworkName, networkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidr() {
		return cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidr(String newCidr) {
		String oldCidr = cidr;
		cidr = newCidr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__CIDR, oldCidr, cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGatewayIp() {
		return gatewayIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGatewayIp(String newGatewayIp) {
		String oldGatewayIp = gatewayIp;
		gatewayIp = newGatewayIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP, oldGatewayIp, gatewayIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkType() {
		return networkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkType(String newNetworkType) {
		String oldNetworkType = networkType;
		networkType = newNetworkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE, oldNetworkType, networkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndIp() {
		return endIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndIp(String newEndIp) {
		String oldEndIp = endIp;
		endIp = newEndIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__END_IP, oldEndIp, endIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK:
				return getPhysicalNetwork();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID:
				return getSegmentationId();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID:
				return getNetworkId();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__IP_VERSION:
				return getIpVersion();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__START_IP:
				return getStartIp();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME:
				return getNetworkName();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__CIDR:
				return getCidr();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP:
				return getGatewayIp();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE:
				return getNetworkType();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__END_IP:
				return getEndIp();
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
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK:
				setPhysicalNetwork((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID:
				setSegmentationId((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID:
				setNetworkId((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__IP_VERSION:
				setIpVersion((ip_versionEnum)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__START_IP:
				setStartIp((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME:
				setNetworkName((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__CIDR:
				setCidr((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP:
				setGatewayIp((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE:
				setNetworkType((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__END_IP:
				setEndIp((String)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK:
				setPhysicalNetwork(PHYSICAL_NETWORK_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID:
				setSegmentationId(SEGMENTATION_ID_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID:
				setNetworkId(NETWORK_ID_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__IP_VERSION:
				setIpVersion(IP_VERSION_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__START_IP:
				setStartIp(START_IP_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME:
				setNetworkName(NETWORK_NAME_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__CIDR:
				setCidr(CIDR_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP:
				setGatewayIp(GATEWAY_IP_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE:
				setNetworkType(NETWORK_TYPE_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__END_IP:
				setEndIp(END_IP_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK:
				return PHYSICAL_NETWORK_EDEFAULT == null ? physicalNetwork != null : !PHYSICAL_NETWORK_EDEFAULT.equals(physicalNetwork);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID:
				return SEGMENTATION_ID_EDEFAULT == null ? segmentationId != null : !SEGMENTATION_ID_EDEFAULT.equals(segmentationId);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID:
				return NETWORK_ID_EDEFAULT == null ? networkId != null : !NETWORK_ID_EDEFAULT.equals(networkId);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__IP_VERSION:
				return ipVersion != IP_VERSION_EDEFAULT;
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__START_IP:
				return START_IP_EDEFAULT == null ? startIp != null : !START_IP_EDEFAULT.equals(startIp);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME:
				return NETWORK_NAME_EDEFAULT == null ? networkName != null : !NETWORK_NAME_EDEFAULT.equals(networkName);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__CIDR:
				return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT.equals(cidr);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP:
				return GATEWAY_IP_EDEFAULT == null ? gatewayIp != null : !GATEWAY_IP_EDEFAULT.equals(gatewayIp);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE:
				return NETWORK_TYPE_EDEFAULT == null ? networkType != null : !NETWORK_TYPE_EDEFAULT.equals(networkType);
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__END_IP:
				return END_IP_EDEFAULT == null ? endIp != null : !END_IP_EDEFAULT.equals(endIp);
		}
		return super.eIsSet(featureID);
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
		result.append(" (physicalNetwork: ");
		result.append(physicalNetwork);
		result.append(", segmentationId: ");
		result.append(segmentationId);
		result.append(", networkId: ");
		result.append(networkId);
		result.append(", ipVersion: ");
		result.append(ipVersion);
		result.append(", startIp: ");
		result.append(startIp);
		result.append(", networkName: ");
		result.append(networkName);
		result.append(", cidr: ");
		result.append(cidr);
		result.append(", gatewayIp: ");
		result.append(gatewayIp);
		result.append(", networkType: ");
		result.append(networkType);
		result.append(", endIp: ");
		result.append(endIp);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_network_networkImpl
