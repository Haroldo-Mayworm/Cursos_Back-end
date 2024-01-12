import dominio.Student;

public class StudentTest {

  public static void main(String[] args) {
    Student student = new Student();
    student.name = "Pedro";
    student.age = 18;
    student.gender = 'M';

    System.out.println(student.name);
  }
}
