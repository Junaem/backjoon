package N_bfs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2644{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer>[] arr = new ArrayList[N+1];
		int[] dp = new int[N+1];
		
		for(int i=1; i<=N; i++)
			arr[i] = new ArrayList<Integer>();
		
		for(int i=0; i<M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x].add(y);
			arr[y].add(x);
		}
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(A);
		dp[A] =0;
		int cnt =0; 
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			
			for(int i : arr[tmp]) {
				if(dp[i]!=0)
					continue;
				dp[i] = dp[tmp]+1;
				if(i==B) {
					System.out.println(dp[B]);
					System.exit(0);
				}
				q.offer(i);
			}
			
		}
		System.out.println(-1);
		
	}
}