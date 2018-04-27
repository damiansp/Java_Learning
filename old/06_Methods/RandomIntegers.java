// Shifted and scaled random integers
import java.util.Random;

public class RandomIntegers {
  public static void main(String[] args) {
    Random rand = new Random();
    int face; // side of a die

    for (int counter = 1; counter <= 20; counter++) {
      face = 1 + rand.nextInt(6);

      System.out.printf("%d ", face);

      if (counter % 5 == 0) {
        System.out.println();
      }
    }
  }
}
