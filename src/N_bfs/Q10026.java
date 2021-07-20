package N_bfs;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q10026{
	static int N;
	static char[][] arr, arr2;
	static boolean[][] visit;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		arr2= new char[N][N];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				arr[i][j] = str.charAt(j);
				if(arr[i][j] == 'G')
					arr2[i][j] = 'R';
				else
					arr2[i][j] = arr[i][j];
			}
		}
		bw.append(Check(arr)+" ").append(Check(arr2)+"");
		bw.flush();
		bw.close();
	}
	
	static int Check(char[][] ar) {
		visit = new boolean[N][N];
		int rtn =0;
		
		for(int i=0; i<N; i++) {
			for(int j =0; j<N; j++) {
				if(!visit[i][j]) {
					Area(ar, i, j);
					rtn++;
				}
			}
		}
		return rtn;
	}
	
	
	static int[] xm = new int[] {-1, 0, 1, 0};
	static int[] ym = new int[] {0, -1, 0, 1};
	
	static void Area(char[][] ar, int a, int b) {
		
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(a, b));
		visit[a][b] = true;
		
		while(!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.peek().y;
			q.poll();
			
			for(int i=0; i<4; i++) {
				int nx = x + xm[i];
				int ny = y + ym[i];
				
				if(nx>=0 && ny>=0 && nx<N && ny<N) {
					if(!visit[nx][ny]) {
						if(ar[nx][ny] == ar[a][b]) {
							q.add(new Point(nx, ny));
							visit[nx][ny] = true;
						}
					}
				}
			}
		}
	}
	
	
	
}