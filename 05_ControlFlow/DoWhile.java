public class DoWhile {
  public static void main(String[] args) {
    int i = 1;

    do {
      int doubled = i * 2;
      System.out.println("2 * " + i + " = " + doubled);
      i++;
    } while (i <= 10);

    System.out.println("C'est Finit");

  }
}
