import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while(true) {
			ArrayList<Integer> arr = new ArrayList<>();
			st = new StringTokenizer(br.readLine()," ");
			arr.add(Integer.parseInt(st.nextToken()));
			arr.add(Integer.parseInt(st.nextToken()));
			arr.add(Integer.parseInt(st.nextToken()));
			if(arr[0]==0) break;
			
			Collections.sort(null);
		}
	}
}