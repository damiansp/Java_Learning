public class EmployeeTest {
  public static void main(String[] args) {
    Employee jj = new Employee("Jimmy", "Jones", 2220.25);
    Employee bb = new Employee("Billy", "Bob", 1888.87);

    System.out.printf("Your employees annual salaries are:\n%.2f\n%.2f\n",
                      12 * jj.getMonthlySalary(),
                      12 * bb.getMonthlySalary());

    // Give each a 10% raise
    System.out.println("Giving each a 10% raise...");
    jj.setMonthlySalary(1.1 * jj.getMonthlySalary());
    bb.setMonthlySalary(1.1 * bb.getMonthlySalary());

    // Report new salaries
    System.out.printf("Your employees annual salaries are now:\n%.2f\n%.2f\n",
                      12 * jj.getMonthlySalary(),
                      12 * bb.getMonthlySalary());
    
  }
}
