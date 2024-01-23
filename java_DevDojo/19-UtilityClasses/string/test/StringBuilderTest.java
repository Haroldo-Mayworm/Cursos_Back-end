public class StringBuilderTest {

  public static void main(String[] args) {
    String name = "Haroldo";

    name.concat(" Mayworm");
    System.out.println(name);
    System.out.println("------------------------------");
    StringBuilder sb = new StringBuilder(name);
    sb.append(" Mayworm").append(" - Developer Jr");
    System.out.println(sb);
  }
}
