class MethodParametersReturn {
 static int newMethod(int x, int y){
  return x + y;
 }

 public static void main(String[] args){
  int z = newMethod(3, 4);
  System.out.println("The output of this method is :"+ z);
 }
}