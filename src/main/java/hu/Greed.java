package hu;

import java.util.Map;
import java.util.TreeMap;

public class Greed {
  private static final int VALUE_TRIPLE1 = 1000;
  private static final int VALUE_TRIPLE6 = 600;
  private static final int VALUE_TRIPLE5 = 500;
  private static final int VALUE_TRIPLE4 = 400;
  private static final int VALUE_TRIPLE3 = 300;
  private static final int VALUE_TRIPLE2 = 200;
  private static final int VALUE_1 = 100;
  private static final int VALUE_5 = 50;

  public static int greedy(int[] dice) {
    Map<Integer, Integer> thrownNumbers = new TreeMap<>();
    for (int die : dice) {
      thrownNumbers.put(die, thrownNumbers.getOrDefault(die, 0) + 1);
    }
    int sum = 0;
    boolean thereArePointsLeft;
    do {
      thereArePointsLeft = false;
      for (int key : thrownNumbers.keySet()) {
        if (thrownNumbers.get(key) >= 3) {
          switch (key) {
            case 1 -> sum += VALUE_TRIPLE1;
            case 2 -> sum += VALUE_TRIPLE2;
            case 3 -> sum += VALUE_TRIPLE3;
            case 4 -> sum += VALUE_TRIPLE4;
            case 5 -> sum += VALUE_TRIPLE5;
            case 6 -> sum += VALUE_TRIPLE6;
          }
          thrownNumbers.put(key, thrownNumbers.get(key) - 3);
          thereArePointsLeft = thrownNumbers.get(key) != 0;
        }
        else {
          if (key == 1) {
            sum += thrownNumbers.get(key) * VALUE_1;
          } else if (key == 5) {
            sum += thrownNumbers.get(key) * VALUE_5;
          }
          thrownNumbers.put(key, 0);
        }
      }
    } while (thereArePointsLeft);
    return sum;
  }
}