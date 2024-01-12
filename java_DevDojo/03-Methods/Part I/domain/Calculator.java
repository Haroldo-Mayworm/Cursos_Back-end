public class Calculator {

  public void sumNumbers() {
    System.out.println(10 + 10);
  }

  public void subNumbers(int number01, int number02) {
    System.out.println(number01 - number02);
  }

  public double mulNumbers(double number01, double number02) {
    return number01 * number02;
  }

  public double divNumbers(double number01, double number02) {
    if (number02 > 0) {
      return number01 / number02;
    }
    return 0;
  }
}
