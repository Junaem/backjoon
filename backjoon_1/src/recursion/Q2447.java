package recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2447{
	static char[][] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		arr = new char[n][n];
		
		Star(0, 0, n, false);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
		
	}
	public static void Star(int x, int y, int n, boolean blank) {
		if(blank) {
			for(int i=x; i<x+n; i++) {//x범위
				for(int j=y; j<y+n; j++) //y범위
					arr[i][j] = ' ';
			}//각 배열을 블랭크로 채움
			return;//여기서 멈춤
		}
		if(n==1) {
			arr[x][y] = '*';
			return;
		}//1이면 무조건 
		
		int size = n/3;
		int cnt =0;
		for(int i=x; i< x+n; i+=size) {
			for(int j=y; j< y+n; j+=size) {
				cnt++;
				if(cnt==5) {//5번째칸, 빈칸= 블랭크가 트루
					Star(i, j, size, true);
				}else {
					Star(i, j, size, false);
				}
			}
		}
	}
}