class Constructor02 {
 int id;
 String name;

 Constructor02(int i,String n){
  id = i;
  name = n;
 }

 void display(){
  System.out.println(id + " " +name);
 }

 public static void main(String[] args){
  
  Constructor02 c1 = new Constructor02(404,"not found");
  Constructor02 c2 = new Constructor02(500,"not avilable");

  c1.display();
  c2.display();
 }
}
