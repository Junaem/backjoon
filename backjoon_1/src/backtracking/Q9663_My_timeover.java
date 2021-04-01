package backtracking;
import java.util.Scanner;

public class Q9663_My_timeover{
	public static int n;
	public static int[][] board;
	public static int rtn =0;
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		board = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = 0;
			}
		}
		
		Queen(0, 0);
		System.out.println(rtn);
	}
	
	public static void Queen(int y, int qNo) {
		
		if(qNo==n) {
			rtn++;
			return;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=y; j<n; j++) {
				
				if(board[i][j]==0) {
					for(int k=0; k<n; k++) {
						board[i][k]++;
						board[k][j]++;
						if(i-k>=0 && j+k<n) 
							board[i-k][j+k]++;
						if(i+k<n && j+k<n)
							board[i+k][j+k]++;
					}
					Queen(j, qNo+1);
					
					for(int k=0; k<n; k++) {
						board[i][k]--;
						board[k][j]--;
						if(i-k>=0 && j+k<n) 
							board[i-k][j+k]--;
						if(i+k<n && j+k<n)
							board[i+k][j+k]--;
					}
				}
			}
		}
	}
}