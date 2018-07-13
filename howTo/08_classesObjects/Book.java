public enum Book {
  // Constants of enum type
  JHTP("Java How to Program", "2018"),
  CHTP("C How to Program", "2016"),
  IW3HTB("Internet & World Wid Web How to Program", "2012"),
  CPPHTP("C++ How to Program", "2017"),
  CBHTP("Visual Basic How to Program", "2014"),
  CSHARPHTP("Visual C# How to Program", "2017");

  private final String title;
  private final String copyrightYear;

  Book(String title, String copyrightYear) {
    this.title = title;
    this.copyrightYear = copyrightYear;
  }

  public String getTitle() { return title; }
  public String getCopyrightYear() { return copyrightYear; }
}
