import java.util.Scanner;
public class KethNumberExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of digits the series must havae: ");
		
		int numLen = sc.nextInt();
		if(numLen < 2) {
			System.out.println("The number must have at least 2 digits.");
		} else {
			long lowBound = (long)Math.pow(10,  numLen - 1);
			
			long upperBound = (long) Math.pow(10,  numLen);
			
			for(long L = lowBound; L < upperBound; L++) {
				if(isKeith(String.valueOf(L))){
					System.out.print(L + ", ");
				}
			}
		}
		sc.close();
	}
	
	public static boolean isKeith(String input) {
		int numLen = input.length();
		long[] series = new long[numLen];
		for(int i = 0; i < numLen; i++) {
			series[i] = Long.valueOf(input.substring(i, i + 1));
		}
		long next_term = 0;
		long number = Long.valueOf(input);
		while (next_term < number) {
			next_term = 0;
			
			for(int i = 0; i < numLen; i++) {
				next_term = next_term + series[i];
				
				if(i < numLen - 1) {
					series[i] = series[i + 1];
				} else {
					series[i] = next_term;
				}
			}
			
			if(next_term == number) {
				return true;
			}
		}
		
		return false;
	}
}
