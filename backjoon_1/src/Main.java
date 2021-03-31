import java.util.Scanner;

public class Main{
	public static StringBuilder sb = new StringBuilder();
	public static int n, m;
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		
		arr = new int[m];
		visit = new boolean[n];
		dfs(0);
		System.out.println(sb);
		
	}
	
	public static void dfs(int depth) {
		if(depth==m) {
			for(int a : arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=0; i<n; i++) {
			arr[depth] = i+1;
			dfs(depth+1);
		}
		
		
			
	}
	
}