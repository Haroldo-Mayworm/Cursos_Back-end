public class StringTest01 {

  public static void main(String[] args) {
    String name = "Haroldo";
    String name2 = "Haroldo";
    name.concat(" Mayworm");
    System.out.println(name == name2);

    name = name.concat(" Mayworm");
    System.out.println(name == name2);
  }
}
