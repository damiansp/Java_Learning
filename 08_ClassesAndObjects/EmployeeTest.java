public class EmployeeTest {
  public static void main(String[] args) {
    Date birth = new Date(11, 3, 1976);
    Date hire  = new Date(6, 1, 2016);
    Employee damian = new Employee("Damian", "Phillips", birth, hire);

    System.out.println(damian);
  }
}
