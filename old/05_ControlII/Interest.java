// Compound interst calculation
public class Interest {
  public static void main(String[] args) {
    double amount,         // amount at year end
      principal = 1000.00, // initial amount
      rate = 0.05;         // annual interest rate

    // print header
    System.out.printf("%s%20s\n", "Year", "Amount on deposit");

    // Calculate amount after each year
    for (int year = 1; year <= 10; year++) {
      // Calculate
      amount = principal * Math.pow(1.0 + rate, year);

      // print
      System.out.printf("%4d%,20.2f\n", year, amount);
    }
  }
}
