public class Switch {
  public static void main(String[] args) {
    String loanType = "Commercial";
    double interestRate;

    switch (loanType) {
    case "Residential":
      interestRate = 0.055;
      break;
    case "Commercial":
      interestRate = 0.062;
      break;
    case "Investment":
      interestRate = 0.059;
      break;
    default:
      interestRate = 0.030;
    }

    System.out.println(loanType + " loans have an annual interest reate of "
                       + interestRate * 100 + "%.");
  }
}
