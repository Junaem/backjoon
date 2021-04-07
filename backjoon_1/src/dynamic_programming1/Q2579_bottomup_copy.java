package dynamic_programming1;
import java.io.*;

public class Q2579_bottomup_copy{
	
	static int n;
	static int[] stair;
	static int[] dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		stair = new int[n+1];
		dp = new int[n+1];
		
		for(int i=1; i<n+1; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = stair[1];
		
		if(n>=2)
			dp[2] = stair[1] + stair[2];
		
		for(int i=3; i<=n; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + stair[i-1]) + stair[i];
		}
		System.out.println(dp[n]);
	}

}