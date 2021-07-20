package N_bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1012{
	static int M,N,K;
	static int[] mP = new int[] {-1, 0, 1, 0};
	static int[] nP = new int[] {0, -1, 0, 1};
	static boolean[][] map;
	static StringTokenizer st;
	static BufferedReader br;
	
	
	public static void main(String[] args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			map = new boolean[M][N];
			
			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int m = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				map[m][n] = true;
			}
		System.out.println(Calc());
			
		}
	}
	
	static int Calc() {
		Queue<int[]> q = new LinkedList<>();
		int cnt =0;
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(!map[i][j])
					continue;
				int[] arr= new int[]{i,j};
				q.offer(arr);
			}
		}
		
		while(!q.isEmpty()) {
			int[] nArr = q.poll();
			
			int m= nArr[0];
			int n= nArr[1];
			if(!map[m][n])
				continue;
			Ctp(m, n);
			cnt++;
			
		}
		return cnt;
	}
	
	static void Ctp(int m, int n) {
		if(!map[m][n])
			return;
		map[m][n] = false;
		for(int i=0; i<4; i++) {
			int nM = m+mP[i];
			int nN = n+nP[i];
			if(nM>=0 && nN>=0 && nM<M && nN<N)
				Ctp(nM, nN);
			
		}
	}
}