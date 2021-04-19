import java.io.*;

public class Main{
	static String A,B;
	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		A = br.readLine();
		B = br.readLine();
		dp = new Integer[A.length()][B.length()];
		for(int i=0; i<B.length(); i++)
			dp[A.length()-1][i] = 1;
		
		int max =0;
		for(int i=0; i<A.length(); i++) {
			max = Math.max(max, Calc(i,0));
		}
		System.out.println(max);
	}
	
	static int Calc(int a, int b) {
		if(dp[a][b]==null) {
			dp[a][b] = 0;
			
			for(int i=b; i<B.length(); i++) {
				if(A.charAt(a)==B.charAt(i)) {
					if(i+1<B.length())
						dp[a][b] = Math.max(dp[a][b], Calc(a+1, i+1)+1);
					else
						dp[a][b] = 1;
				}
			}
		}
		
		return dp[a][b];
	}
}