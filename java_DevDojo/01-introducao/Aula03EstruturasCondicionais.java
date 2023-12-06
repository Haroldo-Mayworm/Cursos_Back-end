public class Aula03EstruturasCondicionais {
    public static void main(String[] args) {
        // IF
        /*if (true) {
            System.out.println("Condição verdadeira");
        } else {
            System.out.println("Condição falsa");
        }*/

        /*int age = 21;
        if (age >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }*/

        /*int age = 17;
        boolean isLegalAge = age >= 18;
        if (isLegalAge) {
            System.out.println("Pode consumir bebida alcoólica");
        } else {
            System.out.println("Não pode consumir bebida alcoólica");
        }*/

        /*int grade = 9;
        if (grade < 6) {
            System.out.println("Reprovado");
        } else if (grade >= 6 && grade <= 8) {
            System.out.println("Aprovado, mas pode melhorar");
        } else if (grade > 8 && grade <= 10) {
            System.out.println("Aprovado, parabéns");
        }*/

        // Ternário
        /*double salary = 4000;
        String positiveMenssage = "Posso doar R$500,00";
        String negativeMenssage = "Não posso doar";
        String finalMenssage = salary >= 4500 ? positiveMenssage : negativeMenssage;
        System.out.println(finalMenssage);*/

        // Exercício
        // Determine o valor de imposto que deverá ser pago em relação ao salário
        /*double salary = 10000;
        double taxOne = 9.70 / 100;
        double taxTwo = 22.20 / 100;
        double taxThree = 35.20 / 100;
        double tax = 0;

        if (salary > 0 && salary <= 2000) {
            tax = salary * taxOne;
        } else if (salary > 2000 && salary <= 5000) {
            tax = salary * taxTwo;
        } else {
            tax = salary * taxThree;
        }
        System.out.println(tax);*/
    }
}