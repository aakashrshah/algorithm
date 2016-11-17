package backtracking;

public class AllBinaryString extends Backtracking implements ApplicationInteface{

	static int a0 = -1;
	
	public AllBinaryString(int n) {
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
		for(int item : x){
			System.out.print(item + " ");
		}
		System.out.println("");
	}

}
