package bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1018{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int bSize = n*m;
		int[][] board = new int[n][m];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		int nCnt=32;
		
		for(int i=0; i<=n-8; i++) {
			for(int j=0; j<=m-8; j++) {
				int cntW =0;
				
				for(int w=i; w<i+8; w++) {
					for(int h=j; h<j+8; h++) {
						if((w+h)%2==0 && board[w][h]=='W')
							cntW++;
						else if((w+h)%2==1 && board[w][h]=='B')
							cntW++;
					}
				}
				if(cntW>=32)
					cntW=64-cntW;
				
				if(cntW<nCnt)
					nCnt=cntW;
			}
		}
		System.out.println(nCnt);
		
		
	}
}