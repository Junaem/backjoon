package N_dynamic;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1965{
	static int N;
	static int[] arr, dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr = new int[N];
		dp = new int[N];
		int max =1;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
					max = Math.max(max, dp[i]);
				}
			}
		}
		bw.write(max + "");
		bw.close();
	}
}