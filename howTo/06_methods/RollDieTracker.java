import java.security.SecureRandom;


public class RollDieTracker {
  public static void main(String[] args) {
    SecureRandom rand = new SecureRandom();
    int freq1 = 0,
      freq2 = 0,
      freq3 = 0,
      freq4 = 0,
      freq5 = 0,
      freq6 = 0;
    int nRolls = 60_000_000;

    for (int roll = 1; roll <= nRolls; ++roll) {
      int face = 1 + rand.nextInt(6);
      switch (face) {
      case 1:
        ++freq1; break;
      case 2:
        ++freq2; break;
      case 3:
        ++freq3; break;
      case 4:
        ++freq4; break;
      case 5:
        ++freq5; break;
      case 6:
        ++freq6; break;
      }
    }

    System.out.println("Face\tFrequency");
    System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
                      freq1, freq2, freq3, freq4, freq5, freq6);
  }
}
