class Student{
 int rollno;
 String name;
 static String college = "MIT";// Static varibe

 Student(int r,String n){
  rollno = r;
  name = n;
 }

 void display(){
  System.out.println(rollno+ " " + name + " " + college);
 }
}

class J01Static {
 public static void main(String[] args){
  Student s1 = new Student(010,"Kabir");
  Student s2 = new Student(020,"Amir");

  s1.display();
  s2.display();
 }
}
