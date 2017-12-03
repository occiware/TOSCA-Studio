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


import extendedtosca.Example_someapp;
import extendedtosca.ExtendedtoscaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.tosca.ToscaPackage;

import org.eclipse.cmf.occi.tosca.provider.Tosca_nodes_rootItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link extendedtosca.Example_someapp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Example_someappItemProvider extends Tosca_nodes_rootItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Example_someappItemProvider(AdapterFactory adapterFactory) {
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

			addPortNamePropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addInitiatorPropertyDescriptor(object);
			addNetworkNamePropertyDescriptor(object);
			addSecurePropertyDescriptor(object);
			addPortsPropertyDescriptor(object);
			addUrlPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Port Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_endpoint_portName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_endpoint_portName_feature", "_UI_Tosca_capabilities_endpoint_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_endpoint_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_endpoint_protocol_feature", "_UI_Tosca_capabilities_endpoint_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_endpoint_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_endpoint_port_feature", "_UI_Tosca_capabilities_endpoint_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initiator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitiatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_endpoint_initiator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_endpoint_initiator_feature", "_UI_Tosca_capabilities_endpoint_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR,
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
				 getString("_UI_Tosca_capabilities_endpoint_networkName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_endpoint_networkName_feature", "_UI_Tosca_capabilities_endpoint_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_endpoint_secure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_endpoint_secure_feature", "_UI_Tosca_capabilities_endpoint_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__SECURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_endpoint_ports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_endpoint_ports_feature", "_UI_Tosca_capabilities_endpoint_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__PORTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Url Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_endpoint_urlPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_endpoint_urlPath_feature", "_UI_Tosca_capabilities_endpoint_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Example_someapp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Example_someapp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Example_someapp)object).getPortName();
		return label == null || label.length() == 0 ?
			getString("_UI_Example_someapp_type") :
			getString("_UI_Example_someapp_type") + " " + label;
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

		switch (notification.getFeatureID(Example_someapp.class)) {
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP__PORT_NAME:
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP__PROTOCOL:
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP__PORT:
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP__INITIATOR:
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP__NETWORK_NAME:
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP__SECURE:
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP__PORTS:
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP__URL_PATH:
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
