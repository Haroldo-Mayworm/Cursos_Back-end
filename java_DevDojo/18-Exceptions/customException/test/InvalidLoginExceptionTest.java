import devDojo.exceptions.customException.domain.InvalidLoginException;
import java.util.Scanner;

public class InvalidLoginExceptionTest {

  public static void main(String[] args) {
    try {
      login();
    } catch (InvalidLoginException e) {
      e.printStackTrace();
    }
  }

  private static void login() throws InvalidLoginException {
    Scanner keyboard = new Scanner(System.in);

    String usernameDB = "Caio";
    String passwordDB = "123456";

    System.out.print("Username: ");
    String usernameTyped = keyboard.nextLine();
    System.out.print("Password: ");
    String passwordTyped = keyboard.nextLine();

    if (
      !usernameDB.equals(usernameTyped) || !passwordDB.equals(passwordTyped)
    ) {
      throw new InvalidLoginException();
    }
    System.out.println("User logged in successfully!");
  }
}
