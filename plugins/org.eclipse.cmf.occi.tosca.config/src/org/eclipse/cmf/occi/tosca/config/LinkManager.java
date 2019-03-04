package org.eclipse.cmf.occi.tosca.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.tosca.ToscaFactory;

public class LinkManager {
	
	public List<LinkToDo> linksToDo = new ArrayList<>();
	
	public static class LinkToDo {
		public final String keySource;
		public final Map<String, Resource> mapSources;
		public final String keyTarget;
		public final Map<String, Resource> mapTarget;
		public final Link link;
		public LinkToDo(String key, LinkToDo linkToDo) {
			this.keySource = key;
			this.mapSources = linkToDo.mapSources;
			this.keyTarget = linkToDo.keyTarget;
			this.mapTarget= linkToDo.mapTarget;
			this.link = linkToDo.link;
		}
		public LinkToDo(String keySource, 
				Map<String, Resource> mapSources,
				String keyTarget, 
				Map<String, Resource> mapTarget,
				Link link) {
			this.keySource = keySource;
			this.mapSources = mapSources;
			this.keyTarget = keyTarget;
			this.mapTarget= mapTarget;
			this.link = link;
		}
		public void apply() {
			if (this.mapSources.get(keySource) == null) {
				throw new RuntimeException(keySource + " : " + this.mapSources.toString());
			}			
			if (this.mapTarget.get(keyTarget) == null) {
				throw new RuntimeException(keyTarget + " : " + this.mapTarget.toString());
			}
			this.link.setSource(this.mapSources.get(keySource));
			this.link.setTarget(this.mapTarget.get(keyTarget));
		}
	}
	
	public void replaceOldKeyInAllLinkToDo(String newKey, String oldKey) {
		for (int i = 0 ; i < this.linksToDo.size() ; i++) {
			if (linksToDo.get(i).keySource.equals(oldKey)) {
				LinkToDo link = new LinkToDo(newKey, linksToDo.get(i));
				this.linksToDo.remove(i);
				this.linksToDo.add(link);
			}
		}
	}
	
	public void addLinkToDo(String name, String currentKey) {
		Link link = (Link) OcciHelper.createEntity(OcciHelper.getKindByTerm(
				OcciHelper.loadExtension("http://schemas.modmacao.org/occi/platform#"), "componentlink"));
		link.getParts().add(ToscaFactory.eINSTANCE.createTosca_relationships_connectsto());
		Main.linkManager.linksToDo.add(new LinkManager.LinkToDo(
				currentKey, Main.applicationAndComponentManger.getComponentByName(),
				name, Main.applicationAndComponentManger.getComponentByName(),
				link
			));
	}

}
