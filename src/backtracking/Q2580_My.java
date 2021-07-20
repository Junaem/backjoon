package backtracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2580_My{
	public static int[][] board = new int[9][9];
	public static boolean[] xNine = new boolean[9];
	public static int cnt =0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0; j<9; j++) {
				board[j][i] = Integer.parseInt(st.nextToken());
				if(board[j][i]==0) {
					cnt++;
				}
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

			int count =0;
			int fFive = 45;
			for(int i=0; i<9; i++) {
				if(board[i][y]!=0) {
					count++;
					fFive -= board[i][y];
				}
			}
			if(count==8) {
				board[x][y]=fFive;
				Sudoku(x+1, y);
			}//여기까지 가로식
			
			count =0;
			fFive =45;
			for(int i=0; i<9; i++) {
				if(board[x][i]!=0) {
					count++;
					fFive -= board[x][i];
				}
			}
			if(count==8) {
				board[x][y]=fFive;
				Sudoku(x+1, y);
			}//세로식
			
			count=0;
			fFive =45;
			int a = x-x%3;
			int b = y-y%3;
			for(int i=a; i<a+3; i++) {
				for(int j=b; j<b+3; j++) {
					if(board[i][j]!=0) {
						count++;
						fFive -=board[i][j];
					}
				}
			}
			if(count==8) {
				board[x][y]=fFive;
				Sudoku(x+1, y);
			}
			
			
			
		}
		Sudoku(x+1, y);
	}
}