public class RuntimeTest02 {

  public static void main(String[] args) {
    try {
      division(1, 0);
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }

  private static double division(int a, int b) {
    if (b <= 0) {
      throw new IllegalArgumentException("Invalid argument, cannot use \"0\".");
    }
    return 0;
    /*try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;*/
  }
}
