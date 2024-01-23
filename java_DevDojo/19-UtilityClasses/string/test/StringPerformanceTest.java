public class StringPerformanceTest {

  public static void main(String[] args) {
    long startProgram = System.currentTimeMillis();
    concatString(100_000);
    long endProgram = System.currentTimeMillis();
    System.out.println(
      "Runtime - normal: " + (endProgram - startProgram) + "ms"
    );

    long startProgram1 = System.currentTimeMillis();
    concatStringBuilder(100_000);
    long endProgram1 = System.currentTimeMillis();
    System.out.println(
      "Runtime - StringBuilder: " + (endProgram1 - startProgram1) + "ms"
    );

    // Multithreading
    long startProgram2 = System.currentTimeMillis();
    concatStringBuffer(100_000);
    long endProgram2 = System.currentTimeMillis();
    System.out.println(
      "Runtime - StringBuffer: " + (endProgram2 - startProgram2) + "ms"
    );
  }

  private static void concatString(int size) {
    String text = "";
    for (int i = 0; i < size; i++) {
      text += i;
    }
  }

  private static void concatStringBuilder(int size) {
    StringBuilder stringbuilder = new StringBuilder(size);
    for (int i = 0; i < size; i++) {
      stringbuilder.append(i);
    }
  }

  private static void concatStringBuffer(int size) {
    StringBuffer stringbuffer = new StringBuffer(size);
    for (int i = 0; i < size; i++) {
      stringbuffer.append(i);
    }
  }
}
