package backtracking;

import inputs.GraphInput;

public class AllUnDirectedGraphs extends Backtracking implements ApplicationInteface{
	
	static int a0 = -1;
	int grDim;
	static int[][] x2;
	GraphInput gr;
	
	public AllUnDirectedGraphs(int n) {
		//Backtrack(a0,N,r);
		super(a0,(n*(n-1))/2,0);
		this.grDim = n;
		x2 = new int[this.grDim][this.grDim];
		Backtrack();
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
		int k = 0;
		for(int i = 0; i < this.grDim;i++){
			for(int j = i; j < this.grDim; j++){
				if(i != j){
					x2[i][j] = x[k];
					k++;
				}
			}	
		}
		gr = new GraphInput(this.grDim);
		this.gr.printGraph(x2);
	}

}
