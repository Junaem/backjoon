package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9184{
	static int a, b, c;
	static int[][][] w = new int [101][101][101];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i=0; i<101; i++) {
			for(int j=0; j<101; j++) {
				for(int k=0; k<101; k++) {
					w[i][j][k] = -1;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if(a==-1 && b==-1 && c==-1) {
				System.out.println(sb);
				System.exit(0);
			}
			sb.append("w(" + a +", " + b + ", " + c+") = "+ w(a,b,c)).append('\n');
		}
	}
	
	static int w(int a, int b, int c) {
		if(w[a+50][b+50][c+50]!= -1) {
			return w[a+50][b+50][c+50];
		}
		
		if(a<=0 || b<=0 || c<=0) {
			w[a+50][b+50][c+50] = 1;
			return 1;
		}
		else if(a>20 || b>20 || c>20) {
			w[a+50][b+50][c+50] = w(20, 20, 20);
			return w(20,20,20);
		}
		else if(a<b && b<c) {
			w[a+50][b+50][c+50] = w(a,b,c-1) + w(a,b-1,c-1) - w(a, b-1, c);
			return w(a,b,c-1) + w(a,b-1,c-1) - w(a, b-1, c);
		}
		else {
			w[a+50][b+50][c+50] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
			return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		}
	}
	
}