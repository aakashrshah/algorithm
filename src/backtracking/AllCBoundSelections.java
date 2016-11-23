package backtracking;

public class AllCBoundSelections extends Backtracking implements ApplicationInteface{
	
	//x[i] is the value of the cell in the matrix
	int count = 0;
	static int a0 = 0;
	int n;
	int c;
	int[][] gr;
	
	public AllCBoundSelections(int n,int[][] graph,int c) {
		super(a0, n, 0);
		this.n = n;
		this.gr = graph;
		this.c = c;
		Backtrack();
		System.out.println("Total Outcomes : " + count);
	}

	@Override
	public boolean Bound(int[] x2, int r2) {
		//Determine Row
		int[] location = determineLocation(x2[r2]);
		int sum = 0;
		for(int i=0; i < r2; i++){
			int [] loc = determineLocation(x2[i]);
			if(x2[i] >= x2[r2]){
				return false;
			}
			if(loc[0] == location[0] || loc[1] == location[1]){
				return false;
			}
		}
		if(r2 == 2){
			for(int i = 0 ; i < this.N ; i++){
				sum += cBound(x2[i],sum);
				if(sum > c){
					return false;
				}
			}
		}

		return true;
	}

	private int cBound(int r,int tempSum) {
		for(int i = 0; i < this.N; i++){
			for(int j = 0; j < this.N; j++){
				if(r == (i*this.N + j+1)){
					tempSum = gr[i][j];
					break;
				}
			}
		}
		return tempSum;
	}

	public int[] determineLocation(int x){
		int row = 0;
		int column = 0;
		for(int j=1 ; j <= this.N ; j++){
			if((x-j)%this.N == 0){
				row = ((x-j)/this.N) + 1;
			}
			if((x-((j-1)*this.N)) >= 1 && (x-((j-1)*this.N)) <= this.N){
				column = (x-((j-1)*this.N));
			}
		}
		int[] location = {row,column};
		return location;
	}

	@Override
	public boolean Domain(int xr) {
		for(int i = 1; i <= (this.N*this.N); i++){
			if(i == xr){
				return true;
			}
		}
		return false;
	}

	@Override
	public void Print() {
		for(int i = 0; i < this.N; i++){
			for(int j = 0; j < this.N; j++){
				if(x[i] == (i*this.N + j+1)){
					System.out.print(gr[i][j]  + " ");
					break;
				}
			}
		}
		
		System.out.println();
		this.count++;
	}
}
