import java.util.HashSet;

public class HashSet01 {
 public static void main(String[] args){
  HashSet<Integer> number = new HashSet<Integer>();

  number.add(4);
  number.add(5);
  number.add(9);

  for (int i =1; i <= 10; i++){
   if(number.contains(i)) {
    System.out.println(i + " was Found in set.");
   } else {
    System.out.println(i + " was not Found in the set.");
   }
  }
 }
}