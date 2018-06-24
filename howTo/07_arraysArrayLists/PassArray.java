public class PassArray {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};

    System.out.printf("Effects of passing refence to entire array:\n" +
                      "The values in the original array are:\n");
    for (int val: array) {
      System.out.printf(" %d", val);
    }
    doubleArray(array);
    System.out.printf("\n\nThe values in the doubled array are:\n");
    for (int val: array) {
      System.out.printf(" %d", val);
    }
    System.out.printf("\n\nEffects of passing array element value:\n" +
                      "array[3] before tripleElement: %d\n",
                      array[3]);
    tripleElement(array[3]);
    System.out.printf("array[3] after tripleElement: %d\n", array[3]);
  }


  public static void doubleArray(int[] array2) {
    for (int i=0; i < array2.length; i++) {
      array2[i] *= 2;
    }
  }

  
  public static void tripleElement(int element) {
    element *= 3;
    System.out.printf("Value of tripled element is: %d\n", element);
  }
}
