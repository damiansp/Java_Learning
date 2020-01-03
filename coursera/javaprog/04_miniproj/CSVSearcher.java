class CSVSearcher {
  public static void main(String[] args) {
    // Print total of boys' and girls' names
    printTotals();

    int damianRank = getRank(1976, "Damian", "male");
    System.out.println("The rank of \"Damian\" in 1976 was " + damianRank);

    String male100 = getName(1976, 100, "male");
    System.out.println("The 100th most popular male name in 1976 was "
                       + male100);

    String damianEquiv1986 = getSexRankEquivalent("Damian", "male", 1976, 1986);
    System.out.printf("\"Damian\" in 1976 would have been %s in 1986\n",
                      damianEquiv1986);
  }


  public static void printTotals() {;}


  public static int getRank(int year, String name, String sex) {;}


  public static String getName(int year, int rank, String sex) {;}

  
  public static String getSexRankEquivalent(
      String actualName, String sex, int actualYear, int otherYear) {;}
}
