package hu;

import java.util.Locale;
import java.util.Map;

public class HexToRGB {
  private static final Map<String, Integer> hexToDecimal = Map.of(
      "A", 10,
      "B", 11,
      "C", 12,
      "D", 13,
      "E", 14,
      "F", 15
  );

  public static int[] hexStringToRGB(String hex) {
    int[] rgbValues = new int[3];
    int arrayIndex = 0;
    int firstNumber = 0, secondNumber = 0, decimalValue;
    for (int i = 1; i < hex.length(); i++) {
      boolean isFirstNumber = i % 2 != 0;
      decimalValue = getDecimalValue(hex, i);
      if (isFirstNumber) {
        firstNumber = decimalValue * 16;
      } else {
        secondNumber = decimalValue;
      }
      if (!isFirstNumber) {
        rgbValues[arrayIndex] = firstNumber + secondNumber;
        arrayIndex++;
      }
    }
    return rgbValues;
  }

  private static int getDecimalValue(String hex, int i) {
    int decimalValue;
    if (isDecimalNumber(hex.charAt(i))) {
      decimalValue = Integer.parseInt("" + hex.charAt(i));
    } else {
      decimalValue = convertHexToDecimal(("" + hex.charAt(i)).toUpperCase(Locale.ROOT));
    }
    return decimalValue;
  }

  private static int convertHexToDecimal(String hexNumberString) {
    int decimalValue = 0;
    for (String key : hexToDecimal.keySet()) {
      if (key.equals(hexNumberString)) {
        decimalValue = hexToDecimal.get(key);
        break;
      }
    }
    return decimalValue;
  }

  private static boolean isDecimalNumber(char numberChar) {
    return numberChar >= 48 && numberChar <= 58;
  }
}
