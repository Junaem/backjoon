package ele_math2;
import java.io.IOException;
import java.util.Scanner;

public class Q1085{
	public static boolean[] arr =new boolean[10001];
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		int gr,sr;
		
			gr = Math.min(x, w-x);
			sr = Math.min(y, h-y);
			
			System.out.println(Math.min(gr, sr));
			
			
	}
}