package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberCreatingTest {
	@Test
	public void tests() {
		assertEquals("(123) 456-7890", PhoneNumberCreating.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	}
}