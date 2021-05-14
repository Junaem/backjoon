import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int N, M;
	static boolean[][] trust;
	static int[] dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		
		trust = new boolean[N+1][N+1];
		dp = new int[N+1];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			trust[Integer.valueOf(st.nextToken())][Integer.valueOf(st.nextToken())] = true;
		}
		
		
	}
	
	static int Calc(int com) {
		if(dp[com]==0) {
			
			
			
			
			
			
		}
		return dp[com];
	}
}