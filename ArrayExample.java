class ArrayExample{
 public static void main(String[] args){
  String[][] Animals ={{"dog", "cat", "goat", "cow"},{"wolf", "tiger", "bear", "rino"}};
/*
  for(int i=0; i<=Animals.length -1; i++){
   for(int j=0; j<=Animals[i].length -1; j++){
    System.out.print(Animals[i][j] + " ");
   }
   System.out.println();
  }
*/
  Animals[1][2] = "butterfly";

  for(int i=0; i<=Animals.length-1; i++){
   for(int j=0; j<=Animals[i].length-1; j++){
    System.out.print(Animals[i][j] +" ");
   }
   System.out.println();
  }
 }
}