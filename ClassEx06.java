class Reactangle {
 int length;
 int width;

 void insert(int l,int w){
  length = l;
  width = w;
 }

 void calculateArea(){
  System.out.println(length*width);
 }
}

class ClassEx06 {
 public static void main(String[] args){
  Reactangle r1 = new Reactangle();
  Reactangle r2 = new Reactangle();

  r1.insert(11,5);
  r2.insert(3,15);

  r1.calculateArea();
  r2.calculateArea();
 }
}
