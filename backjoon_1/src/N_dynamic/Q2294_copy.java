package N_dynamic;

import java.util.Scanner;

public class Q2294_copy{
	static int N, K;
	static int[] arr;
	static int[] dp;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		arr = new int[N];
		dp = new int[K+1];
		
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<K+1; i++) {
			dp[i] = 10001;
		}
		dp[0] =0;
		
		for(int i=0; i<N; i++) {
			for(int j= arr[i]; j<K+1; j++) {
				dp[j] = Math.min(dp[j], dp[j - arr[i]]+1);
			}
		}
		
		if(dp[K]==10001)
			dp[K] = -1;
		System.out.println(dp[K]);
		
		
	}
	
	
}