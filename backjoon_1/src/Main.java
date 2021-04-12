import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
	static int N;
	static int[][] arr;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		dp = new Integer[N];
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " "	);
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		int max =0;
		for(int i=0; i<N; i++)
			max = Math.max(max, Calc(i));
		System.out.println(N-max);
	}
	
	static int Calc(int whr) {
		if(dp[whr]==null) {

			dp[whr] = 1;

			for(int i= whr+1; i<N; i++) {
				if(arr[whr][1]< arr[i][1]) 
					dp[whr] = Math.max(dp[whr], Calc(i) +1);
			}
		}
		return dp[whr];
	}
}