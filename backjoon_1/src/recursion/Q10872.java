package recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10872{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int fact = Fact(n);
		System.out.println(fact);
	}
	public static int Fact(int n) {
		if(n<=1) return 1;
		return n* Fact(n-1);
	}
}