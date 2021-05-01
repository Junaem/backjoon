package N_dynamic;
import java.math.BigInteger;
import java.util.Scanner;

public class Q2407{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		BigInteger rtn = new BigInteger("1");
		
		for(int i=n; i>n-m; i--) {
			BigInteger a = new BigInteger(String.valueOf(i));
			rtn = rtn.multiply(a);
		}
		for(int i=m; i>0; i--) {
			BigInteger a = new BigInteger(String.valueOf(i));
			rtn = rtn.divide(a);
		}
		System.out.println(rtn);
		
		
		
	}
}