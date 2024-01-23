
public class ArraySorting {

	public static void main(String[] args) {
		int[] numbers = {5,3,5,3,4,7,1};
		
		System.out.println("Original Array");
		printArray(numbers);
		
		// Sorting the array in ascending order
		bubbleSort(numbers);
		
		System.out.println("\nArray in ascending Order:");
		printArray(numbers);
	}
	
	// Bubble sort algorithm for sorting the array in ascending order
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		
		for(int i = 0; i < n - 1; i++) {
			swapped = false;
			
				for (int j = 0; j < n - 1 - i; j++) {
					swapped = false;
					if (arr[j] > arr[j + 1]) {
						// Swapping the elements if they are in the wrong order
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						swapped = true;
					}
				}
				
				// If no two elements were swapped by inner loop, then the array is already sorted
				if (!swapped) {
					break;
				}
			}
		}
	
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
}
