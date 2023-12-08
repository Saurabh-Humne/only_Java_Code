import java.util.ArrayList;
import java.util.Collections;

class ArrayList5 {
 public static void main(String[] args){
  ArrayList<Character> myChar = new ArrayList<Character>();
  myChar.add('O');
  myChar.add('B');
  myChar.add('W');
  myChar.add('Q');

  Collections.sort(myChar);
  for (char i: myChar){
   System.out.println(i);
  } 
 }
}