package sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2108{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int sum =0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / (double)n;
		System.out.println(Math.round(avg));
		
		System.out.println(arr[n/2]);
		
		int[] cnt = new int[8001];
		for(int i : arr) {
			cnt[i+4000]++;
		}
		int cbs =0;
		for(int i=0; i<8001; i++) {
			if(cnt[i]>cbs){
				cbs=cnt[i];
			}
		}
		ArrayList<Integer> cbList = new ArrayList<>();
		for(int i=0; i<8001; i++) {
			if(cnt[i]==cbs)
				cbList.add(i-4000);
		}
		Collections.sort(cbList);
		if(cbList.size()>1)
			System.out.println(cbList.get(1));
		else
			System.out.println(cbList.get(0));
		
		
		System.out.println(arr[n-1]-arr[0]);
	}
}