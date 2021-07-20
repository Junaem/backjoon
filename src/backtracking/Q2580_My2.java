package backtracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2580_My2{
	public static int[][] board = new int[9][9];
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0; j<9; j++) {
				board[j][i] = Integer.parseInt(st.nextToken());
				
			}
		}
		Sudoku(0, 0);
	}
	
	
	public static void Sudoku(int x, int y) {
		
		if(x==9) {
			for(int i=0; i<9; i++) {
				sb.append(board[i][y]).append(' ');
			}
			sb.append('\n');
			Sudoku(0, y+1);
			return;
		}
		if(y==9) {
			System.out.println(sb);
			System.exit(0);
		}
		
		if(board[x][y]==0){

			for(int k=1; k<=9; k++) {
				boolean able = true;
				
				for(int i=0; i<9; i++) {
					if(board[i][y]==k || board[x][i]==k)
						able=false;
				}
				
				int a = x-x%3;
				int b = y-y%3;
				for(int i=a; i<a+3; i++) {
					for(int j=b; j<b+3; j++) {
						if(board[i][j]==k)
							able = false;
					}
				}
				if(able) {
					board[x][y] = k;
					Sudoku(x+1, y);
				}
			}
		}
		Sudoku(x+1, y);
	}
}