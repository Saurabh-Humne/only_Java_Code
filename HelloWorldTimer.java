import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class HelloWorldTimer {
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		Scanner scanner = new Scanner(System.in);
		
		// Schedule a task to print "Hello, World!" every 10 Seconds
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				System.out.println("Hello, World!");
			}
			
		}, 0, 10000);
		
		// Wait for the user to type "exit"
		System.out.println("Type 'exit' to stop the program.");
		while (true) {
			String userInput = scanner.nextLine();
			if (userInput.equalsIgnoreCase("exit")) {
				// Cancel the timer and exit the program
				timer.cancel();
				System.out.println("Progran terminated.");
				System.exit(0);
			}
		}
	}
}
