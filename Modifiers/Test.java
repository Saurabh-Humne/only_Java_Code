abstract class Main{
 public String name = "pall";
 public int age =24;
 public abstract void study();
}

class Student extends Main{
 public int graduationYear = 2021;
 public void study() {
  System.out.println("Studing all day");
 }
}

class Test {
 public static void main(String[] args){
  
  Student myObj = new Student();

  System.out.println("Name: " + myObj.name);
  System.out.println("Age: " + myObj.age);
 System.out.println("Gradution Year: " + myObj.graduationYear);
  myObj.study();
 }
}