/* Static method demo */
public class StaticTest {
  public static void main(String[] args) {
    var staff = new Employee[3];

    staff[0] = new Employee("Zeb", 40000);
    staff[1] = new Employee("Yasmeen", 65500);
    staff[2] = new Employee("Xerxes", 88850);
    for (Employee e: staff) {
      e.setID();
      System.out.println("Name: " + e.getName()
                         + "\n ID: " + e.getID()
                         + "\n Salary: " + e.getSalary());
    }
    int n = Employee.getNextID();
    System.out.println("Next available ID: " + n);
  }
}


class Employee {
  private static int nextID = 1; // property of the class, not its instances
  private String name;
  private double salary;
  private int ID;

  public Employee(String n, double s) {
    name = n;
    salary = s;
    ID = 0;
  }

  public String getName() {  return name;  }

  public double getSalary() { return salary; }

  public int getID() { return ID; }

  public void setID() { ID = nextID++; }

  public static int getNextID() { return nextID; }

  public static void main(String[] args) {
    var e = new Employee("Wilbur", 41400);
    System.out.println(e.getName() + ": $" + e.getSalary());
  }
}
