package bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		System.out.println(Bhh(n));
	}
	public static int Bhh(int n) {
		int log = (int)Math.log10(n) +1;
		
		for(int i=n-log*9; i<n; i++) {
			int iSum = i;
			int j = i;
			while(j>=1) {
				iSum+=j%10;
				j/=10;
			}
			if(iSum==n)
				return i;
		}
		return 0;
	}
}