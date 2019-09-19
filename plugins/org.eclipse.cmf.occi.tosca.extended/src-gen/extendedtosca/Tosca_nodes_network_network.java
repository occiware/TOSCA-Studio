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
package extendedtosca;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.tosca.Tosca_nodes_root;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes network network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getPhysicalNetwork <em>Physical Network</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getSegmentationId <em>Segmentation Id</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getNetworkId <em>Network Id</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getIpVersion <em>Ip Version</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getStartIp <em>Start Ip</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getCidr <em>Cidr</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getGatewayIp <em>Gateway Ip</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getNetworkType <em>Network Type</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_network#getEndIp <em>End Ip</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Tosca_nodes_network_network extends Tosca_nodes_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Physical Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Network</em>' attribute.
	 * @see #setPhysicalNetwork(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_PhysicalNetwork()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!physicalNetwork'"
	 * @generated
	 */
	String getPhysicalNetwork();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getPhysicalNetwork <em>Physical Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Network</em>' attribute.
	 * @see #getPhysicalNetwork()
	 * @generated
	 */
	void setPhysicalNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Segmentation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segmentation Id</em>' attribute.
	 * @see #setSegmentationId(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_SegmentationId()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!segmentationId'"
	 * @generated
	 */
	String getSegmentationId();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getSegmentationId <em>Segmentation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segmentation Id</em>' attribute.
	 * @see #getSegmentationId()
	 * @generated
	 */
	void setSegmentationId(String value);

	/**
	 * Returns the value of the '<em><b>Network Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Id</em>' attribute.
	 * @see #setNetworkId(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_NetworkId()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!networkId'"
	 * @generated
	 */
	String getNetworkId();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getNetworkId <em>Network Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Id</em>' attribute.
	 * @see #getNetworkId()
	 * @generated
	 */
	void setNetworkId(String value);

	/**
	 * Returns the value of the '<em><b>Ip Version</b></em>' attribute.
	 * The default value is <code>"IPv4"</code>.
	 * The literals are from the enumeration {@link extendedtosca.ip_versionEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Version</em>' attribute.
	 * @see extendedtosca.ip_versionEnum
	 * @see #setIpVersion(ip_versionEnum)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_IpVersion()
	 * @model default="IPv4"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!ipVersion'"
	 * @generated
	 */
	ip_versionEnum getIpVersion();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getIpVersion <em>Ip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Version</em>' attribute.
	 * @see extendedtosca.ip_versionEnum
	 * @see #getIpVersion()
	 * @generated
	 */
	void setIpVersion(ip_versionEnum value);

	/**
	 * Returns the value of the '<em><b>Start Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Ip</em>' attribute.
	 * @see #setStartIp(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_StartIp()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!startIp'"
	 * @generated
	 */
	String getStartIp();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getStartIp <em>Start Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Ip</em>' attribute.
	 * @see #getStartIp()
	 * @generated
	 */
	void setStartIp(String value);

	/**
	 * Returns the value of the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Name</em>' attribute.
	 * @see #setNetworkName(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_NetworkName()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!networkName'"
	 * @generated
	 */
	String getNetworkName();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getNetworkName <em>Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Name</em>' attribute.
	 * @see #getNetworkName()
	 * @generated
	 */
	void setNetworkName(String value);

	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_Cidr()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!cidr'"
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getCidr <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' attribute.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gateway Ip</em>' attribute.
	 * @see #setGatewayIp(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_GatewayIp()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!gatewayIp'"
	 * @generated
	 */
	String getGatewayIp();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getGatewayIp <em>Gateway Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Ip</em>' attribute.
	 * @see #getGatewayIp()
	 * @generated
	 */
	void setGatewayIp(String value);

	/**
	 * Returns the value of the '<em><b>Network Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Type</em>' attribute.
	 * @see #setNetworkType(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_NetworkType()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!networkType'"
	 * @generated
	 */
	String getNetworkType();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getNetworkType <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Type</em>' attribute.
	 * @see #getNetworkType()
	 * @generated
	 */
	void setNetworkType(String value);

	/**
	 * Returns the value of the '<em><b>End Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Ip</em>' attribute.
	 * @see #setEndIp(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_network_EndIp()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_network!endIp'"
	 * @generated
	 */
	String getEndIp();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_network#getEndIp <em>End Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Ip</em>' attribute.
	 * @see #getEndIp()
	 * @generated
	 */
	void setEndIp(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Tosca_nodes_network_network::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Network)\n *       in\n *         \'Tosca_nodes_network_network::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.STR_Tosca_nodes_network_network_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Network = idResolver.getClass(&lt;%extendedtosca.ExtendedtoscaTables%&gt;.CLSSid_Network, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Network).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.STR_Tosca_nodes_network_network_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tosca_nodes_network_network
