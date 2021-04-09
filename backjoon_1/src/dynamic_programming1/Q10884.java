package dynamic_programming1;
import java.util.Scanner;

public class Q10884{
	static int count = 0;
	static Long[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		dp = new Long[10][num+1];
		for(int i=0; i<10; i++) {
			dp[i][1] = 1l;
		}
		long sum=0;
		for(int i=1; i<10; i++){
			sum+= Stair(i,num);
		}
		System.out.println(sum % 1000000000);
	}
	
	static long Stair(int n, int cntD) {
		if(dp[n][cntD]==null) {
			if(n-1>=0 && n+1<10) {
				dp[n][cntD] = Stair(n-1, cntD-1) + Stair(n+1, cntD-1);
			}else if(n-1>=0) {
				dp[n][cntD]	= Stair(n-1, cntD-1);
			}else if(n+1<10) {
				dp[n][cntD]	= Stair(n+1, cntD-1);
			}
		}
		return dp[n][cntD]%1000000000;
	}
}