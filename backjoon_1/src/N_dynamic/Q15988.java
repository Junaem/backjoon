package N_dynamic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15988{
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		int max =0;
		for(int t=0; t<T; t++) {
			arr[t]= Integer.parseInt(br.readLine());
			max = Math.max(max, arr[t]);
		}
		long[] dp = new long[max+1];
		dp[1] = 1l;
		dp[2] = 2l;
		dp[3] = 4l;
		for(int i=4; i<=max; i++) {
			dp[i] = (dp[i-1] + dp[i-2] + dp[i-3])%1000000009;
		}
		
		for(int i=0; i<T; i++)
			System.out.println(dp[arr[i]]);
		
	}
}