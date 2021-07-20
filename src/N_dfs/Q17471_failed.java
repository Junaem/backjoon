package N_dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q17471_failed{
	static int N, tmp, min;
	static int sum = 0;
	static int[] Pop;
	static boolean[][] node;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		Pop = new int[N+1];
		visit = new boolean[N+1];
		node = new boolean[N+1][N+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=1; i<=N; i++) {
			int pop = Integer.parseInt(st.nextToken());
			Pop[i] = pop;
			sum +=pop;
		}
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				node[i][a] = true;
			}
		}
		min = Integer.MAX_VALUE;
		
		for(int i=1; i<=N; i++) {
			for(boolean a : visit)
				a = false;
			tmp=0; 
			
			Calc(i);
		}
		System.out.println(min);
		
	}
	static void Calc(int whr) {
		if(visit[whr])
			return;
		
		visit[whr] = true;
		tmp+= Pop[whr];
		min = Math.min(min, Math.abs((sum-tmp)-tmp) );
		
		for(int i=1; i<=N; i++) {
			if(node[whr][i])
				Calc(i);
		}
		visit[whr] = false;
		tmp-= Pop[whr];
		
	}
	
	
}