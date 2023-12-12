import java.util.ArrayList;

public class Lambda00 {
 public static void main(String[] args){
  ArrayList<Integer> number = new ArrayList<Integer>();

  number.add(5);
  number.add(4);
  number.add(8);
  number.add(9);
  number.forEach ( (n) -> {System.out.println(n);});
 }
}
