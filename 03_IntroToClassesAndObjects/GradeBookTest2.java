import java.util.Scanner;

public class GradeBookTest2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    GradeBook2 myGB = new GradeBook2();

    // Get course name
    System.out.println("Please enter the course name:");
    String nameOfCourse = input.nextLine();
    System.out.println();
    
    myGB.displayMessage(nameOfCourse);
  }
}
