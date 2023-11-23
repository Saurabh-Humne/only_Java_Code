// varible = (condition) ? expressionTrue : expressionFalse;

class ShortHandIfElse {
 public static void main(String[] args) {
/*
  int age = 30;
  for(age < 18){
   System.out.println("you can not vote");
  } else {
   System.out.println("you can vote");
  }
*/

  int age = 30;
  String note = (age < 18) ? "you can not vote": "you can vote";
  System.out.println(note);
 }
}