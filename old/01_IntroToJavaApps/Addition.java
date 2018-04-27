// Get and add 2 numbers
import java.util.Scanner;

public class Addition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1, n2, sum;

    System.out.print("Enter first number: ");
    n1 = input.nextInt();

    System.out.print("And the second: ");
    n2 = input.nextInt();

    sum = n1 + n2;

    System.out.printf("Sum is %d\n", sum);
  }
}
