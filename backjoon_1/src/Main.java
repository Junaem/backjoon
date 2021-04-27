import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[][] map, dp;
	static int M, N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[M+2][N+2];
		dp = new int[M+2][N+2];
		
		for(int i=1; i<M+1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<N+1; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		
		dp[1][1] = 1;
		
		System.out.print(Calc(M,N));
	}
	static int Calc(int m, int n) {
		if(m*n<1 || m>M || n>N)
			return 0;
		int hgt = map[m][n];
		
		if(dp[m][n]==-1) {
			dp[m][n]=0;
			if(hgt>map[m-1][n])
				dp[m][n] += Calc(m-1, n);
			if(hgt>map[m+1][n])
				dp[m][n] += Calc(m+1, n);
			if(hgt>map[m][n-1])
				dp[m][n] += Calc(m, n-1);
			if(hgt>map[m][n+1])
				dp[m][n] += Calc(m, n+1);
			
			
			
		}
		
		return dp[m][n];
	}
}