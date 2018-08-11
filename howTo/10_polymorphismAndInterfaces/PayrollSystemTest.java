public class PayrollSystemTest {
  public static void main(String[] args) {
    SalariedEmployee sal = new SalariedEmployee(
      "Sal", "Smith", "111-11-1111", 800.00);
    HourlyEmployee earl = new HourlyEmployee(
      "Earl", "Price", "222-22-2222", 16.75, 40);
    CommissionEmployee mitch = new CommissionEmployee(
      "Mitch", "Jones", "333-33-3333", 10000, 0.06);
    BasePlusCommissionEmployee bayes = new BasePlusCommissionEmployee(
      "Bayes", "Ian", "444-44-4444", 5000, 0.04, 300);

    System.out.println("Employees processed individually:");
    System.out.printf("\n%s\nearned: $%,.2f\n\n", sal, sal.earnings());
    System.out.printf("%s\nearned: $%,.2f\n\n", earl, earl.earnings());
    System.out.printf("%s\nearned: $%,.2f\n\n", mitch, mitch.earnings());
    System.out.printf("%s\nearned: $%,.2f\n\n", bayes, bayes.earnings());

    Employee[] employees = new Employee[4];
    employees[0] = sal;
    employees[1] = earl;
    employees[2] = mitch;
    employees[3] = bayes;
    
    System.out.printf("Employees processed polymorphically:\n\n");
    for (Employee currentEmployee: employees) {
      System.out.println(currentEmployee); // -> .toString()
      if (currentEmployee instanceof BasePlusCommissionEmployee) {
        BasePlusCommissionEmployee employee =
          (BasePlusCommissionEmployee) currentEmployee;
        employee.setBaseSalary(1.1 * employee.getBaseSalary());
        System.out.printf("New base salary with 10%% increase is: $%,.2f\n",
                          employee.getBaseSalary());
      }
      System.out.printf("Earned $%,.2f\n\n", currentEmployee.earnings());
    }
    for (int i = 0; i < employees.length; i++) {
      System.out.printf(
        "Employee %d is a %s\n", i, employees[i].getClass().getName());
    }
  }
}
