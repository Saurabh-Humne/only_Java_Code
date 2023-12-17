class Kayju {
 int rollno;
 String name;

void insertRecord(int n, String s){
 rollno = n;
 name = s;
}

void displayInformation(){
 System.out.println(rollno + " " + name);
}
}

class ClassEx04 {
 public static void main(String[] args){
  Kayju s1 = new Kayju();
  Kayju s2 = new Kayju();

  s1.insertRecord(1000,"kong");
  s2.insertRecord(1500,"GodZilla");

  s1.displayInformation();
  s2.displayInformation();
 }
}
