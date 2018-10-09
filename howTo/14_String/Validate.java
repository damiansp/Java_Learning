import java.util.Scanner;

public class Validate {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("First name:");
    String firstName = scanner.nextLine();
    System.out.println("Last name:");
    String lastName = scanner.nextLine();
    System.out.println("Address:");
    String address = scanner.nextLine();
    System.out.println("City:");
    String city = scanner.nextLine();
    System.out.println("State:");
    String state = scanner.nextLine();
    System.out.println("Zip code:");
    String zip = scanner.nextLine();
    System.out.println("Phone number:");
    String phone = scanner.nextLine();

    System.out.println("\nValidating result...");
    if (!ValidateInput.isValidFirstName(firstName)) {
      System.out.println("Invalid first name");
    } else if (!ValidateInput.isValidLastName(lastName)) {
      System.out.println("Invalid last name");
    } else if (!ValidateInput.isValidAddress(address)) {
      System.out.println("Invalid address");
    } else if (!ValidateInput.isValidCity(city)) {
      System.out.println("Invalid city");
    } else if (!ValidateInput.isValidState(state)) {
      System.out.println("Invalid state");
    } else if (!ValidateInput.isValidZip(zip)) {
      System.out.println("Invalid zip");
    } else if (!ValidateInput.isValidPhone(phone)) {
      System.out.println("Invalid phone number");
    } else System.out.println("Valid input. Fanx.");
  }
}
