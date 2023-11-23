class MultiDimensionalArray {
 public static void main(String[] args) {
 
  // to creat a two-dimensional array
  int[][] numbers = {{1,2,3,4},{5,6,7}};
  
  // Access Elements
  System.out.println(numbers[0][1]);

  // change element value
  numbers[0][1] = 99;
  System.out.println(numbers[0][1]);
 
  System.out.println();

  // access all elements in array
  for (int i=0;i<numbers.length;i++){
   for (int j=0;j<numbers[i].length;j++){
    System.out.print(numbers[i][j]+ " ");
   }
  }
 }
}