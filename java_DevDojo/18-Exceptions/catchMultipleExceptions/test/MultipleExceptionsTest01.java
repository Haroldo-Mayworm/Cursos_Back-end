import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultipleExceptionsTest01 {

  public static void main(String[] args) {
    try {
      throw new IndexOutOfBoundsException();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception: ArrayIndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Exception: IndexOutOfBoundsException");
    } catch (IllegalArgumentException e) {
      System.out.println("Exception: IllegalArgumentException");
    } catch (ArithmeticException e) {
      System.out.println("Exception: ArithmeticException");
    } catch (RuntimeException e) {
      System.out.println("Exception: RuntimeException");
    }

    try {
      handleExceptions();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void handleExceptions()
    throws SQLException, FileNotFoundException {}
}
