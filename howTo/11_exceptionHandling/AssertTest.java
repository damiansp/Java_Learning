import java.util.Scanner;

public class AssertTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 10: ");
    int n = input.nextInt();
    assert(n >= 0 && n <= 10): "bad value: " + n;
    System.out.printf("You entered %d\n", n);
  }
}
