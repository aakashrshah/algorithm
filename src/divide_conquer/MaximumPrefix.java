package divide_conquer;

import inputs.ArrayInput;

public class MaximumPrefix {
	static int[] arraylist;
	static int SIZE = 5;
	static int sum = 0;

	MaximumPrefix(int sumData,int sizeData){
		MaximumPrefix.sum = sumData;
		MaximumPrefix.SIZE = sizeData;
	}
	
	public static void main(String[] args) {
		ArrayInput arr = new ArrayInput(SIZE);
		arraylist = arr.getArray();
		arr.printArray(arraylist);
		
		int startIndex = 0;
		int lastIndex = arraylist.length - 1;

		maximumPrefixDivide(arraylist,startIndex,lastIndex);
	}

	public static int[] maximumPrefixDivide(int[] array, int startIndex, int lastIndex){
		
		int k = (startIndex + lastIndex)/2;

		if(startIndex == lastIndex){
			int leftMax = 0;
			
			int index = 0;
			sum += array[startIndex];
			leftMax = array[startIndex];
			index = startIndex;
			int[] result = new int[3];
			result[0] = leftMax;
			result[1] = sum;
			result[2] = index;
			return result;
		}

		int left[] = maximumPrefixDivide(array, startIndex, k);
		int right[] = maximumPrefixDivide(array, k+1, lastIndex);
		
		
		for (int f : left) {
			System.out.print(f + " ");
		}
		System.out.println();
		
		for (int f : right) {
			System.out.print(f + " ");
		}
		System.out.println();
		
		
		int[] result = new int[3];
		
		if(left[0] > right[0]){
			if(left[0] + right[0] > right[1]){
				result[0] = left[0] + right[0];
				result[2] = right[2];
			}else if (left[0] + right[0] == right[1]){
				if(right[1] > left[1]){
					result[0] = right[1];
					result[2] = right[2];
				}else{
					result[0] = left[0];
					result[2] = left[2];
				}
			}
			else{
				result[0] = left[0];
				result[2] = left[2];
			}
			
		}
		else if (right[0] >= left[0]){
			if(right[1] > left[1]){
				result[0] = right[1];
				result[2] = right[2];
			}else{
				result[0] = left[0];
				result[2] = left[2];
			}
			
		}
		result[1] = right[1];
		for (int f : result) {
			System.out.print(f + " ");
		}
		System.out.println();
		return result;
	}
}


