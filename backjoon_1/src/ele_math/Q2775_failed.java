package ele_math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2775_failed {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];
		for(int i=0; i<15;i++) {
			arr[i][0]=1;
			arr[0][i]=i;
		}
		
		for(int te=0; te<t;te++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			for(int j=2; j<=k;j++) {
				for(int i=0; i<n;i++) {
					arr[j][i] +=arr[j][i-1]+arr[j-1][i];
				}
			}
			System.out.println(arr[k][n]);
		}
	}
}
