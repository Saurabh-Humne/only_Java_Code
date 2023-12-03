public class Main{
 static void myStaticMethod() {
  System.out.println("Static metnod can be called without creating objects");
 }

 public void myPublicMethod() {
  System.out.println(" Public method must be calledby creating Objects");
 }

 public static void main(String[] args){
  myStaticMethod();

  Main myObj1 = new Main();
  myObj1.myPublicMethod();

 }
}