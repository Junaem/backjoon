package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003{
	static int zero, one, zero_pl_one;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			fvnc(a);
			sb.append(zero).append(' ').append(one).append('\n');
		}
		System.out.println(sb);
	}
	
	
	static void fvnc(int n) {
		zero = 1;
		one =0;
		int zero_pl_one = 1;
		for(int i=0; i<n; i++) {
			zero = one;
			one = zero_pl_one;
			zero_pl_one = zero + one;
		}
	}
}