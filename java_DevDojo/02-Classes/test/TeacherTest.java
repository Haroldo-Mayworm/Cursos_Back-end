import dominio.Teacher;

public class TeacherTest {

  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    teacher.name = "João";
    teacher.age = 32;
    teacher.gender = 'M';

    System.out.println("The teacher " + teacher.name + " is " + teacher.age + " years old.");
  }
}
