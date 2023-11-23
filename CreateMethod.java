class CreateMethod {
 static void newMethod() {
  System.out.println("This is Method");
 }

 public static void main(String[] args){
  int n = 0;

  do {
   System.out.print(n +" ");
   newMethod(); 
   n++;
  } while (n <= 10);
 }
}