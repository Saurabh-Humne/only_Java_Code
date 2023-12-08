import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {
 public static void main(String[] args){
  LocalDateTime myDateObj = LocalDateTime.now();
  System.out.println("Before :" + myDateObj);

  DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

  String formattedDate = myDateObj.format(myFormatObj);
  System.out.println("After :" +formattedDate);

  DateTimeFormatter myformat = DateTimeFormatter.ofPattern("E dd-MMM-yyyy HH:mm:ss");
  String newDate = myDateObj.format(myformat);
  System.out.println(newDate);
 }
}