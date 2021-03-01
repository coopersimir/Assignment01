package sorting;
/**
 * 
 * @author Simir Cooper
 * @since 2/21/21
 * Bubble Sort takes an array and swaps the adjacent values until it is fully sorted.
 */
public class BubbleSort {
	
	void swap (double [] arr, int i, int j) {
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sort(double [] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					
				}
			}
		}
	
	}
	 public void printArray(double arr[]){ 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	 } 
	public static void main(String[] args) {

	}

}
