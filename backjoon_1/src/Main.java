import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		sc.close();
		long rtn =1l;
		
		for(long i=n; i>n-m; i--) {
			rtn*=i;
		}
		for(long i=m; i>0; i--)
			rtn/=i;
		System.out.println(rtn);
		
		
		
	}
}