package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {
  @Test
  void test891() {
    assertFalse(Validate.validate("891"));
  }

  @Test
  void test91() {
    assertTrue(Validate.validate("91"));
  }
}