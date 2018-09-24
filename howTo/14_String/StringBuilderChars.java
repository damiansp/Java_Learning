public class StringBuilderChars {
  public static void main(String[] args) {
    StringBuilder buff = new StringBuilder("hello there");
    char[] charArray = new char[buff.length()];

    System.out.printf("buffer = %s\n", buff.toString());
    System.out.printf(
      "Char at 0: %s\nChar at 4: %s\n\n", buff.charAt(0), buff.charAt(4));
    buff.getChars(0, buff.length(), charArray, 0);
    System.out.print("the chars are: ");
    for (char c: charArray) System.out.print(c);
    buff.setCharAt(0, 'H');
    buff.setCharAt(6, 'T');
    System.out.printf("\n\nbuffer = %s", buff.toString());
    buff.reverse();
    System.out.printf("\n\nbuffer = %s\n", buff.toString());
  }
}
