
public class Person {
	// Instance Variables
	private String name;
	private int age;
	
	// Parameterized constructor
	public Person(String name, int age) {
		// Use 'this' keyword to refer to instance vatiable
		this.name = name;
		this.age = age;
	}
	
	// Method to print information about the person
	public void displayInfo() {
		System.out.println("Name: "+ this.name);
		System.out.println("Age: "+ this.age);
	}
	
	// Method to compare the age of two person
	public boolean isOlderThan(Person otherPerson) {
		// Use 'this' Keyword to refer to the age of the current object
		// Use 'otherPerson' to refer o the age of the passed object
		return this.age > otherPerson.age;
	}
	
	public static void main(String[] args) {
		//Create two Person Objects
		Person person1 = new Person("Patrick", 25);
		Person person2 = new Person("SpongBob", 30);
		
		//Display information about each person
		System.out.println("Person 1:");
		person1.displayInfo();
		
		System.out.println("Person 2:");
		person2.displayInfo();
		
		// Compare the ages of the two persons
		if (person1.isOlderThan(person2)) {
			System.out.println("\n"+ person1.name + " is older than " + person2.name);
		} else {
			System.out.println("\n" + person1.name + " is not older than " + person2.name);
		}
		
	}
}
