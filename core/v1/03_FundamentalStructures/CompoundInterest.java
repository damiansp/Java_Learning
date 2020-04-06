/**
 * Example of a 2D array
 * Adapted from Horstmann (2018) (See README)
 */
public class CompoundInterest {
  public static void main(String[] args) {
    final double START_RATE = 10;
    final int N_RATES = 6;
    final int N_YEARS = 10;
    double[] interestRates = new double[N_RATES];

    for (int j = 0; j < interestRates.length; ++j) {
      interestRates[j] = (START_RATE + j) / 100.0;
    }

    double[][] balances = new double[N_YEARS][N_RATES];
    for (int j = 0; j < balances[0].length; j++) {
      balances[0][j] = 10000;
    }
    for (int i = 1; i < balances.length; i++) {
      for (int j = 0; j < balances[i].length; j++) {
        double oldBalance = balances[i - 1][j];
        double interest = oldBalance * interestRates[j];
        balances[i][j] = oldBalance + interest;
      }
    }
    for (int j = 0; j < interestRates.length; j++) {
      System.out.printf("%9.0f%%", 100 * interestRates[j]);
    }
    System.out.println();
    for (double[] row: balances) {
      for (double value: row) { System.out.printf("%10.2f", value); }
      System.out.println();
    }
  }
}
