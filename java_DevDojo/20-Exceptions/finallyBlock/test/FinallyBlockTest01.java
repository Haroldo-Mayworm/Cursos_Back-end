public class FinallyBlockTest01 {

  public static void main(String[] args) {
    openConnection();
  }

  private static String openConnection() {
    try {
      System.out.println("opening file...");
      System.out.println("Editing file...");
      return "Connection is open";
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Closing file...");
    }
    return null;
  }
}
