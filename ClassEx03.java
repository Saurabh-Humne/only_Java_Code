class Kayju {

  int id ;
  String name;

}

class ClassEx03 {
 public static void main(String[] args){
  
  Kayju s1 = new Kayju();
  Kayju s2 = new Kayju();

  s1.id = 1000;
  s1.name = "KingKong";

  s2.id = 1500;
  s2.name = "GodZilla";

  System.out.println(s1.id + " " + s1.name);
  System.out.println(s2.id + " " + s2.name);

 }
  
}
