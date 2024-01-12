import dominio.People;

public class PeopleTest {

  public static void main(String[] args) {
    People person = new People();
    person.setName("Ronaldo");
    person.setAge(45);
    System.out.println(person.getName());
    System.out.println(person.getAge());
  }
}
