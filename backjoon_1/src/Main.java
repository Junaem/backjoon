import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		int[] dp = new int[100001];
		
		q.offer(N);
		
		while(!q.isEmpty()) {
			int n = q.poll();
			
			if(n==K) {
				System.out.println(dp[n]);
				System.exit(0);
			}
			int[] arr = new int[] {n-1, n+1, n*2};
			
			for(int i=0; i<3; i++) {
				if(arr[i]>=0 && arr[i]<=100000 && dp[arr[i]]==0) {
					dp[arr[i]] = dp[n] +1;
					q.offer(arr[i]);
				}
			}
			
			
			
			
		}
		
	}
}