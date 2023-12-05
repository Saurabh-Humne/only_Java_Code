class Animal {
 public void animalSound() {
  System.out.println("The annimal make a sound");
 }
}

class Dog extends Animal {
 public void animalSound() {
  System.out.println("The Dog says : Bow Bow");
 }
}

class Cat extends Animal {
 public void animalSound() {
  System.out.println("The Cat says : Mew Mew");
 }
}

class Main {
 public static void main(String[] args){
  Animal myAnimal = new Animal();
  Dog myDog = new Dog();
  Cat myCat = new Cat();

  myAnimal.animalSound();
  myDog.animalSound();
  myCat.animalSound();
 }
}