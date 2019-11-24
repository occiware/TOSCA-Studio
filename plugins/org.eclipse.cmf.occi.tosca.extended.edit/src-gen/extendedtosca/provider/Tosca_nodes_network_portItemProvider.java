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
import extendedtosca.Tosca_nodes_network_port;

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
 * This is the item provider adapter for a {@link extendedtosca.Tosca_nodes_network_port} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Tosca_nodes_network_portItemProvider extends Tosca_nodes_rootItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_network_portItemProvider(AdapterFactory adapterFactory) {
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

			addIpRangeEndPropertyDescriptor(object);
			addIpRangeStartPropertyDescriptor(object);
			addIpAddressPropertyDescriptor(object);
			addIsDefaultPropertyDescriptor(object);
			addOrderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ip Range End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpRangeEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_port_ipRangeEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_port_ipRangeEnd_feature", "_UI_Tosca_nodes_network_port_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__IP_RANGE_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ip Range Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpRangeStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_port_ipRangeStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_port_ipRangeStart_feature", "_UI_Tosca_nodes_network_port_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__IP_RANGE_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ip Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_port_ipAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_port_ipAddress_feature", "_UI_Tosca_nodes_network_port_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__IP_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_port_isDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_port_isDefault_feature", "_UI_Tosca_nodes_network_port_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__IS_DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_network_port_order_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_network_port_order_feature", "_UI_Tosca_nodes_network_port_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Tosca_nodes_network_port.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tosca_nodes_network_port"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tosca_nodes_network_port)object).getModmacaoComponentVersion();
		return label == null || label.length() == 0 ?
			getString("_UI_Tosca_nodes_network_port_type") :
			getString("_UI_Tosca_nodes_network_port_type") + " " + label;
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

		switch (notification.getFeatureID(Tosca_nodes_network_port.class)) {
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_END:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_RANGE_START:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IP_ADDRESS:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__IS_DEFAULT:
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT__ORDER:
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
