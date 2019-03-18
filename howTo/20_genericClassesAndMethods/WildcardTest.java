import java.util.ArrayList;
import java.util.List;


public class WildcardTest {
  public static void main(String[] args) {
    Integer[] ints = {1, 2, 3, 4, 5};
    List<Integer> intList = new ArrayList<>();
    Double[] dubs = {1.1, 3.3, 5.5, 7.7};
    List<Double> dubList = new ArrayList<>();
    Number[] nums = {1, 2.4, 3, 4.6};
    List<Number> numList = new ArrayList<>();
    
    for (Integer elem: ints) intList.add(elem);
    System.out.printf("intList contains: %s\n", intList);
    System.out.printf("Total of elements in intList: %.0f\n\n", sum(intList));
    for (Double elem: dubs) dubList.add(elem);
    System.out.printf("dubList contains: %s\n", dubList);
    System.out.printf("Total of elements in dubList: %.1f\n\n", sum(dubList));
    for (Number elem: nums) numList.add(elem);
    System.out.printf("numList contains: %s\n", numList);
    System.out.printf("Total of elements in numList: %.1f\n\n", sum(numList));
  }


  public static double sum(List<? extends Number> list) {
    double total = 0;

    for (Number elem: list) total += elem.doubleValue();
    return total;
  }
}
