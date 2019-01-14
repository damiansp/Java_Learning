import java.util.stream.IntStream;


public class StreamFilterMapReduce {
  public static void main(String[] args) {
    System.out.printf(
      "Sum(3x | x in { 2, 4, ..., 10 }) = %d\n",
      IntStream.rangeClosed(1, 10).filter(x -> x % 2 == 0).map(x -> 3*x).sum());
  }
}
