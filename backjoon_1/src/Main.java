import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	static int N; 
	static List<node>[] tree;
	static boolean visit[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		visit = new boolean[N+1][N+1];
		StringTokenizer st;
		
		for(int i=1; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
		}
		
	}
	
	class node {
		int n;
		int w;
		node(int n, int w){
			this.n = n;
			this.w = w;
		}
	}
}