import java.util.Scanner;


public class LinearSearchExample2 {

	public static void main(String args[]) {
		int c, n, search, array[];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = in.nextInt();
		array = new int[n];
		
		System.out.println("Enter those" + n + " elements");
		
		for (c = 0;c < n;c++)
			array[c] = in.nextInt();
		
		System.out.println("Enter the value to find");
		search = in.nextInt();
		
		for(c = 0; c < n; c++) {
			if(array[c] == search) {
				System.out.println(search + " is preset at location"+ (c + 1)+ ".");
				break;
			}
		}
		if (c == n)
			System.out.println(search + "isn't resent in array.");
	}
}
