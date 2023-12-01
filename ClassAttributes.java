public class ClassAttributes {
 int x = 5;
 int y = 6;
 final int z = 10;
 String line = "the sum of x and y is : ";
 int sum = x+y;

 public static void main(String[] args){
  ClassAttributes obj1 = new ClassAttributes();
  ClassAttributes obj2 = new ClassAttributes();
  
  System.out.println(obj1.x);

  obj1.y = 30;
  System.out.println(obj1.y);
 
  //obj1.z = 50;  // this will create a error

  obj2.x = 20;
  System.out.println(obj2.x);

  System.out.println(obj1.line + " " + obj1.sum);
 }
}