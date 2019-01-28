public class TowersOfHanoi {
  public static void solve(
      int disks, int sourcePeg, int destinationPeg, int tempPeg) {
    if (disks == 1) {
      System.out.printf("\n%d --> %d\n", sourcePeg, destinationPeg);
      return;
    }

    // move (disks - 1) disks from sourcePeg to tempPeg using destinationPeg
    solve(disks - 1, sourcePeg, tempPeg, destinationPeg);
    System.out.printf("\n%d --> %d", sourcePeg, destinationPeg);
    // move (disks - 1) disks from temp to destinationPeg
    solve(disks - 1, tempPeg, destinationPeg, sourcePeg);
  }

  public static void main(String[] args) {
    int startPeg = 1; // e.g., leftmost
    int endPeg = 3;   // rightmost
    int tempPeg = 2;  // middle
    int totalDisks = Integer.parseInt(args[0]);

    solve(totalDisks, startPeg, endPeg, tempPeg);
  }
}
