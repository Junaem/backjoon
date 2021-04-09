package dynamic_programming1;
import java.io.*;

public class Q2156_copy{
	static int num;
	static int[] arr;
	static Integer[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		arr = new int[num+1];
		dp = new Integer[num+1];
		
		for(int i=1; i<num+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		
		if(num>1) 
			dp[2] = arr[1] + arr[2];
		
		System.out.println(Drink(num));
	}
	
	static int Drink(int n) {
		if(dp[n]==null) {
			
				dp[n] = Math.max(Math.max(Drink(n-2),Drink(n-3) +arr[n-1])+arr[n],Drink(n-1));
			
		}
		
		return dp[n];
		
	}
}