package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAbsoluteDiffTest {
  @Test
  void example() {
    assertEquals(3, MinimumAbsoluteDiff.difference(new int[]{10, 0, -7}));
  }
}