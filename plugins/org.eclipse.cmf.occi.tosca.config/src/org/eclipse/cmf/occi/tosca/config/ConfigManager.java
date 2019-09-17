package org.eclipse.cmf.occi.tosca.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import extendedtosca.ExtendedtoscaFactory;

public class ConfigManager {
	
	public static Configuration currentConfiguration;
	
	private static Resource resource;
	
	private static final String PREFIX_FILE = "file:";
	
	public static void createConfiguration(String path) {
		String name = convertPathToConfigName(path);
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI
				.createURI(PREFIX_FILE + Main.ROOT_WORKSPACE + "org.eclipse.cmf.occi.tosca.examples/" + name + ".extendedTosca");
		resource = resSet.createResource(modelURI);
//		
//		OcciRegistry.getInstance().registerExtension(
//				"http://schemas.ogf.org/tosca/core#", 
//				PREFIX_FILE + Main.ROOT_WORKSPACE + "org.eclipse.cmf.occi.tosca/model/tosca.occie"
//		);
//		
//		OcciRegistry.getInstance().registerExtension(
//				"http://schemas.ogf.org/tosca/extended#", 
//				PREFIX_FILE + Main.ROOT_WORKSPACE + "org.eclipse.cmf.occi.tosca.extended/model/extendedTosca.occie"
//		);

		Configuration configuration = OCCIFactory.eINSTANCE.createConfiguration();
		
		// loading TOSCA extensions
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/tosca/core#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/tosca/extended#"));
		
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/occi/infrastructure#"));
		//configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/occi/platform#"));
		
		// MODMACAO
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.modmacao.org/modmacao#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.modmacao.org/occi/platform#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.modmacao.org/placement#"));
		
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/occi/sla#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/tosca/core#"));
		configuration.getUse().add(OcciHelper.loadExtension("http://schemas.ogf.org/tosca/extended#"));
		//configuration.getUse().add(OcciHelper.loadExtension("file:/C:/Users/schallit/workspace-tosca2/plugins/org.eclipse.cmf.occi.tosca/model/tosca.occie"));
		//configuration.getUse().add(OcciHelper.loadExtension("file:/C:/Users/schallit/workspace-tosca2/plugins/org.eclipse.cmf.occi.tosca.extended/model/extendedTosca.occie"));
		resource.getContents().add(configuration);
		currentConfiguration = configuration;
	}
	
	public static void save() {
		System.out.println("Saving...");
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static org.eclipse.cmf.occi.core.Resource getResourceOfGivenKind(Kind kind) {
		for (org.eclipse.cmf.occi.core.Resource resource : currentConfiguration.getResources()) {
			if (resource.getKind().getTerm().endsWith(kind.getTerm())) {
				return resource;
			}
		}
		throw new RuntimeException("Could not find any resources corresponding to the Kind: " + kind.getName());
	}
	
	public static String convertPathToConfigName(String path) {
		String[] splittedPath = path.split("/");
		return splittedPath[splittedPath.length - 1].split("\\.")[0];
	}

}