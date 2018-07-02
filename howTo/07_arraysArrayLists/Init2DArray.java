public class Init2DArray {
  public static void main(String[] args) {
    int[][] array1 = {{1, 2, 3,},
                      {4, 5, 6}};
    int[][] array2 = {{1, 2},
                      {3},
                      {4, 5, 6}};
    System.out.println("Values in array1, by row: ");
    outputArray(array1);
    System.out.println("\nValues in array2, by row: ");
    outputArray(array2);                      
  }


  public static void outputArray(int[][] array) {
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        System.out.printf("%d ", array[row][col]);
      }
      System.out.println();
    }
  }
}
