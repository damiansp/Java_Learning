/* GenericMethodTest.java */
// Use generic methods to print arrays of different types

public class GenericMethodTest {
  // Generic print method for arrays
  public static <E> void print(E[] array) {
    for (E elem: array) {
      System.out.printf("%s ", elem);
    }

    System.out.println();
  }


  
  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
    Double[] doubArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
    Character[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

    System.out.println("intArray:");
    print(intArray);
    System.out.println("doubArray:");
    print(doubArray);
    System.out.println("charArray:");
    print(charArray);
  }
}
