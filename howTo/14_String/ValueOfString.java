public class ValueOfString {
  public static void main(String[] args) {
    char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
    boolean booleanVal = true;
    char charVal = 'Z';
    int intVal = 7;
    long longVal =  1000000000L;
    float floatVal = 2.5f;
    double doubleVal = 33.333;
    Object objectRef = "hello";

    System.out.printf("char array: %s\n", String.valueOf(charArray));
    System.out.printf("part of char Array: %s\n",
                      String.valueOf(charArray, 3, 3));
    System.out.printf("boolean: %s\n", String.valueOf(booleanVal));
    System.out.printf("char: %s\n", String.valueOf(charVal));
    System.out.printf("int: %s\n", String.valueOf(intVal));
    System.out.printf("long: %s\n", String.valueOf(longVal));
    System.out.printf("float: %s\n", String.valueOf(floatVal));
    System.out.printf("double: %s\n", String.valueOf(doubleVal));
    System.out.printf("Object: %s\n", String.valueOf(objectRef));
  }
}
