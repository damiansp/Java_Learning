// Gradebook class with constructor to init course name

public class GradeBook5 {
  private String courseName;
  private String instructorName;
  
  // Constructor
  public GradeBook5(String name, String instructor) {
    courseName = name;
    instructorName = instructor;
  }


  
  // Setters
  public void setCourseName(String name) {
    courseName = name;
  }

  public void setInstructorName(String name) {
    instructorName = name;
  }


  
  // Getters
  public String getCourseName() {
    return courseName;
  }

  public String getInstructorName() {
    return instructorName;
  }

  

  // Display welcome message
  public void displayMessage() {
    System.out.printf("Welcome to the Grade Book for\n%s,\nTaught by %s!\n\n",
                      getCourseName(),
                      getInstructorName());
  }
}
