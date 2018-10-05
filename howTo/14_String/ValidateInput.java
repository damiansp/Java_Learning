public class ValidateInput {
  public static boolean isValidFirstName(String firstName) {
    return firstName.matches("[A-Z][a-zA-Z]*");
  }

  public static boolean isValidLastName(String lastName) {
    return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
  }

  public static boolean isValidAddress(String address) {
    return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
  }

  public static boolean isValidCity(String city) {
    return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
  }

  public static boolean isValidState(String state) {
    return state.matches("([a-zA-Z]+|[a-zA-Z]\\s[a-zA-Z]+)");
  }

  public static boolean isValidZip(String zip) { return zip.matches("\\d{5}"); }

  public static boolean isValidPhone(String phone) {
    return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
  }
}
