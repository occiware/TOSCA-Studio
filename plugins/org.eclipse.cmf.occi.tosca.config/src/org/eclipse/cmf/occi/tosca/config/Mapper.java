package org.eclipse.cmf.occi.tosca.config;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciKindResolver;
import org.eclipse.cmf.occi.infrastructure.Architecture;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Storage;
import org.eclipse.cmf.occi.tosca.ToscaFactory;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_compute;

import extendedtosca.ExtendedtoscaFactory;

public class Mapper {
	
	public static final Map<String, MappingToCreateType> mappingOfType = new HashMap<>();
	
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
		mappingOfType.put("Compute", 
				new MappingToCreateType(ToscaFactory.class.getMethod("createTosca_nodes_compute"), ToscaFactory.eINSTANCE)
				);
		mappingOfType.put("BlockStorage", 
				new MappingToCreateType(ToscaFactory.class.getMethod("createTosca_nodes_blockstorage"), ToscaFactory.eINSTANCE)
				);
		mappingOfType.put("SoftwareComponent", 
				new MappingToCreateType(ToscaFactory.class.getMethod("createTosca_nodes_softwarecomponent"), ToscaFactory.eINSTANCE)
				);
	}

	private static void initMappingOfCapabilities() throws Exception {
		mappingOfCapabilities.put("setNumCpus", new Mapping(Compute.class, "setOcciComputeCores", Integer.class));
		mappingOfCapabilities.put("setMemSize", new Mapping(Compute.class, "setOcciComputeMemory", Float.class));
		mappingOfCapabilities.put("setArchitecture", new Mapping(Compute.class, "setOcciComputeArchitecture", Architecture.class));
		mappingOfCapabilities.put("setCpuFrequency", new Mapping(Compute.class, "setOcciComputeSpeed", Float.class));
		
		mappingOfCapabilities.put("setSize", new Mapping(Storage.class, "setOcciStorageSize", Float.class));
	}
	
	public static class MappingToCreateType {
		public final Method methodToBeInvoked;
		public final Object objectOnWhichInvoke;
		public MappingToCreateType(Method methodToBeInvoked, Object objectOnWhichInvoke) {
			this.methodToBeInvoked = methodToBeInvoked;
			this.objectOnWhichInvoke = objectOnWhichInvoke;
		}
		public Object invoke() {
			try {
				return this.methodToBeInvoked.invoke(this.objectOnWhichInvoke);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
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
