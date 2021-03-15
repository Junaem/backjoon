import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int meter = Integer.parseInt(st.nextToken());
		
		int day = (meter-down)/(up-down);
		if((meter-down)%(up-down)==0)
			System.out.println(day);
		else
			System.out.println(day+1);
	}

}
