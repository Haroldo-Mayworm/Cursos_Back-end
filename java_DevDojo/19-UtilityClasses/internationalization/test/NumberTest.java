import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

  public static void main(String[] args) {
    double numberToFormat = 10_000_000.852369;

    Locale localeBR = new Locale("pt", "BR");
    Locale localeJP = Locale.JAPAN;
    Locale localeUS = Locale.US;
    Locale localeIT = Locale.ITALIAN;

    NumberFormat[] nfa = new NumberFormat[4];
    nfa[0] = NumberFormat.getInstance(localeBR);
    nfa[1] = NumberFormat.getInstance(localeJP);
    nfa[2] = NumberFormat.getInstance(localeUS);
    nfa[3] = NumberFormat.getInstance(localeIT);

    for (NumberFormat numberFormat : nfa) {
      System.out.println(numberFormat.format(numberToFormat));
    }
  }
}
