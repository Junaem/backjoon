package N_dynamic;
import java.io.*;
import java.util.*;

public class Q10942{
	static int N, M;
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=1; i<=N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(Fal(a,b) +"\n");
		}
		bw.close();
	}
	
	static int Fal(int a, int b) {
		boolean ok = true;
		int h = (b-a+1)/2;
		for(int i=0; i<h; i++) {
			if(!(arr[a+i] == arr[b-i])) {
				ok = false;
			}
		}
		if(ok == false)
			return 0;
		return 1;
		
	}
	
}