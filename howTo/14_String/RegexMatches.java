import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMatches {
  public static void main(String[] args) {
    Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
    String s1 = ("Jane: 05-12-75\n"
                 + "John: 04-28-73\n"
                 + "Dave: 11-04-68\n"
                 + "Joe: 12-17-77\n");
    Matcher matcher = expression.matcher(s1);

    while (matcher.find()) System.out.println(matcher.group());
  }
}
