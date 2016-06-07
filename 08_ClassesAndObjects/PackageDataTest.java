// PackageDataTest.java
// Package-access members of a class are accessible by other classes in the
// same package

// class with package access ivars
class PackageData {
  int number;
  String string;

  // Constructor
  public PackageData() {
    number = 0;
    string = "Hello";
  }

  // toString
  public String toString() {
    return String.format("number: %d; string: %s", number, string);
  }
}

public class PackageDataTest {
  public static void main(String[] args) {
    PackageData packageData = new PackageData();

    // Output String representation of packageData
    System.out.printf("After instantiation:\n%s\n", packageData);

    // Change package acess data in packageData object
    packageData.number = 77;
    packageData.string = "Goodbye";

    // Output as String
    System.out.printf("\nAfter changing values:\n%s\n", packageData);
  }
}
