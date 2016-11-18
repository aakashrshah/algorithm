package inputs;

import java.util.Random;
import java.util.Scanner;

public class GraphInput {
	static int[][] graphmatrix;
	Random rand = new Random();
	Scanner scnr = new Scanner(System.in);
	int SIZE=0;
	int inf = 999;

	
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
											{0  ,inf,  2,   3,  5}, 
											{inf,  0,inf,   8,  3},
											{2  ,inf,  0, inf,  2},
											{3  ,  8,inf,   0, 10},
											{5  ,  3,  2,  10,  0}
										};  
	}
	
//	int[][] dummyUnweightedUndirectedGraph = new int [][] {
//											{0  ,  1,  1,  1,  1}, 
//											{0  ,  0,  1,  1,  1},
//											{0  ,  0,  0,  1,  1},
//											{0  ,  0,  0,  0,  1},
//											{0  ,  0,  0,  0,  0}
//										};
	
	int[][] dummyUnweightedUndirectedGraph = new int [][] {
											{0  ,  1,  0,  0,  0}, 
											{0  ,  0,  1,  1,  0},
											{0  ,  0,  0,  1,  0},
											{0  ,  0,  0,  0,  1},
											{0  ,  0,  0,  0,  0}
	};
	
	
	public int[][] getUnweightedUndirectedGraph(int seed){
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
					if(seed == 0){
						graphmatrix[i][j] = dummyUnweightedUndirectedGraph[i][j];
					}else{
						graphmatrix[i][j] = Math.abs(rand.nextInt()  % 2);
					}
				}
			}
		}
		
		return graphmatrix;
	}
	
	public void printGraph(int[][] graphmatrix){
		for (int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				System.out.print(graphmatrix[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("\n\n");
	}
}
