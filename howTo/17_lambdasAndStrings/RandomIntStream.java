import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;


public class RandomIntStream {
  public static void main(String[] args) {
    SecureRandom rand = new SecureRandom();

    System.out.printf("%-6s%s\n", "Face", "Frequency");
    rand.ints(60_000_000, 1, 7)
      .boxed()
      .collect(Collectors.groupingBy(Function.identity(),
                                     Collectors.counting()))
      .forEach((face, freq) -> System.out.printf("%-6d%d\n", face, freq));
  }
}
