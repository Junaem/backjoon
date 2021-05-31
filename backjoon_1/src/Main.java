import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static final int max_val = 401, max_int = 21;
	public static int n, shark_x, shark_y, min_dist, min_x, min_y, result, eat_cnt = 0, shark_size =2;
	public static int[][] map, check;
	public static int[] dx = {0, 0, 1, -1}, dy = {-1, 1, 0, 0};
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		check = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; i<=n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(map[i][j]==9) {
					shark_x= i;
					shark_y= j;
					map[i][j]=0;
				}
			}
		}
		
		while(true) {
			init_check();
			
			bfs(shark_x, shark_y);
			
			if(min_x != max_int && min_y != max_int) {
				result += check[min_x][min_y];// 체크가 가는데 필요한 시간
				
				eat_cnt++;
				
				if(eat_cnt == shark_size) {
					shark_size++;
					eat_cnt =0;
				}
				
				map[min_x][min_y]=0;
			}
		}
	}
}