class SumOfElements {
 public static void main(String[] args){

  int[] myArray = {1, 2, 5, 10};
  int sum = 0;

  for (int i=0; i<myArray.length; i++){
   System.out.print(myArray[i]);
  } 

  for (int i=0; i<myArray.length; i++) {
   sum += myArray[i];
  }

  System.out.println(sum);
 }
}
