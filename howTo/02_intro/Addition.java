// Addition.java

import java.util.Scanner;

public class Addition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter int1: ");
    int n1 = input.nextInt();

    System.out.print("Enter int2: ");
    int n2 = input.nextInt();
    int sum = n1 + n2;

    System.out.printf("%d + %d = %d\n", n1, n2, sum);
  }
}
