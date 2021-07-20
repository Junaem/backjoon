package sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q11650_My{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr[0][0] = Integer.parseInt(st.nextToken());
		arr[0][1] = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=i-1; j>=0; j--) {
				if(arr[j][0]<x) {
					arr[j+1][0]=x;
					arr[j+1][1]=y;
					break;
				}else if(arr[j][0]==x && arr[j][1]>y) {
					arr[j+1][0] = arr[j][0];
					arr[j+1][1] = arr[j][1];
					arr[j][0] = x;
					arr[j][1] = y;
				}else {
					arr[j+1][0] = arr[j][0];
					arr[j+1][1] = arr[j][1];
					arr[j][0] = x;
					arr[j][1] = y;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
	
	}
}