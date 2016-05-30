// Represent a deck of cards
import java.util.Random;

public class DeckOfCards {
  private Card deck[];
  private int currentCard; // next to be dealt or "top of the deck"
  private final int NUMBER_OF_CARDS = 52;
  private Random rand;

  // Constructor: fills the deck
  public DeckOfCards() {
    String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
                       "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
    deck = new Card[NUMBER_OF_CARDS];

    currentCard = 0; // first card dealt will be deck[0]

    // Populate deck
    for (int i = 0; i < deck.length; i++) {
      deck[i] = new Card(faces[i % 13], suits[i / 13]);
    }
  }

  // Shuffle deck with single-pass
  public void shuffle() {
    currentCard = 0;

    // For each card, pick another at random and swap
    for (int first = 0; first < deck.length; first++) {
      int second = rand.nextInt(NUMBER_OF_CARDS);

      // Swap
      Card temp = deck[first];
      deck[first] = deck[second];
      deck[second] = temp;
    }
  }

  // Deal a single card
  public Card dealCard() {
    // Make sure cards remain in deck
    if (currentCard < deck.length) {
      return deck[currentCard++];
    } else {
      return null;
    }
  }
}
