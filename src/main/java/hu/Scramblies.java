package hu;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {

	public static boolean scramble(String str1, String str2) {
		Map<Character, Integer> characters = new HashMap<>();
		int matchCounter = 0;
		for (int i = 0; i < str1.length(); i++) {
			int counter = characters.getOrDefault(str1.charAt(i), 0);
			characters.put(str1.charAt(i), counter + 1);
		}
		for (int i = 0; i < str2.length(); i++) {
			for (char character : characters.keySet()) {
				if (str2.charAt(i) == character && characters.get(character) > 0) {
					int counter = characters.get(character);
					matchCounter++;
					characters.put(character, counter - 1);
				}
			}
		}
		return matchCounter == str2.length();
	}
}
