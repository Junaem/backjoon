import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	public static int[][] map = new int[9][9];
	public static int[][] copy = new int[9][9];
	public static int[][] spread = new int[9][9];
	public static int N, M;
	public static int[] mR = {-1, 0, 1, 0};
	public static int[] mC = {0, -1, 0, 1};
	public static int ans =0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				copy[i][j] = map[i][j];
			}
		}
		makeWall(0);
		
		bw.write(ans + "\n");
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void makeWall(int cnt) {
		if(cnt ==3) {
			spreadVirus();
			countZero();
			return;
		}
		for(int i=1; i<=N; i++) {
			for(int j=1; i<=M; j++) {
				if(copy[i][j]==0) {
					copy[i][j] = 1;
					makeWall(cnt+1);
					copy[i][j] = 0;
				}
			}
		}
	}
	
	public static void spreadVirus() {
		Queue<Point> q = new LinkedList<Point>();
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {	//맵의 크기를 99로 한것을 여기서 spread할때 n, m으로 제한
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
}