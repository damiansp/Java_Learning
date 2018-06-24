import java.security.SecureRandom;

public class DeckOfCards {
  private static final SecureRandom rand = new SecureRandom();
  private static final int N_CARDS = 52;
  private Card[] deck = new Card[N_CARDS];
  private int currentCard = 0;

  public DeckOfCards() {
    String[] values = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
                       "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    for (int i = 0; i < deck.length; i++) {
      deck[i] = new Card(values[i % 13], suits[i / 13]);
    }
  }

  public void shuffle() {
    currentCard = 0;
    for (int first = 0; first < deck.length; first++) {
      int second = rand.nextInt(N_CARDS);
      Card temp = deck[first];
      deck[first] = deck[second];
      deck[second] = temp;
    }
  }

  public Card dealCard() {
    if (currentCard < deck.length) {
      return deck[currentCard++];
    } else {
      System.out.println("No more cards.");
      return null;
    }
  }
}
