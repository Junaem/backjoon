import java.util.Scanner;

public class Main2{
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] arr;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M  = sc.nextInt();
		arr = new int[M];
		
		for(int i=0; i<M; i++)
			arr[i] = 0;
		
		for(int i=1; i<=N; i++) {
			Calc(i);
		}
		System.out.println(sb);
	}
	
	static void Calc(int n) {
		if(arr(M-1) != 0) {
			for(int i=0; i<M; i++) {
				sb.append(arr.get(i)).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		arr.add(n);
		
		for(int i=1; i<=N; i++) {
			if(!arr.contains(i)) {
				Calc(i);
			}
		}
		arr.remove(n);
	}
	
}