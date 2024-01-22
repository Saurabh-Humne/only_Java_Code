
public class Student {

	private String name;
	private int age;
	private double grade;
	
	// Constructor
	public Student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	// Getter methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getGrade() {
		return grade;
	}
	
	// Setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}else {
			System.out.println("Invalid age");
		}
	}
	
	public void setGrade(double grade) {
		if (grade >= 0 && grade <= 100) {
			this.grade = grade;
		}else {
			System.out.println("Invalid grade");
		}
	}
	
	// Display method
	public void displayStudentInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Grade: "+ grade);
	}
	
	// Example of encapsulation in action
	public static void main(String[] args) {
		// Creating a new Student object
		Student student = new Student("John Doe", 20, 85.5);
		
		// Accessing information using getter methods
		System.out.println("Name: "+ student.getName());
		System.out.println("Age: " + student.getAge());
		System.out.println("Grade: "+ student.getGrade());
		
		// Modifying information using setter methods
		student.setAge(21);
		student.setGrade(90.0);
	}
}
