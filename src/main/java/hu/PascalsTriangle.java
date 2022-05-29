package hu;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
  public static long[] generate(int level) {
    long[] result = new long[numberOfTermsTotal(level)];
    int numberOfTermsInRow = 1;
    int arrayIndex = 0;
    for (int row = 0; row < level; row++) {
      long number;
      for (int term = 0; term < numberOfTermsInRow; term++) {
        if (term == 0 || term == numberOfTermsInRow - 1) {
          number = 1;
        } else {
          number = factorial(row) / (factorial(term) * (factorial(row - term)));
        }
        result[arrayIndex] = number;
        arrayIndex++;
      }
      numberOfTermsInRow++;
    }

    return result;
  }

  private static int numberOfTermsTotal(int level) {
    int result = 0;
    int numberOfTerms = 1;
    for (int i = 0; i < level; i++) {
      result += numberOfTerms;
      numberOfTerms += 1;
    }
    return result;
  }

  private static long factorial(long number) {
    long result = 1;
    for (int i = 1; i <= number; i++) {
      result *= i;
    }
    return result;
  }

  public static String addLargeNumbers(long number1, long number2) {
    String result = "";
    int sumOfDigits, remainder = 0;
    String number1String = Long.toString(number1), number2String = Long.toString(number2);
    while (number1String.length() > 0 || number2String.length() > 0) {
      sumOfDigits = remainder;
      remainder = 0;
      int actualDigit1 = 0, actualDigit2 = 0;
      if (number1String.length() > 0) {
        actualDigit1 = Integer.parseInt(number1String.substring(number1String.length() - 1));
        number1String = number1String.substring(0, number1String.length() - 1);
      }
      if (number2String.length() > 0) {
        actualDigit2 = Integer.parseInt(number2String.substring(number2String.length() - 1));
        number2String = number2String.substring(0, number2String.length() - 1);
      }
      sumOfDigits += actualDigit1 + actualDigit2;
      if (sumOfDigits >= 10) {
        remainder = sumOfDigits / 10;
        sumOfDigits = sumOfDigits % 10;
      }
      result = sumOfDigits + result;
      if (number1String.length() == 0 && number2String.length() == 0 && remainder > 0) {
        result = remainder + result;
      }
    }
    return result;
  }

  public static String multiplyLargeNumbers(long multiplicand, long multiplier) {
    String result = "";
    List<Long> sums = new ArrayList<>();
    String multiplicandString = Long.toString(multiplicand), multiplierString = Long.toString(multiplier);
    while (multiplierString.length() > 0) {
      int multiplicandDigit, multiplierDigit;
      multiplicandDigit = Integer.parseInt(multiplicandString.substring(multiplicandString.length() - 1));
      multiplicandString = multiplicandString.substring(0, multiplicandString.length() - 1);
      multiplierDigit = Integer.parseInt(multiplierString.substring(0, 1));
      multiplierString = multiplierString.substring(1);

    }
    return multiplierString;
  }
}
