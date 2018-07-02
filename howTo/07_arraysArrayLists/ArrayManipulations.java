import java.util.Arrays;

public class ArrayManipulations {
  public static void main(String[] args) {
    double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};

    Arrays.sort(doubleArray);
    System.out.printf("\ndoubleArray: ");
    for (double n: doubleArray) {
      System.out.printf("%.1f ", n);
    }

    int[] filledIntArray = new int[10];
    Arrays.fill(filledIntArray, 7);
    displayArray(filledIntArray, "filledIntArray");

    int[] intArray = {1, 2, 3, 4, 5, 6};
    int[] intArrayCopy = new int[intArray.length];

    System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
    displayArray(intArray, "intArray");
    displayArray(intArrayCopy, "intArrayCopy");

    boolean b = Arrays.equals(intArray, intArrayCopy);

    System.out.printf("\n\nintArray %s intArrayCopy\n", (b ? "==" : "!="));
    b = Arrays.equals(intArray, filledIntArray);
    System.out.printf("intArray %s filledIntArray\n", (b ? "==" : "!="));

    int location = Arrays.binarySearch(intArray, 5);

    if (location >= 0) {
      System.out.printf("Found a 5 at index %d in intArray\n", location);
    } else {
      System.out.println("No 5 found in intArray");
    }
    location = Arrays.binarySearch(intArray, 888);
    if (location >= 0) {
      System.out.printf("Found a 888 at index %d in intArray\n", location);
    } else {
      System.out.println("No 888 found in intArray");
    }
  }


  public static void displayArray(int[] array, String name) {
    System.out.printf("\n%s: ", name);
    for (int n: array) {
      System.out.printf("%d ", n);
    }
  }
}
