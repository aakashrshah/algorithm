package backtracking;

public class AllSubset extends Backtracking implements ApplicationInteface{ 


	static int a0 = -1;
	
	public AllSubset(int n) {
		//Backtrack(a0,N,r);
		super(a0,n,0);
		Backtrack();
	}

	@Override
	public boolean Bound(int[] x2, int r2) {
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
		System.out.print("{");
		for(int i = 0; i < N;i++){
			if(x[i] == 1){
				System.out.print(i + " ");
			}
		}
		System.out.print("}");

		System.out.println("");
	}

}
