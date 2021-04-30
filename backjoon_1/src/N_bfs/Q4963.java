package N_bfs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q4963{
	static int W, H, cnt;
	static boolean[][] map;
	static int[] wArr = new int[] {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] hArr = new int[] {-1, 0, 1, -1, 1, -1, 0, 1};
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			W = sc.nextInt();
			H = sc.nextInt();			
			if(W==0 && H==0)
				break;
			map = new boolean[W][H];
			cnt=0;
			
			for(int i=0; i<H; i++)
				for(int j=0; j<W; j++)
					if(sc.nextInt()==1)
						map[j][i] = true;
			
			for(int i=0; i<W; i++)
				for(int j=0; j<H; j++)
					if(map[i][j]) {
						cnt++;
						Check(i, j);
					}
			System.out.println(cnt);
						
		}
	}
	
	
	static void Check(int w, int h) {
		
		for(int i=w-1; i<=w+1; i++) 
			for(int j=h-1; j<=h+1; j++) {
				if(0>i || 0>j || i>=W || j>=H)
					continue;
				
				if(map[i][j]) {
					map[i][j]=false;
					Check(i,j);
				}
			}
				
			
		return;
	}
}