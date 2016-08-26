/* SelectionSort.java */
// Create an array of rand ints; sort with selection sort
import java.util.Random;

public class SelectionSort {
  private int[] data;
  private static Random rand = new Random();

  // Constr-- Create array of gien size and fill with rand ints
  public SelectionSort(int size) {
    data = new int[size];

    // fill with rand ints on [10, 99]
    for (int i = 0; i < size; i++) {
      data[i] = 10 + rand.nextInt(90);
    }
  }

  // print a single pass of the algo
  public void printPass(int pass, int index) {
    System.out.print(String.format("after pass %2d: ", pass));

    // Output elems up to selected item
    for (int i = 0; i < index; i++) {
      System.out.print(data[i] + " ");
    }

    System.out.print(data[index] + "* ");  // indicate swapped elem

    // rest of array
    for (int i = index + 1; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }

    System.out.print("\n           ");  // align

    // indicate amt of array that is sorted
    for (int j = 0; j < pass; j++) {
      System.out.print("-- ");
    }
    
    System.out.println("\n");
  }
  
  // helper method to swap values of two array elems
  public void swap(int first, int second) {
    int temp = data[first];
    data[first] = data[second];
    data[second] = temp;
  }

  // Sort with selection sort
  public void sort() {
    int smallest; // index of smallest value

    // loop over data.length - 1 elements
    for (int i = 0; i < data.length - 1; i++) {
      smallest = i; // first index of remaining array

      // loop to find index of smallest
      for (int index = i +1; index < data.length; index++) {
        if (data[index] < data[smallest]) { smallest = index; }
      }

      swap(i, smallest);
      printPass(i + 1, smallest);
    }
  }

  // Print values in array
  public String toString() {
    StringBuilder temp = new StringBuilder();

    for (int element: data) {
      temp.append(element + " ");
    }

    temp.append("\n");
    return temp.toString();
  }
}
