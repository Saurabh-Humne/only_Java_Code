class Constructor04 {
 int id;
 String name;

 Constructor04(int i,String n){
  id =i;
  name = n;
 }

 Constructor04(Constructor04 c){
  id = c.id;
  name = c.name;
 }

 void display(){
  System.out.println(id + " " + name);
 }

 public static void main(String[] args){
  Constructor04 c1 = new Constructor04(100,"Alpha");
  Constructor04 c2 = new Constructor04(c1);

  c1.display();
  c2.display();
 }
}
