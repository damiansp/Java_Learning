public class EnhancedForLoop {
  /**
   * @param args
   */
  public static void main(String[] args) {
    int[] tenInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] letters = {"A", "B", "C", "D", "E"};
      
    for (int i: tenInts) {
      int doubled = 2 * i;
      System.out.println("i = " + i + "; 2i = " + doubled);
    }

    for (String l: letters) {
      System.out.println("letter: " + l);
    }
  }
}
