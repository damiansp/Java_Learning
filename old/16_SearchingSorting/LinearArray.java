/* LinearArray.java */
// Class contains an array of ints and method for sequential search
import java.util.Random;

public class LinearArray {
  private int[] data;
  private static Random rand = new Random();

  // Constr--Create array of given size, fill with rand ns
  public LinearArray(int size) {
    data = new int[size];

    // fill with rand ints on [10 - 99]
    for (int i = 0; i < size; i++) {
      data[i] = 10 + rand.nextInt(90);
    }
  }

  // perform a linear search on the data
  public int linearSearch(int searchKey) {
    // loop through sequentially
    for (int i = 0; i < data.length; i++) {
      if (data[i] == searchKey) {
        return i;
      }
    }

    return -1; // not found
  }

  // output values in array
  public String toString() {
    StringBuilder temp = new StringBuilder();

    // iterate over array
    for (int element: data) {
      temp.append(element + " ");
    }

    temp.append("\n");
    return temp.toString();
  }
}
