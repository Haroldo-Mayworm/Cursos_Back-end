public class RepetitionStructure_Part.I {

  public static void main(String[] args) {
    // While
    int count = 1;
    /*while (count <= 10) {
            System.out.println(count);
            count++;
        }*/

    // Do while
    /*do {
            System.out.println("Number: " + count);
            count++;
        } while (count < 5);*/

    // For
    /*for (int i = 1; i <= 10; i++) {
            System.out.println("Loop n° " + i);
        }*/

    // Exercise
    // Print all numbers from 1 -> 1000000
    for (int i = 0; i <= 1000000; i++) {
      if (i % 2 == 0) {
        System.out.println("Number " + i);
      }
    }
  }
}
