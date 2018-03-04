package de.bennetgallein.patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class Patterns {

	ArrayList<Pattern> patterns = new ArrayList<Pattern>();

	public Pattern match(String input) {
		for (int i = 0; i < patterns.size(); i++) {
			for (int z = 0; z < patterns.get(i).getInputs().size(); z++) {
				if (input.toLowerCase().contains(patterns.get(i).getInputs().get(z).toLowerCase())) {
					return patterns.get(i);
				}
			}
		}
		return null;
	}

	public void registerKnown() {
		Pattern welcome = new Pattern(new ArrayList<String>(Arrays.asList("Hi", "Hello")),
				new ArrayList<String>(Arrays.asList("Welcome", "Hello Sir")));
		patterns.add(welcome);
		Pattern questions = new Pattern(new ArrayList<String>(Arrays.asList("How are you", "Whats good")),
				new ArrayList<String>(Arrays.asList("I'm fine!", "Good, what about you?")));
		patterns.add(questions);
		Pattern time = new Pattern(new ArrayList<String>(Arrays.asList("time")),
				new ArrayList<String>(Arrays.asList("Leider werden dynamische Values nicht aktualisiert.")));
		patterns.add(time);
	}
}
