package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932{
	static int[][] tri, ans;
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		tri = new int[n][n];
		ans = new int[n][n];
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<i+1; j++) {
				tri[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				ans[i][j] = 0;
			}
		}
		
		System.out.println(Tri(0, 0));
	}
	
	static int Tri(int ln, int num) {
		if(ln == n-1) {
			return tri[ln][num];
		}
		if(ans[ln][num]==0) {
			ans[ln][num] = Math.max(Tri(ln+1,num), Tri(ln+1,num+1)) + tri[ln][num];
		}
		return ans[ln][num];
	}
	
	
}