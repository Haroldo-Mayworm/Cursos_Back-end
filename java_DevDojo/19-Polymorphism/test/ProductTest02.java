import domain.Computer;
import domain.Keyboard;
import domain.Products;
import service.CalculatorTax;

public class ProductTest02 {

  public static void main(String[] args) {
    Products products = new Computer("ALIENWARE AURORA", 12000);
    Products products1 = new Keyboard("ALIENWARE PRO", 1650);

    System.out.println(products.getName());
    System.out.println(products.getPrice());
    System.out.println(products.calculateTax());
    System.out.println("------------------------------");
    System.out.println(products1.getName());
    System.out.println(products1.getPrice());
    System.out.println(products1.calculateTax());
  }
}
