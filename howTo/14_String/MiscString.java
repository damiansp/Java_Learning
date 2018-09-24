public class MiscString {
  public static void main(String[] args) {
    String s1 = "hello",
      s2 = "GOODBYE",
      s3 = "spaces   ";

    System.out.printf("s1: %s\ns2: %s\ns3: \"%s\"\n\n", s1, s2, s3);
    System.out.printf("Replace 'l' with 'r' in s1: %s\n\n",
                      s1.replace('l', 'r'));
    System.out.printf("s1.toUpperCase(): %s\n", s1.toUpperCase());
    System.out.printf("s2.toLowerCase(): %s\n", s3.toLowerCase());
    System.out.printf("s3.trim(): \"%s\"\n", s3.trim());

    char[] charArray = s1.toCharArray();
    System.out.println("s1 as a character array:");
    for (char c: charArray) {
      System.out.printf("%c ", c);
    }
    System.out.println();
  }
}
