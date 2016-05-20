public class GradeBook3 {
  private String courseName;

  // Setters
  public void setCourseName(String name) {
    courseName = name;
  }

  // Getters
  public String getCourseName() {
    return courseName;
  }
  
  public void displayMessage() {
    System.out.printf("Welcome to the %s Grade Book.\n", getCourseName());
  }
}
