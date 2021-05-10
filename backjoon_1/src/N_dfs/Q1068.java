package N_dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1068{
	static int N, M;
	static boolean[][] node;;
	static boolean[] del, root;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		node = new boolean[N][N];
		del = new boolean[N];
		root = new boolean[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a==-1) {
				root[i]= true;
				continue;
			}
			node[a][i] = true;
		}
		
		M = Integer.parseInt(br.readLine());
		delM(M);
		System.out.println(Cnt());
	}
	
	static int Cnt() {
		
		int rtn =0;
		
		for(int i=0; i<N; i++) {
			boolean haveP = false;
			boolean haveC = false;
			
			if(del[i])
				continue;
			for(int j=0; j<N; j++) {
				if(del[j])
					continue;
				if(node[j][i]) {
					haveP = true;
				}
				if(node[i][j]) {
					haveC = true;
				}
			}
			if(haveP && !haveC)
				rtn++;
			else if(root[i] && !haveC)
				rtn++;

		}
		return rtn;
		
	}
	
	
	
	
	
	static void delM(int m) {
		del[m] = true;
		for(int i=0; i<N; i++) {
			
			if(node[m][i]) {
				delM(i);
			}
		}
	}
}