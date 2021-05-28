package N_dynamic;
import java.io.*;
import java.util.*;

public class Q11660_timeover{
	static int N, M;
	static int[][] map;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<=N; j++) {
				map[j][i] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(
				Calc(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())) +"\n"
			);
		}
		bw.close();
		
	}
	
	static int Calc(int x1, int y1, int x2, int y2) {
		int ans =0;
		
		for(int i=x1; i<=x2; i++) {
			for(int j=y1; j<=y2; j++) {
				ans+= map[i][j];
			}
		}
		
		
		return ans;
	}
	
}