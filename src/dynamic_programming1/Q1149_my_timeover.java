package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149_my_timeover{
	static int n;
	static int cMin = Integer.MAX_VALUE;
	static int[][] House;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		House = new int[n][3];
		
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			House[i][0] = Integer.parseInt(st.nextToken());
			House[i][1] = Integer.parseInt(st.nextToken());
			House[i][2] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<3; i++) {
			RGB(0, 0, i);
		}
		System.out.println(cMin);
	}
	
	static void RGB(int house, int cost, int color) {
		if(house==n) {
			cMin = Math.min(cMin, cost);
			return;
		}
		for(int i=0; i<3; i++) {
			if(i!=color && cost + House[house][i]<cMin)
				RGB(house+1, cost + House[house][i], i);
		}
		
		
	}
	
}