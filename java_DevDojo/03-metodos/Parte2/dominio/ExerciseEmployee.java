package devDojo.metodos03.Parte2.dominio;

import java.util.Arrays;

public class ExerciseEmployee {
    // Crie um classe de um funcionário com: nome, idade e 3 salários.
    // E crie um método para exibir os dados na tela e outro para exibir a média dos 3 salários.
    public String name;
    public int age;
    public double[] salary;

    public void printInfoEmployee() {
        System.out.println(this.name);
        System.out.println(this.age);
        double average= 0;
        for (int i = 0; i < salary.length; i++) {
            average += salary[i];
        }
        System.out.println(average /= salary.length);
    }
}
