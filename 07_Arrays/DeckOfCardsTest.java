// Card Shuffling and Dealing app
public class DeckOfCardsTest {
  public static void main(String[] args) {
    DeckOfCards theDeck = new DeckOfCards();
    theDeck.shuffle();

    // Print cards in order dealt, 4 to a line
    for (int i = 0; i < 13; i++) {
      // Deal and print 4 cards
      System.out.printf("%-20s%-20s%-20s%-20s\n",
                        theDeck.dealCard(),
                        theDeck.dealCard(),
                        theDeck.dealCard(),
                        theDeck.dealCard());
    }
  }
}
