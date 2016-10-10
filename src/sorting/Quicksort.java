package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import partitioning.Partition;

public class Quicksort {
	static Partition pr;
	private static List<Integer> arr;
	
	public static void main(String args[]){
		Integer[] ints = new Integer[]{5,8,1,9,3,14,7,10,18,4};
		arr = new ArrayList<Integer>();
		arr.addAll(Arrays.asList(ints));
		
		int firstIndex = 0;
		int lastIndex = arr.size() - 1;
		System.out.println(arr);

		arr = QuicksortAlgorithm(arr,firstIndex,lastIndex);	
		System.out.println(arr);
	}

	private static List<Integer> QuicksortAlgorithm(List<Integer> arr, int firstIndex, int lastIndex) {
		int pivot = 0;
		if(firstIndex >= lastIndex){
			System.out.println("True");
			return arr;
		}
		pivot = simplePartition(firstIndex,lastIndex);
		System.out.println(firstIndex + " " + (pivot-1) + " " + pivot + " " + (pivot + 1)+ " " + lastIndex);
		if(firstIndex < pivot){
			QuicksortAlgorithm(arr.subList(firstIndex, pivot), firstIndex, pivot-1);
		}
		if(lastIndex > pivot){
			QuicksortAlgorithm(arr.subList(pivot+1, lastIndex+1), pivot+1, lastIndex);
		}
				return arr;
	}
	
	public static int simplePartition(int p,int q){
		int i = p;
		int j = q;
		
		int a = arr.get(p);
		while(i<j){
			while(arr.get(i) <= a){
				i++;
			}
			while(arr.get(j) > a){
				j--;
			}
			if(i<j){
				swap(arr,i,j);
				i++;
				j--;
			}
		}
		swap(arr,p,j);
		System.out.println(arr);
		System.out.println(j);
		System.out.println(arr.get(j));
		return j;
	}

	private static void swap(List<Integer> arr, Integer i, Integer j) {
		int temp;
		temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}
	
}
