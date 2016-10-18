package sorting;

import inputs.ArrayInput;

public class MergeSort {

	final static int SIZE = 10;
	static int[] outputArray = new int[SIZE];
	public static void main(String args[]){
		int[] arraylist;
		ArrayInput arr = new ArrayInput();
		arraylist = new int[SIZE];
		arraylist = arr.getDummyArray(SIZE);
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;
		MergeSortAlgorithm(arraylist,startIndex,lastIndex);	
		
		for (int i : outputArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void MergeSortAlgorithm(int[] array, int firstIndex, int lastIndex) {
		int pivot = (firstIndex + lastIndex)/2;
		if(firstIndex == lastIndex){
			outputArray[firstIndex] = array[firstIndex];
			return;
		}
		
		MergeSortAlgorithm(array, firstIndex, pivot);
		MergeSortAlgorithm(array, pivot+1, lastIndex);
		Merge(array,firstIndex,lastIndex);
	}


	private static void Merge(int[] array, int firstIndex, int lastIndex) {
		int pivot = (firstIndex + lastIndex)/2;
	   	int u,v,w;  
	   	/* 	u will scan C[i:k],  
			v will scan C[k+1:j], and 
			w will index the out B
		*/
	   	u=firstIndex;
	   	v=pivot+1;
	   	w=firstIndex;
	   	
	   	while  (u <= pivot && v <= lastIndex){
	    		if (array[u] <= array[v]){
	     			outputArray[w]=array[u]; 
	     			u++;w++;
	    		}
	    		else{
	     			outputArray[w]=array[v]; 
	     			v++;w++;
	    		}		
	   	}
	   	if(u > pivot){
	   		while (v < lastIndex)
	   	    {
	   	        outputArray[w] = array[v];
	   	        w++;
	   	        v++;
	   	    }
	   	}
	    		
	   	else if(v>lastIndex){
	   		while (u < pivot)
	   	    {
	   	        outputArray[w] = array[u];
	   	        w++;
	   	        u++;
	   	    }
	   	}
		
	}
	
}
