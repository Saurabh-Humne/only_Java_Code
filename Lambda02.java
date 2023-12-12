interface StringFunction {
 String run(String str);
}

public class Lambda02 {
 public static void main(String[] args) {
  StringFunction exclaim = (s) -> s + "!";
  StringFunction ask = (s) -> s + "?";
  PrintFormatted("Hello", exclaim);
  PrintFormatted("Hello", ask);
 }

  public static void PrintFormatted(String str, StringFunction format) {
   String result = format.run(str);
   System.out.println(result);
  }
}
