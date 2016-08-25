/* BinaryArray.java */
// Uses binary search to find an int in a sorted array
import java.util.Arrays;
import java.util.Random;

public class BinaryArray {
  private int[] data;
  private static Random rand = new Random();

  // Constr-- Create array of given size, and fill w sorted rand ints
  public BinaryArray(int size) {
    data = new int[size];

    // fill with ints on [10 - 99]
    for (int i = 0; i < size; i++) {
      data[i] = 10 + rand.nextInt(90);
    }

    Arrays.sort(data);
  }

  // Output a range of index vals of the array
  public String remainingElements(int low, int high) {
    StringBuilder temp = new StringBuilder();

    // Output spaces for alignment
    for (int i = 0; i < low; i++) {
      temp.append("   ");
    }

    // Output elems in range
    for (int i = low; i <= high; i++) {
      temp.append(data[i] + " ");
    }

    temp.append("\n");
    return temp.toString();
  }

  // Output values in array
  public String toString() {
    return remainingElements(0, data.length - 1);
  }
  
  // Perform binary search on data
  public int binarySearch(int searchElement) {
    int low = 0,                     // low...
      high = data.length - 1,        // ... and high index bounds of search
      middle = (low + high + 1) / 2, // middle elem in search range
      location = -1;                 // return val or -1 if not found

    do {
      // Search:
      // Print remaining elements in array
      System.out.print(remainingElements(low, high));

      // Align
      for (int i = 0; i < middle; i++) {
        System.out.print("   ");
      }

      System.out.println(" * "); // indicate middle
  
      // If elem found at middle
      if (searchElement == data[middle]) {
        location = middle;
        // Else update bounds:
      } else if (searchElement < data[middle]) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
      
      // update middle
      middle = (low + high + 1) / 2;
    } while ((low <= high) && (location == -1));

    return location;
  }
}
