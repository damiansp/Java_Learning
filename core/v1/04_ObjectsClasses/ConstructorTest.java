import java.util.*;

/** Object construction demo */
public class ConstructorTest {
  public static void main(String[] args) {
    var staff = new Employee[3];

    staff[0] = new Employee("Elmo", 40000);
    staff[1] = new Employee(60000);
    staff[2] = new Employee();
    for (Employee e: staff) { e.show(); }
  }
}


class Employee {
  private static int nextID;
  private int id;
  private String name = "";
  private double salary;
  static {
    var generator = new Random();
    nextID = generator.nextInt(10000);
  }
  // object initialization block
  {
    id = nextID++;
  }

  // Constructors
  public Employee(String n, double s) {
    name = n;
    salary = s;
  }

  public Employee(double s) {
    this("Employee #" + nextID, s);
  }

  public Employee(){ /* name ""; salary 0; id initialized above */ }

  // Accessors
  public String getName() { return name; }

  public double getSalary() { return salary; }

  public int getID() { return id; }

  public void show() {
    System.out.println(
      "Name: " + name + "\n ID: " + id + "\n Salary: " + salary + "\n");
  }
}
