public class StackOverflowTest {

  public static void main(String[] args) {
    // Errors are events that you need to stop your application to resolve.
    recursive();
  }

  public static void recursive() {
    recursive();
  }
}
