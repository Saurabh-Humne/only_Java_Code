import java.util.HashSet;

public class HashSet00 {
 public static void main(String[] args){
  HashSet<String> fruts = new HashSet<String>();

  fruts.add("Apple");
  fruts.add("Big apple");
  fruts.add("Chota apple");
  fruts.add("Dusra apple");
  fruts.add("Apple");
 
  System.out.println("Every iterm in HashSet has to  be unique");
  System.out.println(fruts);
 }
}