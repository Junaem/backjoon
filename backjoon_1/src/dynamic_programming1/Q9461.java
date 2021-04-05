package dynamic_programming1;
import java.io.IOException;
import java.util.Scanner;

public class Q9461{
	
	static long [] dp = new long[101];
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		
		for(int i=6; i<dp.length; i++) {
			dp[i] = 0;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			Pado(n);
			sb.append(Pado(n)).append('\n');
		}
		
		System.out.println(sb);
	}
	
	static long Pado(int n) {
		
		if(dp[n]==0) {
			dp[n] = Pado(n-1) + Pado(n-5);
		}
		return dp[n];
		
	}
}