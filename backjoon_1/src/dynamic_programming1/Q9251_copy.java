package dynamic_programming1;
import java.io.*;

public class Q9251_copy{
	
	static char[] StrA, StrB;
	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		StrA = new char[a.length()];
		StrB = new char[b.length()];
		dp = new Integer[a.length()][b.length()];
		
		for(int i=0; i<a.length(); i++) {
			StrA[i] = a.charAt(i);
		}
		for(int i=0; i<b.length(); i++) {
			StrB[i] = b.charAt(i);
		}

		System.out.println(Calc(a.length()-1, b.length()-1));
	}
	
	static int Calc(int A, int B) {

		if(A <0 || B<0) {
			return 0;
		}
		
		if(dp[A][B] == null) {
			dp[A][B] = 0;
			
			if(StrA[A] == StrB[B]) 
				dp[A][B] = Calc(A-1, B-1)+1;
			
			else
				dp[A][B] = Math.max(Calc(A-1,B), Calc(A, B-1));
		}
		return dp[A][B];
	}
}