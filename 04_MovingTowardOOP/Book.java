class Book {
    // statics are class variables, shared by all instances
    // final variables cannot be changed
  final String title;
  final int releaseYear;
  int copiesSold = 0;
  
  // Constructor
  Book(String t, int ry) {
    title = t;
    releaseYear = ry;
  }

  void sell(int nCopies) {
    copiesSold += nCopies;
  }

  int nCopiesSold() {
    return copiesSold;
  }
}

