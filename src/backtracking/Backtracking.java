package backtracking;

public abstract class Backtracking{
	
	int r  = 0;
	int N = 5;
	static int[] x;
	int a0;
	
	public Backtracking(int a0,int n,int r){
		this.a0 = a0;
		this.N = n;
		this.r = r;
		x = new int[this.N];
	}
	
	
	public void Backtrack(){
		for(int i=0;i<N;i++){
			x[i] = a0;
		}
		
		while(r > -1){
			getNext(x,r);
			if(x[r] == a0){
				r -= 1;
			}
			else if(r == N-1){
				Print();
			}
			else{
				r += 1;	
			}
			
		}
	}
	
	public void getNext(int[] x2, int r2){
		x2[r2] += 1;
		while(Domain(x2[r2])){
			if(Bound(x2,r2)){
				x = x2;
				return;
			}else{
				x2[r2] += 1;
			}
		}
		x[r2] = a0;
	}


	protected abstract boolean Bound(int[] x2, int r2);
	protected abstract boolean Domain(int i);
	protected abstract void Print();

	
}
