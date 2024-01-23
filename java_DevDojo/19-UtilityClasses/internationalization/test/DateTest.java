import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateTest {

  public static void main(String[] args) {
    Locale localeBrazil = new Locale("pt", "BR");
    Locale localeEua = new Locale("en", "US");
    Calendar calendar = Calendar.getInstance();

    DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
    DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeEua);

    System.out.println("Brazil : " + df1.format(calendar.getTime()));
    System.out.println("USA : " + df2.format(calendar.getTime()));
  }
}
