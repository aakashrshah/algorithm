package divide_conquer;

import java.util.Arrays;

import inputs.ArrayInput;

public class MaximumSubarray {

	static int[] arraylist;
	final static int SIZE = 4;
	static int leftMax = 0;
	static int rightMax = 0;
	static int[] result = new int[3];
	static int count = 0;
	static int lpos = 0;
	static int rpos = 0;
	static int oldlpos = 0;
	static boolean firstime = true;
	
	public static void main(String args[]){
		ArrayInput arr = new ArrayInput(SIZE);
		arraylist = arr.getArray();
		arr.printArray(arraylist);
		
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;
		System.out.println("\t" + "sum" + "\t" + "k" + "\t" + "r");
		int kr[] = FindMaxSumSubArray(arraylist, startIndex, lastIndex);
		System.out.println("\n\t" + kr[0] + "\t" + (kr[1]+1) + "\t" + (kr[2]+1));
	}
	
	public static int[] FindMaxSumSubArray(int[] arraylist, int startIndex, int lastIndex){
		
		int k = (startIndex + lastIndex)/2;
		k = k - startIndex;
		lastIndex = lastIndex  - startIndex;
		
		if(arraylist.length == 1){
			
			if(count == 0){
				leftMax += arraylist[0];
				rightMax += arraylist[0];
				result[0] = arraylist[0];
				result[1] = count;
				result[2] = count;
				count++;
				System.out.println("\n" +arraylist[0] + "\t" +  result[0] + "\t" + result[1] + "\t" + result[2]);
				return result;
			}

			int oldresult = result[0];
			int oldlpos = lpos;
			leftMax = Math.max((leftMax + arraylist[0]),leftMax);
			rightMax = Math.max((rightMax + arraylist[0]),  arraylist[0]);
			
			if(rightMax > result[0]){
				result[0] = rightMax;
			}
			
			//Position of k and r
			if(result[0] > oldresult ){
				
					if(firstime){
						if(oldresult <= 0){
							lpos = count;
						}
						firstime = false;
					}
					else{
						lpos = oldlpos;
					}
					rpos = count;
			}
			else if((result[0] == oldresult)){
				if(arraylist[0] == result[0]){
					lpos = rpos = count;
				}
			}
			
			if(lpos == rpos){
				oldlpos = lpos;
			}

			result[1] = lpos;result[2] = rpos;
			System.out.println("\n" +arraylist[0] + "\t" + result[0] + "\t" + result[1] + "\t" + result[2]);
			count ++;
			return result;
		}
		
		FindMaxSumSubArray(Arrays.copyOfRange(arraylist, 0, k+1), 0, k);
		FindMaxSumSubArray(Arrays.copyOfRange(arraylist, k+1, lastIndex+1), k+1, lastIndex);
		
	    return result;
	 }
}
