package hu;

public class ArrayDifference {


	public static int[] arrayDiff(int[] a, int[] b) {
		if (a.length < 1) {
			return new int[0];
		} else if (b.length < 1) {
			return a;
		}

		int totalOccurrences = 0;

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					totalOccurrences++;
					a[j] = Integer.MIN_VALUE;
				}
			}
		}

		int[] newArray = new int[a.length - totalOccurrences];
		int newArrayIdx = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != Integer.MIN_VALUE) {
				newArray[newArrayIdx] = a[i];
				newArrayIdx++;
			}
		}

		return newArray;
	}
}
