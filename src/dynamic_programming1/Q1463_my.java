package dynamic_programming1;
import java.util.Scanner;

public class Q1463_my{
	static int n;
	static int mCnt = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		Calc(n, 0);
		System.out.println(mCnt);
	}
	
	
	static void Calc(int num, int cnt) {
		if(cnt==mCnt)
			return;
		if(num==1) {
			mCnt = Math.min(cnt, mCnt);
			return;
		}
		
		if(num%3==0) {
			Calc(num/3, cnt+1);
		}
		if(num%2==0) {
			Calc(num/2, cnt+1);
		}
		Calc(num-1, cnt+1);
	}
}