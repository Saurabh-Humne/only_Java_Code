class ClassEx07 {

 void fact(int n){

  int fact = 1;
  
  for (int i=1;i<=n;i++){
   fact=fact*i;
  }

   System.out.println("Factorial is " +fact);
 }

 public static void main(String[] args){
  
  new ClassEx07().fact(5);
 }
}
