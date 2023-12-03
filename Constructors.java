public class Constructors {
 int modelYear;
 String modelName;

 public Constructors(int year, String name) {
  modelYear = year;
  modelName = name;
 }

 public static void main(String[] args){
  Constructors car = new Constructors(1960,"Mustang");
  System.out.println(car.modelYear + " " + car.modelName);
 }
}