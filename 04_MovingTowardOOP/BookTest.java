// Test the Book class
class BookTest {
  public static void main(String[] args) {
    Book firstBook = new Book("First Book", 2004);
    Book secondBook = new Book("Second Book", 2014);

    firstBook.sell(200);

    System.out.println("Number of copies of \"First Book\" sold: " +
                       firstBook.nCopiesSold());
    System.out.println("Title of second book is: " + secondBook.title);
  }
}
