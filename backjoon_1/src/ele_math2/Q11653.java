package ele_math2;
import java.util.ArrayList;
import java.util.Scanner;

public class Q11653{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		ArrayList<Integer> prm	= new ArrayList<>();
		for(int i=2; i*i<=n;i++) {
			while(n%i==0) {
				System.out.println(i);
				n /=i;
			}
		}
		if(n!=1)
			System.out.println(n);
	}
}