import java.security.SecureRandom;
import java.util.stream.Collectors;


public class RandomInts {
  public static void main(String[] args) {
    SecureRandom rand = new SecureRandom();

    System.out.println("Random numbers on separate lines:");
    rand.ints(10, 1, 7).forEach(System.out::println);

    String numbers = rand.ints(10, 1, 7)
                         .mapToObj(String::valueOf)
                         .collect(Collectors.joining(" "));
    System.out.printf("\nRandom numbers on one line:\n %s\n", numbers);
  }
}
