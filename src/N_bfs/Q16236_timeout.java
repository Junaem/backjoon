package N_bfs;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16236_timeout{
	static int size = 2;
	static int N, fishes;
	static int need = 2;
	static int time =0;
	static int[][] map;
	static Point drr; 
	static int[] mX = {0, -1, 1, 0};
	static int[] mY = {-1, 0, 0, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		fishes =0;
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<N; j++) {
				map[j][i] = Integer.parseInt(st.nextToken());
				if(map[j][i] == 9)
					drr = new Point(j,i);
				else if(map[j][i]>0)
					fishes++;
			}
		}
		play();
	}
	
	static void play() {
		while(fishes>0)
			eat();
		System.out.println(time);
	}
	
	static void eat() {
		Point whr = search();
		if(whr.x==100) {
			fishes=0;
			return;
		}
		int sec = Math.abs(whr.x - drr.x) + Math.abs(whr.y-drr.y);
		time += sec;
		
		map[drr.x][drr.y] = 0; 
		map[whr.x][whr.y] = 9;
		drr = whr;
		need--;
		fishes--;
		if(need==0) {
			size++;
			need = size;
		}
	}
	
	static Point search() {
		Queue<Point> q = new LinkedList<>();	
		q.offer(drr);
		
		
		while(!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.peek().y;
			q.poll();
			for(int i=0; i<4; i++) {
				int nx = x+mX[i];
				int ny = y+mY[i];
				
				if(nx>=0 && ny>=0 && nx<N && ny<N) {
					if(map[nx][ny]<=size && map[nx][ny]!=9) {
						q.offer(new Point(nx, ny));
						if(map[nx][ny]!=0 && map[nx][ny]<size)
							return new Point(nx, ny);
					}
				}				
			}
			
		}
		return new Point(100, 100);
		
		
	}
}