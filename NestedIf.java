class NestedIf {
 public static void main(String[] args){
  
  String animal = "Dog";
  String type = "pug";

  if(animal == "Dog"){
   if(type == "pug"){
    System.out.println("It's a pug");
   } else {
    System.out.println("It's not a pug");
   }
   } else {
    System.out.println("It's not a dog");
   }
 }
}