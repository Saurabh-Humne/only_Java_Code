class J02Static {
 //an intance varible which get memory each time when we creat an object of the class
 //int num = 0;//will get memory each time when the intance is created

 // use of static varible which is shared with all object
 static int num = 0; //will get memory only once and retain its value

 J02Static(){
  num++;
  System.out.println(num);
 }

 public static void main(String[] args){
  J02Static count = new J02Static();
  J02Static count1 = new J02Static();
  J02Static count2 = new J02Static();
 }
}
