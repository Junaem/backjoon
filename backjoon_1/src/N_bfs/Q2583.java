package N_bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2583{
	static int N, M, K;
	static boolean[][] arr;
	
	static void Devide(int x1, int y1, int x2, int y2){
		
		for(int i=x1; i<x2; i++) 
			for(int j=y1; j<y2; j++) 
				arr[i][j] = true;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		arr = new boolean[N][M];
		
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			Devide(x1, y1, x2, y2);
		}
		ArrayList<Integer> ans = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int area =1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++)
				if(!arr[i][j]) {
					ans.add(paint(i, j));
					area++;
				}
		}
		Collections.sort(ans);
		
		sb.append(area-1).append('\n');
		for(int i=0; i<area-1; i++) {
			sb.append(ans.get(i)).append(' ');
		}
		
		System.out.println(sb);
		
	}
	static int[] xM = new int[] {-1, 0, 1, 0};
	static int[] yM = new int[] {0, -1, 0, +1};
	
	static int paint(int x, int y) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		q.offer(y);
		int rtn = 0;
		
		while(!q.isEmpty()) {
			int a = q.poll();
			int b = q.poll();
			arr[a][b] = true;
			rtn++;
			
			for(int i=0; i<4; i++) {
				int nA = a+xM[i];
				int nB = b+yM[i];
				if(nA>=0 && nA<N && nB>=0 && nB<M)
					if(!arr[nA][nB]){
						q.offer(nA);
						q.offer(nB);
						arr[nA][nB] = true;		
					}
			}
			
			
		}
		
		
		return rtn;
	}
	
}