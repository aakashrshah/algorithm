package divide_conquer;

import inputs.ArrayInput;

public class MaximumPrefix {
	static int[] arraylist;
	static int SIZE = 5;
	static int sum = 0;
	static int newSum = 0;
	static int[] result = new int[4];
	static int ltemp = 0;
	static int rtemp = 0;
	
	MaximumPrefix(int sumData,int sizeData){
		MaximumPrefix.sum = sumData;
		MaximumPrefix.SIZE = sizeData;
		MaximumPrefix.newSum = 0;
	}
	
	public static void main(String[] args) {
		ArrayInput arr = new ArrayInput();
		arraylist = new int[SIZE];
		arraylist = arr.getDummyArray(SIZE);
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println();
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;
		
		ltemp = arraylist[0];
		int k = maximumPrefixDivide(arraylist,startIndex,lastIndex,sum);
		
		System.out.println("\nMaximum Prefix Sum : " + k);
//		System.out.println("\nMaximum Prefix Index : " + k);
	}

	public static int maximumPrefixDivide(int[] array, int startIndex, int lastIndex,int temp){
		
		int k = (startIndex + lastIndex)/2;
		
		if(startIndex == lastIndex){
			sum += array[startIndex];
			return array[startIndex];
		}

		int leftMax = maximumPrefixDivide(array, startIndex, k,ltemp);
		int rightMax = maximumPrefixDivide(array, k+1, lastIndex,rtemp);
		
	
		if((leftMax+rightMax) >= ltemp){
			ltemp = sum;
			leftMax = ltemp;
		}
				
		return ltemp;
		
	}

	
}


