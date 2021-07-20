package ele_math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int h,w,n;
		
		for(int i=0; i<test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int x,y;
			
			if(n%h==0)
				x=n/h;
			else
					x = n/h+1;
			if(n%h==0)
				y =h;
			else
				y = n%h;
			sb.append(y);
			if(x>=10)
				sb.append(x);
			else
				sb.append('0').append(x);
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
