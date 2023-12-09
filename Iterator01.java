import java.util.ArrayList;
import java.util.Iterator;

public class Iterator01 {
 public static void main(String[] args){
  ArrayList<String> fruts = new ArrayList<String>();

  fruts.add("Chiku");
  fruts.add("Banana");
  fruts.add("Apple");
  fruts.add("DragonFruts");

  Iterator<String> itit = fruts.iterator();
  
  while(itit.hasNext()) {
   System.out.println(itit.next());
  }
 }
}