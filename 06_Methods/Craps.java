// Play a game of craps
import java.util.Random;

public class Craps {
  // Random number generator
  private Random rand = new Random();
  // Game status
  private enum Status { CONTINUE, WON, LOST };

  // Constant roll defs
  private final static int SNAKE_EYES = 2;
  private final static int TREY = 3;
  private final static int SEVEN = 7;
  private final static int YO_LEVEN = 11;
  private final static int BOX_CARS = 12;

  // roll dice, return sum
  public int rollDice() {
    int die1 = 1 + rand.nextInt(6),
      die2 = 1 + rand.nextInt(6),
      sum = die1 + die2;

    System.out.printf("Player rolled %d & %d: %d\n", die1, die2, sum);

    return sum;
  }
  
  // Play one game
  public void play() {
    int point = 0,
      sumOfDice = 0;
    Status gameStatus;

    sumOfDice = rollDice();  // First roll

    // Determine game status from roll
    switch (sumOfDice) {
    case SEVEN:
    case YO_LEVEN:
      gameStatus = Status.WON; break;
    case SNAKE_EYES:
    case TREY:
    case BOX_CARS:
      gameStatus = Status.LOST; break;
    default:
      gameStatus = Status.CONTINUE;
      point = sumOfDice;
      System.out.printf("Point is %d\n", point); break;
    }

    while (gameStatus == Status.CONTINUE) {
      sumOfDice = rollDice();

      if (sumOfDice == point) {
        gameStatus = Status.WON;
      } else {
        if (sumOfDice == SEVEN) {
          gameStatus = Status.LOST;
        }
      }
    }

    // Display game outcome
    if (gameStatus == Status.WON) {
      System.out.println("\nYou win!\n\n");
    } else {
      System.out.println("\nYou lose.\n\n");
    }
  }
}
