import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int N;
	static int[][] arr;
	static Integer[] dp;
	
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr= new int[N+1][2];
		dp = new Integer[N+1];
		StringTokenizer st;
		
		for(int i=1; i<N+1; i++) {
			st= new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Calc(0);
	}
	
	static int Calc(int day) {
		if(day<0) {
			return 0;
		}
		
		if(dp[day] ==null) {
			for(int i=day; i<N; i++)
			dp[day] = Math.max(Calc(i), Calc(day+arr[day][0]) +arr[day][1] );
		}
		
		return dp[day];
	}
}