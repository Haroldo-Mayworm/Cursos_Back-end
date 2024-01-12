public class Series {

  private String name;
  private static int[] episodes;

  static {
    System.out.println("In initializer block");
    episodes = new int[50];
    for (int i = 0; i < episodes.length; i++) {
      episodes[i] = i + 1;
    }
  }

  static {
    System.out.println("In initializer block - 02");
  }

  {
    System.out.println("In initializer block don't static");
  }

  public Series() {
    for (int episodes : Series.episodes) {
      System.out.print(episodes + " ");
    }
    System.out.println();
  }
}
