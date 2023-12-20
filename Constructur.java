class Constructur05 {
 int id;
 String name;

 Constructur05(int i,String n){
  id = i;
  name = n;
 }

 Constructur05(){}

 void display(){
  System.out.println(id + " " + name);
 }

 public static void main(String[] args){
  Constructur05 c1 = new Constructur05(200,"TwoHundred");
  Constructur05 c2 = new Constructur05();

  c2.id = c1.id;
  c2.name = c1.name;

  c1.display();
  c2.display();
 }
}
