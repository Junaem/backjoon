package N_bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11724{
	static int N,M;
	static int cnt =0;
	static boolean[][] node;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		node = new boolean[N+1][N+1];
		visit = new boolean[N+1];
		visit[0] = true;
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			node[a][b]= node[b][a] = true;
		}
		
		for(int i=1; i<N+1; i++)
			Calc(i);
		System.out.println(cnt);
	}
	
	static void Calc(int n) {
		if(visit[n])
			return;
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(n);
		cnt++;
		while(!q.isEmpty()) {
			int tmp = q.poll();
			
			for(int i=1; i<N+1; i++) {
				if(node[tmp][i] && !visit[i]) {
					visit[i] = true;
					q.offer(i);
				}
			}
			
			
			
		}
	}
}