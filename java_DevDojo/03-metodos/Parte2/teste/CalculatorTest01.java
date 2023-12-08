package devDojo.metodos03.Parte2.teste;

import devDojo.metodos03.Parte2.dominio.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        // Passagem de parametros para os tipo primitivos
        // Valores do tipo primitivo, não alteram o valor ao passar por um método e sim criam uma "cópia"
        int numberOne = 20;
        int numberTwo = 30;

        Calculator calculator = new Calculator();
        calculator.changeTwoNumbers(numberOne, numberTwo);

        System.out.println("Fora do método:");
        System.out.println("num1 = " + numberOne);
        System.out.println("num2 = " + numberTwo);
    }
}
