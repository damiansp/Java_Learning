// Find a maximum value
import java.util.Scanner;

public class Max {
  // return max of 3 doubles
  public double maximum(double a, double b, double c) {
    double maxVal = a;

    if (b > maxVal) {
      maxVal = b;
    }
    if (c > maxVal) {
      maxVal = c;
    }

    return maxVal;
  }
  
  // Get 3 floats; find max
  public void determineMax() {
    Scanner input = new Scanner(System.in);

    // get input
    System.out.print("Enter 3 floats separated by spaces: ");
    double n1 = input.nextDouble();
    double n2 = input.nextDouble();
    double n3 = input.nextDouble();

    // find max
    double result = maximum(n1, n2, n3);

    // print
    System.out.println("Max is: " + result);
  }
}
