import java.util.Scanner;
import java.util.ArrayList;

public class Main2{
	static StringBuilder sb;
	static StringBuilder prt = new StringBuilder();
	static int N, M;
	static ArrayList<Integer> arr = new ArrayList<>();
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M  = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			sb = new StringBuilder();
			Calc(i);
		}
		System.out.println(prt);
	}
	
	static void Calc(int n) {
		if(arr.size() == M) {
			prt.append(sb).append('\n');
			return;
		}
		
		
		for(int i=n+1; i<N; i++) {
		
		}
	}
	
}