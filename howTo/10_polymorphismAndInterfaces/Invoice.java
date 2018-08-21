public class Invoice implements Payable {
  private final String partNumber;
  private final String partDescription;
  private final int quantity;
  private final double pricePerItem;

  public Invoice(
      String partNumber, String partDescription, int quantity,
      double pricePerItem) {
    if (quantity < 0) {
      throw new IllegalArgumentException("Quantity cannot be negative");
    }
    if (pricePerItem < 0.0) {
      throw new IllegalArgumentException("Price cannot be negative");
    }
    this.quantity = quantity;
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    this.pricePerItem = pricePerItem;
  }

  public String getPartNumber() { return partNumber; }
  public String getPartDescription() { return partDescription; }
  public int getQuantity() { return quantity; }
  public double getPricePerItem() { return pricePerItem; }

  @Override
  public String toString() {
    return String.format(
      "Invoice:\nPart Number: %s (%s)\nQuantity: %d\nPrice Each: %,.2f",
      getPartNumber(), getPartDescription(), getQuantity(), getPricePerItem());
  }

  @Override
  public double getPaymentAmount() { return getQuantity() * getPricePerItem(); }
}
