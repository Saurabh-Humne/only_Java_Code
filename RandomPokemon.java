import java.util.Random;

public class RandomPokemon {
	public static void main(String[] args) {
		String randomPokeBall = IChoseYou();
		System.out.println("Your Pokemon is: " + randomPokeBall);
	}
	
	public static String IChoseYou() {
		Random random = new Random();
		int randomNumber = random.nextInt(3); // generate a rando number from 0 to 2
		
		switch (randomNumber) {
		case 0: 
			return "Charmander";
		case 1:
			return "Bulbasaur";
		case 2:
			return "Squirtel";
		default:
			return "Pikachu";
		}
	}
}
