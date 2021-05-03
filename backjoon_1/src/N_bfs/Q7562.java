package N_bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7562{
	static int N;
	static int map[][];
	static int[] mX = new int[] {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] mY = new int[] { 1, -1, 2, -2, 2, -2, 1, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			int o = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			Calc(n,m,o,p);
		}
	}
	
	static void Calc(int n, int m, int o, int p) {
		if(n==o && m==p) {
			System.out.println(0);
			return;
		}
		
		int[][] dp = new int[N][N];
		boolean[][] visit = new boolean[N][N];
		Queue<Integer> q= new LinkedList<>();
		dp[n][m] =0;
		q.offer(n);
		q.offer(m);
		
		while(!q.isEmpty()) {
			int a = q.poll();
			int b = q.poll();
			
			if(visit[a][b]) 
				continue;
			visit[a][b] = true;
			
			if(a==o && b==p) {
				System.out.println(dp[a][b]);
				return;
			}
			
			for(int i=0 ; i<8; i++) {
				int nA = a+mX[i];
				int nB = b+mY[i];
				
				if(0<=nA && nA<N && 0<=nB && nB<N) {
					q.offer(nA);
					q.offer(nB);
					dp[nA][nB] = dp[a][b]+1;
				}
			}
			
			
			
		}
		
		
		
	}
}