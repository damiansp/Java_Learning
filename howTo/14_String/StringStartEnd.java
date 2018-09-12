public class StringStartEnd {
  public static void main(String[] args) {
    String[] strings = {"started", "starting", "ended", "ending"};

    for (String s: strings) {
      if (s.startsWith("st")) {
        System.out.printf("\"%s\" starts with \"st\"\n", s);
      }
      if (s.startsWith("art", 2)) {
        System.out.printf("\"%s\" starts with \"art\" at position 2\n", s);
      }
      if (s.endsWith("ed")) {
        System.out.printf("\"%s\" ends with \"ed\"\n", s);
      }
    }
  }
}
