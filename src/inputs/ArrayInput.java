package inputs;

import java.util.Random;
import java.util.Scanner;

public class ArrayInput {
	static int[] arraylist;
	Random rand = new Random();
	Scanner scnr = new Scanner(System.in);
	
	public int[] getArray(int size){
		//Random Array
		arraylist = new int[size];
		
		if(size == 0){
			arraylist[0] = 0;
			return arraylist;	
		}
		
		for (int i=0;i<size;i++){
			arraylist[i] = rand.nextInt()  % 10;
		}
		
		return arraylist;
	}
	
	public int[] getArray(int size,int seed){
		//PseudoRandom Array
		rand = new Random(seed);
		arraylist = new int[size];
		
		if(size == 0){
			arraylist[0] = 0;
			return arraylist;	
		}
		
		for (int i=0;i<size;i++){
			arraylist[i] = rand.nextInt()  % 10;
		}
		
		return arraylist;
	}
	
	public int[] getUserArray(int size){
		arraylist = new int[size];
		
		if(size == 0){
			arraylist[0] = 0;
			return arraylist;
		}
		
		for (int i=0;i<size;i++){
			arraylist[i] = scnr.nextInt();
		}
		
		return arraylist;
	}
	
	public int[] getDummyArray(int size){
		return arraylist = new int[] { 5, 8, 1, 9, 3, 14, 7, 10, 18, 4};
	}
}
