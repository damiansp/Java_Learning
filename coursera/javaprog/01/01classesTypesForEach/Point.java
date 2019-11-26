public class Point {
  private int x;
  private int y;

  public Point(int x0, int y0) {
    x = x0;
    y = y0;
  }

  public int getX() { return x; }

  public int getY() { return y; }

  public double getDistance(Point other) {
    int dx = x - other.getX();
    int dy = y - other.getY();
    return Math.sqrt(dx*dx + dy*dy);
  }

  public static void main(String[] args) {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(6, 8);
    System.out.println(p1.getDistance(p2));
  }
}
