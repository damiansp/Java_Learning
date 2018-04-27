// Invoice.java
// Invoice class; implements Payable
public class Invoice implements Payable {
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double pricePerItem;

  // Accessors
  // Setters
  public void setPartNumber(String part) { partNumber = part; }

  public void setPartDesciption(String description) {
    partDescription = description;
  }

  public void setQuantity(int count) {
    quantity = (count < 0) ? 0 : count;
  }

  public void setPricePerItem(double price) {
    pricePerItem = (price < 0.0) ? 0.0 : price;
  }

  // Getters
  public String getPartNumber() { return partNumber; }
  public String getPartDescription() { return partDescription; }
  public int getQuantity() { return quantity; }
  public double getPricePerItem() { return pricePerItem; }
  
  // Constructor
  public Invoice(String part, String description, int count, double price) {
    partNumber = part;
    partDescription = description;
    setQuantity(count);
    setPricePerItem(price);
  }

  // toString
  public String toString() {
    return String.format("%s: \n%s: %s (%s)\n%s: %d\n%s: $%,.2f",
                         "invoice",
                         "part number",
                         getPartNumber(),
                         getPartDescription(),
                         "quantity",
                         getQuantity(),
                         "price per item",
                         getPricePerItem());
  }



  // Method required to carry out contract with interface Payable:
  public double getPaymentAmount() {
    return getQuantity() * getPricePerItem();
  }
}
