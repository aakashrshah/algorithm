package inputs;

import java.util.Random;
import java.util.Scanner;

public class ArrayInput {
	static int[] arraylist;
	Random rand = new Random();
	Scanner scnr = new Scanner(System.in);
	int SIZE=0;
	
	public ArrayInput(int arraySize){
		this.SIZE = arraySize;
	}
	
	public int[] getArray(){
		//Random Array
		arraylist = new int[SIZE];
		
		if(SIZE == 0){
			arraylist[0] = 0;
			return arraylist;	
		}
		
		for (int i=0;i<SIZE;i++){
			arraylist[i] = rand.nextInt()  % 10;
		}
		
		return arraylist;
	}
	
	public int[] getArray(int seed){
		//PseudoRandom Array
		rand = new Random(seed);
		arraylist = new int[SIZE];
		
		if(SIZE == 0){
			arraylist[0] = 0;
			return arraylist;	
		}
		
		for (int i=0;i<SIZE;i++){
			arraylist[i] = rand.nextInt()  % 10;
		}
		
		return arraylist;
	}
	
	public int[] getUserArray(){
		arraylist = new int[SIZE];
		
		if(SIZE == 0){
			arraylist[0] = 0;
			return arraylist;
		}
		
		for (int i=0;i<SIZE;i++){
			arraylist[i] = scnr.nextInt();
		}
		
		return arraylist;
	}
	
	public int[] getDummyArray(){
		return arraylist = new int[] {-5, 1 ,-5 ,-4, 0 };
	}
	
	public void printArray(int[] arraylist){
		for (int i : arraylist) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}
