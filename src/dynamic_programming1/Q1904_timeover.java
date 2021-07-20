package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1904_timeover{
	
	static int n, one;
	static int count = 0;
	static boolean[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		arr= new boolean[n];
		Calc(0);
		System.out.println(count%15746);
		
	}
	
	static void Calc(int jrs) {
		if(jrs==n) {
			count++;
			return;
		}
		
		for(int i=0; i<2; i++) {
			if(i==0 && jrs+1<n) {
				Calc(jrs+2);
			}else if(i==1) {
				arr[jrs] = true;
				Calc(jrs+1);
				arr[jrs] = false;
			}
				
		}
		
		
	}
}