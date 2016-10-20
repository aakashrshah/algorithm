package divide_conquer;

import java.util.Arrays;

import inputs.ArrayInput;

public class FixedLengthMaximumSubarray {

	static int[] arraylist;
	final static int SIZE = 8;
	static int result = 0;
	static int count=0;
	static int highestSum = 0;
	static int oldHighest = 0;
	static int l = 3;
	static int lcount = 0;
	
	
	public static void main(String args[]){
		ArrayInput arr = new ArrayInput(SIZE);
		arraylist = arr.getArray();
		arr.printArray(arraylist);
		
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;

		for (int i = 0; i< l;i++){
			oldHighest += arraylist[i];
		}
		
		int kr = FindMaxSumSubArray(arraylist, startIndex, lastIndex);
		System.out.println("\n\t" + (kr+1));
	}
	
	public static int FindMaxSumSubArray(int[] arraylist, int startIndex, int lastIndex){
		
		int k = (startIndex + lastIndex)/2;
		k = k - startIndex;
		lastIndex = lastIndex  - startIndex;
		
		if(arraylist.length == 1){
			if(lcount<l){
				highestSum += arraylist[0];
				lcount++;
			}
			else if (lcount == l){
				if(highestSum >= oldHighest){
					oldHighest = highestSum;
					result = count - l + 1;
				}
				highestSum = 0;
				highestSum += arraylist[0];
				lcount = 1;
			}
			count++;
			return result;
		}
		
		FindMaxSumSubArray(Arrays.copyOfRange(arraylist, 0, k+1), 0, k);
		FindMaxSumSubArray(Arrays.copyOfRange(arraylist, k+1, lastIndex+1), k+1, lastIndex);
		
	    return result;
	 }
}
