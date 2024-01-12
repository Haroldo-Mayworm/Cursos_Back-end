import dominio.Calculator;

public class CalculatorTest01 {

  public static void main(String[] args) {
    // Passing parameters to primitive types
    // Primitive type values ​​do not change the value when passing through a method but create a "copy"
    int numberOne = 20;
    int numberTwo = 30;

    Calculator calculator = new Calculator();
    calculator.changeTwoNumbers(numberOne, numberTwo);

    System.out.println("Fora do método:");
    System.out.println("num1 = " + numberOne);
    System.out.println("num2 = " + numberTwo);
  }
}
