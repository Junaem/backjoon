package dynamic_programming1;
import java.io.*;

public class Q2579_my_timeover{
	
	static int n;
	static int[] stair, dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		stair = new int[n+1];
		dp = new int[n+1];
		
		for(int i=1; i<n+1; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		dp[n] = stair[n];
		
		System.out.println(Calc(0, 0));
	}
	
	static int Calc(int whr, int stk) {
		if(whr==n) {
			return dp[n];
		}
		
		if(whr+2>n) {
			if(stk==1)
				return -300;
			dp[whr] = Calc(whr+1, 1) + stair[whr];
		}
		else if(stk==1) {
			dp[whr] = Calc(whr+2, 0) + stair[whr];
		}else if(whr ==0 ) 
			dp[whr] = Math.max(Calc(whr+1, 0), Calc(whr+2, 0)) + stair[whr];
		else{
			dp[whr] = Math.max(Calc(whr+1, 1), Calc(whr+2, 0)) + stair[whr];
		}
		return dp[whr];
	}
	

}