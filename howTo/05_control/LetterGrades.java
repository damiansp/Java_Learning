// LetterGrades.java
import java.util.Scanner;

public class LetterGrades {
  public static void main(String[] args) {
    int total = 0;
    int gradeCounter = 0;
    int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
    Scanner input = new Scanner(System.in);

    System.out.print(
      "Enter the integer grades in range 0-100, <Ctrl>-d when done: ");
    while (input.hasNext()) {
      int grade = input.nextInt();

      total += grade;
      ++gradeCounter;
      switch (grade / 10) {
        case 10:
        case 9:
          ++aCount; break;
        case 8:
          ++bCount; break;
        case 7:
          ++cCount; break;
        case 6:
          ++dCount; break;
        default:
          ++fCount; break;
      }
    }

    System.out.printf("\nGrade Report:\n");
    if (gradeCounter > 0) {
      double avg = (double) total / gradeCounter;

      System.out.printf("Total of %d grades: %d\n", gradeCounter, total);
      System.out.printf("Class avg: %.2f\n", avg);
      System.out.printf("A: %d\nB: %d\nC: %d\nD: %d\nF: %d\n",
                        aCount, bCount, cCount, dCount, fCount);
    } else {
      System.out.println("No grades entered.");
    }
  }
}
