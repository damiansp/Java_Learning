import java.security.SecureRandom;

public class RollDie {
  public static void main(String[] args) {
    SecureRandom rand = new SecureRandom();
    int iters = 100;

    for (int i = 1; i <= iters; ++i) {
      int face = 1 + rand.nextInt(6); // 1 + {0,  1, ..., 5}

      System.out.printf("%d ", face);

      if (i % 10 == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }
}
