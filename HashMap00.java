import java.util.HashMap;

public class HashMap00 {
 public static void main(String[] args){
  HashMap<String, String> capitalCities = new HashMap<String, String>();

  capitalCities.put("England", "London");
  capitalCities.put("Germany", "Berlin");
  capitalCities.put("Norway", "Oslo");
  capitalCities.put("USA", "Washington DC");

  System.out.println(capitalCities);

  System.out.println("To Get the specific element in HashMap");
  System.out.println(capitalCities.get("England"));
  System.out.println();

  System.out.println("To get only keys");
  for (String i : capitalCities.keySet()) {
   System.out.println(i);
  }

  System.out.println();

  System.out.println("To get only Values");
  for (String i : capitalCities.values()) {
  System.out.println(i);
  }

  System.out.println();
 
  System.out.println("To print both keys and values");
  for (String i : capitalCities.keySet()) {
   System.out.println("key :" + i + "  values :" + capitalCities.get(i));
  }
 }
}
