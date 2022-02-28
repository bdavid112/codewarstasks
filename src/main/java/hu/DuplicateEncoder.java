package hu;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

	public static String encode(String word) {
		Map<Character, Integer> appearances = new HashMap<>();
		String result = "";
		for (int i = 0; i < word.length(); i++) {
			int counter = appearances.getOrDefault(word.toLowerCase().charAt(i), 0);
			appearances.put(word.toLowerCase().charAt(i), counter + 1);
		}
		for (int i = 0; i < word.length(); i++) {
			if (appearances.get(word.toLowerCase().charAt(i)) == 1) {
				result += "(";
			} else {
				result += ")";
			}
		}
		return result;
	}
}
