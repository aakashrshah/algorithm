package sorting;

import java.util.Arrays;

import inputs.ArrayInput;
import partitioning.Partition;

public class Quicksort {
	static Partition pr;
	static int[] arraylist;
	final static int SIZE = 8;
	
	public static void main(String args[]){
		ArrayInput arr = new ArrayInput();
		arraylist = new int[SIZE];
		arraylist = arr.getDummyArray(SIZE);
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;

		int k = QuicksortAlgorithm(arraylist,startIndex,lastIndex);	
	}

	private static int QuicksortAlgorithm(int[] array, int firstIndex, int lastIndex) {
		int pivot = 0;
		if(array.length <= 1){
			return 0;
		}
		pivot = simplePartition(array,firstIndex,lastIndex);
//		System.out.println("\nPartitioning Element : " + arraylist[pivot] + "\n");
		QuicksortAlgorithm(Arrays.copyOfRange(arraylist, 0, pivot), 0, pivot-1);
		QuicksortAlgorithm(Arrays.copyOfRange(arraylist, pivot+1, lastIndex+1), pivot+1, lastIndex);
		
		return 0;
	}
	
	public static int simplePartition(int[] array, int p,int q){
		int i = p;
		int j = q;
		
		i = i - p;
		j = j  - p;
		
		int a = array[i];
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
				if(j == -1){
					j++; 
					break;
				}
			}
			if(i<j){
				swap(i + p,j + p);
				i++;
				j--;
			}
		}
		j = j + p;
		if(p!=j){
			
			swap(p,j);
		}
		
		System.out.println();
		for (int kl : arraylist) {
			System.out.print(kl + " ");
		}
		return j;
	}

	private static void swap(Integer i, Integer j) {
		int temp;
		temp = arraylist[i];
		arraylist[i] = arraylist[j];
		arraylist[j] = temp;
	}
	
}
