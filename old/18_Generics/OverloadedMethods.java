/* OverloadedMethods.java */
// Overload methods to print arrays of difft types
public class OverloadedMethods {
  // Int
  public static void print(Integer[] array) {
    for (Integer elem: array) {
      System.out.printf("%s ", elem);
    }

    System.out.println();
  }

  // Doub
  public static void print(Double[] array) {
    for (Double elem: array) {
      System.out.printf("%s ", elem);
    }

    System.out.println();
  }

  // Char
  public static void print(Character[] array) {
    for (Character elem: array) {
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
