import java.util.ArrayList;
import java.util.Iterator;

public class Iterator02 {
 public static void main(String[] args){
  ArrayList<Integer> number = new ArrayList<Integer>();
  
  number.add(23);
  number.add(12);
  number.add(8);
  number.add(20);
  number.add(7);

  Iterator<Integer> itit = number.iterator();

  while(itit.hasNext()) {
   Integer i = itit.next();
   if (i < 10) {
    itit.remove();
   }
  }

  System.out.println(number);
 }
}