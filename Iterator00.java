import java.util.ArrayList;
import java.util.Iterator;

public class Iterator00 {
 public static void main(String[] args){
  ArrayList<String> fruts = new ArrayList<String>();

  fruts.add("Apple");
  fruts.add("Dragon Frut");
  fruts.add("Chiku");
  fruts.add("Banana");

  Iterator<String> it = fruts.iterator();
  System.out.println(it.next());
 }
}