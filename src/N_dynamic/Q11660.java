package N_dynamic;
import java.io.*;
import java.util.*;

public class Q11660{
	static int N, M;
	static int[][] map, dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		dp = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<=N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1] + map[i][j];
			}
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(
				Calc(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())) +"\n"
			);
		}
		bw.close();
		
	}
	
	static int Calc(int x1, int y1, int x2, int y2) {
		
		return dp[x2][y2]-dp[x2][y1-1]-dp[x1-1][y2]+dp[x1-1][y1-1];
	}
	
}