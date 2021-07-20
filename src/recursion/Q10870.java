package recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10870{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int fact = pivo(n);
		System.out.println(fact);
	}
	public static int pivo(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return  pivo(n-2)+pivo(n-1);
	}
}