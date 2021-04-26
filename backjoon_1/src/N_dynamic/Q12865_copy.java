package N_dynamic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12865_copy{
	static int N, K;
	static int[][] arr;
	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr= new int[N][2];
		dp = new Integer[N][K+1];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] =  Integer.parseInt(st.nextToken());
			arr[i][1] =  Integer.parseInt(st.nextToken());
		}
	
		System.out.println(Calc(N-1, K));
		
	}
	static int Calc(int i, int k) {
		
		if(i<0)
			return 0;
		
		if(dp[i][k] ==null) {
			
			if(arr[i][0]>k) {
				dp[i][k] = Calc(i-1, k);
			}else
				dp[i][k] = Math.max(Calc(i-1, k), Calc(i-1, k-arr[i][0]) + arr[i][1]);
			
			
		}
		return dp[i][k];
	}
	
	
}