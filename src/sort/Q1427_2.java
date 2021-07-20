package sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1427_2{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] cnt = new int[10];
	
		while(n>0) {
			int a = n%10;
			cnt[a]++;
			n/=10;
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=9; i>=0; i--) {
			for(int j=cnt[i]; j>0; j--) {
				sb.append(i);
			}
		}
		System.out.println(sb);
	}
}