package ele_math2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			boolean sosu =true;
			if(a==1)
				sosu = false;
			for(int j=2; j<a;j++ ) {//a를 a의 제곱근까지만, 즉 Math.sqrt(a)로 해도 됨
				if(a%j==0) {
					sosu = false;
					break;
				}
			}
			if(sosu)
				cnt++;
		}
		System.out.println(cnt);
		
	}
}
