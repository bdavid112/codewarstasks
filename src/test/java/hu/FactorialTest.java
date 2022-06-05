package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
  @Test
  public void addTest() {
    assertEquals("420", LargeFactorial.add("210", "210"));
    assertEquals("1440", LargeFactorial.add("1140", "300"));
    assertEquals("10998", LargeFactorial.add("999", "9999"));
    assertEquals("889881008058", LargeFactorial.add("543534662435", "346346345623"));
  }

  @Test
  public void multiplyTest() {
    assertEquals("2500", LargeFactorial.multiply("50", "50"));
    assertEquals("250000", LargeFactorial.multiply("500", "500"));
  }

  @Test
  public void BasicTests()
  {
    assertEquals("1", LargeFactorial.factorial(1));
    assertEquals("120", LargeFactorial.factorial(5));
    assertEquals("362880", LargeFactorial.factorial(9));
    assertEquals("1307674368000", LargeFactorial.factorial(15));
  }
}