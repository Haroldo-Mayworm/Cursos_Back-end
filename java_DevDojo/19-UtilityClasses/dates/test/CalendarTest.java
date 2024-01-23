import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

  public static void main(String[] args) {
    // Date for old/obsolete systems
    Calendar c = Calendar.getInstance();
    c.add(Calendar.HOUR, 2);

    Date date = c.getTime();

    if (c.getFirstDayOfWeek() == c.SUNDAY) {
      System.out.println("Sunday is the first day of the week");
    }
    System.out.println(c.get(Calendar.DAY_OF_WEEK));
    System.out.println(c.get(Calendar.DAY_OF_MONTH));
    System.out.println(c.get(Calendar.DAY_OF_YEAR));
    System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    System.out.println(c);
    System.out.println(date);
  }
}
