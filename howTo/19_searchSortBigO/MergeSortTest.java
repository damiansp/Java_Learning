import java.security.SecureRandom;
import java.util.Arrays;


public class MergeSortTest {
  public static void mergeSort(int[] data) {
    sortArray(data, 0, data.length - 1);
  }

  private static void sortArray(int[] data, int low, int high) {
    if ((high - low) >= 1) {
      int mid1 = (low + high) / 2;
      int mid2 = mid1 + 1;
      System.out.printf("split:  %s\n", subarrayString(data, low, high));
      System.out.printf("  %s\n", subarrayString(data, low, mid1));
      System.out.printf("  %s\n\n", subarrayString(data, mid2, high));
      sortArray(data, low, mid1);
      sortArray(data, mid2, high);
      merge(data, low, mid1, mid2, high);
    }
  }

  private static void merge(int[] data, int left, int mid1, int mid2, int right)
  {
    int leftIdx = left;
    int rightIdx = mid2;
    int combinedIdx = left;
    int[] combined = new int[data.length];
    System.out.printf("merge:  %s\n", subarrayString(data, left, mid1));
    System.out.printf("  %s\n", subarrayString(data, mid2, right));
    while (leftIdx <= mid1 && rightIdx <= right) {
      if (data[leftIdx] <= data[rightIdx]) {
        combined[combinedIdx++] = data[leftIdx++];
      } else combined[combinedIdx++] = data[rightIdx++];
    }
    if (leftIdx == mid2) {
      while (rightIdx <= right) combined[combinedIdx++] = data[rightIdx++];
    } else {
      while (leftIdx <= mid1) combined[combinedIdx++] = data[leftIdx++];
    }
    for (int i = left; i <= right; i++) data[i] = combined[i];
    System.out.printf("  %s\n\n", subarrayString(data, left, right));
  }
  
  private static String subarrayString(int[] data, int low, int high) {
    StringBuilder temp = new StringBuilder();
    for (int i = 0; i < low; i++) temp.append("  ");
    for (int i = low; i <= high; i++) temp.append(" " + data[i]);
    return temp.toString();
  }

  public static void main(String[] args) {
    SecureRandom rand = new SecureRandom();
    int[] data = rand.ints(10, 10, 91).toArray();
    System.out.printf("Unsorted array: %s\n\n", Arrays.toString(data));
    mergeSort(data);
    System.out.printf("Sorted array: %s\n", Arrays.toString(data));
  }
}
