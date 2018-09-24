public class StringIndexMethods {
  public static void main(String[] args) {
    String letters = "abcdefghijklmabcdefghijklm";
    System.out.printf("'c' at index %d\n", letters.indexOf('c'));
    System.out.printf("'a' at index %d\n", letters.indexOf('a', 1));
    System.out.printf("'$' at index %d\n\n", letters.indexOf('$'));

    System.out.printf("Last 'c' at index %d\n", letters.lastIndexOf('c'));
    System.out.printf("last 'a' at index %d\n", letters.lastIndexOf('a', 25));
    System.out.printf("Last '$' at index %d\n\n", letters.lastIndexOf('$'));

    System.out.printf("\"def\" at index %d\n", letters.indexOf("def"));
    System.out.printf("\"def\" at index %d\n", letters.indexOf("def", 7));
    System.out.printf("\"hello\" at index %d\n\n", letters.indexOf("hello"));

    System.out.printf("Last \"def\" at index %d\n", letters.lastIndexOf("def"));
    System.out.printf("Last \"def\" at index %d\n",
                      letters.lastIndexOf("def", 25));
    System.out.printf("Last \"hello\" at index %d\n",
                      letters.lastIndexOf("hello"));
  }
}
