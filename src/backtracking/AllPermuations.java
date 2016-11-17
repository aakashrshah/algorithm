package backtracking;

public class AllPermuations extends Backtracking implements ApplicationInteface{
	
	static int a0 = -1;
//	static int a0 = 0;
	
	public AllPermuations(int n) {
		super(a0, n, 0);
		Backtrack();
	}

	@Override
	public boolean Bound(int[] x2, int r2) {
		for(int i=0; i < r2; i++){
			if(x2[i] == x2[r2]){
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean Domain(int xr) {
		for(int i = 0; i < this.N; i++){
			if(i == xr){
				return true;
			}
		}
		return false;
		
//		for(int i = 1; i <= this.N; i++){
//			if(i == xr){
//				return true;
//			}
//		}
//		return false;
	}

	@Override
	public void Print() {
		for(int i = 0; i < this.N; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}


}
