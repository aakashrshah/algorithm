package sorting;

import inputs.ArrayInput;

public class SelctionSort {
	final static int SIZE = 10;
	
	public static void main(String args[]){
		ArrayInput arr = new ArrayInput();
		int arraylist[] = arr.getDummyArray(SIZE);
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println();
		SelectionSort(arraylist);
	}

	private static void SelectionSort(int[] arraylist) {
		int d = 0;
		for(int i=0;i<arraylist.length;i++){
			int init = 9999;
			for(int j = i; j< arraylist.length;j++){
				if(arraylist[j] < init){
					init = arraylist[j];
					d = j;
				}
			}
			swap(arraylist,d,i);
			for (int item : arraylist) {
				System.out.print(item + " ");
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
