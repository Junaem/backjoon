package N_dfs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1987{
	static int R, C;
	static Character[][] map;
	static int[] mr = {-1, 0, 1, 0};
	static int[] mc = {0, -1, 0, 1};
	static ArrayList<Character> arr = new ArrayList<>();
	static int ans =0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new Character[R][C];
		
		for(int i=0; i<R; i++) { 
			String str = br.readLine();
			for(int j=0; j<C; j++)
				map[i][j] = str.charAt(j);
		}
	
		dfs(0, 0);
		
		bw.write(ans+"");
		bw.flush();
		bw.close();
	}
	
	static void dfs(int r, int c) {
		
		arr.add(map[r][c]);
		
		ans = Math.max(ans, arr.size());
		
		for(int i=0; i<4; i++) {
			int nr = r+mr[i];
			int nc = c+mc[i];
			
			if(nr>=0 && nc>=0 && nr<R && nc<C) 
				if(!arr.contains(map[nr][nc])) {
					dfs(nr, nc);
					arr.remove(arr.size()-1);
				}
			
			
		}
		
		return;
	}
	
	
	
}