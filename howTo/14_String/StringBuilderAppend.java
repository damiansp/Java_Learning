public class StringBuilderAppend {
  public static void main(String[] args) {
    Object objectRef = "hello";
    String string = "goodbye";
    char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
    boolean boolVal = true;
    char charVal = 'Z';
    int intVal = 7;
    long longVal = 10000000000L;
    float floatVal = 1.2f;
    double dubVal = 34.567;
    StringBuilder lastBuff = new StringBuilder("last buffer");
    StringBuilder buff = new StringBuilder();

    buff.append(objectRef)
      .append(System.getProperty("line.separator"))
      .append(string)
      .append(System.getProperty("line.separator"))
      .append(charArray)
      .append(System.getProperty("line.separator"))
      .append(charArray, 0, 3)
      .append(System.getProperty("line.separator"))
      .append(boolVal)
      .append(System.getProperty("line.separator"))
      .append(charVal)
      .append(System.getProperty("line.separator"))
      .append(intVal)
      .append(System.getProperty("line.separator"))
      .append(longVal)
      .append(System.getProperty("line.separator"))
      .append(floatVal)
      .append(System.getProperty("line.separator"))
      .append(dubVal)
      .append(System.getProperty("line.separator"))
      .append(lastBuff);
    System.out.printf("buffer contains:\n\n%s\n", buff.toString());
  }
}
