package devDojo.classes02.Aula08OrientacaoObjetos_Classes.teste;

import devDojo.classes02.Aula08OrientacaoObjetos_Classes.dominio.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "João";
        teacher.age = 32;
        teacher.gender = 'M';

        System.out.println("O professor " + teacher.name + " tem " + teacher.age + " anos.");
    }
}
