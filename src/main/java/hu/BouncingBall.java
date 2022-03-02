package hu;

public class BouncingBall {
  public static int bouncingBall(double h, double bounce, double window) {
    if (h > 0 && (bounce > 0 && bounce < 1) && window < h) {
      int counter = 0;
      while (true) {
        counter++;
        h *= bounce;
        if (h <= window) {
          break;
        }
        counter++;
      }
      return counter;
    }
    return -1;
  }
}
