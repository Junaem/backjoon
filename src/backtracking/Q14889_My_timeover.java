package backtracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14889_My_timeover{
	public static int n;
	public static int min = 1000000000;
	public static int[][] stats;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		stats = new int[n][n];
		teamA = new boolean[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<n; j++) {
				stats[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		Team(0, 0);
		System.out.println(min);
	}
	
	public static boolean[] teamA;
	
	public static void Team(int mem, int start) {
		if(mem==n/2) {
			gapCalc();
			return;
		}
		for(int i=start; i<n; i++) {
			if(!teamA[i]) {
				teamA[i] = true;
				Team(mem+1, start+1);
				teamA[i] = false;
			}
		}
	}
	public static void gapCalc() {
		
		int APoint =0;
		int BPoint =0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(teamA[i] && teamA[j]) {
					APoint+= stats[i][j];
					APoint+= stats[j][i];
				}
				else if(!teamA[i] && !teamA[j]) {
					BPoint+= stats[i][j];
					BPoint+= stats[j][i];
				}
			}
		}
		int gap = Math.abs(APoint - BPoint);
		if(gap == 0) {
			System.out.println(0);
			System.exit(0);
		}

		min = Math.min(gap, min);
		return;
	}
	
}