package org.eclipse.cmf.occi.tosca.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Type;

public class AttributeMapper extends Mapper {
	
	public AttributeMapper() {
		super();
		
		this.mappings.put("tosca.nodes.ObjectStorage", new AttributesMapping("maxsize"));
		
		List<String> attributeToRemoveFromNodeRoot = new ArrayList<String>();
		attributeToRemoveFromNodeRoot.add("tosca_id");
		attributeToRemoveFromNodeRoot.add("tosca_name");
		attributeToRemoveFromNodeRoot.add("state");
		this.mappings.put("tosca.nodes.Root", new AttributesMapping(attributeToRemoveFromNodeRoot));
		
		this.mappings.put("tosca.relationships.AttachesTo", new AttributesMapping("device"));

		List<String> actionsToRemoveFromStandard = new ArrayList<String>();
		actionsToRemoveFromStandard.add("start");
		actionsToRemoveFromStandard.add("stop");
		this.mappings.put("tosca.interfaces.node.lifecycle.Standard", new ActionMapping(actionsToRemoveFromStandard));
	}
	
	private class ActionMapping implements Mapping<Type> {
		public final List<String> actionsToRemove;
		public ActionMapping(String actionToRemove) {
			this.actionsToRemove = new ArrayList<String>();
			this.actionsToRemove .add(actionToRemove);
		}
		public ActionMapping(List<String> actionsToRemove) {
			this.actionsToRemove = actionsToRemove;
		}
		@Override
		public void mapTo(Type type) {
			List<Action> realActionsToRemove = new ArrayList<Action>();
			for (Action action : type.getActions()) {
				if (this.actionsToRemove.contains(action.getName())) {
					realActionsToRemove.add(action);
				}
			}
			for (Action action : realActionsToRemove) {
				type.getActions().remove(action);
			}
		}
	}
	
	private class AttributesMapping implements Mapping<Type> {
		public final List<String> attributesToRemove;
		public AttributesMapping(String attributeToRemove) {
			this.attributesToRemove = new ArrayList<String>();
			this.attributesToRemove .add(attributeToRemove);
		}
		public AttributesMapping(List<String> attributesToRemove) {
			this.attributesToRemove = attributesToRemove;
		}
		@Override
		public void mapTo(Type type) {
			List<Attribute> realAttributesToRemove = new ArrayList<Attribute>();
			for (Attribute attribute : type.getAttributes()) {
				if (this.attributesToRemove.contains(attribute.getName())) {
					realAttributesToRemove.add(attribute);
				}
			}
			for (Attribute attribute : realAttributesToRemove) {
				type.getAttributes().remove(attribute);
			}
		}
	}

}
