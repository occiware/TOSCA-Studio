package org.eclipse.cmf.occi.tosca.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ConfigManager {
	
	public static List<Configuration> configurations = new ArrayList<>();
	
	private static Resource resource;
	
	public static Configuration createConfiguration(String path) {
		String name = convertPathToConfigName(path);
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI
				.createURI("file:/C:/Users/schallit/workspace-tosca/plugins/org.eclipse.cmf.occi.tosca.examples/" + name + ".tosca");
		resource = resSet.createResource(modelURI);
		Configuration configuration = OCCIFactory.eINSTANCE.createConfiguration();
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/occi/infrastructure#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/occi/platform#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/occi/sla#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://org.occi/tosca#"));
		resource.getContents().add(configuration);
		return configuration;
	}
	
	public static void save() {
		System.out.println("Saving...");
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static String convertPathToConfigName(String path) {
		String[] splittedPath = path.split("/");
		return splittedPath[splittedPath.length - 1].split("\\.")[0];
	}

}
