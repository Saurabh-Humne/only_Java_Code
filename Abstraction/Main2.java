abstract class Animal {
 public abstract void animalSound();
 public void sleep() {
  System.out.println("Zzz");
 }
}

class Dog extends Animal {
 public void animalSound() {
  System.out.println("The Dog says: Bow Bow");
 }
}

class Main2 {
 public static void main(String[] args) {
  Dog myDog = new Dog();
  myDog.animalSound();
  myDog.sleep();
 }
}