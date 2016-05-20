// Analysis of exam results
import java.util.Scanner;

public class Analysis {
  public void processExamResults() {
    Scanner input = new Scanner(System.in);
    int passes = 0,
      failures = 0,
      counter = 1,
      result;

    // Process 10 students using counter-contolled loop
    while (counter++ <= 10) {
      System.out.printf("Enter result (1: pass; 2: fail): ");
      result = input.nextInt();

      if (result == 1) {
        passes++;
      } else {
        failures++;
      }
    }

    System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

    if (passes > 8) {
      System.out.println("Give that teacher a bonus.");
    }
  }
}
