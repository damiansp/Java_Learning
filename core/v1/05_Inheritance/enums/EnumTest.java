package enums;

import java.util.*;


/** Demo of enumerated typed */
public class EnumTest {
  public static void main(String[] args) {
    var in = new Scanner(System.in);

    System.out.print("Enters a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
    String input = in.next().toUpperCase();
    Size size = Enum.valueOf(Size.class, input);

    System.out.println("size: " + size);
    System.out.println("abbr: " + size.getAbbreviation());
    if (size == Size.EXTRA_LARGE) {
      System.out.println("Good job paying attention to the underscore.");
    }
  }
}


enum Size {
  SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
  private String abbreviation;

  private Size(String abbr) { this.abbreviation = abbr; }

  public String getAbbreviation() { return abbreviation; }
}
