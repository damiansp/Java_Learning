// Static member demo

public class Employee2Test {
  public static void main(String[] args) {
    System.out.printf("Employees at program start: %d\n",
                      Employee2.getCount());

    Employee2 e1 = new Employee2("Abigail", "Buttersworth");
    Employee2 e2 = new Employee2("Clarence", "Digglesby");

    System.out.printf("e1.getCount()\n> %d\n", e1.getCount());
    System.out.printf("e2.getCount()\n> %d\n", e2.getCount());
    System.out.printf("Employee2.getCount()\n> %d\n", Employee2.getCount());
    
    System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n\n",
                     e1.getFirstName(), e1.getLastName(),
                     e2.getFirstName(), e2.getLastName());
    e1 = null;
    e2 = null;
    System.gc();  // garbage collection

    System.out.printf("\nEmployees after System.gc():\n> %d\n",
                      Employee2.getCount());
    
  }
}
