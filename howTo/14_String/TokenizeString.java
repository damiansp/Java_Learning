import java.util.Scanner;


public class TokenizeString {
  public static void main(String[] args) {
    Scanner scanbot = new Scanner(System.in);
    System.out.println("Enter a new sentence: ");
    String sentence = scanbot.nextLine();
    String[] tokens = sentence.split(" ");
    System.out.printf("Number of elements: %d\nThe tokens are:\n",
                      tokens.length);
    for (String token: tokens) System.out.println(token);
  }
}
