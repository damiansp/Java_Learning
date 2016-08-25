/* HanoiTower.java */

public class HanoiTower {
  int nDisks;

  // Constr
  public HanoiTower(int n) {
    nDisks = n;
  }

  // Recursively move disks between towers
  public void solveTowers(int disks, int sourcePeg, int destPeg, int tempPeg) {
    // Base case -- only 1 disk to move
    if (disks == 1 ) {
      System.out.printf("%d --> %d\n", sourcePeg, destPeg);
      return;
    }

    // Recursion step -- move (disk - 1) disks from source peg to temp peg
    // using destPeg
    solveTowers(disks - 1, sourcePeg, tempPeg, destPeg);

    // Move last disk fr sourcePeg to destPeg
    System.out.printf("%d --> %d\n", sourcePeg, destPeg);

    // Move (disks - 1) disks from tempPeg to destPeg
    solveTowers(disks - 1, tempPeg, destPeg, sourcePeg);
  }
}
