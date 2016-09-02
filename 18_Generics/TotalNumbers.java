/* TotalNumbers.java */
// Sum elements in an ArrayList
import java.util.ArrayList;

public class TotalNumbers {
  public static double sum(ArrayList<Number> aList) {
    double total = 0;

    for (Number n: aList) {
      total += n.doubleValue();
    }

    return total;
  }
  
  public static void main(String[] args) {
    // Create and init output ArrayList of Numbers containing both Ints and
    // Doubles; display sum
    Number[] numbers = { 1, 2.4, 3, 4.8 };
    ArrayList<Number> nList = new ArrayList<Number>();

    for (Number n: numbers) {
      nList.add(n);
    }

    System.out.printf("nList contains: %s\n", nList);
    System.out.printf("Total of the elements in nList: %.1f\n", sum(nList));
  }
}
