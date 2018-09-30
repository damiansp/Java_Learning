import java.util.Scanner;


public class StaticCharMethods2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an int radix:");
    int radix = scanner.nextInt();
    System.out.print("1: digit -> char\n2: char -> digit\n");
    int choice = scanner.nextInt();

    switch (choice) {
    case 1:
      System.out.println("Enter digit:");
      int digit = scanner.nextInt();
      System.out.printf("digit -> char: %s\n",
                        Character.forDigit(digit, radix));
      break;
    case 2:
      System.out.println("Enter a character:");
      char c = scanner.next().charAt(0);
      System.out.printf("Char -> digit: %s\n", Character.digit(c, radix));
      break;
    }
  }
}
