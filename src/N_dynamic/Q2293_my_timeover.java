package N_dynamic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2293_my_timeover{
	static int n, k;
	static int cnt =0;
	static int[] coin;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		coin = new int[n];
		
		for(int i=0; i<n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		Calc(0,0);
		System.out.println(cnt);
	}
	
	static void Calc(int wc, int won) {
		if(won>=k) {
			if(won==k)
				cnt++;
			return;
		}
		
		for(int i=wc; i<n; i++) {
			Calc(i, won+coin[i]);
		}
		
		
		
	}
}