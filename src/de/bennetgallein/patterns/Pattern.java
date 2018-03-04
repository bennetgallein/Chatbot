package de.bennetgallein.patterns;

import java.util.ArrayList;
import java.util.Random;

public class Pattern {

	public ArrayList<String> inputs = new ArrayList<String>();
	public ArrayList<String> responses = new ArrayList<String>();
	
	public Pattern(ArrayList<String> inputs, ArrayList<String> responses) {
		this.inputs = inputs;
		this.responses = responses;
	}
	public String getReponse() {
		Random r = new Random();
		int z = r.nextInt(responses.size());
		return responses.get(z);
	}
	public ArrayList<String> getInputs() {
		return this.inputs;
	}
	public ArrayList<String> getResponses() {
		return this.responses;
	}
}
