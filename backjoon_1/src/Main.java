import java.io.*;

public class Main{
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
		
		System.out.println(Drink(0));
	}
	
	static int Drink(int n) {
		if(dp[n]==null) {
			dp[n] = Math.max(Drink(n+3) + dp[n+1], Drink(n+2));
		}
		
		return dp[n];
		
	}
}