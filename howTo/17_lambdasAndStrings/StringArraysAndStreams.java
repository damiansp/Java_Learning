import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;


public class StringArraysAndStreams {
  public static void main(String[] args) {
    String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo",
                        "Violet"};
    System.out.printf("Original strings:\n %s\n", Arrays.asList(strings));
    System.out.printf("Strings in uppercase:\n %s\n",
                      Arrays.stream(strings)
                            .map(String::toUpperCase)
                            .collect(Collectors.toList()));
    System.out.printf("Strings less than 'n', sorted ascending:\n %s\n",
                      Arrays.stream(strings)
                            .filter(s -> s.compareToIgnoreCase("n") < 0)
                            .sorted(String.CASE_INSENSITIVE_ORDER)
                            .collect(Collectors.toList()));
    System.out.printf("Stings less than 'n', sorted descenting:\n %s\n",
                      Arrays.stream(strings)
                            .filter(s -> s.compareToIgnoreCase("n") < 0)
                            .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                            .collect(Collectors.toList()));
  }
}
