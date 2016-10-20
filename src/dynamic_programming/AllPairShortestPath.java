package dynamic_programming;

import java.util.HashMap;

import inputs.GraphInput;

public class AllPairShortestPath {
	
	final static int SIZE = 5;
	public static void main(String args[]){
		GraphInput graph = new GraphInput(SIZE);
		int[][] graphmatrix = graph.getDummyGraph();
		graph.printGraph(graphmatrix);
		
		AllPairShortestPath(graphmatrix);
	}
	
//	private static void AllPairShortestPath(int[][] graphmatrix) {
//		int[][][] A = new int[SIZE][SIZE][SIZE];
//		
//		for(int i=0;i<SIZE;i++){
//			for(int j=0;j<SIZE;j++){
//				A[0][i][j] = graphmatrix[i][j];
//			}
//		}
//		
//		for(int k=1;k<SIZE;k++){
//			for(int i=0;i<SIZE;i++){
//				for(int j=0;j<SIZE;j++){
//					A[k-1][i][j] = Math.min(
//												( A[k-1][i][k] + A[k-1][k][j] ),
//												( A[k-1][i][j] )
//											);
//					
//				}
//			}
//		}
//	}
	
	private static void AllPairShortestPath(int[][] graphmatrix) {
		int[][] A = new int[SIZE][SIZE];
		
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				A[i][j] = graphmatrix[i][j];
			}
		}
		
		for(int k=0;k<SIZE;k++){
			for(int i=0;i<SIZE;i++){
				for(int j=0;j<SIZE;j++){
						A[i][j] = Math.min(	(A[i][k] + A[k][j]), (A[i][j]) );
						System.out.print(A[i][j] + "\t");
				}
				System.out.println("");
			}
			System.out.println("\n");
		}
		
		
	}
}
