package N_dynamic;
import java.util.Scanner;

public class Q11057{
	static int n;
	static Long[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new Long[10][n+1];
		
		for(int i=0 ;i<10; i++) {
			dp[i][0] = 1l;
		}
		
		System.out.println(Calc(9, n));
	}
	
	static long Calc(int a, int jr) {
		
		if(dp[a][jr]==null) {
			dp[a][jr] = 0l;
			for(int i=0; i<10; i++) {
				if(a>=i) {
					dp[a][jr] += Calc(i, jr-1);
				}
			}
		
		}
		return dp[a][jr]%10007;
	}
}