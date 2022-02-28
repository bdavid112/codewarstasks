package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordTest {
	@Test
	void word1() {
		assertEquals(5, ShortestWord.findShort("apple"));
	}

	@Test
	void words2() {
		assertEquals(6, ShortestWord.findShort("banana pineapple"));
		assertEquals(5, ShortestWord.findShort("machine smoke"));
	}

	@Test
	void findShortACT() {
		assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
	}
}