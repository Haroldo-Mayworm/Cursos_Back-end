import domain.Computer;
import domain.Keyboard;
import service.CalculatorTax;

public class ProductTest01 {

  public static void main(String[] args) {
    Computer computer = new Computer("iMac", 14999);
    Keyboard keyboard = new Keyboard("Magic Keyboard", 1700);

    CalculatorTax.calculeTax(computer);
    System.out.println("------------------------------");
    CalculatorTax.calculeTax(keyboard);
  }
}
