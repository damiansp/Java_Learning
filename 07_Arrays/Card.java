// Represent a playing card
public class Card {
  private String face;
  private String suit;

  // Constructor
  public Card(String cardFace, String cardSuit) {
    face = cardFace;
    suit = cardSuit;
  }

  // To String
  public String toString() {
    return "The " + face + " of " + suit;
  }
}
