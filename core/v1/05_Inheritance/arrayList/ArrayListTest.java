package arrayList;

import java.util.*;


/** ArrayList class demo */
public class ArrayListTest {
  public static void main(String[] args) {
    var staff = new ArrayList<Employee>();

    staff.add(new Employee("Corey Copperfield", 77700, 2012, 11, 03));
    staff.add(new Employee("Betty Butter", 66660, 2010, 8, 16));
    staff.add(new Employee("Alice Appleford", 82820, 2000, 1, 1));
    for (Employee e: staff) {
      e.raiseSalary(5);
      System.out.println("Name: " + e.getName()
                         + ", Salary: " + e.getSalary()
                         + ", Hire Date: " + e.getHireDay());
    }
  }
}
