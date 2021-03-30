package sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1427{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[(int)Math.log10(n)+1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = n%10;
			n/=10;
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i=arr.length-1; i>=0; i--)
			System.out.print(arr[i]);
	}
}