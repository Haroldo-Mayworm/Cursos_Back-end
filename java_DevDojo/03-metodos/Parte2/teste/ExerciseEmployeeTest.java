package devDojo.metodos03.Parte2.teste;

import devDojo.metodos03.Parte2.dominio.ExerciseEmployee;

public class ExerciseEmployeeTest {
    public static void main(String[] args) {
        ExerciseEmployee employee = new ExerciseEmployee();
        employee.name = "Bruno";
        employee.age = 25;
        employee.salary = new double[] {1500,2450,1820};

        employee.printInfoEmployee();
    }
}
