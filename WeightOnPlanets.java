import java.util.Scanner;

public class WeightOnPlanets {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Earth gravity constant
		final double EARTH_GRAVITY = 9.81;
		
		// Planet gravity constants (relative t Earth's gravity)
		final double MARSE_GRAVITY = 0.38;
		final double VENUS_GRAVITY = 0.91;
		final double JUPITER_GRAVITY = 24.79;
		
		// Input: weight on Earth
		System.out.print("Enter the weight on Earth (in kg): ");
		double weightOnEarth = scanner.nextDouble();
		
		// Calculate weight on Earth
		double weightOnMarse = calculateWeight(weightOnEarth, MARSE_GRAVITY);
		double weightOnVenus = calculateWeight(weightOnEarth, VENUS_GRAVITY);
		double weightOnJupiter = calculateWeight(weightOnEarth, JUPITER_GRAVITY);
		
		//Display results
		System.out.printf("weight on Marse: %.2f N\n",  weightOnMarse);
		System.out.printf("Weight on Venus; %.2f N\n", weightOnVenus);
		System.out.printf("Weight on Jupiter: %.2f N\n", weightOnJupiter);
		
		scanner.close();
	}
	
	// Function to calculate weight on a planet
	private static double calculateWeight(double weightOnEarth, double gravityOnPlanet) {
		return weightOnEarth * gravityOnPlanet;
	}
}
