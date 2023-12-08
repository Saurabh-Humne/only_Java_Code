import java.util.Scanner;

class UserInput {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  String name;
  int age;
  double salary;


  System.out.println("Enter Your name");
  name = sc.nextLine();

  System.out.println("What is your age");
  age = sc.nextInt();

  System.out.println("How much your earn");
  salary = sc.nextDouble();


  System.out.println("Name :" +name);
  System.out.println("Age :" +age);
  System.out.println("Salary :" +salary);
 }  
}
