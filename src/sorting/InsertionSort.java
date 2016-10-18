package sorting;

import inputs.ArrayInput;

public class InsertionSort {
	final static int SIZE = 10;
	
	public static void main(String args[]){
		ArrayInput arr = new ArrayInput();
		int arraylist[] = arr.getDummyArray(SIZE);
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println();
		InsertionSort(arraylist);
	}
	
	private static void InsertionSort(int[] arraylist) {
		for(int x = 1; x < arraylist.length ; x++){
			for(int y = x ; y > 0 ; y--){
				if(arraylist[y] < arraylist[y-1]){
					swap(arraylist,y-1,y);
				}
			}
			for (int i : arraylist) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	private static void swap(int arraylist[],int i, int j) {
		int temp;
		temp = arraylist[i];
		arraylist[i] = arraylist[j];
		arraylist[j] = temp;
	}
}
