public class StringBuilderCapacityAndLength {
  public static void main(String[] args) {
    StringBuilder buffer = new StringBuilder("Hi there, how goes it?");

    System.out.printf("buffer = %s\nlength = %d\ncapacity = %d\n\n",
                      buffer.toString(),
                      buffer.length(),
                      buffer.capacity());
    buffer.ensureCapacity(75);
    System.out.printf("New capacity = %d\n\n", buffer.capacity());
    buffer.setLength(10);
    System.out.printf(
      "New length = %d\nbuffer = %s\n\n", buffer.length(), buffer.toString());
  }
}
