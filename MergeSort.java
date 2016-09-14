
import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[7]; 
		array = initializeArray(array); //{12, 6, -2, 8, 1, 9};
		int[] helper = new int[6];
		printArray(array);
		mergeSort(array, 0, array.length-1);
		//printArray(array);
	}
	
	
	public static void mergeSort(int[] A, int left, int right){
	
		if(left < right){
			int middle = (left + right) / 2;
			System.out.println("1st mergesort : left=" + left + ", middle=" + middle);
			mergeSort(A, left, middle);
			
			System.out.println("2nd mergesort : middle+1=" + (middle+1) + ", right=" + right);
			mergeSort(A, middle+1, right);
			
			System.out.println("Merging : left=" + left + ", middle=" + middle + ", right=" + right);
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
		
		//System.out.print("printing the helper --> ");
		//printArray(B);
		
		while(i <= middle && j <= right){
			if( B[i] <= B[j] ){
				A[k++] = B[i];
				i++;
			}else{
				A[k++] = B[j];
				j++;
			}
			//k++;
		}
		
		//System.out.println("i=" + i);
		//System.out.println("k=" + k);
		while( i <= middle){
			A[k++] = B[i++];
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
