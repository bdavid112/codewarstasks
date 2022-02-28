package hu;

import java.util.List;
import java.util.stream.Stream;

public class Catalog {

  public static String catalog(String s, String article) {
    String result = "";
    String[] lines = s.split("\n\n");
    List<String> foundItems = Stream.of(lines)
        .filter(line -> line.contains(article))
        .toList();
    for (String foundItem : foundItems) {
      result += formatLine(foundItem);
      result += "\n";
    }
    return foundItems.size() == 0 ? "Nothing" : result.trim();
  }

  private static String formatLine(String line) {
    String formattedLine = line.replace("<prod><name>", "");
    formattedLine = formattedLine.replace("</name><prx>", " > prx: $");
    formattedLine = formattedLine.replace("</prx><qty>", " qty: ");
    formattedLine = formattedLine.replace("</qty></prod>", "");
    return formattedLine;
  }
}
