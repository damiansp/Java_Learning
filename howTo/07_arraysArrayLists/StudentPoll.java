public class StudentPoll {
  public static void main(String[] args) {
    int[] responses = {1, 2, 2, 3, 4, 5, 1, 3, 5, 6, 4, 3, 3, 4, 2, 1, 4, 14};
    int[] freq = new int[6];
    
    for (int answer = 0; answer < responses.length; answer++) {
      try {
        ++freq[responses[answer]];
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
        System.out.printf(" responses[%d] = %d\n\n", answer, responses[answer]);
      }
    }
    System.out.printf("%s%10s\n", "Rating", "Frequency");
    for (int rating = 1; rating < freq.length; rating++) {
      System.out.printf("%6d%10d\n", rating, freq[rating]);
    }
  }
}
