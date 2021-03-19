package ele_math2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q4153{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while(true) {
			ArrayList<Integer> arr = new ArrayList<>();
			st = new StringTokenizer(br.readLine()," ");
			arr.add(Integer.parseInt(st.nextToken()));
			arr.add(Integer.parseInt(st.nextToken()));
			arr.add(Integer.parseInt(st.nextToken()));
			if(arr.get(0)==0) break;
			
			Collections.sort(arr);
			int a = arr.get(0);
			int b = arr.get(1);
			int c = arr.get(2);
			if(c*c == a*a + b*b)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}