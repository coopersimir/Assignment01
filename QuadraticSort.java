package sorting;
/**
 * 
 * @author Simir Cooper
 * Takes the Selection Sort algorithm which has runtime O(n^2) and modifies 
 * it so that it has a similar signature to Quick sort algorithm.
 */
public class QuadraticSort {
	void swap (double [] arr, int i, int j) {
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	int findSmallest(double [] arr, int start) {
		int smallest = start;
		for (int i = start+1; i < arr.length; i++) {
			if (arr[i] < arr[smallest]) {
				smallest = i;
			}
		}
		return smallest;
			
	}
	
	public void sort(double [] arr, int bot, int top) {
		for (int i = bot; i < top; i++) {
			swap(arr, i, findSmallest(arr, i));
		}
	}
	public void printArray(double arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
	}
	
	public static void main(String[] args) {
		QuadraticSort ob = new QuadraticSort();
		double [] array = {12, 6, 9, 4, 13, 5};
		ob.sort(array, 0, array.length -1);
		ob.printArray(array);

	}

}
