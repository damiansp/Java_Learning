// Creating an array

public class InitArray {
  public static void main(String[] args) {
    int array[] = new int[10];
    int array2[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
    final int ARRAY_LENGTH = 10;
    int array3[] = new int[ARRAY_LENGTH];
    
    System.out.printf("%s%8s%9s%9s\n", "Index", "Array1", "Array2", "Array3");

    for (int counter = 0; counter < array.length; counter++) {
      array3[counter] = 2 + 2 * counter;
      System.out.printf("%5d%8d%9d%9d\n",
                        counter,
                        array[counter],
                        array2[counter],
                        array3[counter]);
    }
  }
}
