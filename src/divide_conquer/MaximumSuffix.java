package divide_conquer;

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

	public static int[] maximumSuffix(int[] array, int startIndex, int lastIndex) {

		int k = (startIndex + lastIndex)/2;
		
		if(startIndex == lastIndex){
			count--;
			newSum += array[startIndex];
			if(newSum >= sum){
				sum = newSum;
				result[0] = sum;
				result[1] = count;
			}
			System.out.print(array[startIndex] + "\t" + newSum + "\t" + sum + "\n" );
			return result;
		}
		
		maximumSuffix(array, k+1, lastIndex);
		maximumSuffix(array, 0, k);

		return result;
	}
}
