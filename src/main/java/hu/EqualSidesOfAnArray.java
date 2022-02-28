package hu;

public class EqualSidesOfAnArray {

	public static int equalSideIndex(int[] arr) {
		int idx = -1;

		for (int i = 0; i < arr.length; i++) {
			int sumOfLeftSide = 0, sumOfRightSide = 0;

			for (int left = 0; left < i; left++) {
				sumOfLeftSide += arr[left];
			}

			for (int right = i + 1; right < arr.length; right++) {
				sumOfRightSide += arr[right];
			}

			if (sumOfLeftSide == sumOfRightSide) {
				idx = i;
				break;
			}
		}

		return idx;
	}
}
