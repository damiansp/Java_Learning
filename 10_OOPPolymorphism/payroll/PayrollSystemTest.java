// PayrollSystemTest.java
// Tests Employee class hierarchy
public class PayrollSystemTest {
  public static void main(String[] args) {
    // Create subclass objects
    SalariedEmployee salEmp = new SalariedEmployee(
      "John", "Smith", "111-11-1111", 800.00);
    HourlyEmployee hrEmp = new HourlyEmployee(
      "Karen", "Price", "222-22-2222", 16.75, 40);
    CommissionEmployee comEmp = new CommissionEmployee(
      "Sue", "Jones", "333-33-3333", 10000, 0.06);
    BasePlusCommissionEmployee bComEmp = new BasePlusCommissionEmployee(
      "Bob", "Louis", "444-44-4444", 5000, 0.04, 300);

    System.out.println("Employees processed individually:\n");
    System.out.printf("%s\n%s: $%,.2f\n\n", salEmp,  "earned", salEmp.earnings());
    System.out.printf("%s\n%s: $%,.2f\n\n", hrEmp,   "earned", hrEmp.earnings());
    System.out.printf("%s\n%s: $%,.2f\n\n", comEmp,  "earned", comEmp.earnings());
    System.out.printf("%s\n%s: $%,.2f\n\n", bComEmp, "earned", bComEmp.earnings());

    
    // Combine employees in an array
    Employee[] employees = new Employee[4];
    employees[0] = salEmp;
    employees[1] = hrEmp;
    employees[2] = comEmp;
    employees[3] = bComEmp;

    System.out.println("Employess processed polymorphically:\n");

    for (Employee currentEmployee : employees) {
      System.out.println(currentEmployee);

      // Determine if BasePlusCommissionEmployee
      if ( currentEmployee instanceof BasePlusCommissionEmployee) {
        // Downcast
        BasePlusCommissionEmployee employee =
          (BasePlusCommissionEmployee) currentEmployee;

        double oldBaseSalary = employee.getBaseSalary();
        employee. setBaseSalary(1.10 * oldBaseSalary);
        System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                          employee.getBaseSalary());
      }

      System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
    }

    // Get type name of ea obj in employee array
    for (int j = 0; j < employees.length; j++) {
      System.out.printf(
        "Employee %d is a %s\n", j, employees[j].getClass().getName());
    }
  }
}
