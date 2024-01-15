import domain.Developer;
import domain.Employed;
import domain.Manager;

public class EmployedTest {

  public static void main(String[] args) {
    Manager manager = new Manager("Pedro", 22000);
    Developer developer = new Developer("Will", 8000);

    manager.print();

    System.out.println(manager);
    System.out.println(developer);
  }
}
