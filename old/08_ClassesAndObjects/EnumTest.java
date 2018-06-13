// Test enum type Book
import java.util.EnumSet;

public class EnumTest {
  public static void main(String[] args) {
    System.out.println("All books:\n");

    // print all books in enum Book
    for (Book book: Book.values()) {
      System.out.printf(
        "%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
    }

    System.out.println("\nDisplay a range of enum constants:\n");

    // print first 4 books
    for (Book book: EnumSet.range(Book.JAVA, Book.CPP)) {
      System.out.printf(
        "%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
    }
  }
}