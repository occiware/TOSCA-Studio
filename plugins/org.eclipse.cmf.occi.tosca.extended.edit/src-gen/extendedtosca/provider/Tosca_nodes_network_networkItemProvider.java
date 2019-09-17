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
package extendedtosca.provider;


import extendedtosca.ExtendedtoscaPackage;
import extendedtosca.Tosca_nodes_network_network;

import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.tosca.provider.Tosca_nodes_rootItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link extendedtosca.Tosca_nodes_network_network} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Tosca_nodes_network_networkItemProvider extends Tosca_nodes_rootItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_network_networkItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPhysicalNetworkPropertyDescriptor(object);
			addSegmentationIdPropertyDescriptor(object);
			addNetworkIdPropertyDescriptor(object);
			addIpVersionPropertyDescriptor(object);
			addStartIpPropertyDescriptor(object);
			addNetworkNamePropertyDescriptor(object);
			addCidrPropertyDescriptor(object);
			addGatewayIpPropertyDescriptor(object);
			addNetworkTypePropertyDescriptor(object);
			addEndIpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Physical Network feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicalNetworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_physicalNetwork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_physicalNetwork_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Segmentation Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSegmentationIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_segmentationId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_segmentationId_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_networkId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_networkId_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ip Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_ipVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_ipVersion_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__IP_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_startIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_startIp_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__START_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_networkName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_networkName_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cidr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCidrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_cidr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_cidr_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__CIDR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gateway Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGatewayIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_gatewayIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_gatewayIp_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_networkType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_networkType_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_network_endIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_network_endIp_feature", "_UI_Tosca_nodes_network_network_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__END_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Tosca_nodes_network_network.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tosca_nodes_network_network"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tosca_nodes_network_network)object).getNetworkName();
		return label == null || label.length() == 0 ?
			getString("_UI_Tosca_nodes_network_network_type") :
			getString("_UI_Tosca_nodes_network_network_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Tosca_nodes_network_network.class)) {
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__IP_VERSION:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__START_IP:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__CIDR:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK__END_IP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExtendedtoscaEditPlugin.INSTANCE;
	}

}
