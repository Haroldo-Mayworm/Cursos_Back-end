package devDojo.classes02.Aula08OrientacaoObjetos_Classes.teste;

import devDojo.classes02.Aula08OrientacaoObjetos_Classes.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
        Car model01 = new Car();
        Car model02 = new Car();

        model01.name = "Fusca";
        model01.carModel = "passeio";
        model01 .carYear = 1925;

        model02.name = "Mustang";
        model02.carModel = "gt";
        model02 .carYear = 1995;
    }
}
