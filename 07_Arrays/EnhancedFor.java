// using for(type i : array) loops
public class EnhancedFor {
  public static void main(String[] args) {
    int primes[] = { 1, 2, 3, 5, 7, 9, 11, 13, 17, 19, 23, 29 };
    int total = 0;

    for (int i: primes) {
      total += i;
    }

    System.out.printf("Total: %d\n", total);
  }
}
