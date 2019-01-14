import java.util.List;
import java.util.Map;
import java.util.Set;

/** Java 9+ only */
public class FactoryMethods {
  public static void main(String[] args) {
    List<String> colorList = List.of("red", "orange", "yellow", "green", "blue",
                                     "indigo", "violet");
    System.out.printf("colorList: %s\n\n", colorList);

    Set<String> colorSet = Set.of("red", "orange", "yellow", "green", "blue",
                                  "indigo", "violet");
    System.out.printf("colorSet: %s\n\n", colorSet);

    Map<String, Integer> dayMap = Map.of(
      "Monday", 1, "Tuesday", 2, "Wednesday", 3, "Thursday", 4, "Friday", 5,
      "Saturday", 6, "Sunday", 7);
    System.out.printf("dayMap: %s\n\n", dayMap);

    Map<String, Integer> monthMap = Map.ofEntries(Map.entry("Jan", 31),
                                                  Map.entry("Feb", 28),
                                                  Map.entry("Mar", 31),
                                                  Map.entry("Apr", 30),
                                                  Map.entry("May", 31),
                                                  Map.entry("Jun", 30),
                                                  Map.entry("Jul", 31),
                                                  Map.entry("Aug", 31),
                                                  Map.entry("Sep", 30),
                                                  Map.entry("Oct", 31),
                                                  Map.entry("Nov", 30),
                                                  Map.entry("Dec", 31));
    System.out.printf("monthMap: %s\n", monthMap);
  }
}
