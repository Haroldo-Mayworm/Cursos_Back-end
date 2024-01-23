import java.util.Date;

public class DateTest {

  public static void main(String[] args) {
    // Date for old/obsolete systems
    Date date = new Date(1_000_000_000_000l);
    System.out.println(date);

    Date currentDate = new Date();
    System.out.println(currentDate.getTime());
  }
}
