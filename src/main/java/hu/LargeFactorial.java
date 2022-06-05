package hu;

public class LargeFactorial {

  public static String factorial(int n) {
    if (n < 0) {
      return null;
    }
    int actualNumber = n;
    while (actualNumber > 2) {

      actualNumber--;
    }
    return null;
  }

  public static String add(String number1, String number2) {
    String res = "";
    int remainder = 0;
    while (number1.length() > 0 || number2.length() > 0) {
      int actDigit1 = 0, actDigit2 = 0;
      if (number1.length() > 0) {
        actDigit1 = Integer.parseInt(number1.substring(number1.length() - 1));
        number1 = number1.substring(0, number1.length() - 1);
      }
      if (number2.length() > 0) {
        actDigit2 = Integer.parseInt(number2.substring(number2.length() - 1));
        number2 = number2.substring(0, number2.length() - 1);
      }
      int sumOfDigits = actDigit1 + actDigit2 + remainder;
      remainder = 0;
      if (sumOfDigits >= 10) {
        remainder = sumOfDigits / 10;
        sumOfDigits %= 10;
      }
      res = sumOfDigits + res;
    }
    if (remainder > 0) {
      res = remainder + res;
    }
    return res;
  }

  public static String multiply(String number1, String number2) {
    String[] parts = new String[number2.length()];
    int partIndex = 0;
    String partRes = "";
    while (number2.length() > 0) {
      if (partRes.length() != 0) {
        if (Integer.parseInt(partRes) != 0) {
          partRes = "";
        }
      }
      int actMultiplier = Integer.parseInt(number2.substring(number2.length() - 1));
      int remainder = 0;
      for (int i = number1.length() - 1; i >= 0; i--) {
        int sum = Integer.parseInt(number1.charAt(i) + "") * actMultiplier + remainder;
        remainder = 0;
        if (sum >= 10) {
          remainder = sum / 10;
          sum %= 10;
        }
        partRes = sum + partRes;
      }
      if (remainder > 0) {
        partRes = remainder + partRes;
      }
      parts[partIndex] = partRes;
      partIndex++;
      number2 = number2.substring(0, number2.length() - 1);
      if (Integer.parseInt(partRes) == 0) {
        partRes = "0";
      }
    }
    return add(parts[0], parts[1]);
  }
}
