package hu;

import java.util.HashMap;
import java.util.Map;

public class MinimumAbsoluteDiff {

  public static int difference(int[] numbers) {
    int min = Integer.MAX_VALUE;
    for (int firstNumber = 0; firstNumber < numbers.length - 1; firstNumber++) {
      for (int secondNumber = firstNumber + 1; secondNumber < numbers.length; secondNumber++) {
        int actualDifference = numbers[firstNumber] - numbers[secondNumber];
        if (actualDifference < 0) {
          actualDifference *= -1;
        }
        if (actualDifference < min) {
          min = actualDifference;
        }
      }
    }

    return min;
  }
}
