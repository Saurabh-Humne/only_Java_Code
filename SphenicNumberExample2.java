import java.util.*;
public class SphenicNumberExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lower, upper, i, n,f, count, k;
		System.out.print("Enter the lower limit: ");
		//read the lower limit from the user
		lower = sc.nextInt();
		System.out.println("Enter the upper limit: ");
		//reads the upper limit from the user
		upper = sc.nextInt();
		System.out.println("\nSphenic numbers between the given range are: ");
		for(i= lower ; i <= upper;i++) {
			n=i;
			k=0;
			int prime[] = {0,0,0};
			for(f=2; n!=1;f++) {
			//counts the frequency of the prime factors
			
			count=0;
			while(n%f==0) {
				count++;
				n=n/f;
			}
			if(count==1)
				prime[k++]=f;
			if(k==prime.length)
				//breaks the execution if there are 3 unique prime factors
				break;
			
		}
		n=prime[0]*prime[1]*prime[2];
		
		if(i==n)
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}
