public class GenericMethods {
  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5, 6};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.printf("intArray: ");
    printArray(intArray);
    System.out.printf("doubleArray: ");
    printArray(doubleArray);
    System.out.printf("charArray: ");
    printArray(charArray);
  }


  public static void printArray(T[] inputArray) {
    for (T elem: inputArray) System.out.printf("%s ", elem);
    System.out.println();
  }
}
