import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = new int[9]; 
		array = initializeArray(array);
		
		printArray(array);
		quickSort(array, 0, array.length-1);
		printArray(array);
	}
	
	
	public static void quickSort(int[] A, int left, int right){

		if(left < right){
			int pi = partition(A, left, right);
			quickSort(A, left, pi-1);
			quickSort(A, pi, right);
		}
		
	}
	
	
	public static int partition(int[] arr, int left, int right){
		int pivot = arr[((left+right)/2)];
		
		int i=left;
		int j=right;
		
		while( i<=j ){
			while(arr[i] < pivot)
				i++;
			
			while(arr[j] > pivot)
				j--;
			
			if(i<=j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		return i;
	}
	
	
	public static void printArray(int[] array){
		
		for(int i=0; i<array.length; i++){
			System.out.print( array[i] + "  " );
		}
		System.out.println("  " );
	}

	
	
	public static int[] initializeArray(int[] a){
		Random randomInsert = new Random();
		for(int i=0; i<a.length; i++){
			int data = randomInsert.nextInt(20)+1;
			a[i] = data;
		}
		
		return a;
	}

}
