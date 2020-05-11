package inheritance;

/** Inheritance demo */
public class ManagerTest {
  public static void main(String[] args) {
    var boss = new Manager("Bob Dobolina", 120000, 2015, 11, 12);
    boss.setBonus(5000);

    var staff = new Employee[3];
    staff[0] = boss;
    staff[1] = new Employee("Cuc Fucumope", 72200, 2018, 6, 30);
    staff[2] = new Employee("Dad Gadanuqui", 65500, 2019, 9, 5);
    for (Employee e: staff) {
      System.out.println(
        "Name: " + e.getName() + "\n Salary: $" + e.getSalary());
    }
  }
}
