import java.util.stream.IntStream;


public class StreamMapReduce {
  public static void main(String[] args) {
    // Sum even ints from 2 ... 20
    System.out.printf(
      "Sum(2, 4, 6, ..., 20) = %d\n",
      IntStream.rangeClosed(1, 10).map((int x) -> { return x * 2; }).sum());
    System.out.printf(
      "Again, that's %d\n",
      IntStream.rangeClosed(1, 10).map(x -> x * 2).sum());
  }
}
