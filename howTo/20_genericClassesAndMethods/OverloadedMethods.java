public class OverloadedMethods {
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


  public static void printArray(Integer[] inputArray) {
    for (Integer elem: inputArray) System.out.printf("%s ", elem);
    System.out.println();
  }


  public static void printArray(Double[] inputArray) {
    for (Double elem: inputArray)  System.out.printf("%s ", elem);
    System.out.println();
  }
  

  public static void printArray(Character[] inputArray) {
    for (Character elem: inputArray)  System.out.printf("%s ", elem);
    System.out.println();
  }
}
