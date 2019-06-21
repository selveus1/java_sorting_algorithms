
import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = new int[7]; 
		array = initializeArray(array); 
		int[] helper = new int[6];
		printArray(array);
		mergeSort(array, 0, array.length-1);
		//printArray(array);
	}
	
	
	public static void mergeSort(int[] A, int left, int right){
	
		if(left < right){
			int middle = (left + right) / 2;
			System.out.printf("1st mergesort : left=%d, middle=%d \n", left, middle);
			mergeSort(A, left, middle);
			
			System.out.printf("2nd mergesort : middle+1=%d, right=%d \n", (middle+1),right);
			mergeSort(A, middle+1, right);
			
			System.out.printf("Merging : left=%d, mid=%d, right=%d \n",left, middle,right);
			merge(A, left, middle, right);
			printArray(A);

		}
	}
	
	
	public static void merge(int[] A, int left, int middle, int right){
		
		int i = left;
		int j = middle+1;
		int k = left;
		int[] B = new int[A.length];
		
		for(int z=left; z<=right; z++ ){
			B[z] = A[z];
		}
		
		while(i <= middle && j <= right){
			if( B[i] <= B[j] ){
				A[k++] = B[i];
				i++;
			}else{
				A[k++] = B[j];
				j++;
			}
		}
		
		while( i <= middle){
			A[k++] = B[i++];
		}
		
	}
	
	
	public static void printArray(int[] array){
		
		for(int i=0; i<array.length; i++)
			System.out.print( array[i] + "  " );
		
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
