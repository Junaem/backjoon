package ele_math2;
import java.io.IOException;
import java.util.Scanner;

public class Q9020{
	public static boolean[] arr =new boolean[10001];
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		PrmTime();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			int a = n/2;
			int b = n/2;
			
			while(true) {
				
				if(!arr[a] && !arr[b]) {
					System.out.println(a+" "+b);
					break;
				}
				a--;
				b++;
			}
			
		}
	}

	public static void PrmTime() {
		arr[0] = arr[1] = true;
		for (int i = 2; i <= Math.sqrt(arr.length); i++) {
			if (arr[i])
					continue;
			for (int j = i * i; j < arr.length; j += i) {
					arr[j] = true;
			}
		}
	}
}