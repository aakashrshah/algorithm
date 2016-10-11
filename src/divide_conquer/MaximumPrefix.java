package divide_conquer;

import inputs.ArrayInput;

public class MaximumPrefix {
	static int[] arraylist;
	static int SIZE = 10;
	static int sum = 0;
	static int newSum = 0;
	static int[] result = new int[2];
	static int count = 0;
	
	MaximumPrefix(int sumData,int sizeData){
		MaximumPrefix.sum = sumData;
		MaximumPrefix.SIZE = sizeData;
		MaximumPrefix.newSum = 0;
		MaximumPrefix.count = 0;
	}
	
	public static void main(String[] args) {
		ArrayInput arr = new ArrayInput();
		arraylist = new int[SIZE];
		arraylist = arr.getArray(SIZE);
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println();
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;
		
		sum = arraylist[0];
		int k[] = maximumPrefix(arraylist,startIndex,lastIndex);
		System.out.println("\n" + k[0] + "\t" + k[1]);
	}

	public static int[] maximumPrefix(int[] array, int startIndex, int lastIndex) {

		int k = (startIndex + lastIndex)/2;
		
		if(startIndex == lastIndex){
			count++;
			newSum += array[startIndex];
			if(newSum >= sum){
				sum = newSum;
				result[0] = sum;
				result[1] = count;
			}
			System.out.print(array[startIndex] + "\t" + newSum + "\t" + sum + "\n" );
			return result;
		}
		maximumPrefix(array, 0, k);
		maximumPrefix(array, k+1, lastIndex);

		return result;
	}

}


