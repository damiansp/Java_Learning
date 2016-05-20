public class GradeBookTest5 {
  public static void main(String[] args) {
    // Create some GB objects
    GradeBook5 javaGB = new GradeBook5("CS 101: Intro to Java", "Brian Beans");
    GradeBook5 webDevGB = new GradeBook5("CS 102: Intro to Web Development",
                                         "Walt Devknee");

    // Call getCourseName() on both
    System.out.printf("You have initialized two Grade Books...\n");
    javaGB.displayMessage();
    webDevGB.displayMessage();
  }
}
