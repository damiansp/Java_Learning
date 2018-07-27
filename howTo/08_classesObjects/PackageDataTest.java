public class PackageDataTest {
  public static void main(String[] args) {
    PackageData packageData = new PackageData();

    System.out.printf("After instantiation:\n%s\n", packageData);
    packageData.number = 77;
    packageData.string = "Goodbye";
    System.out.printf("After changing value:\n%s\n", packageData);
  }
}


class PackageData {
  int number = 0;
  String string = "Hello";

  public String toString() {
    return String.format("number: %d; string: %s", number, string);
  }
}
