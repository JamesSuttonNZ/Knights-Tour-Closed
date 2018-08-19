package part2;

import java.util.Arrays;

public class KnightsTourNode {
	
	private boolean[][] b;
	private int i;
	private int j;
	private int startI;
	private int startJ;
	private int n;
	private int k;
	private KnightsTourNode parent;
	private int[][] moves = new int[][] { {2,1},{2,-1},{1,2},{1,-2},{-1,2},{-1,-2},{-2,1},{-2,-1} };
	
	public KnightsTourNode(boolean[][] b, int i, int j, int startI, int startJ, int n, int k, KnightsTourNode parent){
		this.b = new boolean[n][n];
		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				this.b[row][col] = b[row][col];
			}
		}
		this.i = i;
		this.j = j;
		this.startI = startI;
		this.startJ = startJ;
		
		if(parent != null){
			this.b[i][j] = true;
		}
		
		this.n = n;
		this.k = k;
		this.parent = parent;
	}
	
	public boolean complete(){
		if(k == (n*n)+1){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public boolean completable() {
		if(k < n*n){
			for(int d = 0; d < 8; d++){
				int di = moves[d][0];
				int dj = moves[d][1];
				int idi = startI+di;
				int jdj = startJ+dj;
				if(0 <= idi && idi < n && 0 <= jdj && jdj < n && b[idi][jdj] == false){
					return true;
				}
			}
			return false;
		}else{
			return true;
		}
		
	}
	

	public KnightsTourNode getParent() {
		return parent;
	}

	public void setParent(KnightsTourNode parent) {
		this.parent = parent;
	}

	public boolean[][] getB() {
		return b;
	}

	public void setB(boolean[][] b) {
		this.b = b;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getStartI() {
		return startI;
	}

	public void setStartI(int startI) {
		this.startI = startI;
	}

	public int getStartJ() {
		return startJ;
	}

	public void setStartJ(int startJ) {
		this.startJ = startJ;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
}
