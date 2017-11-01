package org.eclipse.cmf.occi.tosca.handlers;

import java.util.Map;

import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Type;

public class ActionReader {
	
		public static void readActions(Type type, Map<String, ?> actions) {
			for (String actionName : actions.keySet()) {
				System.out.println(actionName);
				if (! "derived_from".equals(actionName)) {
					Action action = OCCIFactory.eINSTANCE.createAction();
					Map<String, ?> actionValues = (Map<String, ?> ) actions.get(actionName);
					action.setName(actionName);
					Object description = actionValues.get("description");
					if (description != null) {
						action.setTitle(description.toString());	
					}
					type.getActions().add(action);
					action.setScheme(ExtensionsManager.getExtension("tosca").getScheme());
				}
			}
		}
		
	}



