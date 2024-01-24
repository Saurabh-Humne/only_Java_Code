import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		// Define the correct password
		String correctPassword = "Password@123";
		
		// Get uer input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String enteredPassword = scanner.nextLine();
		
		// Check if the entered password is correct
		if (checkPassword(enteredPassword, correctPassword)) {
			System.out.println("password is correct. Access reanted!");
		} else {
			System.out.println("incorrect password. Access denied.");
		}
		
		// Close the scanner
		scanner.close();
	}
	
	// Method to check if the entered password matches the correct password
	private static boolean checkPassword(String enteredPassword, String correctPassword) {
		return enteredPassword.equals(correctPassword);
	}
}
