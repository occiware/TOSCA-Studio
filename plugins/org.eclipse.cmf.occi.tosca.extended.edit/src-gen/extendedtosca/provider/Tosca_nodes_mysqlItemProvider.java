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
import extendedtosca.Tosca_nodes_mysql;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link extendedtosca.Tosca_nodes_mysql} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Tosca_nodes_mysqlItemProvider extends Tosca_nodes_abstractmysqlItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_mysqlItemProvider(AdapterFactory adapterFactory) {
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

			addPortMySQLPropertyDescriptor(object);
			addStoragePathPropertyDescriptor(object);
			addDbUserPropertyDescriptor(object);
			addBindAddressPropertyDescriptor(object);
			addDbPasswordPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Port My SQL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortMySQLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_mysql_portMySQL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_mysql_portMySQL_feature", "_UI_Tosca_nodes_mysql_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL__PORT_MY_SQL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Storage Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoragePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_mysql_storagePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_mysql_storagePath_feature", "_UI_Tosca_nodes_mysql_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL__STORAGE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_mysql_dbUser_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_mysql_dbUser_feature", "_UI_Tosca_nodes_mysql_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL__DB_USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bind Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBindAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_mysql_bindAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_mysql_bindAddress_feature", "_UI_Tosca_nodes_mysql_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL__BIND_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_nodes_mysql_dbPassword_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_nodes_mysql_dbPassword_feature", "_UI_Tosca_nodes_mysql_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL__DB_PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Tosca_nodes_mysql.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tosca_nodes_mysql"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tosca_nodes_mysql)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Tosca_nodes_mysql_type") :
			getString("_UI_Tosca_nodes_mysql_type") + " " + label;
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

		switch (notification.getFeatureID(Tosca_nodes_mysql.class)) {
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__PORT_MY_SQL:
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__STORAGE_PATH:
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_USER:
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__BIND_ADDRESS:
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_PASSWORD:
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
