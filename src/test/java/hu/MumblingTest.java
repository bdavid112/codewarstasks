package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MumblingTest {
	@Test
	void test1Letter() {
		assertEquals("A", Mumbling.accum("A"));
		assertEquals("B", Mumbling.accum("b"));
	}

	@Test
	void test2Letters() {
		assertEquals("C-Dd", Mumbling.accum("cd"));
		assertEquals("H-Jj", Mumbling.accum("Hj"));
	}

	@Test
	void test4Letters() {
		assertEquals("A-Bb-Ccc-Dddd", Mumbling.accum("abcd"));
	}

	@Test
	void accumACT() {
		assertEquals("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy", Mumbling.accum("RqaEzty"));
	}
}