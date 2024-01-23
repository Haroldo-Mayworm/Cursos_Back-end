import domain.Computer;
import domain.Keyboard;
import domain.Products;

public class CalculatorTax {

  public static void calculeTax(Products products) {
    System.out.println("Tax report");
    double tax = products.calculateTax();
    System.out.println("Product: " + products.getName());
    System.out.println("Price: " + products.getPrice());
    System.out.println("Tax: " + tax);
  }
}
