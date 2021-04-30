package N_bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576{
	static int M, N;
	static int[][] arr;
	static int[] mAr = new int[] {-1, 0, 1, 0};
	static int[] nAr = new int[] {0, -1, 0, 1};
	static Queue<int[]> q, q2;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr= new int[M][N];
		q= new LinkedList<>();
		q2= new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++) {
				arr[j][i] = Integer.parseInt(st.nextToken());
				if(arr[j][i]==1)
					q2.offer(new int[]{j,i});
			}
		}
		
		
		int day=0;
		while(!q2.isEmpty()) {
			while(!q2.isEmpty())
				q.offer(q2.poll());
			Day();
			day++;
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j]==0) {
					System.out.println(-1);
					System.exit(0);
				}
			}
		}
		System.out.println(day-1);
	}
	
	static void Day() {
		
		while(!q.isEmpty()) {
			int[] arrr = q.poll();
			int m = arrr[0];
			int n = arrr[1];
			
			if(arr[m][n]==1) {
				for(int i=0; i<4; i++) {
					int nM = m+mAr[i];
					int nN = n+nAr[i];
					if(nM<0 || nN<0 || nM>=M || nN>=N) 
						continue;
					if(arr[nM][nN]==0) {
						arr[nM][nN]=1;
						q2.offer(new int[] {nM, nN});
					}
				}
			}
		}
		
		
		
	}
	
}