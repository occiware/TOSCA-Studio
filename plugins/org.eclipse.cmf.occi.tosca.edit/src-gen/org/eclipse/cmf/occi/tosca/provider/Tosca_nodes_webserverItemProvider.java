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
package org.eclipse.cmf.occi.tosca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Tosca_nodes_webserverItemProvider extends Tosca_nodes_softwarecomponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_webserverItemProvider(AdapterFactory adapterFactory) {
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
			addNumCpusPropertyDescriptor(object);
			addDiskSizePropertyDescriptor(object);
			addCpuFrequencyPropertyDescriptor(object);
			addMemSizePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Num Cpus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumCpusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_container_numCpus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_container_numCpus_feature", "_UI_Tosca_capabilities_container_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disk Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiskSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_container_diskSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_container_diskSize_feature", "_UI_Tosca_capabilities_container_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_container_cpuFrequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_container_cpuFrequency_feature", "_UI_Tosca_capabilities_container_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mem Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_container_memSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_container_memSize_feature", "_UI_Tosca_capabilities_container_type"),
				 ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Tosca_nodes_webserver.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tosca_nodes_webserver"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tosca_nodes_webserver)object).getPortName();
		return label == null || label.length() == 0 ?
			getString("_UI_Tosca_nodes_webserver_type") :
			getString("_UI_Tosca_nodes_webserver_type") + " " + label;
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

		switch (notification.getFeatureID(Tosca_nodes_webserver.class)) {
			case ToscaPackage.TOSCA_NODES_WEBSERVER__PORT_NAME:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__PROTOCOL:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__PORT:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__INITIATOR:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__NETWORK_NAME:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__SECURE:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__PORTS:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__URL_PATH:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__NUM_CPUS:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__DISK_SIZE:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__CPU_FREQUENCY:
			case ToscaPackage.TOSCA_NODES_WEBSERVER__MEM_SIZE:
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

}
