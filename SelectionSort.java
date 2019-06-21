import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = new int[9]; 
		array = initializeArray(array);
		
		printArray(array);
		selectionSort(array);
		printArray(array);
	}

	
	public static void selectionSort(int[] arr){
		
		for(int i=0; i<arr.length-1; i++){
			
			int min = arr[i];
			int index = 0;
			
			for(int j=i+1; j<arr.length; j++){
				
				if(arr[j] < min){
					min = arr[j];
					index = j;
				}
			}
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
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
