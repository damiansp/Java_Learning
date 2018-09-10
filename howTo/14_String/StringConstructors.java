public class StringConstructors {
  public static void main(String[] args) {
    char[] charArray = {'a', ' ', 'S', 't', 'r', 'i', 'n', 'g'};
    String s = new String("another one");
    String s1 = new String();
    String s2 = new String(s);
    String s3 = new String(charArray);
    String s4 = new String(charArray, 2, 6);
    System.out.printf("s1: %s\ns2: %s\ns3: %s\ns4: %s\n", s1, s2, s3, s4);
  }
}
