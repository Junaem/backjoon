package N_bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11725_memory{
	static int N;
	static boolean[][] node;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		node = new boolean[N+1][N+1];
		
		for(int i=0; i<N-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			node[a][b] = true;
			node[b][a] = true;
		}
		
		for(int i=2; i<=N; i++)
			Find(i);
		
		System.out.println(sb);
	}
	
	static void Find(int m) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(1);
		
		while(!q.isEmpty()) {
			int n = q.poll();
			
			for(int i=1; i<=N; i++) {
				if(node[n][i] && i==m) {
					sb.append(n).append('\n');
					return;
				}
				else if(node[n][i])
					q.offer(i);
			}
			
		}
		
	}
	
	
}