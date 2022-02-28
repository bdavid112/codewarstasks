package hu;

public class Mumbling {

  public static String accum(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      String actualChar = s.substring(i, i + 1);
      for (int j = 0; j < i + 1; j++) {
        if (j == 0) {
          result += actualChar.toUpperCase();
          continue;
        }
        result += actualChar.toLowerCase();
      }
      if (i != s.length() - 1) {
        result += "-";
      }
    }
    return result;
  }
}
