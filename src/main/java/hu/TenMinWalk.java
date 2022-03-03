package hu;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) {
      return false;
    }
    int posX = 0, posY = 0;
    for (char direction : walk) {
      if (direction == 'n') {
        posY++;
      } else if (direction == 's') {
        posY--;
      } else if (direction == 'w') {
        posX--;
      } else {
        posX++;
      }
    }
    return posX == 0 && posY == 0;
  }
}
