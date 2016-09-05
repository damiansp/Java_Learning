/* WildcardTest.java */
import java.util.ArrayList;

public class WildcardTest {
  public static void main(String[] args) {
    // Create, init, and output ArrayList of Ints, then display their total
    Integer[] ints = { 1, 2, 3, 4, 5 };
    ArrayList<Integer> intList = new ArrayList<Integer>();

    // insert elements in intList
    for (Integer elem: ints) {
      intList.add(elem);
    }

    System.out.printf("intList contains: %s\n", intList);
    System.out.printf("Total of the elements in intList: %.0f\n\n",
                      sum(intList));

    // Create, init, and output ArrayList of Doubs, and total
    Double[] doubs = { 1.1, 3.3, 5.5 };
    ArrayList<Double> doubList = new ArrayList<Double>();

    // insert elems into doubList
    for (Double elem: doubs) {
      doubList.add(elem);
    }

    System.out.printf("doubList contains: %s\n", doubList);
    System.out.printf("Total of the elements in doubList: %.1f\n\n",
                      sum(doubList));

    // Create, init, output ArrayList of Numbers, and total
    Number[] nums = { 1, 2.3, 4, 5.6 };
    ArrayList<Number> numList = new ArrayList<Number>();

    // insert elems into numList
    for (Number n: nums) {
      numList.add(n);
    }

    System.out.printf("numList contains: %s\n", numList);
    System.out.printf("Total of the elements in numList: %.1f\n\n",
                      sum(numList));
  }

  // Calculate total of elems in stack
  public static double sum(ArrayList<? extends Number> list) {
    double total = 0;

    for (Number n: list) {
      total += n.doubleValue();
    }

    return total;
  }
}
