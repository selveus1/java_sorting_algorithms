import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[9]; 
		array = initializeArray(array);
		
		printArray(array);
		insertionSort(array);
		printArray(array);
	}

	
	public static void insertionSort(int[] arr){
		
		for(int i=1; i<arr.length; i++){
			
			int j = i;
			
			while( (j>0) && ( arr[j-1] > arr[j] ) ){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
					
		}
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
