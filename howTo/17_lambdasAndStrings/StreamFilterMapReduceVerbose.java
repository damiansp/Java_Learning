import java.util.stream.IntStream;


public class StreamFilterMapReduceVerbose {
  public static void main(String[] args) {
    System.out.printf(
      "Sum(3x | x in { 2, 4, ..., 10 }) = %d\n",
      IntStream.rangeClosed(1, 10)
               .filter(x -> { System.out.printf("\nfilter: %d\n", x);
                              return x % 2 == 0; })
               .map(x -> { System.out.printf("map: %d\n", x);
                           return 3 * x; })
               .sum());
  }
}
