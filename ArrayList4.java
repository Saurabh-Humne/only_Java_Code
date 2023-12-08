import java.util.ArrayList;

class ArrayList4 {
 public static void main(String[] args){
  ArrayList<Integer> num = new ArrayList<Integer>();
   num.add(2000);
   num.add(1999);
   num.add(1888);
   num.add(1777);
 
   for (int i : num ){
    System.out.println(i);
   }
 }
}
