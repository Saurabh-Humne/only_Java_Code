import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {

	public static void main(String[] args) {
		int countdownSecond = 10; // Set the countdown time in seconds
		startCountdownTimer(countdownSecond);
	}
	
	private static void startCountdownTimer(int seconds) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int remainingSeconds = seconds;

			@Override
			public void run() {
				if(remainingSeconds > 0) {
					System.out.println(remainingSeconds + " seconds remaining... ");
					remainingSeconds--;
				} else {
					System.out.println("Beep Beep! time's up!");
					timer.cancel(); // Stop the timer
				}
				
			}
		};
		
		timer.scheduleAtFixedRate(task, 0, 1000);
	}
}
