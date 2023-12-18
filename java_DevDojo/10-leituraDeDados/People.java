package leituraDeDados;

import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = inputKeyboard.nextLine();
        System.out.println("Digite sua idade: ");
        int age = inputKeyboard.nextInt();

        System.out.println("Informações: " + name + " - " + age);
    }
}
