class CountWords {
 public static void main(String[] args){

  String line = "This is to count words in this line";

  int count = line.split("\\s").length;
  System.out.println(line);

  System.out.println(count);

 }
}
