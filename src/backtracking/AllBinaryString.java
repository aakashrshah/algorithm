package backtracking;

public class AllBinaryString extends Backtracking implements ApplicationInteface{

	//x[i] = ith bit can be 0 or 1
	int count = 0;
	static int a0 = -1;
	
	public AllBinaryString(int n) {
		//Backtrack(a0,N,r);
		super(a0,n,0);
		Backtrack();
		System.out.println("Total Outcomes : " + count);
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
		this.count++;
	}

}
