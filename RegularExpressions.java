import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
 public static void main(String[] args){
  Pattern pattern = Pattern.compile("My name", Pattern.CASE_INSENSITIVE);
  Matcher matcher = pattern.matcher("my Name is Godzilla");
  boolean matchFound = matcher.find();
  if (matchFound) {
   System.out.println("Match Found");
  } else {
   System.out.println("Match Not Found");
  }
 }
}