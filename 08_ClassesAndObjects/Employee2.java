// Employee object making use of a static var

public class Employee2 {
  private String firstName;
  private String lastName;
  private static int count = 0; // number of Employee2 objects in memory

  // Constructor
  public Employee2(String first, String last) {
    firstName = first;
    lastName = last;
    count++;

    System.out.printf("Employee2 constructor: %s %s; count = %d\n",
                      firstName, lastName, count);
  }

  // Subtract 1 from static count when garbage collector calls finalize to
  // clean up object; confirm call
  protected void finalize() {
    count--;

    System.out.printf("Employee finalizer: %s %s; count = %d\n",
                      firstName, lastName, count);
  }

  // Getters
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  // static method to get static value
  public static int getCount() {
    return count;
  }
}
