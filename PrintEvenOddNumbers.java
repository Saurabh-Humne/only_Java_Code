class PrintEvenOddNumbers{
 public static void main(String[] args){
  int num = 100;
  System.out.println("The even numbers from 1 to 100");
  for (int i=1; i<=num;i++){
   if (i%2==0){
    System.out.print(i+" ");
   }
  }
  System.out.println();
  System.out.println("The odd numbers fron 1 to 100");
  for(int i=0; i<=num;i++){
   if(i%2!=0){
    System.out.print(i+" ");
   }
  }
 }
}