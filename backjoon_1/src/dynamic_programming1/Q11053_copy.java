package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11053_copy{
	static int n;
	static int[] arr;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
	
		
		int max =0;
		for(int i=0; i<n; i++) {
			max = Math.max(Calc(i), max);
		}
		System.out.println(max);
	}
	
	
	static int Calc(int whr) {
		if(dp[whr]==null) {
			dp[whr] = 1;
			
			for(int i=whr-1; i>=0; i--) {
				if(arr[i]<arr[whr])
					dp[whr] = Math.max(dp[whr], Calc(i) +1);
			}
		}
		return dp[whr];
	}
}