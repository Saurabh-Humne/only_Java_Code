class Constructor01 {
 int i;
 String n;

 void display(){
  System.out.println(i + " " + n);
 }

 public static void main(String[] args){
  Constructor01 c1 = new Constructor01();
  Constructor01 c2 = new Constructor01();


  System.out.println("the default constructor display 0 / null value");

  c1.display();
  c2.display();
 }
}
