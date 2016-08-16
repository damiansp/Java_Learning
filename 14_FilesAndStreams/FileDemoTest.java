/* FileDemoTest.java */
import java.util.Scanner;

public class FileDemoTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    FileDemo app = new FileDemo();

    System.out.print("Enter file or directory name here: ");
    app.analyzePath(input.nextLine());                     
  }
}
