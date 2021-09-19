package backtracking;
import java.util.Scanner;

public class Q15649_x2{
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		arr = new int[m];
		visit = new boolean[n];
		dfs(n, m, 0);
	}
	
	public static void dfs(int n, int m, int depth) {
		if(depth == m) {
			for(int a : arr) {
				System.out.println(a + " ");
			}
			System.out.println();
			return;
		}
		for(int i=1; i<=n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i;
				dfs(n, m, depth+1);
				visit[i] = false;
			}
		}
		
	}
	
	
}