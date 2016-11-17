package graphs;

import inputs.GraphInput;

public class CompleteBiPartiteGraph {
	final static int SIZE = 5;
	public static void main(String args[]){
		GraphInput graph = new GraphInput(SIZE);
		int[][] graphmatrix = graph.getDummyGraph();
		graph.printGraph(graphmatrix);
		isCompleteBiPartite();
	}

	private static boolean isCompleteBiPartite() {
		
		return true;		
	}
	
	
}
