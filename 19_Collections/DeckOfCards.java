/* DeckOfCards.java */
// Using Collections' shuffle algorithm
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Represent a single playing card
class Card {
  public static enum Face { Ace, Deuce, Three, Four, Five, Six, Seven, Eight,
                            Nine, Ten, Jack, Queen, King };
  public static enum Suit { Clubs, Diamonds, Hearts, Spades };
  private final Face face;
  private final Suit suit;

  // Constr
  public Card(Face cardFace, Suit cardSuit) {
    face = cardFace;
    suit = cardSuit;
  }

  // Acc
  public Face getFace() { return face; }
  public Suit getSuit() { return suit; }

  // toString
  public String toString() {
    return String.format("%s of %s", face, suit);
  }
}

// Represent a deck of cards
public class DeckOfCards {
  private List<Card> list;

  // Constr-- Set up deck and shuffle
  public DeckOfCards() {
    Card[] deck = new Card[52];
    int count = 0; // keep track of n cards

    // Populate deck
    for (Card.Suit suit: Card.Suit.values()) {
      for (Card.Face face: Card.Face.values()) {
        deck[count++] = new Card(face, suit);
      }
    }

    list = Arrays.asList(deck);
    Collections.shuffle(list);
  }

  // Print
  public void print() {
    // Display all cards in 2 cols
    for (int i = 0; i < list.size(); i++) {
      System.out.printf("%-20s%s",
                        list.get(i),
                        ((i + 1) % 2 == 0) ? "\n" : "\t");
    }
  }



  public static void main(String[] args) {
    DeckOfCards cards = new DeckOfCards();
    cards.print();
  }
  
}
