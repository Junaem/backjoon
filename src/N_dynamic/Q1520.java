package N_dynamic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1520{
	static int[][] map, dp;
	static int M, N;
	static int[] mA = {-1, 0, 1, 0};
	static int[] nA = {0, -1, 0, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[M+1][N+1];
		dp = new int[M+1][N+1];
		
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
		
		int hgt = map[m][n];
		
		if(dp[m][n]==-1) {
			dp[m][n]=0;
			for(int i=0; i<4; i++) {
				int nM = m+mA[i];
				int nN = n+nA[i];
				
				if(nM*nN<0 || nM>M || nN>N)
					continue;
				
				if(hgt<map[nM][nN])
					dp[m][n] += Calc(nM, nN);
				
				
			}
			
			
		}
		
		return dp[m][n];
	}
}