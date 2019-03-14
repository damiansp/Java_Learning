import java.util.ArrayList;
import java.util.List;


public class TotalNumbers {
  public static void main(String[] args) {
    Number[] numbers = {1, 2.3, 4, 5.6};
    List<Number> nList = new ArrayList<>();

    for (Number element: numbers) nList.add(element);
    System.out.printf("nList contains %s\n", nList);
    System.out.printf("Totla of the elements in nList: %.1f\n", sum(nList));
  }


  public static double sum(List<Number> list) {
    double total = 0;

    for (Number n: list) total += n.doubleValue();
    return total;
  }
}
