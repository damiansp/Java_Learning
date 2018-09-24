public class ConcatString {
  public static void main(String[] args) {
    String s1 = "Good ";
    String s2 = "Times!";

    System.out.printf("s1: %s\ns2: %s\n\n", s1, s2);
    System.out.printf("s1.concat(s2): %s\n", s1.concat(s2));
    System.out.printf("After concatenation, s1: %s\n", s1);
  }
}
