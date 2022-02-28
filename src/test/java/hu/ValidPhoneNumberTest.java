package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPhoneNumberTest {
	@Test
	void test() {
		assertTrue(ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
		assertFalse(ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
		assertFalse(ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
	}

	@Test
	void nonDigitCharacters() {
		assertFalse(ValidPhoneNumber.validPhoneNumber("(abc) def-ghij"));
	}
}