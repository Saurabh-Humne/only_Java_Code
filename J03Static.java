// java program to demonstrate the uses of static method 

class Student {
 int rollno;
 String name;
 static String college = "MIT";

// static method to chnge the value of 
 static void change(){
  college = "Yell";
 }

// construct to initialize the value
 Student(int r,String n){
  rollno = r;
  name = n;
 }
 
// method to display value
 void display(){
  System.out.println(rollno +" "+ name +" "+ college);
 }
}

class J03Static {
 public static void main(String[] args){

  Student.change();

  Student s1 = new Student(01, "groot");
  Student s2 = new Student(06, "rocket");

  s1.display();
  s2.display();
 }
}
