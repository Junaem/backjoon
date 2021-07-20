package N_dynamic;
import java.io.*;
import java.util.StringTokenizer;

public class Q11052_my{
	static int N;
	static int[] arr;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr = new int[N+1];
		dp = new int[N+1][N+1];
		
		for(int i=1; i<N+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max =0;
		for(int i=1; i<N+1; i++) {
			max = Math.max(max, Calc(i, i));
		}
		System.out.println(max);
	}
	
	static int Calc(int n, int ca) {
		if(ca>N) {
			return 0;
		}
		if(dp[n][ca]==0) {
			
			for(int i=n; i<N+1; i++) {
				dp[n][ca] = Math.max(dp[n][ca], Calc(i, ca+i)+ arr[n] );
			}
		}
		
		return dp[n][ca];
	}
}