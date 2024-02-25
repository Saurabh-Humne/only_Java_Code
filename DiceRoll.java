import java.util.Random;

public class DiceRoll {
	public static void main(String[] args) {
		Random random = new Random();
		
		int die1 = rollDie(random);
		int die2 = rollDie(random);
		
		System.out.println("Rolling two dice...");
		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);
		System.out.println("Total: "+ (die1 + die2));
	}
	
	private static int rollDie(Random random) {
		return random.nextInt(6) + 1;
	}
}
