// Declaring enum type

public enum Book {
  // declare constants of enum type
  JAVA("Introduction to Java", "2005"),
  C("The C Programming Language", "1978"),
  IWWW("Internet and Web Programming", "2004"),
  CPP("C++ for Dummies", "2003"),
  VB("An Intro to Visual Basic", "2002"),
  CSH("C# Programming", "2007");

  // instance fields
  private final String title;
  private final String copyrightYear;

  // Constructor
  Book(String bookTitle, String year) {
    title = bookTitle;
    copyrightYear = year;
  }

  // accessors
  public String getTitle() {
    return title;
  }

  public String getCopyrightYear() {
    return copyrightYear;
  }
}
