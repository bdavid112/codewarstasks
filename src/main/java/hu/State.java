package hu;

import java.util.*;

public class State {
  private static final Map<String, String> states = Map.of(
      "AZ", "Arizona",
      "CA", "California",
      "ID", "Idaho",
      "IN", "Indiana",
      "MA", "Massachusetts",
      "OK", "Oklahoma",
      "PA", "Pennsylvania",
      "VA", "Virginia"
  );

  public static String byState(String str) {
    String result = "";
    String[] addresses = str.split("\n");
    Map<String, List<String>> addressesByStates = new TreeMap<>();
    for (int i = 0; i < addresses.length; i++) {
      addresses[i] = addresses[i].replaceAll(",", "");
      for (String key : states.keySet()) {
        if (addresses[i].contains(key)) {
          String stateName = states.get(key);
          addresses[i] = addresses[i].replaceFirst(key, stateName);
          List<String> addressList = addressesByStates.getOrDefault(stateName, new ArrayList<>());
          addressList.add(addresses[i]);
          Collections.sort(addressList);
          addressesByStates.put(stateName, addressList);
        }
      }
    }
    for (String key : states.keySet()) {
      String stateName = states.get(key);
      if (addressesByStates.get(stateName) != null) {
        if (result.length() > 0) {
          result += " ";
        }
        result += stateName + "\n";
        for (String address : addressesByStates.get(stateName)) {
          result += "..... " + address + "\n";
        }
      }
    }
    return result.trim();
  }
}
