package backtracking;
import java.util.Scanner;

public class Q15650{
	public static StringBuilder sb = new StringBuilder();
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		arr = new int[m];
		visit = new boolean[n];
		dfs(n, m, 0);
		System.out.println(sb);
		
	}
	
	public static void dfs(int n, int m, int depth) {
		if(depth==m) {
			for(int a : arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=0; i<n; i++) {
			if(depth==0) {
				arr[depth] = i+1;
				dfs(n,m, depth+1);
			}else if(i+1>arr[depth-1]){
				arr[depth] = i+1;
				dfs(n,m, depth+1);
			}
		}
		
		
			
	}
	
}