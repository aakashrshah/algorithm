package backtracking;

public class HamiltonianPath extends Backtracking implements ApplicationInteface{

	//x[i] = label of ith node.
	int count = 0;
	static int a0 = 0;
	int n;
	int[][] gr;
	
	public HamiltonianPath(int n,int[][] graph) {
		super(a0, n, 0);
		this.n = n;
		this.gr = graph;
		Backtrack();
		System.out.println("Total Outcomes : " + count);
	}

	@Override
	public boolean Bound(int[] x2, int r2) {
		for(int i=0; i < r2; i++){
			if(x2[i] == x2[r2]){
				return false;
			}
		}
		if(r2 > 0 && !isAnEdge(x2[r2-1],x2[r2])){
			return false;
		}
		return true;
	}

	@Override
	public boolean Domain(int xr) {
		for(int i = 1; i <= this.N; i++){
			if(i == xr){
				return true;
			}
		}
		return false;
	}
	
	private boolean isAnEdge(int i, int j) {
//		System.out.println(i + " " + j);
		if(i<j){
			if(gr[i-1][j-1] == 1){
				return true;
			}
		}else{
			if(gr[j-1][i-1] == 1){
				return true;
			}
		}
		return false;
	}

	@Override
	public void Print() {
		for(int i = 0; i < this.N; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();	
		this.count++;
	}

}
