package N_dynamic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1915_copy{
	static int N, M;
	static int[][] sqr, dp;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	sqr = new int[N][M];
    	dp = new int[N][M];
    	int max = 0;
    	
    	for(int i=0; i<N; i++) {
    		String str = br.readLine();
    		for(int j=0; j<M; j++) {
    			sqr[i][j] = dp[i][j] = str.charAt(j)-'0';
    			if(sqr[i][j]==1)
    				max =1;
    		}
    	}
    	
    	
    	for(int i=1; i<N; i++) {
    		for(int j=1; j<M; j++) {
    			if(sqr[i-1][j]==1 && sqr[i][j-1]==1 && sqr[i-1][j-1]==1) {
    				dp[i][j] = Math.min(dp[i-1][j],
    						Math.min(dp[i][j-1], dp[i-1][j-1]))+1;
    				max = Math.max(max, dp[i][j]);
    			}
    		}
    	}
    	System.out.println(max*max);
    }
    
}