package org.eclipse.cmf.occi.tosca.config;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.infrastructure.Compute;

import extendedtosca.ExtendedtoscaFactory;

public class Mapper {
	
	public static final Map<String, Method> mappingOfType = new HashMap<>();
	
	public static final Map<String, Mapping> mappingOfCapabilities = new HashMap<>();
	
	static {
		try {
			initMappingOfType();
			initMappingOfCapabilities();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static void initMappingOfType() throws Exception {
		mappingOfType.put("Compute", ExtendedtoscaFactory.class.getMethod("createTosca_nodes_compute"));
	}

	private static void initMappingOfCapabilities() throws Exception {
		mappingOfCapabilities.put("setNumCpus", new Mapping(Compute.class, "setOcciComputeCores", Integer.class));
	}
	
	public static class Mapping {
		public final Class<?> classContainingTheMethod;
		public final String methodNameToBeInvoked;
		public final Class<?> argumentClass;
		public Mapping(Class<?> classContainingTheMethod, String methodNameToBeInvoked, Class<?> argumentClass) {
			this.classContainingTheMethod = classContainingTheMethod;
			this.methodNameToBeInvoked = methodNameToBeInvoked;
			this.argumentClass = argumentClass;
		}
		public Method getMethod() {
			try {
				return this.classContainingTheMethod.getMethod(this.methodNameToBeInvoked, this.argumentClass);
			} catch (Exception e) {
				return null;
			}
		}
	}
	
}
