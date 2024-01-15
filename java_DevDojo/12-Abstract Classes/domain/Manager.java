public class Manager extends Employed {

  public Manager(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void calculateBonus() {
    this.salary = this.salary + this.salary * 0.1;
  }

  @Override
  public String toString() {
    return "Manager {" + 
            "name='" + 
            name + '\'' + 
            ", salary=" + 
            salary + 
            '}';
  }
}
