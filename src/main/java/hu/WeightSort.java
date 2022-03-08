package hu;

public class WeightSort {
  public static String orderWeight(String strng) {
    String result = "";
    String[] weightArray = strng.trim().split(" +");
    sortWeights(weightArray);
    for (String weight : weightArray) {
      result += weight + " ";
    }
    return result.trim();
  }

  private static void sortWeights(String[] weightArray) {
    boolean wasSwap;
    do {
      wasSwap = false;
      int numberOfSwaps = 0;
      for (int i = numberOfSwaps; i < weightArray.length - 1; i++) {
        int weightInt1, weightInt2;
        try {
          weightInt1 = Integer.parseInt(weightArray[i]);
          weightInt2 = Integer.parseInt(weightArray[i + 1]);
        } catch (NumberFormatException e) {
          break;
        }
        int sum1 = getSumOfDigits(weightInt1), sum2 = getSumOfDigits(weightInt2);
        if (sum1 > sum2) {
          String m = weightArray[i];
          weightArray[i] = weightArray[i + 1];
          weightArray[i + 1] = m;
          wasSwap = true;
          numberOfSwaps++;
        } else if (sum1 == sum2) {
          if (weightArray[i].compareTo(weightArray[i + 1]) > 0) {
            String m = weightArray[i];
            weightArray[i] = weightArray[i + 1];
            weightArray[i + 1] = m;
            wasSwap = true;
          }
        }
      }
    } while (wasSwap);
  }

  private static int getSumOfDigits(long number) {
    int sum = 0;
    while (number > 0) {
      long actualDigitOfFirstNumber = number % 10;
      sum += actualDigitOfFirstNumber;
      number /= 10;
    }
    return sum;
  }
}
