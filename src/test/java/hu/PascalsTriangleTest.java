package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalsTriangleTest {
  @Test
  public void testOneLevelTriangle() {
    final long[] terms = { 1L };
    assertEquals(arrayToString(terms), arrayToString(PascalsTriangle.generate(1)));
  }

  @Test
  public void testTwoLevelsTriangle() {
    final long[] terms = { 1L, 1L, 1L };
    assertEquals(arrayToString(terms), arrayToString(PascalsTriangle.generate(2)));
  }

  @Test
  public void testFourLevelsTriangle() {
    final long[] terms = { 1L, 1L, 1L, 1L, 2L, 1L, 1L, 3L, 3L, 1L };
    assertEquals(arrayToString(terms), arrayToString(PascalsTriangle.generate(4)));
  }

  @Test
  public void test20Levels() {
    final long[] terms = { 1L, 1L, 1L, 1L, 2L, 1L, 1L, 3L, 3L, 1L };
    assertEquals(arrayToString(terms), arrayToString(PascalsTriangle.generate(40)));
  }

  @Test
  public void addLargeNumbersTest() {
    assertEquals("19", PascalsTriangle.addLargeNumbers(15L, 4L));
    assertEquals("11", PascalsTriangle.addLargeNumbers(5L, 6L));
    assertEquals("51", PascalsTriangle.addLargeNumbers(25L, 26L));
    assertEquals("246", PascalsTriangle.addLargeNumbers(123L, 123L));
    assertEquals("333", PascalsTriangle.addLargeNumbers(111L, 222L));
    assertEquals("1332", PascalsTriangle.addLargeNumbers(666L, 666L));
    assertEquals("7221", PascalsTriangle.addLargeNumbers(555L, 6666L));
    assertEquals("643093", PascalsTriangle.addLargeNumbers(1251L, 641842L));
    assertEquals("2386770420210291", PascalsTriangle.addLargeNumbers(7823657823768L, 2378946762386523L));
    assertEquals("10202604607758010291", PascalsTriangle.addLargeNumbers(7823657845634623768L, 2378946762123386523L));
  }

  @Test
  public void multiplyLargeNumbersTest() {
    assertEquals("", PascalsTriangle.multiplyLargeNumbers(256, 256));
  }

  private static String arrayToString(long[] array) {
    String result = "";
    for (long element : array) {
      result += element + "\n";
    }
    return result.trim();
  }
}