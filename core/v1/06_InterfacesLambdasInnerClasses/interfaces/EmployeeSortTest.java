package interfaces;

import java.util.*;


/** Demo Comparable interface */
public class EmployeeSortTest {
  public static void main(String[] args) {
    var staff = new Employee[3];
    
    staff[0] = new Employee("Bob Dobolina", 39900);
    staff[1] = new Employee("Ziz Cizikemu", 82200);
    staff[2] = new Employee("Xex Bexejalo", 58800);
    Arrays.sort(staff);
    for (Employee e: staff) {
      System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
    }
  }
}
