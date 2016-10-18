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
		MergeSortAlgorithm(arraylist,startIndex,lastIndex,outputArray);	
	}

	private static void MergeSortAlgorithm(int[] array, int firstIndex, int lastIndex,int[] outputArray) {
		int[] out = new int[SIZE];
		
		if(firstIndex == lastIndex){
			outputArray[firstIndex] = array[firstIndex];
			return;
		}
		
		int pivot = (firstIndex + lastIndex)/2;
		MergeSortAlgorithm(array, firstIndex, pivot,out);
		MergeSortAlgorithm(array, pivot+1, lastIndex,out);
		out = Merge(out,firstIndex,lastIndex,outputArray);
		for (int i : outputArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}


	private static int[] Merge(int[] array, int firstIndex, int lastIndex,int[] outputArray) {
		int pivot = (firstIndex + lastIndex)/2;
		int u = firstIndex;
		int v = pivot + 1;
		int w = u;
		
		while(u <= pivot && v <= lastIndex){
			if(array[u] <= array[v]){
				outputArray[w] = array[u];
				u++;
			}
			else{
				outputArray[w] = array[v];
				v++;
			}
			w++;
		}
		
		if(u>pivot){
//			outputArray[w:lastIndex] = array[v:lastIndex];
			System.arraycopy(array, v, outputArray, w, lastIndex - v + 1);
		}else if (v > lastIndex){
//			outputArray[w:lastIndex] = array[u:pivot];
			System.arraycopy(array, u, outputArray, w, pivot - u + 1);

		}
		return outputArray;
	}
	
}