package hu;

public class Validate {

  public static boolean validate(String n) {
    int[] digits = new int[n.length()];
    for (int i = 0; i < n.length(); i++) {
      digits[i] = Character.getNumericValue(n.charAt(i));
    }
    doubleDigitsInArray(digits);
    int sum = 0;
    for (int i = 0; i < digits.length; i++) {
      if (digits[i] > 9) {
        digits[i] -= 9;
      }
      sum += digits[i];
    }
    return sum % 10 == 0;
  }

  private static void doubleDigitsInArray(int[] digits) {
    if (digits.length % 2 == 0) {
      for (int i = 0; i < digits.length - 1; i += 2) {
        digits[i] *= 2;
      }
    } else {
      for (int i = 1; i < digits.length - 1; i += 2) {
        digits[i] *= 2;
      }
    }
  }
}
