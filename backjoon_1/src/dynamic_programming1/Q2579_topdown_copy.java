package dynamic_programming1;
import java.io.*;

public class Q2579_topdown_copy{
	
	static int n;
	static int[] stair;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		stair = new int[n+1];
		dp = new Integer[n+1];
		
		for(int i=1; i<n+1; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = stair[0];
		dp[1] = stair[1];

		if(n>=2) {
			dp[2] = stair[1] + stair[2];
		}
		System.out.println(Calc(n));
	}
	
	static int Calc(int num) {

		if(dp[num] == null) {
			dp[num] = Math.max(Calc(num-2), Calc(num-3) + stair[num-1]) + stair[num];
		}
		return dp[num];
	}
	

}