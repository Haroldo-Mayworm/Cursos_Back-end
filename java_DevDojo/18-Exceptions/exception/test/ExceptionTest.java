import java.io.File;
import java.io.IOException;

public class ExceptionTest {

  public static void main(String[] args) {
    createNewFile();
  }

  public static void createNewFile() {
    File file = new File("arquivo\\exceptionTest.txt");

    try {
      boolean isCreate = file.createNewFile();
      System.out.println("File create: " + isCreate);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
