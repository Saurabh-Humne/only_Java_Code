class DiamondPattrn2 {
 public static void main(String[] args){
  int line = 5;

  for (int i=0;i<=line;i++){
   for (int j=1;j<=line-i;j++){
    System.out.print(" ");
   }
  
   for(int j=1;j<=2*i-1;j++){
    System.out.print("*");
   }
   System.out.println();
  }

  for(int i=line-1; i>=1; i--){
   for(int j=1; j<=line-i;j++){
    System.out.print(" ");
   }
 
   for(int j=1;j<=2*i-1;j++){
    System.out.print("*");
   }
   System.out.println();
  }
 }
}