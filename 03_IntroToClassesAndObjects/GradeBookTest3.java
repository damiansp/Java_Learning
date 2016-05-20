import java.util.Scanner;

public class GradeBookTest3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    GradeBook3 myGB = new GradeBook3();

    // Get course name
    System.out.printf("Course name currently set as %s\n\n",
                      myGB.getCourseName());
    
    System.out.println("Please enter the course name:");
    String nameOfCourse = input.nextLine();

    myGB.setCourseName(nameOfCourse);
    System.out.println();
    
    myGB.displayMessage();
  }
}
