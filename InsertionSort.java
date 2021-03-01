package sorting;
/**
 * 
 * @author Simir Cooper 
 * @since 2/21/21
 * Takes array and breaks it up into sorted and unsorted until array is fully sorted.
 */
public class InsertionSort {
	
	public void sort(double [] arr) {
		for (int i = 1; i < arr.length; i++) {
			double temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = temp; 
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
