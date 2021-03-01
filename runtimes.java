import java.util.*;
import java.util.stream.DoubleStream;
import sorting.*;
/**
 * 
 * @author Simir Cooper
 * @since 3/1/21
 * Runtimes imports a package I have created with all of the general purpose sorting algorithms.
 * Each sorting algorithm is tested with different sized arrays and the time in milliseconds is recorded
 * each time.
 */
public class runtimes {
	
	static void BubbleSort_(double [] arr) {
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
	}
	static void MergeSort_(double [] arr) {
		MergeSort ms = new MergeSort();
		ms.sort(arr);
	}
	static void InsertionSort_(double [] arr) {
		InsertionSort is = new InsertionSort();
		is.sort(arr);
	}
	static void QuickSort_(double [] arr) {
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, arr.length-1);
	}
	static void SelectionSort_(double [] arr) {
		SelectionSort ss = new SelectionSort();
		ss.sort(arr);
	}
	
	public static void main(String[] args) {
		
		int [] array_sizes = {50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};
		for(int i=0; i< 10; i++) {
			double [] array = DoubleStream.generate(() -> new Random().nextInt()).limit(array_sizes[i]).toArray();
			System.out.println("Size of array: "+array_sizes[i]);
			long current_time = System.currentTimeMillis(); 
			SelectionSort_(array);
			long end_time = System.currentTimeMillis(); 
			System.out.println("Runtime: "+(end_time-current_time));
		}
		
		
	}

}
