package hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AntBridgeTest {
  @Test
  public void noGaps() {
    assertEquals("GFEDCBA", AntBridge.antBridge("GFEDCBA", "-----------------------"));
  }

  @Test
  public void oneGap() {
    assertEquals("EDCBAGF", AntBridge.antBridge("GFEDCBA", "------------...-----------"));
  }

  @Test
  public void twoGaps() {
    assertEquals("AGFEDCB", AntBridge.antBridge("GFEDCBA", "----..---------..------"));
  }

  @Test
  public void random() {
    assertEquals("JIHGFEDCBAK", AntBridge.antBridge("KJIHGFEDCBA", "----.......-----.....------......-.......-"));
  }
}