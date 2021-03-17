package ele_math2;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1929{
	
	static boolean isPrm(int a) {
		for(int i=2; i*i<=a; i++) {
			if(a%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		
		for(int i=n+1; i<=2*n; i++) {
			if(isPrm(i))
				System.out.println(i);
		}
		
	}
}