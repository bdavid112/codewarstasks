package hu;

import java.util.Set;

public class ValidPhoneNumber {

	public static boolean validPhoneNumber(String phoneNumber) {
		String[] parts = phoneNumber.split(" ");
		if (parts.length != 2 || parts[0].length() != 5 || parts[1].length() != 8) {
			return false;
		}
		String firstPart = parts[0];
		String secondPart = parts[1];
		if (firstPart.charAt(0) != '(' || firstPart.charAt(4) != ')' || containsNonDigit(firstPart.substring(1, 4))) {
			return false;
		}
		if (secondPart.charAt(3) != '-' || containsNonDigit(secondPart)) {
			return false;
		}
		return true;
	}

	private static boolean containsNonDigit(String sequence) {
		Set<String> numbers = Set.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
		int matchCount = 0;
		for (int i = 0; i < sequence.length(); i++) {
			for (String number : numbers) {
				String actChar = "" + sequence.charAt(i);
				if (actChar.equals(number)) {
					matchCount++;
				}
			}
		}
		return matchCount == 0;
	}
}
