public class WrapperTest {

  public static void main(String[] args) {
    byte byteP = 1;
    short shortP = 1;
    int intP = 10;
    long longP = 100L;
    float floatP = 10f;
    double doubleP = 10d;
    char charP = 'P';
    boolean booleanP = true;

    // Autoboxing
    Byte byteW = 2;
    Short shortW = 1;
    Integer intW = 10;
    Long longW = 100L;
    Float floatW = 10f;
    Double doubleW = 10d;
    Character charW = 'W';
    Boolean booleanW = true;

    // Unboxing
    byte b = byteW;
    short s = shortW;
    int i = intW;
    long l = longW;
    float f = floatW;
    double d = doubleW;
    char c = charW;
  }
}
