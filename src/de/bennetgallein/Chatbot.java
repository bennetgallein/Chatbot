package de.bennetgallein;

import java.util.Scanner;

import de.bennetgallein.patterns.Pattern;
import de.bennetgallein.patterns.Patterns;

public class Chatbot {

	Patterns p = new Patterns();
	public static Chatbot b;

	public static void main(String[] args) {
		b = new Chatbot();
		b.p.registerKnown();
		// custom patterns here:
		
		// end of custom patterns
		b.waitForInput();
	}

	public void waitForInput() {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		Pattern match = b.p.match(input);
		if (match == null) {
			System.out.println("No matching pattern found!");
		} else {
			System.out.println(match.getReponse());
		}
		waitForInput();
	}

	public static Chatbot getInstance() {
		return b;
	}
}
