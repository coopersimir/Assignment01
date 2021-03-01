package sorting;
/**
 * 
 * @author Simir Cooper 
 * @since 2/21/21
 * Quick Sort takes array and arranges it around a pivot until it is completely sorted. 
 */
public class QuickSort {
	void swap (double [] arr, int i, int j) {
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	/**
	 * Takes a pivot and reorders the array around it.
	 * @param arr
	 * @param left
	 * @param right
	 * @return the left value or the top value
	 */
	int partition (double [] arr, int left, int right) {
		if (left < right) {
			int pivot = left;
			int bot = left + 1;
			int top = right;
			while (bot <= top) {
				while (bot <= right && arr[bot] <= arr[pivot]) {
					++bot;
				}
				while (top >= bot && arr[top] > arr[pivot]) {
					--top;
				}
				if (bot <= right && bot < top) {
					swap(arr, bot, top);
				}
				
			}
			swap(arr, pivot, top);
			return top;
		}
		return left;
	}
	public void sort(double [] arr, int bot, int top) {
		if (bot < top) {
			int p = partition(arr, bot, top);
			sort(arr, bot, p-1);
			sort(arr, p+1, top);
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
