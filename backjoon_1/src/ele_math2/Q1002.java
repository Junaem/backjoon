package ele_math2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			double r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			double r2 = Integer.parseInt(st.nextToken());
			
			int X = x1-x2;
			int Y = y1-y2;
			double R = Math.sqrt(X*X + Y*Y);
			
			if(R==0 && r1==r2)
				System.out.println(-1);
			else if(R==0)
				System.out.println(0);
			else if(R<Math.abs(r1-r2))
				System.out.println(0);
			else if(R==Math.abs(r1-r2))
				System.out.println(1);
			else if(R==r1+r2)
				System.out.println(1);
			else if(R<r1+r2)
				System.out.println(2);
			else 
				System.out.println(0);
		}
		
	}
}