import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultipleExceptionsTest02 {

  public static void main(String[] args) {
    try {
      throw new IndexOutOfBoundsException();
    } catch (
      ArrayIndexOutOfBoundsException
      | IllegalArgumentException
      | ArithmeticException e
    ) {
      System.out.println("Exception: ArrayIndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Exception: IndexOutOfBoundsException");
    } catch (RuntimeException e) {
      System.out.println("Exception: RuntimeException");
    }

    try {
      handleExceptions();
    } catch (SQLException | FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  private static void handleExceptions()
    throws SQLException, FileNotFoundException {}
}
