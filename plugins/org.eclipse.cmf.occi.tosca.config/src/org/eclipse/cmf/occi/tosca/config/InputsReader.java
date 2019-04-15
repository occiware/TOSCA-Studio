package org.eclipse.cmf.occi.tosca.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
			inputs.put(line.split(":")[0], line.split(":")[1]);
		}
	}

}