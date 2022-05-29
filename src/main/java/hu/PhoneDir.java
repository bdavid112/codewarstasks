package hu;

import java.util.Arrays;
import java.util.List;

public class PhoneDir {
  public static  String phone(String strng, String num) {
    List<String> lines = Arrays.asList(strng.split("\n"));
    if (!strng.contains(num)) {
      return "Error => Not found: " + num;
    } else if (notUniqueNumber(lines, num)) {
      return "Error => Too many people: " + num;
    }
    String matchingLine = lines.stream()
        .filter(line -> line.contains(num))
        .findFirst()
        .orElseThrow();
    String[] parts = matchingLine.split(" +");
    String phone = "", name = "", address = "";
    for (String part : parts) {
      if (part.contains("<") || part.contains(">")) {
        part = part.replace("<", "");
        part = part.replace(">", "");
        name = (name + " " + part).trim();
      } else if (part.contains("+")) {
        phone = part.replaceAll("\\p{Punct}", " ").trim().replaceAll(" ", "-");
      } else {
        if (part.contains("-")) {
          address = (address + " " + part).trim();
          continue;
        } else if (part.contains("_")) {
          part = part.replace("_", " ");
        }
        if (part.contains(".")) {
          address = (address + " " + part).trim();
          continue;
        }
        address = (address + " " + part.replaceAll("\\p{Punct}", "")).trim();
      }
    }
    return "Phone => " + phone + ", Name => " + name + ", Address => " + address;
  }

  private static boolean notUniqueNumber(List<String> lines, String number) {
    int occurrences = 0;
    for (String line : lines) {
      if (line.contains(number)) {
        occurrences++;
      }
      if (occurrences > 1) {
        return true;
      }
    }
    return false;
  }
}
