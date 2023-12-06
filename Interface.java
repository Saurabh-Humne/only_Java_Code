interface Animal {
 public void animalSound();
 public void sleep();
}

class Dog implements Animal {
 public void animalSound() {
  System.out.println("The Dog says: Bow Bow");
 }
 public void sleep() {
  System.out.println("Zzz");
 }
}

class Interface {
 public static void main(String[] args) {
  Dog myDog = new Dog();
  myDog.animalSound();
  myDog.sleep();
 }
}