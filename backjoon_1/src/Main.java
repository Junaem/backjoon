import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		boolean[][] map = new boolean[N+1][M+1];
		int[][] dp = new int[N+1][M+1];
		int[] nP = new int[] {-1, 0, 1, 0};
		int[] mP = new int[] {0, -1, 0, 1};
		
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			for(int j=1; j<=M; j++) {
				if(str.charAt(j-1)=='1')
					map[i][j] = true;
			}
		}
		dp[1][1] = 1;
		Queue<Integer> q= new LinkedList<>();
		
		q.offer(1);
		q.offer(1);
		
		while(!q.isEmpty()) {
			int n = q.poll();
			int m = q.poll();
			
			if(n==N && m==M) {
				System.out.println(dp[n][m]);
				System.exit(0);
			}
			
			for(int i=0; i<4; i++) {
				int nN = n+ nP[i];
				int nM = m+ mP[i];
				
				if(nN>0 && nM>0 && nN<N+1 && nM<M+1) {
					if(map[nN][nM]) {
						dp[nN][nM]=dp[n][m]+1;
						map[nN][nM]=false;
						q.offer(nN);
						q.offer(nM);
					}
						
				}
				
			}
			
			
			
		}
		
		
	}
}