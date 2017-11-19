package org.eclipse.cmf.occi.tosca.config;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.eclipse.cmf.occi.tosca.ToscaFactory;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_container;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_database;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms;

public class Mapper {
	
	public static class Mapping {
		public final Method method;
		public final Class<?>[] argumentClasses;
		public Mapping(Method method, Class<?>...classes) {
			this.method = method;
			this.argumentClasses = classes;
		}
	}
	
	public static class MappingResources {
		public final Method method;
		public final Object object;
		public MappingResources(Method method, Object object) {
			this.method = method;
			this.object = object;
		}
		public Resource invoke() {
			try {
				return (Resource) this.method.invoke(this.object);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public static final Map<String, Method> mappingOfType = new HashMap<>();
	
	public static final Map<String, Mapping> mappingOfCapabilities = new HashMap<>();
	
	public static final Map<String, MappingResources> mappingOfResources = new HashMap<>();
	
	static {
		try {
			initMappingOfType();
			initMappingOfCapabilities();
			initMappingOfResources();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	

	private static void initMappingOfType() throws Exception {
		mappingOfType.put("tosca.nodes.Compute", ToscaFactory.class.getMethod("createTosca_nodes_compute"));
		mappingOfType.put("Compute", ToscaFactory.class.getMethod("createTosca_nodes_compute"));
		mappingOfType.put("tosca.nodes.DBMS.MySQL", ToscaFactory.class.getMethod("createTosca_nodes_dbms"));
		mappingOfType.put("tosca.nodes.DBMS", ToscaFactory.class.getMethod("createTosca_nodes_dbms"));
		mappingOfType.put("tosca.nodes.Database.MySQL", ToscaFactory.class.getMethod("createTosca_nodes_database"));
		mappingOfType.put("tosca.nodes.Database", ToscaFactory.class.getMethod("createTosca_nodes_database"));
		mappingOfType.put("tosca.relationships.ConnectsTo", ToscaFactory.class.getMethod("createTosca_relationships_connectsto"));
		mappingOfType.put("tosca.nodes.WebServer", ToscaFactory.class.getMethod("createTosca_nodes_webserver"));
	}

	private static void initMappingOfCapabilities() throws Exception {
		mappingOfCapabilities.put("num_cpus", new Mapping(
				Tosca_capabilities_container.class.getMethod("setNumCpus", Integer.class), Integer.class));
		mappingOfCapabilities.put("disk_size",  new Mapping(
				Tosca_capabilities_container.class.getMethod("setDiskSize", Integer.class), Integer.class));
		mappingOfCapabilities.put("mem_size",  new Mapping(
				Tosca_capabilities_container.class.getMethod("setMemSize", Integer.class), Integer.class));		
		mappingOfCapabilities.put("architecture",  new Mapping(
				Tosca_capabilities_operatingsystem.class.getMethod("setArchitecture", String.class), String.class));
		mappingOfCapabilities.put("type",  new Mapping(
				Tosca_capabilities_operatingsystem.class.getMethod("setType", String.class), String.class));
		mappingOfCapabilities.put("distribution",  new Mapping(
				Tosca_capabilities_operatingsystem.class.getMethod("setDistribution", String.class), String.class));
		mappingOfCapabilities.put("root_password",  new Mapping(
				Tosca_nodes_dbms.class.getMethod("setRootPassword", String.class), String.class));
		mappingOfCapabilities.put("port",  new Mapping(
				Tosca_nodes_dbms.class.getMethod("setPort", Integer.class), Integer.class));
		mappingOfCapabilities.put("user",  new Mapping(
				Tosca_nodes_database.class.getMethod("setUser", String.class), String.class));
		mappingOfCapabilities.put("password",  new Mapping(
				Tosca_nodes_database.class.getMethod("setPassword", String.class), String.class));
		mappingOfCapabilities.put("name",  new Mapping(
				Tosca_nodes_database.class.getMethod("setName", String.class), String.class));
	}
	
	private static void initMappingOfResources() throws Exception {
		mappingOfResources.put("compute", 
				new MappingResources(InfrastructureFactory.class.getMethod("createCompute"),
						InfrastructureFactory.eINSTANCE
			)
		);
	}
}
