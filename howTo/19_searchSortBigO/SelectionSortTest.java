import java.security.SecureRandom;
import java.util.Arrays;


public class SelectionSortTest {
  public static void selectionSort(int[] data) {
    for (int i = 0; i < data.length - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < data.length; j++) {
        if (data[j] < data[smallest]) smallest = j;
      }
      swap(data, i, smallest);
      printPass(data, i + 1, smallest);
    }
  }

  private static void swap(int[] data, int first, int second) {
    int temp = data[first];
    data[first] = data[second];
    data[second] = temp;
  }

  private static void printPass(int[] data, int pass, int idx) {
    System.out.printf("After pass %2d: ", pass);
    for (int i = 0; i < idx; i++) System.out.printf("%d  ", data[i]);
    System.out.printf("%d* ", data[idx]);
    for (int i = idx + 1; i < data.length; i++) {
      System.out.printf("%d  ", data[i]);
    }
    System.out.printf("\n  ");
    for (int j = 0; j < pass; j++) System.out.printf("--  ");
    System.out.println();
  }

  public static void main(String[] args) {
    SecureRandom rand = new SecureRandom();
    int[] data = rand.ints(10, 10, 91).toArray();
    System.out.printf("Unsorted array: %s\n\n", Arrays.toString(data));
    selectionSort(data);
    System.out.printf("\nSorted array: %s\n", Arrays.toString(data));
  }
}
