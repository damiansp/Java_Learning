public class EnhancedForTest {
  public static void main(String[] args) {
    int[] array = {60, 60, 24, 7, 52};
    int product = 1;

    for (int number: array) {
      product *= number;
    }
    System.out.printf("There are %d seconds in a year\n", product);
  }
}
