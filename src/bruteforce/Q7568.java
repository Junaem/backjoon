package bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7568{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st= new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = 1;
			for(int j=0; j<i; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					arr[i][2]++;
				}else if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1]) {
					arr[j][2]+=1;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i][2]+" ");
		}
		
		
		
		
	}
}