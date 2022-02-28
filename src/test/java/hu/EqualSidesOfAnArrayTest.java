package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSidesOfAnArrayTest {
	@Test
	void emptyArray() {
		assertEquals(-1, EqualSidesOfAnArray.equalSideIndex(new int[]{}));
	}

	@Test
	void array1Element() {
		assertEquals(0, EqualSidesOfAnArray.equalSideIndex(new int[]{1}));
	}

	@Test
	void array2Element() {
		assertEquals(0, EqualSidesOfAnArray.equalSideIndex(new int[]{1, 0}));
		assertEquals(1, EqualSidesOfAnArray.equalSideIndex(new int[]{0, 1}));
		assertEquals(-1, EqualSidesOfAnArray.equalSideIndex(new int[]{1, 1}));
	}

	@Test
	void array3Element() {
		assertEquals(1, EqualSidesOfAnArray.equalSideIndex(new int[]{2,3,2}));
	}

	@Test
	void array7Element() {
		assertEquals(3, EqualSidesOfAnArray.equalSideIndex(new int[]{1,2,3,4,3,2,1}));
	}

	@Test
	void arrayACT() {
		assertEquals(0, EqualSidesOfAnArray.equalSideIndex(new int[]{20,10,-80,10,10,15,35}));
	}
}