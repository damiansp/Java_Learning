import static java.lang.System.*;

import com.dsp.core.*;

/**
 * Demonstrate package usage and organization
 */
public class PackageTest {
  public static void main(String[] args) {
    // Employee exposed by import
    var bob = new Employee("Bob Dobolina", 50000, 1989, 10, 1);
    bob.raiseSalary(5);

    // out also exposed by import
    out.println("Name: " + bob.getName() + "\n Salary: " + bob.getSalary());
  }
}

