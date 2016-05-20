public class Break {
  public static void main(String[] args) {
    System.out.println("\nLooping with No Break:");
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        System.out.println("x: " + x + "; y: " + y);
      }
    }

    System.out.println("\nBreak without Labels");
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        System.out.println("x: " + x + "; y: " + y);
        if (x == y) {
          System.out.println("Break out of inner (y) loop...\n");
        }
      }
    }

    System.out.println("\nBreak with Label");
    outer:
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        System.out.println("x: " + x + "; y: " + y);
        if (x == y) {
          System.out.println("Break out of both loops...\n");
          break outer;
        }
      }
    }
  }
}
