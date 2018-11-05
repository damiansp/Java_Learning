import java.util.Arrays;

public class RegExSub {
  public static void main(String[] args) {
    String s1 = "This sentence ends in 5 stars *****";
    String s2 = "1, 2, 3, 4, 5, 6, 7, 8";

    System.out.printf("Original s1: %s\n", s1);
    s1 = s1.replaceAll("\\*", "^");
    s1 = s1.replaceAll("star", "caret");
    System.out.printf("Sub: %s\n", s1);
    System.out.printf("Every word replaced by \"word\": %sn\n",
                      s1.replaceAll("\\w+", "word"));

    System.out.printf("Original s2: %s\n", s2);
    for (int i = 0; i < 3; i++) s2 = s2.replaceFirst("\\d", "digit");

    System.out.printf("First 3 digits subbed: %s\n", s2);
    System.out.print("String split at commas: ");

    String [] results = s2.split(",\\s*");
    System.out.println(Arrays.toString(results));
  }
}
