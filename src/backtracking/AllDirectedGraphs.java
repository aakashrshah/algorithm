package backtracking;

import inputs.GraphInput;

public class AllDirectedGraphs extends Backtracking implements ApplicationInteface{
	
	int count = 0;
	//x[i] = ith node is 0 if there is no edge in the graph at i,j and 1 if there is.
	static int a0 = -1;
	int grDim;
	static int[][] x2;
	GraphInput gr;
	
	public AllDirectedGraphs(int n) {
		//Backtrack(a0,N,r);
		super(a0,n*n,0);
		this.grDim = n;
		x2 = new int[this.grDim][this.grDim];
		Backtrack();
		System.out.println("Total Outcomes : " + count);
	}

	@Override
	public boolean Bound(int[] x2, int r) {
		return true;
	}

	@Override
	public boolean Domain(int a) {
		if (a == 0 || a == 1){
			return true;
		}
		return false;
	}

	@Override
	public void Print() {
		for(int i = 0; i < this.grDim;i++){
			for(int j = 0; j < this.grDim; j++){
				x2[i][j] = x[(i*(this.grDim)) + j];
			}	
		}
		gr = new GraphInput(this.grDim);
		this.gr.printGraph(x2);
		this.count++;
	}

}
