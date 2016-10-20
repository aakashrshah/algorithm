package inputs;

import java.util.Random;
import java.util.Scanner;

public class GraphInput {
	static int[][] graphmatrix;
	Random rand = new Random();
	Scanner scnr = new Scanner(System.in);
	int SIZE=0;
	
	public GraphInput(int graphSize){
		this.SIZE = graphSize;
	}
	
	
	
	public int[][] getDirectedGraph(){
		//Random Graph
		graphmatrix = new int[SIZE][SIZE];
		
		if(SIZE == 0){
			graphmatrix[0][0] = 0;
			return graphmatrix;	
		}
		
		for (int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				if(i == j){
					graphmatrix[i][j] = 0;
				}else{
					graphmatrix[i][j] = rand.nextInt()  % 10;
				}
			}
		}
		
		return graphmatrix;
	}
	
	
	
	
	public int[][] getUndirectedGraph(){
		//Random Graph
		graphmatrix = new int[SIZE][SIZE];
		
		if(SIZE == 0){
			graphmatrix[0][0] = 0;
			return graphmatrix;	
		}
		
		for (int i=0;i<SIZE;i++){
			for(int j=i;j<SIZE;j++){
				if(i == j){
					graphmatrix[i][j] = 0;
				}else{
					graphmatrix[i][j] = rand.nextInt()  % 10;
				}
			}
		}
		
		return graphmatrix;
	}
	
	
	
	
	
	
	public int[][] getDirectedGraph(int seed){
		//Random Graph
		rand = new Random(seed);
		graphmatrix = new int[SIZE][SIZE];
		
		if(SIZE == 0){
			graphmatrix[0][0] = 0;
			return graphmatrix;	
		}
		
		for (int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				if(i == j){
					graphmatrix[i][j] = 0;
				}else{
					graphmatrix[i][j] = rand.nextInt()  % 10;
				}
			}
		}
		
		return graphmatrix;
	}
	
	
	
	
	public int[][] getUndirectedGraph(int seed){
		//Random Graph
		rand = new Random(seed);
		graphmatrix = new int[SIZE][SIZE];
		
		if(SIZE == 0){
			graphmatrix[0][0] = 0;
			return graphmatrix;	
		}
		
		for (int i=0;i<SIZE;i++){
			for(int j=i;j<SIZE;j++){
				if(i == j){
					graphmatrix[i][j] = 0;
				}else{
					graphmatrix[i][j] = rand.nextInt()  % 10;
				}
			}
		}
		
		return graphmatrix;
	}
	
	
	
	
	
	
	public int[][] getUserDirectedGraph(){
		//Random Graph
		graphmatrix = new int[SIZE][SIZE];
		
		if(SIZE == 0){
			graphmatrix[0][0] = 0;
			return graphmatrix;	
		}
		
		for (int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				if(i == j){
					graphmatrix[i][j] = 0;
				}else{
					System.out.println("i = " + i + "| j = " + j);
					graphmatrix[i][j] = scnr.nextInt();
				}
			}
		}
		
		return graphmatrix;
	}
	
	
	
	
	public int[][] getUserUndirectedGraph(){
		//Random Graph
		graphmatrix = new int[SIZE][SIZE];
		
		if(SIZE == 0){
			graphmatrix[0][0] = 0;
			return graphmatrix;	
		}
		
		for (int i=0;i<SIZE;i++){
			for(int j=i;j<SIZE;j++){
				if(i == j){
					graphmatrix[i][j] = 0;
				}else{
					System.out.println("i = " + i + "| j = " + j);
					graphmatrix[i][j] = scnr.nextInt();
				}
			}
		}
		
		return graphmatrix;
	}
	
	
	public int[][] getDummyGraph(){
		return graphmatrix = new int[][] {
											{ 0,-1, 2, 3, 5}, 
											{-1, 0,-1, 8, 3},
											{-1,-1, 0,-1, 2},
											{-1,-1,-1, 0,10},
											{-1,-1,-1,-1, 0}
										};
	}
	
	public void printGraph(int[][] graphmatrix){
		for (int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				System.out.print(graphmatrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
