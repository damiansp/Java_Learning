// Test GradeBook
public class GradeBookTest {
  public static void main(String[] args) {
    int[] gradesArray = { 47, 76, 76, 75, 86, 84, 99, 88, 71, 85,
                          77, 81, 68, 74, 71, 66, 70, 76, 81, 78 };
    GradeBook JavaGB = new GradeBook("CS101: Intro to Java", gradesArray);
    JavaGB.displayWelcome();
    JavaGB.processGrades();
  }
}
