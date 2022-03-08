package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightSortTest {
  @Test
  public void BasicTests() {
    System.out.println("****** Basic Tests ******");
    assertEquals("2000 103 123 4444 99", WeightSort.orderWeight("103 123 4444 99 2000"));
    assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    assertEquals("21 121 24 421 12455 4256", WeightSort.orderWeight(" 421   21 24  12455 121   4256  "));
    assertEquals("59544965313", WeightSort.orderWeight("59544965313"));
  }
}