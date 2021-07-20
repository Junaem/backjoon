package ele_math2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2581 {
	
	public static void Primetime(int a, int b) {
		ArrayList<Integer> arr = new ArrayList<>();
		int sum =0; 
		
		for(int i=a; i<=b; i++) {
			boolean sosu = true;
			if(i==1)
				sosu = false;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					sosu = false;
					break;
				}
			}
			if (sosu)
				arr.add(i);
		}
		if(arr.size()==0) {
			System.out.println(-1);
		}else {
			for(int i=0;i<arr.size();i++) {
				sum+=arr.get(i);
			}
			arr.sort(null);
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
	
		Primetime(m,n);
		
	}
}
