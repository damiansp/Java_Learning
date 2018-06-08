// MaximumFinder.java
import java.util.Scanner;

public class MaximumFinder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter 3 decimal values separated by spaces: ");
    double n1 = input.nextDouble();
    double n2 = input.nextDouble();
    double n3 = input.nextDouble();
    double result = maximum(n1, n2, n3);

    System.out.println("Max is: " + result);
  }


  public static double maximum(double x, double y, double z) {
    double maxValue = x;

    if (y > maxValue) {
      maxValue = y;
    }
    if (z > maxValue) {
      maxValue = z;
    }
    return maxValue;
  }
}
