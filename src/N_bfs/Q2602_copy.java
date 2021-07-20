package N_bfs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2602_copy{
	static int node[][];
	static boolean visit[];
	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int M = sc.nextInt();
		node = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			node[a][b] = node[b][a] = 1;
		}
		BFS(1);
		
	}
	
	
	
	
	static void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		
		visit[start] = true;
		q.offer(start);
		int cnt =0; 
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			
			for(int i=1; i<N; i++) {
				if(node[tmp][i]==1 && !visit[i]) {
					q.offer(i);
					visit[i] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}