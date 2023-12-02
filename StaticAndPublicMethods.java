public class StaticAndPublicMethods {
 static void myStatic() {
  System.out.println("Static metnods can be called without creating objects");
 }

 public void myPublic(){
  System.out.println("Public methods must be called by creating objects");
 }

 public static void main(String[] args){
  myStatic();

  StaticAndPublicMethods obj = new StaticAndPublicMethods();
  obj.myPublic();
 }
}