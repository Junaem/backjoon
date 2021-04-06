package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149_copy{
	static int n;
	static int[][] House, Sum;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		House = new int[n][3];
		Sum = new int[n][3];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			House[i][0] = Integer.parseInt(st.nextToken());
			House[i][1] = Integer.parseInt(st.nextToken());
			House[i][2] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Sum[0][0] = House[0][0];
		Sum[0][1] = House[0][1];
		Sum[0][2] = House[0][2];
		
		System.out.println(Math.min(RGB(n-1, 0), Math.min(RGB(n-1,1), RGB(n-1,2))));
	}
	
	static int RGB(int house, int color) {
		if(Sum[house][color] == 0) {
			
			if(color == 0) {
				Sum[house][0] = Math.min(RGB(house-1,1), RGB(house-1,2)) + House[house][0];
			}else if(color == 1) {
				Sum[house][1] = Math.min(RGB(house-1,0), RGB(house-1,2)) + House[house][1];
			}else if(color == 2) {
				Sum[house][2] = Math.min(RGB(house-1,1), RGB(house-1,0)) + House[house][2];
			}
		}
		return Sum[house][color];
		
		
	}
	
}