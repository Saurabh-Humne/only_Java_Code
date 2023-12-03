public class PublicMethod {
 
 public void fullThrottle() {
  System.out.println("the car is on full throttle");
 }

 public void speed (int maxSpeed){
  System.out.println("Max Speed is : maxSpeed");
 }

 public static void main(String[] args){
  PublicMethod car = new PublicMethod();

  car.fullThrottle();
  car.speed(200);
 }
}