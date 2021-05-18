import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
	static ArrayList<Integer>[] arr = new ArrayList[10001];
	static boolean[] visited = new boolean[10001];
	static int[] ans = new int[10001];
	static int cnt =0;
	
	public static void main(String[] args) {
		sc.init();
		
		new Main().solve();
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
		
		static String readLineReplace() {
			try {
				return br.readLine().replaceAll("\\s+", "");
			} catch (IOException e) {
			}
			return null;
		}
		
		static String next() {
			while(!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
				}
			}
			return st.nextToken();
		}
		
		static long nextLong() {
			return Long.parseLong(next());
		}
		
		static int nextInt() {
			return Integer.parseInt(next());
		}
		
		static double nextDouble()	{
			return Double.parseDouble(next());
		}
	}
}