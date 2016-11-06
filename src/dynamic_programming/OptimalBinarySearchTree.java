package dynamic_programming;

import inputs.ArrayInput;

public class OptimalBinarySearchTree {
	public final static int SIZE = 7;
	public static double[][]  w = new double[SIZE][SIZE];
	public static double[][]  c = new double[SIZE][SIZE];
	public static double[][]  r = new double[SIZE][SIZE];
	
	public static void main(String args[]){
		ArrayInput ai = new ArrayInput(SIZE);
		
		double[] p = ai.getPDoubleArray();
		double[] q = ai.getQDoubleArray();
		

		for(int i=0; i<SIZE; i++){
			for(int j=i; j<(SIZE) ; j++){
				if(i == j){
					w[i][j] = q[i];
				}
				else{
					w[i][j] = w[i][j-1] + p[j] + q[j];
				}
			}
		}

		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				System.out.printf("%.2f\t",w[i][j]);
				
			}
			System.out.println("\n");
		}
		System.out.println("\n");

		
		obst();
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				System.out.printf("%.2f\t",c[i][j]);
				
			}
			System.out.println("\n");
		}
		
		System.out.println("\n");
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				System.out.printf("%.2f\t",r[i][j]);
				
			}
			System.out.println("\n");
		}
		
	}
	
	public static void obst(){
		int m;
		
		for (int i=0; i < SIZE;i++){
			c[i][i] = 0;
		}

		for (int l=1; l < SIZE;l++){
			for (int i=0; i < SIZE-l;i++){
			int j = i + l;
			c[i][j] = 99.00;
			m = i+1; 
			for (int k=i+1; k <= j ; k++){
				double test = c[i][k-1] + c[k][j];
				if( test <= c[i][j] ){
					c[i][j] = test;
					m = k;
				}
			}
			c[i][j] = c[i][j] + w[i][j];
			r[i][j] = m;
			}
		}
	}
	
}
