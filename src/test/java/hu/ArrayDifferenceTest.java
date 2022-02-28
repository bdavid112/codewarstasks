package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDifferenceTest {
	@Test
	void emptyArray() {
		assertArrayEquals(new int[]{}, ArrayDifference.arrayDiff(new int[]{}, new int[]{1, 2}));
		assertArrayEquals(new int[] {1,2,2}, ArrayDifference.arrayDiff(new int [] {1,2,2}, new int[] {}));
	}

	@Test
	void array2Elements() {
		assertArrayEquals(new int[]{2}, ArrayDifference.arrayDiff(new int[]{1,2}, new int[]{1}));
	}

	@Test
	void array3Elements() {
		assertArrayEquals(new int[] {2,2}, ArrayDifference.arrayDiff(new int [] {1,2,2}, new int[] {1}));
		assertArrayEquals(new int[] {1}, ArrayDifference.arrayDiff(new int [] {1,2,2}, new int[] {2}));
	}
}