// Gradebook with counter-controlled rep for averaging
import java.util.Scanner;

public class GradeBook {
  private String courseName;

  // Constructors
  public GradeBook(String name) {
    courseName = name;
  }

  // Setters
  public void setCourseName(String name) {
    courseName = name;
  }

  // Getters
  public String getCourseName() {
    return courseName;
  }



  // Display a welcome message
  public void displayMessage() {
    System.out.printf("Welcome to the grade book for\n%s!\n\n",
                      getCourseName());
  }

  // Determine class avg base on 10 grades entered by user
  public void determineClassAverage() {
    Scanner input = new Scanner(System.in);

    int total = 0, // sum of grades
      gradeCounter = 1,
      grade, // single grade
      average;

    while (gradeCounter <= 10) {
      System.out.print("Enter next grade: ");
      grade = input.nextInt();
      total += grade;
      gradeCounter++;
    }

    average = total / 10;

    System.out.printf("\nTotal of all 10 grades is %d\n", total);
    System.out.printf("Class average is %d\n", average);
  }
}
