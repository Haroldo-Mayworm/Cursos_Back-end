public class Computer extends Products {

  public static final double TAX_FOR_PERCENTAGE = 0.21;

  public Computer(String name, double price) {
    super(name, price);
  }

  @Override
  public double calculateTax() {
    System.out.println("Calculating computer tax...");
    return price * TAX_FOR_PERCENTAGE;
  }
}
