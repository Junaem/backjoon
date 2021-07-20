package N_dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1325_copy{
	static ArrayList<Integer>[] arr = new ArrayList[10001];
	static boolean[] visited = new boolean[10001];
	static int[] ans = new int[10001];
	static int cnt =0;
	
	void solve() {
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			arr[v1].add(v2);
		}
		
		int max =0;
		
		for(int i=1; i<=n; i++) {
			visited = new boolean[10001];
			dfs(i);
		}
		
		for(int i=1; i<=n; i++) {
			max = Math.max(max, ans[i]);
		}
		
		for(int i=1; i<=n; i++) {
			if(ans[i] == max)
				sb.append(i).append(' ');
		}
		System.out.println(sb);
	}
	
	public static void dfs(int i) {
		visited[i] = true;
		
		for(int a : arr[i]) {
			if(!visited[a]) {
				ans[a]++;
				dfs(a);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		sc.init();
		
		new Q1325_copy().solve();
	}
	
	static class sc{
		static BufferedReader br;
		static StringTokenizer st;
		
		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}
		
		static String readLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
			}
			return null;
		}
		
		static int nextInt() {
			while(!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
				}
			}
			return Integer.parseInt(st.nextToken());
		}
	}
}