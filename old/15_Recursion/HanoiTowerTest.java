/* HanoiTowerTest.java */

public class HanoiTowerTest {
  public static void main(String[] args) {
    int startPeg = 1;
    int tempPeg = 2;
    int endPeg = 3;
    int totalDisks = 5;
    HanoiTower towers = new HanoiTower(totalDisks);

    towers.solveTowers(totalDisks, startPeg, endPeg, tempPeg);
  }
}
