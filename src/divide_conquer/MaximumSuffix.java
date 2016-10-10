package divide_conquer;

import java.util.Arrays;

import inputs.ArrayInput;

public class MaximumSuffix {
	static int[] arraylist;
	static int SIZE = 10;
	static int sum = 0;
	static int newSum = 0;
	static int[] result = new int[2];
	static int count = SIZE+1;
	
	MaximumSuffix(int sumData,int sizeData){
		MaximumSuffix.sum = sumData;
		MaximumSuffix.SIZE = sizeData;
		MaximumSuffix.count = MaximumSuffix.SIZE + 1;
		MaximumSuffix.newSum = 0;
	}
	
	public static void main(String[] args) {
		ArrayInput arr = new ArrayInput();
		arraylist = new int[SIZE];
		arraylist = arr.getArray(SIZE,1);

		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println();
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;
		sum = arraylist[arraylist.length - 1];
		int k[] = maximumSuffix(arraylist,startIndex,lastIndex);
		System.out.println("\n" + k[0] + "\t" + k[1]);
	}

	public static int[] maximumSuffix(int[] arraylist, int startIndex, int lastIndex) {

		int k = (startIndex + lastIndex)/2;
		k = k - startIndex;
		lastIndex = lastIndex  - startIndex;
		
		if(arraylist.length == 1){
			count--;
			newSum += arraylist[0];
			if(newSum >= sum){
				sum = newSum;
				result[0] = sum;
				result[1] = count;
			}
//			System.out.print(arraylist[0] + "\t" + newSum + "\t" + sum + "\n" );
			return result;
		}
		
		maximumSuffix(Arrays.copyOfRange(arraylist, k+1, lastIndex+1), k+1, lastIndex);
		maximumSuffix(Arrays.copyOfRange(arraylist, 0, k+1), 0, k);

		return result;
	}
}
