package sorting;

import inputs.ArrayInput;

public class Quicksort {

	final static int SIZE = 10;
	
	public static void main(String args[]){
		int[] arraylist;
		ArrayInput arr = new ArrayInput();
		arraylist = arr.getDummyArray(SIZE);
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;
		QuicksortAlgorithm(arraylist,startIndex,lastIndex);	
	}

	private static void QuicksortAlgorithm(int[] array, int firstIndex, int lastIndex) {
		int pivot = 0;
		if(firstIndex >= lastIndex){
			return;
		}
		pivot = simplePartition(array,firstIndex,lastIndex);
		QuicksortAlgorithm(array, firstIndex, pivot-1);
		QuicksortAlgorithm(array, pivot+1, lastIndex);
	}
	
	public static int simplePartition(int[] array, int p,int q){
		int i = p;
		int j = q;
		int a = array[p];
		while(i<j){
			while(array[i] <= a){
				i++;
				if(i == array.length){
					i--;
					break;
				}
			}
			while(array[j] > a){
				j--;
			}
			if(i<j){
				swap(array,i,j);
				i++;
				j--;
			}
		}
		swap(array,p,j);

		
		System.out.println();
		for (int kl : array) {
			System.out.print(kl + " ");
		}
		System.out.println("Partitioning Element : " +j + "," + array[j]);
		return j;
	}

	private static void swap(int[] array ,int i, int j) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
}
