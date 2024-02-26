import java.util.Scanner;

public class SumCalculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("Enter number to calculate the sum. Type 'exit' to finish.");
		
		while (true) {
			System.out.println("Enter a number: ");
			String input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("exit")) {
				break;
			}
			
			try {
				int number = Integer.parseInt(input);
				sum += number;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid number or 'exit'.");
			}
		}
		
		System.out.println("sum of the entered number: " + sum);
		
		scanner.close();
	}
}
