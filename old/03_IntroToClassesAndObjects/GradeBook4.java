// Gradebook class with constructor to init course name

public class GradeBook4 {
  private String courseName;

  // Constructor
  public GradeBook4(String name) {
    courseName = name;
  }

  // Setter
  public void setCourseName(String name) {
    courseName = name;
  }

  // Getter
  public String getCourseName() {
    return courseName;
  }

  // Display welcome message
  public void displayMessage() {
    System.out.printf("Welcome to the Grade Book for\n%s!", getCourseName());
  }
}
