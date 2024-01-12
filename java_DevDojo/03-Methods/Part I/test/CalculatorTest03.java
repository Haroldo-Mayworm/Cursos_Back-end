import dominio.Calculator;

public class CalculatorTest03 {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    double result = calculator.mulNumbers(0, 10);
    System.out.println(result);
  }
}
