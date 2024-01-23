public class Keyboard extends Products {

  public static final double TAX_PER_UNIT = 0.11;
  private String size;

  public Keyboard(String name, double price) {
    super(name, price);
  }

  @Override
  public double calculateTax() {
    System.out.println("Calculating keyboard tax...");
    return price * TAX_PER_UNIT;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }
}
