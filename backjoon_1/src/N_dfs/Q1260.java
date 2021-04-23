package N_dfs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1260{
	static int N, M;
	static boolean[][] con;
	static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int V = sc.nextInt();
		con = new boolean[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			con[a][b] = con[b][a] = true;
		}
		DFS(V);
		System.out.println();
		
		for(int i=0; i<N+1; i++) 
			visit[i] = false;
		
		BFS(V);
	}
	
	static void DFS(int n) {
		if(!visit[n]) {
			visit[n] = true;
			System.out.print(n +" ");
			for(int i=0; i<N+1; i++) {
				if(con[n][i] && !visit[i]) 
					DFS(i);
			}
		}
	}
	
	static void BFS(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		visit[n] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			
			System.out.print(temp+" ");
			
			for(int j=1; j<N+1; j++) {
				if(con[temp][j] && !visit[j]) {
					q.offer(j);
					visit[j] = true;
				}
			}
		}
	}
	
	
}