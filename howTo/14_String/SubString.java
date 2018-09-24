public class SubString {
  public static void main(String[] args) {
    String letters = "abcdefghijklmabcdefghijklm";
    System.out.printf("Substring from 20 to end: \"%s\"\n",
                      letters.substring(20));
    System.out.printfo("Substirng [3, 6): \"%s\"\n", letters.substring(3, 6));
  }
}
