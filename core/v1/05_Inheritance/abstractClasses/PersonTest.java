package abstractClasses;


/** Abstract class demo */
public class PersonTest {
  public static void main(String[] args) {
    var people = new Person[2];

    people[0] = new Employee("Hairy Whodeany", 67890, 1944, 10, 10);
    people[1] = new Student("Mona Stick", "religious studies");
    for (Person p: people) {
      System.out.println(p.getName() + ", " + p.getDescription());
    }
  }
}
