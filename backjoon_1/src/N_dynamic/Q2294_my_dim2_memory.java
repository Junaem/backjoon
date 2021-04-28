package N_dynamic;
import java.util.Scanner;

public class Q2294_my_dim2_memory{
	static int N, K;
	static int[] arr;
	static Integer[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		arr = new int[N];
		dp = new Integer[N][K+1];
		
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			dp[i][0] =0;
		}
		
		if(Calc(0,K)>=10001)
			System.out.println(-1);
		else
			System.out.println(Calc(0, K));
	}
	
	static int Calc(int n, int k) {
		
		if(dp[n][k]==null) {
			
			dp[n][k]= 10001;
			
			for(int i=n; i<N; i++) {
				if(k-arr[i]>=0) {
					dp[n][k] = Math.min(dp[n][k], Calc(i, k-arr[i]) + 1);
				}
			}
			
		}
		return dp[n][k];
	}
}