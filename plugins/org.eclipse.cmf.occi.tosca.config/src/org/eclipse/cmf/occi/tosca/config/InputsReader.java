package org.eclipse.cmf.occi.tosca.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InputsReader {
	
	public static Map<String, String> inputs;
	
	public static void read(String nameOfConfig, Map<String, ?> inputsMap) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(Main.ROOT_WORKSPACE + "org.eclipse.cmf.occi.tosca.examples/inputs/" + nameOfConfig + "-inputs.csv"));
		} catch (IOException e) {
			System.err.println("WARNING missing input file for " + nameOfConfig);
			return;
		}
		InputsReader.inputs = new HashMap<>();
		for (String line : lines) {
			final String key = line.split(":")[0];
			if (inputsMap.containsKey(key)) {
				Map<String, ?> mapOfCurrentInput = (Map)inputsMap.get(key);
				if (mapOfCurrentInput.containsKey("constraints")) {
					// gather the constraints of the current input
					List<Map<String, ?>> constraints = (List) mapOfCurrentInput.get("constraints");
					for (Map<String, ?> constraint : constraints) {
						for (String keyConstraint: constraint.keySet()) {
							if ("valid_values".equals(keyConstraint)) {
								List<String> validValues = (List<String>)constraint.get(keyConstraint);
								if (!validValues.contains(line.split(":")[1])) {
									throw new RuntimeException("Invalid value for " + key + 
											". You gave: " +  line.split(":")[1] + 
											" while valid values are: " +
											validValues.stream().collect(Collectors.joining(","))
									);
								}
							}
						}
					}
				}
			}
			inputs.put(key, line.split(":")[1]);
		}
	}
}