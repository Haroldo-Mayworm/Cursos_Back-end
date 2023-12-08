package devDojo.metodos03.Parte2.teste;

import devDojo.metodos03.Parte2.dominio.PrintStudent;
import devDojo.metodos03.Parte2.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        // Passagem de parametros para os tipo de referência
        Student student01 = new Student();
        Student student02 = new Student();
        PrintStudent printStudent = new PrintStudent();

        student01.name = "Pedro";
        student01.age = 18;
        student01.gender = 'M';

        student02.name = "Rafael";
        student02.age = 35;
        student02.gender = 'M';

        /*printStudent.print(student01);
        printStudent.print(student02);*/

        /*System.out.println(student01.name);
        System.out.println(student01.age);
        System.out.println(student01.gender);*/
    }
}
