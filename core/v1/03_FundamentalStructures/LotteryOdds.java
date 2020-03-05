import java.util.*;

/**
 * This program demonstrates a for loop.
 * Derived from code by Cay Horstmann (see repo README)
 */
public class LotteryOdds {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("How many numbers to draw? ");
    int k = in.nextInt();

    System.out.print("Highest number drawable? ");
    int n = in.nextInt();

    /* compute binomial coef */
    int lotteryOdds = 1;
    for (int i = 1; i <= k; i++) {
      lotteryOdds *= ((n - i + 1) / i);
    }
    System.out.println(
      "Odds of winning are 1 / " + lotteryOdds + ". Good Luck!\n");
  }
}
