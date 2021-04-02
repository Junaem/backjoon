package backtracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14888{
	public static int[] arr;
	public static int[] sig = new int[4];
	public static int n, count, max, min;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		count =0;
		max =-1000000000; 
		min =1000000000;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<4; i++) {
			sig[i] = Integer.parseInt(st.nextToken());
			count += sig[i];
		}
		Calc(arr[0], 0);
		System.out.println(max);
		System.out.println(min);
		
	}
	
	public static void Calc(int answer, int cnt) {
		if(cnt == count) {
			if(answer>max)
				max = answer;
			if(answer<min)
				min = answer;
			return;
		}
		
		for(int i=0; i<4; i++) {
			if(sig[i]!=0) {
				sig[i]--;
				int temp =0;
				if(i==0) {
					temp = answer + arr[cnt+1];
					Calc(temp, cnt+1);
				}else
				if(i==1) {
					temp = answer - arr[cnt+1];
					Calc(temp, cnt+1);
				}else
				if(i==2) {
					temp = answer * arr[cnt+1];
					Calc(temp, cnt+1);
				}else
				if(i==3) {
					if(answer<0) {
						temp = -((-answer)/arr[cnt+1]);
					}else {
					temp = answer / arr[cnt+1];
					}
					Calc(temp, cnt+1);
				}
				sig[i]++;
			}
		}
		
		
		
		
		
	}
}