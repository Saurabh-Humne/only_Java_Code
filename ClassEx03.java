class Student {

  int id ;
  String name;

}

class ClassEx03 {
 public static void main(String[] args){
  
  Student s1 = new Student();
  Student s2 = new Student();

  s1.id = 1000;
  s1.name = "KingKong";

  s2.id = 1500;
  s2.name = "GodZilla";

  System.out.println(s1.id + " " + s1.name);
  System.out.println(s2.id + " " + s2.name);

 }
  
}
