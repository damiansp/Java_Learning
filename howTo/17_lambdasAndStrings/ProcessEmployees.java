import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ProcessEmployees {
  public static void main(String[] args) {
    Employee[] employees = {
      new Employee("Jason", "Red", 5000, "IT"),
      new Employee("Ashley", "Green", 7600, "IT"),
      new Employee("Matthew", "Indigo", 3587.5, "Sales"),
      new Employee("James", "Indigo", 4700.77, "Marketing"),
      new Employee("Luke", "Indigo", 6200, "IT"),
      new Employee("Jason", "Blue", 3200, "Sales"),
      new Employee("Wendy", "Brown", 4236.4, "Marketing")};
    List<Employee> list = Arrays.asList(employees);

    System.out.println("Complete Employee List:");
    list.stream().forEach(System.out::println);

    Predicate<Employee> fourToSixK = e -> (e.getSalary() >= 4000
                                           && e.getSalary() <= 6000);
    System.out.printf("\nEmployees earning $4-6K monthly, sorted by salary:\n");
    list.stream()
      .filter(fourToSixK)
      .sorted(Comparator.comparing(Employee::getSalary))
      .forEach(System.out::println);
    System.out.printf("\nFirst employee who earns $4-6K:\n%s\n",
                      list.stream().filter(fourToSixK).findFirst().get());

    Function<Employee, String> byFirstName = Employee::getFirstName;
    Function<Employee, String> byLastName = Employee::getLastName;
    Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName)
                                                   .thenComparing(byFirstName);

    System.out.printf(
      "\nEmployees in descending order by last name, then first:\n");
    list.stream().sorted(lastThenFirst.reversed()).forEach(System.out::println);
    System.out.printf("\nUnique employee surnames:\n");
    list.stream()
      .map(Employee::getLastName)
      .distinct()
      .sorted()
      .forEach(System.out::println);
    System.out.printf("\nEmployee names in order by last then first:\n");
    list.stream()
      .sorted(lastThenFirst)
      .map(Employee::getName)
      .forEach(System.out::println);
    System.out.printf("\nEmployees by department:\n");

    Map<String, List<Employee>> groupedByDepartment = (
      list.stream().collect(Collectors.groupingBy(Employee::getDepartment)));

    groupedByDepartment.forEach((department, employeesInDepartment) -> {
        System.out.printf("\n%s\n", department);
        employeesInDepartment.forEach(employee -> System.out.printf("  %s\n",
                                                                    employee));
    });
    System.out.printf("\nCount of Employees by department:\n");

    Map<String, Long> employeeCountByDepartment = (
      list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                                                  Collectors.counting())));
    employeeCountByDepartment.forEach((dept, count) ->
      System.out.printf("%s has %d employee(s)\n", dept, count));
    System.out.printf("\nSum of Employees' salaries (sum method): %.2f\n",
                      list.stream().mapToDouble(Employee::getSalary).sum());
    System.out.printf("Sum of Employees' salaries (reduce method): %.2f\n",
                      list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, (s1, s2) -> s1 + s2));
    System.out.printf(
      "Mean Employee salary: %.2f\n",
      list.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
  }
}


