class ReverseString {
 public static void main(String[] args){
  String str = "this is java";
  String reverseStr = "";

  for (int i= 0; i < str.length(); i++){
   reverseStr = str.charAt(i) + reverseStr;
  }

  System.out.println("Original string : " + str);
  System.out.println("Reversed string : " + reverseStr);
 }
}
