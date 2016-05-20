public class GradeBookTest4 {
  public static void main(String[] args) {
    // Create some GB objects
    GradeBook4 javaGB = new GradeBook4("CS 101: Intro to Java");
    GradeBook4 webDevGB = new GradeBook4("CS 102: Intro to Web Development");

    // Call getCourseName() on both
    System.out.printf("You have initialized two Grad Books:\n%s and\n%s.\n",
                      javaGB.getCourseName(),
                      webDevGB.getCourseName());
  }
}
