package backtracking;
import java.util.Scanner;

public class Q15649_2{
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] arr;
	static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M  = sc.nextInt();
		arr = new int[M];
		visit = new boolean[N+1];
		
		Calc(0);
		System.out.println(sb);
	}
	
	static void Calc(int m) {
		if(m==M) {
			for(int i=0; i<M; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=1; i<=N; i++) {
			if(visit[i]==false) {
				visit[i] = true;
				arr[m] = i;
				Calc(m+1);
				visit[i] = false;
			}
		}
	}
	
}