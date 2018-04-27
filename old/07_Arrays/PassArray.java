// Passing arrays to methods
public class PassArray {
  // double the elements in an array
  public static void doubleArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] *= 2;
    }
  }

  public static void tripleElement(int element) {
    element *= 3;
    System.out.printf("Value of element in tripleElement: %d\n", element);
  }
  
  public static void main(String[] args) {
    int array[] = { 1, 2, 3, 4, 5 };

    System.out.println("Effects of passing reference to entire array:\n" +
                       "The values of the original array are:");

    for (int value: array) {
      System.out.printf("  %d", value);
    }

    System.out.printf("\n\nEffects of pasing array element value:\n" +
                      "array[3] before tripleElement(): %d\n",
                      array[3]);

    tripleElement(array[3]);
    System.out.printf("array[3] after tripleElement(): %d\n", array[3]);

    doubleArray(array);
  }
}
