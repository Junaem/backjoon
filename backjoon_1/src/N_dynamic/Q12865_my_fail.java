package N_dynamic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12865_my_fail{
	static int N, K;
	static int[][] arr;
	static Integer[] dp;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr= new int[N][2];
		visit = new boolean[N]; 
		dp = new Integer[K+1];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] =  Integer.parseInt(st.nextToken());
			arr[i][1] =  Integer.parseInt(st.nextToken());
		}
		
		dp[0] = 0;
	
		System.out.println(Calc(K));
		
	}
	static int Calc(int k) {
		
		if(dp[k] ==null) {
			dp[k] =0;
			for(int i=0; i<N; i++) {
				if(!visit[i] && k-arr[i][0]>=0) {
					visit[i] = true;
					dp[k] = Math.max(dp[k], Calc(k-arr[i][0]) + arr[i][1]);
					visit[i] = false;
				}
			}
		}
		return dp[k];
	}
	
	
}