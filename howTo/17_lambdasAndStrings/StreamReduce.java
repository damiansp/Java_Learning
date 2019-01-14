import java.util.stream.IntStream;


public class StreamReduce {
  public static void main(String[] ags) {
    System.out.printf("Sum of (1, 2, ..., 10): %d\n",
                      IntStream.rangeClosed(1, 10).sum());
  }
}
