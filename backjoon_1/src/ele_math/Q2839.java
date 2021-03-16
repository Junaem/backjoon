package ele_math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<=n/5;i++) {
			for(int j=0; j<=n/3; j++) {
				if(5*i + 3*j == n)
					arr.add(i+j);
			}
		}
		Collections.sort(arr);
		if(arr.isEmpty())
			System.out.println("-1");
		else
			System.out.println(arr.get(0));
	}
}
