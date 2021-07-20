package N_dynamic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1520_my_fail{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[][] map = new int[m+1][n+1];
		int[][] dp = new int[m+1][n+1];
		
		for(int i=1; i<m+1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<n+1; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[1][1] = 1;
		
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(map[i-1][j]>map[i][j])
					dp[i][j]+=dp[i-1][j];
				if(map[i][j-1]>map[i][j])
					dp[i][j]+=dp[i][j-1];
				if(i+1<m+1 && map[i+1][j]>map[i][j] )
					dp[i][j]+=dp[i+1][j];
				if(j+1<n+1 && map[i][j+1]>map[i][j])
					dp[i][j]+=dp[i][j+1];
			}
		}
		System.out.print(dp[m][n]);
	}
}