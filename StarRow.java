class StarRow{
 public static void main(String[] args){
  int n = 10;
  for(int i=1;i<=n;i++){
   for(int j=n;j>=1;j--){
    if(j!=i){
     System.out.print(j);
    }else{
     System.out.print("*");
    }
   }
   System.out.println("");
  }
 }
}