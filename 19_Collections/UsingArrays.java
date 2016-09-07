/* UsingArrays.java */
import java.util.Arrays;

public class UsingArrays {
  private int[] intArray = { 1, 2, 3, 4, 5, 6 };
  private double[] doubArray = { 8.7, 9.8, 0.9, 7.6, 3.2 };
  private int[] filledIntArray,
    intArrayCopy;

  // Constr (init arrays)
  public UsingArrays() {
    filledIntArray = new int[10];
    intArrayCopy   = new int[intArray.length];

    Arrays.fill(filledIntArray, 7); // sets all elements to 7
    Arrays.sort(doubArray);

    // Copy intArray into intArrayCopy
    System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
  }

  // Output values in each array
  public void printArrays() {
    System.out.print("doubArray: ");
    for (double d: doubArray) {
      System.out.printf("%.1f ", d);
    }

    System.out.print("\nintArray: ");
    for (int i: intArray) {
      System.out.printf("%d ", i);
    }

    System.out.print("\nfilledIntArray: ");
    for (int i: filledIntArray) {
      System.out.printf("%d ", i);
    }

    System.out.print("\nintArrayCopy: ");
    for (int i: intArrayCopy) {
      System.out.printf("%d ", i);
    }

    System.out.println("\n");
  }

  // Search: find value in array intArray
  public int searchForInt(int value) {
    return Arrays.binarySearch(intArray, value);
  }

  // Compare array contents
  public void printEquality() {
    boolean b = Arrays.equals(intArray, intArrayCopy);

    System.out.printf("intArray %s intArrayCopy\n", (b ? "==" : "!="));

    b = Arrays.equals(intArray, filledIntArray);
    System.out.printf("intArray %s filledIntArray\n", (b ? "==" : "!="));
  }


  
  public static void main(String[] args) {
    UsingArrays usingArrays = new UsingArrays();

    usingArrays.printArrays();
    usingArrays.printEquality();

    int location = usingArrays.searchForInt(5);

    if (location >= 0) {
      System.out.printf("Found 5 at index %d in intArray\n", location);
    } else {
      System.out.println("5 not found in intArray");
    }

    location = usingArrays.searchForInt(999);
    if (location >= 0) {
      System.out.printf("Found 999 at index %d in intArray\n", location);
    } else {
      System.out.println("999 not found in intArray");
    }
  }
}
