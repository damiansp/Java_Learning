// Gradebook with sentinel-controlled rep for averaging
import java.util.Scanner;

public class GradeBook2 {
  private String courseName;

  // Constructors
  public GradeBook2(String name) {
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
      gradeCounter = 0,
      grade; // single grade
    double average;

    // prompt for next grade
    System.out.print("Enter next grade or -1 to quit: ");
    grade = input.nextInt();

    
    while (grade != -1) {
      total += grade;
      gradeCounter++;
      
      
      System.out.print("Enter next grade (-1 to quit): ");
      grade = input.nextInt();
    }

    if (gradeCounter != 0) {
      average = (double) total / gradeCounter;

      System.out.printf("\nTotal of %d grades is %d\n", gradeCounter, total);
      System.out.printf("Class average is %.2f\n", average);
    } else {
      System.out.println("No grades entered.");
    }

  }
}
