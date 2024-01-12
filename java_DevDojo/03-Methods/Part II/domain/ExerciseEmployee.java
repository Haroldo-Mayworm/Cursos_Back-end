import java.util.Arrays;

public class ExerciseEmployee {

  // Create an employee class with: name, age and 3 salaries.
  // And create a method to display the data on the screen and another to display the average of the 3 salaries.
  public String name;
  public int age;
  public double[] salary;

  public void printInfoEmployee() {
    System.out.println(this.name);
    System.out.println(this.age);
    double average = 0;
    for (int i = 0; i < salary.length; i++) {
      average += salary[i];
    }
    System.out.println(average /= salary.length);
  }
}
