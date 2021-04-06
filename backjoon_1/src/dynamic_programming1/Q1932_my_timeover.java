package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932_my_timeover{
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
		ans[0][0] = tri[0][0];
		int triMax =0;
		
		for(int i=0; i<n; i++) {
			triMax = Math.max(triMax, Tri(n-1, i));
		}
		System.out.println(triMax);
	}
	
	static int Tri(int ln, int num) {
		if(ans[ln][num]==0) {
			if(ln == 1) {
				ans[ln][num] = ans[0][0] + tri[ln][num];
			}
			else if(num-1>=0)
				ans[ln][num] = Math.max(Tri(ln-1,num-1) + tri[ln][num], Tri(ln-1, num) + tri[ln][num]);
			else if(num-1<0)
				ans[ln][num] = Tri(ln-1, 0) + tri[ln][num];
		}
		return ans[ln][num];
	}
	
	
}