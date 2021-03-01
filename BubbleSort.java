package sorting;
/**
 * 
 * @author Simir Cooper
 * @since 3/1/21
 * Hybrid Sort is an algorithm that determines whether our quadratic sorting algorithm or 
 * our randomized quick sort algorithm is used to sort arrays with varying sizes.
 */
public class HybridSort {
	public void sort(double [] arr, int bot, int top) {
		if(arr.length<1000) {
			QuadraticSort ob = new QuadraticSort();
			ob.sort(arr,bot, top);
			ob.printArray(arr);
		}
		else {
			RandomizedQuickSort ob = new RandomizedQuickSort();
			ob.sort(arr, bot, top);
			ob.printArray(arr);
		}
	}
	public static void main(String[] args) {
		HybridSort sample = new HybridSort();
		double [] array = {8, 5, 10, 3, 2};
		sample.sort(array, 0, array.length-1);
	}

}
