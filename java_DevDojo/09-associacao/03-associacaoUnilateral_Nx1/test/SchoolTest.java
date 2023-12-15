package devDojo.associacao.associacaoUnilateral_Nx1.test;

import devDojo.associacao.associacaoUnilateral_Nx1.domain.School;
import devDojo.associacao.associacaoUnilateral_Nx1.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Willian Suane");
        Teacher teacher2 = new Teacher("Trainee");
        Teacher[] teachers = {teacher1, teacher2};
        School school1 = new School("Dev Dojo", teachers);

        school1.print();
    }
}
