public class PrimitiveDataTypes {

  public static void main(String[] args) {
    // Primitive types
    byte numberByte = 10;
    short numberShort = 20;
    int numberInteger = 30;
    long numberLong = 40;
    float numberFloat = 9.75F;
    double numberDouble = 15.3;
    char characterChar = 'a';
    boolean isTrue = false;

    // Casting
    double myDouble = 9.78;
    int myInteger = (int) myDouble;
    System.out.println(myDouble);
    System.out.println(myInteger);

    // String - "reference type" (Tipo de referência)
    String myString = "Isso é uma string";

    /*
        Exercise:
        Create variable for the names between "<>" and print the sentence: 
        
        "I <name>, inform you that the package was delivered to the address <address>, at a cost of <cost>, on <date>"
    */

    String name = "Haroldo Mayworm";
    String address = "Titkit Street";
    double cost = 115.90;
    String date = "03/06/2023";
    String sentence =
      "I " +
      name +
      ", inform you that the package was delivered to the address " +
      address +
      ", at a cost of " +
      cost +
      ", on " +
      date +
      ".";
    System.out.println(sentence);
  }
}
