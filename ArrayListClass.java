import java.util.ArrayList;

class ArrayListClass {
 public static void main(String[] atgs){
  ArrayList<String> fruts = new ArrayList<String>();
  fruts.add("Mango");
  fruts.add("Apple");
  fruts.add("Banana");
  fruts.add("Pineapple");
  
  System.out.println(fruts);
  System.out.println("The size of the array is :"+fruts.size());

  System.out.println("The element at 0 position is :" + fruts.get(0));

  System.out.println("Change the element at 0");
  fruts.set(0, "Promograned");
  System.out.println(fruts);
  System.out.println("Remove element at position at 1");
  fruts.remove(1);
  System.out.println(fruts);
  System.out.println("The size of the array now is :"+fruts.size());
  System.out.println("Clear all the elements in array");
  fruts.clear();
  System.out.println("The size of the array now is :"+fruts.size());
  System.out.println(fruts);
 }
}
