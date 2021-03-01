package sorting;
/**
 * 
 * @author Simir Cooper 
 * @since 2/21/21
 * Takes array and places smallest values in ascending order until array is completely sorted.
 */
public class SelectionSort {
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
	public void sort(double [] arr) {
		for (int i = 0; i < arr.length; i++) {
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
		
	}

}
