package hu;

public class AntBridge {
  public static String antBridge(final String ants, final String terrain) {
    if (terrain.contains(".")) {
      int travelledDistance = 0, positionOfFirstAnt = 0;
      String orderOfAnts = ants;
      String[] gaps = terrain.split("-+");
      String[] surfaceParts = terrain.split("\\.+");
      for (int gap = 1; gap < gaps.length; gap++) {
        int gapLength = gaps[gap].length();
        String bridge = orderOfAnts.substring((ants.length() - gapLength) - 2);
        String across = orderOfAnts.replace(bridge, "");
        orderOfAnts = bridge + across;
        travelledDistance += surfaceParts[gap - 1].length() + gaps[gap].length();
      }
      return orderOfAnts;
    }
    return ants;
  }
}
