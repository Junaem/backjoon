package dynamic_programming1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11054{
	static int N;
	static int[] arr;
	static Integer[] Mdp, Pdp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		Mdp = new Integer[N];
		Pdp = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			Mdp[i] = 1;
			Pdp[i] = 1;
		}
		
		int max =0;
		for(int i=0; i<N; i++)
			max = Math.max(max, Calc(i));
		System.out.println(max);

	}
	static int Calc(int whr) {
		return mCalc(whr) + pCalc(whr) -1;
	}
	
	static int mCalc(int whr) {
		if(Mdp[whr]==1) {
			
			for(int i=whr-1; i>=0; i--) {
				if(arr[i]<arr[whr]) 
					Mdp[whr] = Math.max(Mdp[whr], mCalc(i)+1);
			}
		}
		return Mdp[whr];
	}
	static int pCalc(int whr) {
		if(Pdp[whr]==1) {
			
			for(int i=whr+1; i<N; i++) {
				if(arr[i]<arr[whr]) 
					Pdp[whr] = Math.max(Pdp[whr], pCalc(i)+1);
			}
		}
		return Pdp[whr];
	}
	
	
}