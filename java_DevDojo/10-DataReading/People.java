import java.util.Scanner;

public class People {

  public static void main(String[] args) {
    Scanner inputKeyboard = new Scanner(System.in);

    System.out.println("Type your name: ");
    String name = inputKeyboard.nextLine();
    System.out.println("Type your age: ");
    int age = inputKeyboard.nextInt();

    System.out.println("information: " + name + " - " + age);
  }
}
