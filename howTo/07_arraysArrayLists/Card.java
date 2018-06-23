public class Card {
  private final String value;
  private final String suit;

  public Card(String cardValue, String cardSuit) {
    this.value = cardValue;
    this.suit = cardSuit;
  }

  public String toString() {
    return value + " of " + suit;
  }
}
