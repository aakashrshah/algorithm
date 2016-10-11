package divide_conquer;

import inputs.ArrayInput;

public class MaximumSubarray2 {

	static int[] arraylist;
	final static int SIZE = 5;
	static int leftMax = 0;
	static int rightMax = 0;
	static int[] result = new int[3];
	static int count = 0;
	static int lpos = 0;
	static int rpos = 0;
	static int oldlpos = 0;
	static boolean firstime = true;
	
	public static void main(String args[]){
		ArrayInput arr = new ArrayInput();
		arraylist = new int[SIZE];
		arraylist = arr.getDummyArray(SIZE);
		
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;
		
		int kr = FindMaxSumSubArray(arraylist, startIndex, lastIndex);
	}
	
	public static int FindMaxSumSubArray(int[] array, int startIndex, int lastIndex){
		
		int k = (startIndex + lastIndex)/2;

		if(startIndex == lastIndex){
			return array[0];
		}
		
		return max(
				FindMaxSumSubArray(array, startIndex, k),
				FindMaxSumSubArray(array, k+1, lastIndex),
				FindMaxCrossingSumArray(array,0,k,lastIndex)
		);
		
	    
	 }

	private static int max(int findMaxSumSubArray, int findMaxSumSubArray2, int findMaxCrossingSumArray) {
		// TODO Auto-generated method stub
		int max = Math.max(Math.max(findMaxSumSubArray, findMaxSumSubArray2), findMaxCrossingSumArray);
		System.out.println("\n" + "-----------Max---------------\n" + max);
		return max;
	}

	private static int FindMaxCrossingSumArray(int[] array, int i, int k, int lastIndex) {
		
		int sum = array[i];
		int size = k + 1;
		new MaximumPrefix(sum, size);
		int mp[] = MaximumPrefix.maximumPrefix(array, i, k);
		System.out.println("\n" + "-----------Max Prefix------------\n" + mp[0]);
		
		sum = array[k+1];
		size = (lastIndex - (k+1)) + 1;
		new MaximumSuffix(sum, size);
		int ms[] = MaximumSuffix.maximumSuffix(array, k+1, lastIndex);
		System.out.println("\n" + "----------Max Suffix----------------\n" + ms[0]);
		
		return ms[0] + mp[0];
	}
}
