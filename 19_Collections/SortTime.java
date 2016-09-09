/* SortTime.java */
// Sort list using custom Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTime {
  public void print() {
    List<Time2> list = new ArrayList<Time2>();

    list.add(new Time2( 6, 24, 38));
    list.add(new Time2(18, 14, 58));
    list.add(new Time2( 6,  5, 34));
    list.add(new Time2(12, 14, 58));
    list.add(new Time2( 6, 24, 22));

    // Output List elements
    System.out.printf("Unsorted array:\n%s\n", list);

    // Sort
    Collections.sort(list, new TimeComparator());

    // Output again
    System.out.printf("Sorted array:\n%s\n", list);
  }


  public static void main(String[] args) {
    SortTime sortTime = new SortTime();
    sortTime.print();
  }
}
