package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11053_fail{
	static int n;
	static int[] arr;
	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		dp = new Integer[n][1001];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=1; i<1001; i++) {
			if(arr[n-1]>i)	
				dp[n-1][i] = 2;
			else
				dp[n-1][i] = 1;
		}
		
		int max =0;
		for(int i=0; i<n; i++) {
			max = Math.max(Calc(i, arr[i]), max);
		}
		System.out.println(max);
	}
	
	
	static int Calc(int whr, int pnt) {
		if(dp[whr][pnt]==null) {
			if(arr[whr]> pnt) {
				dp[whr][pnt] = Calc(whr+1, arr[whr])+1;
			}else
				dp[whr][pnt] = Calc(whr+1, pnt);
		}
		return dp[whr][pnt];
	}
}