import java.security.SecureRandom;

public class RollDie {
  public static void main(String[] args) {
    SecureRandom rand = new SecureRandom();
    int[] freq = new int[7];

    for (int roll = 1; roll <= 6_000_000; roll++) {
      ++freq[1 + rand.nextInt(6)];
    }
    System.out.printf("%s%10s\n", "Face", "Frequency");
    for (int face = 1; face < freq.length; face++) {
      System.out.printf("%4d%10d\n", face, freq[face]);
    }
  }
}
