package sorting;
import java.util.*;
/**
 * 
 * @author Simir Cooper 
 * @since 2/21/21
 * Randomized Quick Sort takes array and arranges it around a random pivot until it is completely sorted. 
 */
public class RandomizedQuickSort {
	
	int random_pivot(int bot,int top) {
		Random rand = new Random();
		int pivot = rand.nextInt(top-bot)+bot;  
		return pivot;
	} 
	void swap (double [] arr, int i, int j) {
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	int partition (double [] arr, int left, int right) {
		if (left < right) {
			int pivot = random_pivot(left, right);
			int bot = left;
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
		RandomizedQuickSort ob = new RandomizedQuickSort();
		double [] array = {12, 6, 9, 4, 13, 5};
		ob.sort(array, 0, array.length -1);
		ob.printArray(array);
	}

}
