import java.util.HashMap;

class HashMap01 {
 public static void main(String[] args){
  HashMap<String, Integer> people = new HashMap<String, Integer>();

  people.put("John", 32);
  people.put("Jani", 34);
  people.put("Janardn", 30);


  for (String i : people.keySet()){
   System.out.println("key :" + i + "  value :" +people.get(i));
  }
 }
}
