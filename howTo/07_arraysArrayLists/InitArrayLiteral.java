public class InitArrayLiteral {
  public static void main(String[] args) {
    int[] array = {0, 1, 1, 2, 3, 5, 8, 13};

    System.out.printf("%s%8s\n", "Index", "Value");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%5d%8d\n", i, array[i]);
    }
  }
}
