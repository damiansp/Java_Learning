public class StringBuilderInsertDelete {
  public static void main(String[] args) {
    Object objRef = "object";
    String string = "string";
    char[] cArray = {'c', 'h', 'a', 'r', 's'};
    boolean bool = true;
    char ch = 'K';
    int i = 7;
    long L = 10000000000L;
    float f = 2.5f;
    double d = 34.567;
    StringBuilder buff = new StringBuilder();

    buff.insert(0, objRef);
    buff.insert(0, "  ");
    buff.insert(0, string);
    buff.insert(0, "  ");
    buff.insert(0, cArray);
    buff.insert(0, "  ");
    buff.insert(0, bool);
    buff.insert(0, "  ");
    buff.insert(0, ch);
    buff.insert(0, "  ");
    buff.insert(0, i);
    buff.insert(0, "  ");
    buff.insert(0, L);
    buff.insert(0, "  ");
    buff.insert(0, f);
    buff.insert(0, "  ");
    buff.insert(0, d);
    System.out.printf("Buffer after insertions:\n%s\n\n", buff.toString());
    buff.deleteCharAt(10);
    buff.delete(2, 6);
    System.out.printf("Buffer after deletions:\n%s\n", buff.toString());
  }
}
