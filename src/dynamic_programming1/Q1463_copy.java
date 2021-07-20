package dynamic_programming1;
import java.util.Scanner;

public class Q1463_copy{
	static int n;
	static Integer[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		dp = new Integer[n+1];
		dp[0] = dp[1] = 0;
		
		System.out.println(Calc(n));
	}
	
	
	static int Calc(int n) {

		if(dp[n]==null) {
			
			if(n%6==0) {
				dp[n] = Math.min(Calc(n-1), Math.min(Calc(n/3), Calc(n/2))) + 1;
			}
			else if(n%3==0) 
				dp[n] = Math.min(Calc(n/3),Calc(n-1)) + 1;
			else if(n%2==0) 
				dp[n] = Math.min(Calc(n/2),Calc(n-1)) + 1;
			else
				dp[n] = Calc(n-1) +1;
		}
		return dp[n];
	}
}