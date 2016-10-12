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
		arraylist = arr.getArray(SIZE);
		
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;
		
		int kr = FindMaxSumSubArray(arraylist, startIndex, lastIndex);
		System.out.println(kr);
	}
	
	public static int FindMaxSumSubArray(int[] array, int startIndex, int lastIndex){
		
		int k = (startIndex + lastIndex)/2;

		if(startIndex == lastIndex){
			return array[startIndex];
		}
		
		return max(FindMaxSumSubArray(array, startIndex, k),
				FindMaxSumSubArray(array, k+1, lastIndex),
				FindMaxCrossingSumArray(array,0,k,lastIndex)				
		);
	 }

	private static int max(int findMaxSumSubArray, int findMaxSumSubArray2, int findMaxCrossingSumArray) {
		// TODO Auto-generated method stub
//		System.out.println( findMaxSumSubArray +" -> " + findMaxSumSubArray2+ " -> "+findMaxCrossingSumArray);
		int max = Math.max(Math.max(findMaxSumSubArray, findMaxSumSubArray2), findMaxCrossingSumArray);
//		System.out.println("\n" + "-----------Max--------------- " + max);
		return max;
	}

	private static int FindMaxCrossingSumArray(int[] array, int i, int k, int lastIndex) {
		
		int ssum = 0;
		int left_sum = 0;
		for (int iter = k; iter >= i; iter--)
		{
			ssum = ssum + array[iter];
			if (ssum > left_sum)
			left_sum = ssum;
		}

		ssum = 0;
		int right_sum = 0;
		for (int iter = k+1; iter <= lastIndex; iter++)
		{
			ssum = ssum + array[iter];
			if (ssum > right_sum)
			right_sum = ssum;
		}

		return left_sum + right_sum;
	}
}
