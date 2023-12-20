class Constructor03 {
 int id ;
 String name ;
 int age ;

 Constructor03(int i,String n){
  id = i;
  name = n;
 }

 Constructor03(int i,String n,int a){
  id = i;
  name = n;
  age = a;
 }

 void display(){
  System.out.println(id +" "+ name + " " + age);
 }

 public static void main(String[] args){
  Constructor03 c1 = new Constructor03(101,"ok");
  Constructor03 c2 = new Constructor03(224,"dio",23);

  c1.display();
  c2.display();
 }
}
