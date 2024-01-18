import java.io.*;

public class TryWithResoucesTest01 {

  public static void main(String[] args) {}

  public static void readFileNew() throws IOException {
    try (Reader reader = new BufferedReader(new FileReader("Test.txt"))) {}
  }
  /*public static void readFileOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
}
