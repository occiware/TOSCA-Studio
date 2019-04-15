package org.eclipse.cmf.occi.tosca.config;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;

import modmacao.ModmacaoFactory;

public class ApplicationAndComponentManager {

	private Resource currentApplication;

	private Configuration configuration;
	
	private Map<String, Resource> componentByName;
	
	public Map<String, Resource> getComponentByName() {
		return this.componentByName;
	}
	
	public ApplicationAndComponentManager(Configuration configuration) {
		this.configuration = configuration;
		this.componentByName = new HashMap<>();
	}

	public void createNewApplication() {
		this.currentApplication = (Resource) OcciHelper.createEntity(OcciHelper
				.getKindByTerm(OcciHelper.loadExtension("http://schemas.modmacao.org/occi/platform#"), "application"));
		configuration.getResources().add((Resource) currentApplication);
	}

	public Resource getpplication() {
		return this.currentApplication;
	}

	// this method create a new component, store using the provided key and link it to the application
	public Resource createComponentAndLinks(String key) {
		Resource component = (Resource) OcciHelper.createEntity(OcciHelper
				.getKindByTerm(OcciHelper.loadExtension("http://schemas.modmacao.org/occi/platform#"), "component"));
		// add the mixin component from modmacao
		MixinBase mixinComponent = ModmacaoFactory.eINSTANCE.createComponent();
		component.getParts().add(mixinComponent);
		// link the new component and the application with a component link
		Link componentLink = (Link) OcciHelper.createEntity(OcciHelper.getKindByTerm(
				OcciHelper.loadExtension("http://schemas.modmacao.org/occi/platform#"), "componentlink"));
		componentLink.setSource(this.currentApplication);
		componentLink.setTarget(component);
		this.componentByName.put(key, component);
		this.configuration.getResources().add((Resource) component);
		return component;
	}
	
	public void linkComponentsAndGivenMixin(Resource source, Resource target, MixinBase mixin) {
		Link componentLink = (Link) OcciHelper.createEntity(OcciHelper.getKindByTerm(
				OcciHelper.loadExtension("http://schemas.modmacao.org/occi/platform#"), "componentlink"));
		componentLink.setSource(source);
		componentLink.setTarget(target);
		componentLink.getParts().add(mixin);
	}
	
	public Resource getComponent(String key) {
		return this.componentByName.get(key);
	}
}
