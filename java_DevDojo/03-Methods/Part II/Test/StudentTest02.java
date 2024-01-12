import dominio.Student;

public class StudentTest02 {

  public static void main(String[] args) {
    Student student01 = new Student();
    Student student02 = new Student();

    student01.name = "Pedro";
    student01.age = 18;
    student01.gender = 'M';

    student02.name = "Rafael";
    student02.age = 35;
    student02.gender = 'M';

    student01.print02();
    student02.print02();
  }
}
