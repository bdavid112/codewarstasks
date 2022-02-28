package hu;

public class ShortestWord {

	public static int findShort(String s) {
		String actualWord = s;
		int min = Integer.MAX_VALUE;

		while (s.length() > 0) {
			if (s.lastIndexOf(" ") != -1) {
				actualWord = s.substring(0, s.indexOf(" "));

				if (actualWord.length() < min) {
					min = actualWord.length();
				}

				s = s.replace(actualWord + " ", "");
			} else {
				actualWord = s.substring(0, s.length());

				if (actualWord.length() < min) {
					min = actualWord.length();
				}

				s = s.replace(actualWord, "");
			}
		}

		return min;
	}
}
