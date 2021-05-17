package N_dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1325_timeover{
	static int N, M;
	static boolean[][] trust;
	static boolean[] hacked;
	static int[] dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		
		trust = new boolean[N+1][N+1];
		dp = new int[N+1];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			trust[Integer.valueOf(st.nextToken())][Integer.valueOf(st.nextToken())] = true;
		}
		int max =0;
		
		for(int i=1; i<=N; i++) {
			hacked = new boolean[N+1];
			max = Math.max(max, Calc(i));
		}
		
		for(int i=1; i<=N; i++) {
			if(dp[i]==max)
				System.out.print(i + " ");
		}
	}
	
	static int Calc(int com) {
		if(!hacked[com]) {
			hacked[com] =true;
			
			dp[com] = 1;
			
			for(int i=1; i<=N; i++) {
				if(!hacked[i] && trust[i][com]) {
					dp[com] += Calc(i);
				}
				
				
			}
			
			
			
			
			
		}
		return dp[com];
	}
}