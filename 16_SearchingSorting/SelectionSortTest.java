/* SelectionSortTest.java */
public class SelectionSortTest {
  public static void main(String[] args) {
    SelectionSort sortArray = new SelectionSort(15);

    System.out.println("Unsorted array:");
    System.out.println(sortArray);

    sortArray.sort();

    System.out.println("Sorted array:");
    System.out.println(sortArray);
  }
}
