package hu;

import java.util.Arrays;
import java.util.List;

public class Order {
  public static String order(String words) {
    if (words.length() == 0) {
      return words;
    }
    int foundWords = 0;
    String wordsInOrder = "";
    List<String> wordsList = Arrays.asList(words.split(" "));
    while (foundWords < wordsList.size()) {
      int finalFoundWords = foundWords;
      String nextWord = wordsList.stream()
          .filter(word -> word.contains("" + (finalFoundWords + 1)))
          .findFirst()
          .orElseThrow();
      wordsInOrder += nextWord + " ";
      foundWords++;
    }
    return wordsInOrder.trim();
  }
}
