package N_dfs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1967_memory{
	static int N; 
	static int[][] node, dp;
	static boolean nvisit[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		node = new int[N+1][N+1];
		nvisit = new boolean[N+1][N+1];
		StringTokenizer st;
		
		for(int i=1; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			node[a][b]= c;
			node[b][a] = c;
			nvisit[a][b] = nvisit[b][a] = true;
		}
		
		System.out.println(Grem());
	}
	
	
	static int Grem() {
		int max = 0;
		
		for(int i=1; i<=N; i++) {
			int con = 0;
			
			for(int j=1; j<=N; j++) {
				if(node[i][j]>0)
					con++;
			}
			
			if(con>1)
				continue;
			max = Math.max(max, check(i));
		}
		return max;
	}
	
	static int cur=0;
	static int chmax=0;
	
	static int check(int n) {
		for(int i=1; i<=N; i++) {
			if(nvisit[n][i] && node[n][i]>0) {
				nvisit[n][i] = nvisit[i][n] = false;
				cur += node[n][i];
				chmax = Math.max(chmax, cur);
				check(i);
				cur -= node[n][i];
				nvisit[n][i] = nvisit[i][n] = true;
			}
		}
		
		return chmax;
	}
	
}