class OuterClass {
 int x = 10;
 class InnerClass {
  int y = 5;
 }
}

public class Main {
 public static void main(String[] args){
  OuterClass myOuterClass = new OuterClass();
  OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();

  System.out.println(myOuterClass.x + myInnerClass.y); 
 }
}