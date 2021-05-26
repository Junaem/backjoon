import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int N, M;
	static int[][] map;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		
		
		
		
		
	}
	
	static int[] WallP(){
		int n =0;
		int m =0;
		for(int i=0; i<N; i++)
			for(int j=0; j<M; j++) {
				if(map[i][j]==0) {
					n = i;
					m = j;
				}
			}
		
		int [] rtn = new int[] {n, m};
		return rtn;
	}
}