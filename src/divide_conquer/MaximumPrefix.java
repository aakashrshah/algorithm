package divide_conquer;

import inputs.ArrayInput;

public class MaximumPrefix {
	static int[] arraylist;
	static int SIZE = 5;
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
		
		sum = 0;
		int k = maximumPrefixDivide(arraylist,startIndex,lastIndex,sum);
		
		System.out.println("\nMaximum Prefix Sum : " + newSum);
//		System.out.println("\nMaximum Prefix Index : " + k);
	}

	public static int maximumPrefixDivide(int[] array, int startIndex, int lastIndex,int tempsum){
		
		int k = (startIndex + lastIndex)/2;
		
		tempsum = 0;
		for(int i=startIndex;i<=lastIndex;i++){
			tempsum += array[i];
		}
		System.out.println(tempsum);
		
		if(startIndex == lastIndex){
			sum += array[startIndex];
			return array[startIndex];
		}

		
		return 	maximumPrefixConquer(
					maximumPrefixDivide(array, startIndex, k,tempsum),
					maximumPrefixDivide(array, k+1, lastIndex,tempsum)
		);
	}

	private static int maximumPrefixConquer(int maximumPrefixDivide, int maximumPrefixDivide2) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
}


