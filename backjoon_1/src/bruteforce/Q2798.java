package bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2798{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		
		st1 = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<n; i++) 
			arr.add(Integer.parseInt(st1.nextToken()));
		
		br.close();
		for(int i : arr) {
			int sum =i;
			
			for(int j: arr) {
				if(j!=i) {
					sum+=j;
					
					for(int k: arr) {
						if(k!=i && k!=j) {
						sum+=k;
						answer.add(sum);
						sum-=k;
						}
					}
					sum-=j;
				}
			}
		}
		answer.sort(null);
		
		for(int i=answer.size()-1;i>=0; i--) {
			if(answer.get(i)<=m) {
				System.out.println(answer.get(i));
				break;
			}
		}
	}
}