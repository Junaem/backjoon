package sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2750_my2{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		for(int i=0; i<n; i++) {
			int a= Integer.parseInt(br.readLine());
			arr.add(a);
		}
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(arr.get(i)>arr.get(j)) {
					int chair = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, chair);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i : arr)
			sb.append(i).append('\n');
		System.out.println(sb);
	}
}