package hu;

public class DataReverse {
  public static int[] dataReverse(int[] data) {
    String dataString = "";
    int[] reversedData = new int[data.length];
    int counter = 1;
    for (int element : data) {
      dataString += "" + element;
      if (counter % 8 == 0 && counter < data.length) {
        dataString += " ";
      }
      counter++;
    }
    String[] dataStringArray = dataString.split(" ");
    for (int i = dataStringArray.length - 1, j = 0; i >= 0; i--) {
      for (int bitIndex = 0; bitIndex < 8; bitIndex++) {
        reversedData[j] = Integer.parseInt(dataStringArray[i].substring(bitIndex, bitIndex + 1));
        j++;
      }
    }
    return reversedData;
  }
}
